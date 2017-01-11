package fr.imie.ProjetPlateformeWeb.entity;
//import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.imie.ProjetPlateformeWeb.entity.crudRepository.BaseItem;

//import org.springframework.security.authentication.encoding.PasswordEncoder;


/** User bean. */
@Entity
public class User extends BaseItem {
	
	/** id of user. */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	/** email of person. */
	@Column(nullable=false,name="email", length=60)
	private String email;
	/** password of person. */
	@Column(name="password",nullable=false, length=20)
	private String password;
	/** name of person. */
	@Column(name="username",nullable=false, length=20)
	private String name;
	
	protected String lastName;
	protected String firstName;
	protected String civility;
	private CategoryUser category;




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
		this.name = userName;
	}

	/** Constructor of User. */
	public User(String lastName, String firstName, String userName, CategoryUser category) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.name = userName;
		this.category = category;
	}

	/**
	 * toString method for the User entity
	 */
	//@Override
	public String toString() {
		return "Welcome User!!! Your Category User is " + category.getCategoryUser() + ", First Name is " + firstName
				+ ", Last Name is " + lastName + ", User Name is " + name;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return name;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.name = userName;
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