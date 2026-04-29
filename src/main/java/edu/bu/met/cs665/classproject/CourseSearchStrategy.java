package edu.bu.met.cs665.classproject;

import java.util.ArrayList;
import java.util.List;

/*
the concrete strategy to search sessions by course
*/
public class CourseSearchStrategy implements SearchStrategy {

	/*
	returns sessions that match the course, implements the search strategy but the keyword is the course
	*/
	@Override
	public List<StudySession> search(List<StudySession> sessions, String keyword) {

		List<StudySession> result = new ArrayList<>();

		for (StudySession s: sessions) {

			if (s.getCourse().equalsIgnoreCase(keyword)) {
				result.add(s);
			}
		}

		return result;
	}
}