package fr.imie.ProjetPlateformeWeb.entity.crudRepository;

public abstract class BaseItem {
	    private int id = 0;

	    public BaseItem() {

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

	
		
}
