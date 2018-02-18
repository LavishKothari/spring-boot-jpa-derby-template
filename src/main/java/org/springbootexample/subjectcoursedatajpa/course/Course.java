package org.springbootexample.subjectcoursedatajpa.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springbootexample.subjectcoursedatajpa.subject.Subject;

@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String description;
	private int durationInMonths;

	@ManyToOne
	private Subject subject;
	
	public Course() {
		super();
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Course(String id, String name, String description, int durationInMonths) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.durationInMonths = durationInMonths;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

}
