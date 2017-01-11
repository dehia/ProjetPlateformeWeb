package fr.imie.ProjetPlateformeWeb.form;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import fr.imie.ProjetPlateformeWeb.dao.UserDAO;
import fr.imie.ProjetPlateformeWeb.entity.User;


public class Subscriptionform {

    private static final String PARAM_EMAIL = "email";
    private static final String PARAM_PASSWORD = "password";
    private static final String PARAM_CONFIRMATION = "confirmation";
    private static final String PARAM_NAME = "name";
    
	
    private UserDAO userDAO;
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    	    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    private String result;
    private Map<String, String> errors = new HashMap<String, String>();

    /**
	 * @param userDAO
	 */
	public Subscriptionform(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}

	public User createUser(HttpServletRequest request) {
		String email = request.getParameter(Subscriptionform.PARAM_EMAIL);
		String password = request.getParameter(Subscriptionform.PARAM_PASSWORD);
		String confirmation = request.getParameter(Subscriptionform.PARAM_CONFIRMATION);
		String name = request.getParameter(Subscriptionform.PARAM_NAME);
		
		User user = new User();
		
		try {
			this.validEmail(email);
			user.setEmail(email);
		} catch (Exception e) {
			this.errors.put(PARAM_EMAIL, e.getMessage());
		}
		
		try {
			this.validPassword(password, confirmation);
			user.setPassword(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			this.errors.put(PARAM_PASSWORD, e.getMessage());
		}
		
		try {
			this.validName(name);
			user.setName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			this.errors.put(PARAM_NAME, e.getMessage());
		}
		
		if (this.errors.isEmpty()) {
			this.userDAO.create(user);
			this.result = "Succès de l'inscription";
		} else {
			this.result = "Échec de l'inscription";
		}
		
		return user;
    }
    
    private void validEmail(String email) throws Exception {
		if (email != null && email.trim().length()!=0) {
			Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
			if (!matcher.find()) {
				throw new Exception("Merci de saisir un email valide.");
			}
		} else {
			throw new Exception("Merci de saisir un email.");
		}
	}
	
	private void validPassword(String password, String confirmation) throws Exception{
		if (password != null && password.trim().length() != 0
				&& confirmation != null && confirmation.trim().length() > 0) {
			if (!password.equals(confirmation)) {
				throw new Exception("Les mots de passe sont différents");
			} else if (password.trim().length() < 8) {
				throw new Exception("Le mot de passe doit contenir au minimum 8 caractères");
			}
			
		} else {
			throw new Exception("Merci de saisir un mot de passe.");
		}
	}
	
	private void validName(String name) throws Exception {
		if (name != null && name.trim().length() < 3) {
			throw new Exception("Le nom d'utilisateur doit contenir au moins 3 caractères.");
		}
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @return the errors
	 */
	public Map<String, String> getErrors() {
		return errors;
	}

}
