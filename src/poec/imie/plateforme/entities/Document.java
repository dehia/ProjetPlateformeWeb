package poec.imie.plateforme.entities;
public interface Document <T>{
	public void writeDocument(T entity);
	public void download(T entity);
	public void createDocument(T entity);
	public void addDocument(T entity);
	public void removeDocument(T entity);
	public void researchDocument(T entity);

}