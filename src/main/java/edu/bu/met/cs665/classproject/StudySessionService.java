package edu.bu.met.cs665.classproject;

import java.util.List;

/**

 * Name: Yuting Shi 

 * Course: CS-665 Software Designs & Patterns

 * Date: 04/30/2026

 * File Name: StudySessionService.java

 * Description: main service class that delegates the responsibilities tothe handlers
*/
public class StudySessionService {

	private CreateHandler createHandler = new CreateHandler();
	private FindHandler findHandler = new FindHandler();
	private RSVPHandler rsvpHandler = new RSVPHandler();
    private DeleteHandler deleteHandler = new DeleteHandler();

	/*
	delegates session creation to CreateHandler 
	*/
	public void createSession(StudySession session) {
		createHandler.createSession(session); 
	}

	/*
	delegates searching to FindHandler using strategy
	*/
	public List<StudySession> findSessions(String course) {
		return findHandler.findSessions(new CourseSearchStrategy(), course);
	}

	/*
	delegates RSVP to RSVPHandler
	*/
	public void rsvp(StudySession session, String name) {
		rsvpHandler.rsvp(session, name);
	}
    
    /*
    delegates deletion to DeleteHandler
    */
    public void deleteSession(int id) {
        deleteHandler.deleteSession(id);
    }

}