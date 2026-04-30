package edu.bu.met.cs665.classproject;

/**

 * Name: Yuting Shi 

 * Course: CS-665 Software Designs & Patterns

 * Date: 04/30/2026

 * File Name: CreateHandler.java

 * Description: handles creation of study sessions 
*/

public class CreateHandler {

	/*
	creates and stores a new session in the database
	*/
	public void createSession(StudySession session) {
		SessionDatabase.getInstance().addSession(session);
	}
}