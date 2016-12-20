package poec.imie.plateforme.entities;

public class Student extends User {
	private int numStudent;
	private Group group;
	private Promotion promotion;
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
