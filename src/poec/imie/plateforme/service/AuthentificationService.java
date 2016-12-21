package poec.imie.plateforme.service;

import poec.imie.plateforme.entities.User;

/**
 * Provides processing service to set user authentication session
 * 
 * @author Arthur Vin
 */
public interface AuthentificationService {

	/**
	 * Process user authentication
	 * 
	 * @param user
	 * @return
	 */
	boolean processUserAuthentification(User user);
}
