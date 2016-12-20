package poec.imie.plateforme.entities;

import java.util.Date;

public class Subject <T> implements Document <T>{
    private Integer Id;
    private Teacher author;
    private Date deadline;
    protected Promotion promotion;
    private String description;

     public Subject(Teacher author, Promotion promotion,String description,Date deadline) {
            this.author = author;
            this.promotion = promotion;
            this.description = description;
            this.deadline = deadline;
            System.out.println("Create a new Subject : " + this.author + " for promotion : " +  this.promotion + " and description : " + this.description + "to make before : " + this.deadline);
        }
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

	@Override
	public void writeDocument(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void download(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createDocument(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDocument(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDocument(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void researchDocument(T entity) {
		// TODO Auto-generated method stub
		
	}


   }