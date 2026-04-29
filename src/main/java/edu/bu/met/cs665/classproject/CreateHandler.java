package edu.bu.met.cs665.classproject;

/*
handles creation of study sessions 
*/
public class CreateHandler {

	/*
	creates and stores a new session in the database
	*/
	public void createSession(StudySession session) {
		SessionDatabase.getInstance().addSession(session);
	}
}