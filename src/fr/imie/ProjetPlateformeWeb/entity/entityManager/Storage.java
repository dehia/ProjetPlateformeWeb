package fr.imie.ProjetPlateformeWeb.entity.entityManager;

import java.util.ArrayList;
import java.util.List;

import fr.imie.ProjetPlateformeWeb.entity.Subject;


public class Storage {
	private int id;
	private List<String> urls= new ArrayList<String>();
	private int size;
	private List<Subject> listSubject = new ArrayList<Subject>();
	
	public Storage (){
		
	}
	
	public Storage (int id, int size,ArrayList<String> url){
		this.id=id;
		this.size=size;
		this.setUrls(url);
	}
	public void addSubject(Subject subject){
		this.listSubject.add(subject);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the listSubject
	 */
	public List<Subject> getListSubject() {
		return listSubject;
	}

	/**
	 * @param listSubject the listSubject to set
	 */
	public void setListSubject(List<Subject> listSubject) {
		this.listSubject = listSubject;
	}

	/**
	 * @return the urls
	 */
	public List<String> getUrls() {
		return urls;
	}

	/**
	 * @param urls the urls to set
	 */
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}
}
