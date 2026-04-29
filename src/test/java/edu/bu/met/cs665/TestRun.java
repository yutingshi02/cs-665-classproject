package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.classproject.*;
import java.util.List;


/*
testing for the app
*/
public class TestRun {

	public static void main(String[] args) {

		StudySessionService service = new StudySessionService();

		// create sessions
		service.createSession(new StudySession("CS665", "Final Exam Prep", "Mugar 3rd floor", "Monday, 5PM"));
		service.createSession(new StudySession("CS665", "Practice Presentations", "CAS 101", "Wednsday, 7PM"));
		service.createSession(new StudySession("CS667", "Final Paper Pair Review", "CAS 201", "Friday, 6PM"));

		// search sessions by course
		List<StudySession> sessions = service.findSessions("CS665");

		System.out.println("CS665 Sessions:");
		for (StudySession s : sessions) {
			System.out.println(s);
		}

		// RSVP students
		if (!sessions.isEmpty()) {
			service.rsvp(sessions.get(0), "Yuting");
			service.rsvp(sessions.get(0), "Lola");
		}

		System.out.println("\nAfter RSVP:");
		System.out.println(sessions.get(0));
	}
}