package poec.imie.plateforme.entities;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import poec.imie.plateforme.crudRepository.BaseItem;

public class Promotion  extends BaseItem {
	
protected String libelle;
protected Year annee;
protected List<Student> listStudent = new ArrayList<Student>();

public Promotion(String libelle, Year annee, List<Student> listStudent) {
	super();
	this.libelle = libelle;
	this.annee = annee;
	this.listStudent = listStudent;
}

}

