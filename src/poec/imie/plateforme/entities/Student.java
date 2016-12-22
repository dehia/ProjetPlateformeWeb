package poec.imie.plateforme.entities;

public class Student extends User {
	private int numStudent;
	private Group group;
	private Promotion promotion;
	
	public Student() {
		super();
	}
	public Student(String lastName, String firstName) {
		super(lastName,firstName);
	}
	public Student(String lastName, String firstName, String userName,CategoryUser category,int numStudent) {
		super(lastName,firstName,userName,category);
		this.numStudent = numStudent;
	}
    /**
     * toString method for the User entity
     */
    @Override
	public String toString() {
    	return super.toString()+ ", num Student is" + this.numStudent;
    }
	/**
	 * @return the numStudent
	 */
	public int getNumStudent() {
		return numStudent;
	}
	/**
	 * @param numStudent the numStudent to set
	 */
	public void setNumStudent(int numStudent) {
		this.numStudent = numStudent;
	}
	/**
	 * @return the group
	 */
	public Group getGroup() {
		return group;
	}
	/**
	 * @param group the group to set
	 */
	public void setGroup(Group group) {
		this.group = group;
	}
	/**
	 * @return the promotion
	 */
	public Promotion getPromotion() {
		return promotion;
	}
	/**
	 * @param promotion the promotion to set
	 */
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	
}
