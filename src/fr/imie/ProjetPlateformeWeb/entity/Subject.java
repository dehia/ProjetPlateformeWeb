package fr.imie.ProjetPlateformeWeb.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Subject extends Document {
    public Subject(Object doc) {
		super(doc);
		// TODO Auto-generated constructor stub
	}

	private Integer Id;
    private Teacher author;
    private String title;
    private Date deadline;
    protected Promotion promotion;
    private String description;
    private File subjectwriting;

//    public Subject(){
//    	
//    }
//     public Subject(String title,Teacher author, Promotion promotion,String description,Date deadline) {
//            this.author = author;
//            this.promotion = promotion;
//            this.description = description;
//            this.deadline = deadline;
//            this.title = title;
//            System.out.println("Create a new Subject : "+"title :"+ this.title +"and author" + this.author + " for promotion : " +  this.promotion + " and description : " + this.description + "to make before : " + this.deadline);
//        }
//   
        /**
        * @return the id
        */
       public Integer getId() {
           return Id;
       }

       /**
        * @param id the id to set
        */
       public void setId(Integer id) {
           Id = id;
       }

       /**
        * @return the author
        */
       public Teacher getAuthor() {
           return author;
       }

       /**
        * @param author the author to set
        */
       public void setAuthor(Teacher author) {
           this.author = author;
       }

       /**
        * @return the deadline
        */
       public Date getDeadline() {
           return deadline;
       }

       /**
        * @param deadline the deadline to set
        */
       public void setDeadline(Date deadline) {
           this.deadline = deadline;
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

       /**
        * @return the description
        */
       public String getDescription() {
           return description;
       }

       /**
        * @param description the description to set
        */
       public void setDescription(String description) {
           this.description = description;
       }
//
//	@Override
//	public void writeDocument() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void download() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void createDocument() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void addDocument() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void removeDocument() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void researchDocument() {
//		// TODO Auto-generated method stub
//		
//	}
	


   }