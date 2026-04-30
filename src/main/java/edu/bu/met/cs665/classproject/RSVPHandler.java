package edu.bu.met.cs665.classproject;

/**

 * Name: Yuting Shi 

 * Course: CS-665 Software Designs & Patterns

 * Date: 04/30/2026

 * File Name: RSVPHandler.java

 * Description: handles RSVP functionality 
*/
public class RSVPHandler {

	/*
	adds a student to a session's attendee list
	*/
	public void rsvp(StudySession session, String studentName) {
		session.addAttendee(studentName);
	}
}