package fr.imie.ProjetPlateformeWeb.entity;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import fr.imie.ProjetPlateformeWeb.entity.crudRepository.BaseItem;

public class Promotion  extends BaseItem {
	
	protected String libelle;
	protected Year annee;
	private String specialty;
	protected List<Student> listStudent = new ArrayList<Student>();
	public Promotion() {
		super();
	}
	public Promotion(String libelle, Year annee, List<Student> listStudent) {
		super();
		this.libelle = libelle;
		this.annee = annee;
		this.listStudent = listStudent;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the annee
	 */
	public Year getAnnee() {
		return annee;
	}
	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(Year annee) {
		this.annee = annee;
	}
	/**
	 * @return the listStudent
	 */
	public List<Student> getListStudent() {
		return listStudent;
	}
	/**
	 * @param listStudent the listStudent to set
	 */
	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}
	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}
	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
}


