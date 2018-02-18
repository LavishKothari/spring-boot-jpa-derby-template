package org.springbootexample.subjectcoursedatajpa.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	// the following methods are common to all the repositories
	
	// getAllCourses()
	// getCourseById(String courseId)
	// updateCourse(Subject course)
	// deleteCourse(String courseId)
	
	public List<Course> findByDurationInMonths(int months);
	public List<Course> findBySubjectId(String subjectId);
	
}
