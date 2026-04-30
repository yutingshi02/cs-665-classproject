package edu.bu.met.cs665.classproject;
/**

 * Name: Yuting Shi 

 * Course: CS-665 Software Designs & Patterns

 * Date: 04/30/2026

 * File Name: DeleteHandler.java

 * Description: handles deleting study sessions

 */

public class DeleteHandler {

	/*
	deletes a session from the database
	*/
    public void deleteSession(int id) {
		SessionDatabase.getInstance().removeSessionById(id);
	}
}