package fr.imie.ProjetPlateformeWeb.entity;

public class Notification {
		private String coreMessage;
		private String titleMessage;
		private Subject deadeline;
		 
		 public Notification(String coreMessage, String titleMessage, int deadeline){
			 this.coreMessage=coreMessage;
			 this.titleMessage=titleMessage;
			 this.getDeadeline();
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
		 * @return the deadline
		 */
		public Subject getDeadeline() {
			return deadeline;
		}

		/**
		 * @param deadeline the deadline to set
		 */
		public void setDeadeline(Subject deadeline) {
			this.deadeline = deadeline;
		}

	
		 
		 
}
