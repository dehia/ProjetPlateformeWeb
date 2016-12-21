package poec.imie.plateforme.service.implementation;

//package com.example.j2eeapp.services;
//import javax.faces.event.AjaxBehaviorEvent;

import poec.imie.plateforme.entities.User;


public interface UserServiceimplementation {

	/**
	 * Create user - persist to database
	 * 
	 * @param userEntity
	 * @return true if success
	 */
	boolean createUser(User userEntity);
	
	/**
	 * Check user name availability. UI ajax use.
	 * 
	 * @param ajax event
	 * @return
	 */
//	boolean checkAvailable(AjaxBehaviorEvent event);
	
	/**
	 * Retrieves full User record from database by user name
	 * 
	 * @param userName
	 * @return UserEntity
	 */
	User loadUserEntityByUsername(String userName);
}
