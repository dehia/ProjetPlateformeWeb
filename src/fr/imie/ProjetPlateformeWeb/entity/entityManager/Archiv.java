package fr.imie.ProjetPlateformeWeb.entity.entityManager;

//import java.io.File;
import java.util.Date;

import fr.imie.ProjetPlateformeWeb.entity.Promotion;
import fr.imie.ProjetPlateformeWeb.entity.Subject;
import fr.imie.ProjetPlateformeWeb.entity.Teacher;

public class Archiv {
	private int id;
	private int url_id;
	private Subject title;
	private Teacher author;
	private Date deadline;
	protected Promotion promotion;
	private Subject description;
	private Date createAT;

	public Archiv() {
	}

}