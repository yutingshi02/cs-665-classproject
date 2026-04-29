package edu.bu.met.cs665.classproject;

import java.util.List;

/*
strategy interface for searching sessions 
*/
public interface SearchStrategy {

	/*
	searches sessions based on a keyword
	*/
	List<StudySession> search(List<StudySession> sessions, String keyword);
}