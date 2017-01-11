package fr.imie.ProjetPlateformeWeb.entity;

import java.util.Date;

public class Homework extends Document{
	private String title;
	private Student author;
	private Date deposedAT = new Date();
	private Subject subject_id;
	

	public  Homework() {
		}
	
	public  Homework(String title, Student author,Date deposedAT, Subject subject_id) {
	this.title=title;
	this.author=author;
	this.subject_id=subject_id;
	this.deposedAT=new Date();
	System.out.println("Create a new Homework : " + this.title + " and author : " +  this.author + " for Subject : " + this.subject_id + "deposed : " + this.deposedAT);
    }
	
	

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public Student getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(Student author) {
		this.author = author;
	}
	
	/**
	 * @return the deposedAT
	 */
	public Date getDeposedAT() {
		return deposedAT;
	}

	/**
	 * @param deposedAT the deposedAT to set
	 */
	public void setDeposedAT(Date deposedAT) {
		this.deposedAT = deposedAT;
	}

	/**
	 * @return the subject_id
	 */
	public Subject getSubject_id() {
		return subject_id;
	}
	/**
	 * @param subject_id the subject_id to set
	 */
	public void setSubject_id(Subject subject_id) {
		this.subject_id = subject_id;
	}

	@Override
	public void writeDocument() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void download() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createDocument() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDocument() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDocument() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void researchDocument() {
		// TODO Auto-generated method stub
		
	}

	
	
}
