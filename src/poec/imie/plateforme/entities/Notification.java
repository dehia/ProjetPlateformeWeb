package poec.imie.plateforme.entities;

public class Notification {
		private String coreMessage;
		private String titleMessage;
		private int deadeline = 20170201;
		 
		 public Notification(String coreMessage, String titleMessage, int deadeline){
			 this.coreMessage=coreMessage;
			 this.titleMessage=titleMessage;
			 this.deadeline=deadeline;
		 }

		/**
		 * @return the coreMessage
		 */
		public String getCoreMessage() {
			return coreMessage;
		}

		/**
		 * @param coreMessage the coreMessage to set
		 */
		public void setCoreMessage(String coreMessage) {
			this.coreMessage = coreMessage;
		}

		/**
		 * @return the titleMessage
		 */
		public String getTitleMessage() {
			return titleMessage;
		}

		/**
		 * @param titleMessage the titleMessage to set
		 */
		public void setTitleMessage(String titleMessage) {
			this.titleMessage = titleMessage;
		}

		/**
		 * @return the deadeline
		 */
		public int getDeadeline() {
			return deadeline;
		}

		/**
		 * @param deadeline the deadeline to set
		 */
		public void setDeadeline(int deadeline) {
			this.deadeline = deadeline;
		}
		 
		 
}
