package poec.imie.plateforme.entities;

import java.util.ArrayList;
import java.util.List;

import poec.imie.plateforme.crudRepository.BaseItem;

public class Group extends BaseItem {
	private int numGroup;
	protected String groupName;
	// private Student student;
	protected List<Student> listStudent = new ArrayList<Student>();

	public Group() {

	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;

		/*
		 * public void addStudent(List<Student> listStudent) {
		 * this.groupName.add(numStudent);
		 * System.out.println("Create a new group : " + this.groupName); }
		 */

	}

	public void create() {

	}
	
	public void delete() {

	}


	/**
	 * @return the numGroup
	 */
	public int getNumGroup() {
		return numGroup;
	}

	/**
	 * @param numGroup
	 *            the numGroup to set
	 */
	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName
	 *            the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return the listStudent
	 */
	public List<Student> getListStudent() {
		return listStudent;
	}

	/**
	 * @param listStudent
	 *            the listStudent to set
	 */
	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}

}
