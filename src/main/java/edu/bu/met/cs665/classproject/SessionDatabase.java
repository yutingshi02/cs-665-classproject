package edu.bu.met.cs665.classproject;

import java.util.ArrayList;
import java.util.List;

/*
database/repository that stores all study sessions, using the singleton method here
*/
public class SessionDatabase {

	private static SessionDatabase instance;
	private List<StudySession> sessions;

	/*
	private constructor because using th singleton method
	*/
	private SessionDatabase() {
		sessions = new ArrayList<>();
	}

	/*
	returns the single instance of the database
	*/
	public static SessionDatabase getInstance() {

		if (instance == null) {
			instance = new SessionDatabase();
		}
		return instance;
	}

	/*
	adds a new study session to the database
	*/
	public void addSession(StudySession session) {
		sessions.add(session);
	}

	/*
	returns all stored sessions
	*/
	public List<StudySession> getAllSessions() {
		return sessions;
	}

    /*
    removes a session using it ID
    */
    public void removeSessionById(int id) {
        sessions.removeIf(s -> s.getId() == id);
    }
    
}