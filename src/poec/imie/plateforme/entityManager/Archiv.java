package poec.imie.plateforme.entityManager;

//import java.io.File;
import java.util.Date;

import poec.imie.plateforme.entities.Promotion;
import poec.imie.plateforme.entities.Subject;
import poec.imie.plateforme.entities.Teacher;

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