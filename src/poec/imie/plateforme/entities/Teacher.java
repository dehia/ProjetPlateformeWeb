package poec.imie.plateforme.entities;

public class Teacher extends User  {
	private int numTeacher;
	
	 public Teacher() {
	        super();
	    }
	 public Teacher(String lastName, String firstName, String userName,CategoryUser category,int numTeacher) {
		 super(lastName,firstName,userName,category);
	     this.numTeacher = numTeacher;
	 }
	 public Teacher(String lastName, String firstName, String userName,int numTeacher) {
		 super(lastName,firstName,userName);
	     this.numTeacher = numTeacher;
	 }
	 /**
	 * toString method for the User entity
	 */
	 @Override
	 public String toString() {
		 return super.toString()+ ", num Teacher is" + this.numTeacher;
	 }
	 /**
	 * @return the numTeacher
	 */
	public int getNumTeacher() {
		return numTeacher;
	}

	/**
	 * @param numTeacher the numTeacher to set
	 */
	public void setNumTeacher(int numTeacher) {
		this.numTeacher = numTeacher;
	}
}