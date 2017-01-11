package fr.imie.ProjetPlateformeWeb.entity;

public class Admin extends User {
	
	public Admin() {
		
	}
	
	
	public Admin(String lastName, String firstName, String civility, String userName, String password) {
		super();
		this.getId();

		System.out.println("Welcome" + " Administrator your name is : " + this.civility + this.lastName + this.firstName);
	}

}
