package edu.bu.met.cs665.classproject;

import java.util.ArrayList;
import java.util.List;

/*
represents a study session with course info and attendees 
 */

public class StudySession {

	private String course;
	private String description;
	private String location;
	private String time;
	private List<String> attendees;

    /*
    this is for creating IDs so they can b deleted later
    */
    private static int counter = 1;
    private int id;

	/*
	constructor to create a new study session
	*/
	public StudySession(String course, String description, String location, String time) {
		this.course = course;
		this.description = description;
		this.location = location;
		this.time = time;
		this.attendees = new ArrayList<>();
        // id is so that each can be deleted later 
        this.id = counter++;
	}

	/*
	return the course name
	*/
	public String getCourse() {
		return course;
	}

	/*
	adds a students name to the attendees list, for rsvp 
	*/
	public void addAttendee(String name) {
		attendees.add(name);
	}

	/*
	returns the list of attendees
	*/
	public List<String> getAttendees() {
		return attendees;
	}

	/*
	returns a readable string of the session
	*/
	@Override
	public String toString() {
		return course + " " + description + 
            "\nAt " + location + " on " + time + 
			"\nAttendees: " + attendees + "\n"; 
	}

    /*
    returns id 
    */
    public int getId() {
	    return id;
    }
}