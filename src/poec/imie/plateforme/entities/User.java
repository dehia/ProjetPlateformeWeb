package poec.imie.plateforme.entities;
//import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

//import org.springframework.security.authentication.encoding.PasswordEncoder;

import poec.imie.plateforme.crudRepository.BaseItem;

public abstract class User extends BaseItem {
	protected String lastName;
	protected String firstName;
	protected String civility;
	private CategoryUser category;
	private String userName;
	private String password;

	public User() {

	}

	/** Constructor of User. */
	public User(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	/** Constructor of User. */
	public User(String lastName, String firstName, String userName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.userName = userName;
	}

	/** Constructor of User. */
	public User(String lastName, String firstName, String userName, CategoryUser category) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.userName = userName;
		this.category = category;
	}

	/**
	 * toString method for the User entity
	 */
	@Override
	public String toString() {
		return "Welcome User!!! Your Category User is " + category.getCategoryUser() + ", First Name is " + firstName
				+ ", Last Name is " + lastName + ", User Name is " + userName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the civility
	 */
	public String getCivility() {
		return civility;
	}

	/**
	 * @param civility
	 *            the civility to set
	 */
	public void setCivility(String civility) {
		this.civility = civility;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param password
	 *            the password to set
	 */
	// public void setPassword(String password) {
	// PasswordEncoder crypto = new Md5PasswordEncoder();
	// this.password = crypto.encodePassword(password, null);
	// }

}