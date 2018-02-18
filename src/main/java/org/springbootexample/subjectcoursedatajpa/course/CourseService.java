package org.springbootexample.subjectcoursedatajpa.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public Course getCourseById(String id) {
		return courseRepository.findOne(id);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourseById(String courseId) {
		courseRepository.delete(courseId);
	}

	public List<Course> getCoursesBySubjectId(String subjectId) {
		return courseRepository.findBySubjectId(subjectId);
	}
	
	public List<Course> getCoursesByDurationInMonths(int months) {
		return courseRepository.findByDurationInMonths(months);
	}
}
