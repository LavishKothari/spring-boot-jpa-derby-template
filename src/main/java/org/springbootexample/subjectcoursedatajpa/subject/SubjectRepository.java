package org.springbootexample.subjectcoursedatajpa.subject;

import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, String> {

	// the following methods are common to all the repositories
	
	// getAllSubjects()
	// getSubjectById(String subjectId)
	// updateSubject(Subject subject)
	// deleteSubject(String subjectId)
}
