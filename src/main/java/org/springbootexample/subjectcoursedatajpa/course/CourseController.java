package org.springbootexample.subjectcoursedatajpa.course;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springbootexample.subjectcoursedatajpa.subject.Subject;
import org.springbootexample.subjectcoursedatajpa.subject.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@Autowired
	SubjectService subjectService;
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/course/{courseId}")
	public Course getCourseById(@PathVariable String courseId) {
		return courseService.getCourseById(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="subject/{subjectId}/courses")
	public void addSubject(@PathVariable String subjectId, @RequestBody Course course) {
		Subject subject = subjectService.getSubjectById(subjectId);
		course.setSubject(subject);
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/courses")
	public void updateSubject(@RequestBody Course course) {
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/course/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourseById(courseId);
	}
	
	@RequestMapping("/subject/{subjectId}/courses")
	public List<Course> getCoursesBySubjectId(@PathVariable String subjectId) {
		return courseService.getCoursesBySubjectId(subjectId);
	}
	
	@RequestMapping("/courses/duration/{duration}")
	public List<Course> getCoursesByDuration(@PathVariable int duration) {
		return courseService.getCoursesByDurationInMonths(duration);
	}
	
}
