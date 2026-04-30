package edu.bu.met.cs665.classproject;

import java.util.List;

/**

 * Name: Yuting Shi 

 * Course: CS-665 Software Designs & Patterns

 * Date: 04/30/2026

 * File Name: FindHandler.java

 * Description: handles the searching for study sessions 
*/
public class FindHandler {

	/*
	finds sessions using search strategy
	*/
	public List<StudySession> findSessions(SearchStrategy strategy, String keyword) {
		return strategy.search(SessionDatabase.getInstance().getAllSessions(), keyword);
	}
}