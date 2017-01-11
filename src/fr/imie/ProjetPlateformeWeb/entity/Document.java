package fr.imie.ProjetPlateformeWeb.entity;

public class Document <T>{
	private T doc;
	
	public Document(T doc) {
		super();
		this.doc = doc;
	}
	public void  writeDocument( );
	public <T>void downloadFile(Object T){
		
		DownloadFile<T> dl = new DownloadFile(T);
		dl.start();
		System.out.println("File saved into filesystem." );
	};
	public void createDocument();
	public void addDocument();
	public void removeDocument();
	public void researchDocument();

}