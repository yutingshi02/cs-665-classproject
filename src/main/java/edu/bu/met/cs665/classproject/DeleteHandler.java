package edu.bu.met.cs665.classproject;

/*
handles deletion of study sessions
*/
public class DeleteHandler {

	/*
	deletes a session from the database
	*/
    public void deleteSession(int id) {
		SessionDatabase.getInstance().removeSessionById(id);
	}
}