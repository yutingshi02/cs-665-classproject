package edu.bu.met.cs665.classproject;

import java.util.List;

/*
handles the searching for study sessions 
*/
public class FindHandler {

	/*
	finds sessions using search strategy
	*/
	public List<StudySession> findSessions(SearchStrategy strategy, String keyword) {
		return strategy.search(SessionDatabase.getInstance().getAllSessions(), keyword);
	}
}