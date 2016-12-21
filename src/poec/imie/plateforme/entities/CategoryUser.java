package poec.imie.plateforme.entities;

public class CategoryUser {
	private int idCategory;
	private String libelle;
	
	/**
	 * Default constructor for Category_use entity.
	 */
	public CategoryUser() {

	}
	/**
	 * Constructor for the Category_user entity, with:
	 * @param id
	 */
	public CategoryUser(int id) {
		this.idCategory = id;
	}
	/**
	 * Full constructor for the Category_user entity, with:
	 * @param id
	 * @param categoryUser
	 */
	public CategoryUser(int id, String categoryUser) {
		this.idCategory = id;
		this.libelle = categoryUser;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return idCategory;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idCategory = id;
	}

	/**
	 * @return the categoryUser
	 */
	public String getCategoryUser() {
		return libelle;
	}

	/**
	 * @param categoryUser the categoryUser to set
	 */
	public void setCategoryUser(String categoryUser) {
		this.libelle = categoryUser;
	}
	
	
}
