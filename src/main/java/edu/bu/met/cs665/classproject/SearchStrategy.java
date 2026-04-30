package edu.bu.met.cs665.classproject;

import java.util.List;

/**

 * Name: Yuting Shi 

 * Course: CS-665 Software Designs & Patterns

 * Date: 04/30/2026

 * File Name: SearchStrategy.java

 * Description: strategy interface for searching sessions 
*/
public interface SearchStrategy {

	/*
	searches sessions based on a keyword
	*/
	List<StudySession> search(List<StudySession> sessions, String keyword);
}