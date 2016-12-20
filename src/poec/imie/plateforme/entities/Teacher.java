package poec.imie.plateforme.entities;

public class Teacher extends User  {
	private int numTeacher;
	
	 public Teacher(int numTeacher) {
	        super();
	        this.numTeacher = numTeacher;
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
