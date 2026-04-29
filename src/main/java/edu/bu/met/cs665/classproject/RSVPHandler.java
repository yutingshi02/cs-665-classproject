package edu.bu.met.cs665.classproject;

/*
handles RSVP functionality 
*/
public class RSVPHandler {

	/*
	adds a student to a session's attendee list
	*/
	public void rsvp(StudySession session, String studentName) {
		session.addAttendee(studentName);
	}
}