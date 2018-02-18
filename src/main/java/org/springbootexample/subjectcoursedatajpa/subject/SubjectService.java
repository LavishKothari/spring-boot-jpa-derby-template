package org.springbootexample.subjectcoursedatajpa.subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepository;

	public List<Subject> getAllSubjects() {
		List<Subject> subjects = new ArrayList<>();
		subjectRepository.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	public Subject getSubjectById(String id) {
		return subjectRepository.findOne(id);
	}

	public void updateSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	public void deleteSubjectById(String subjectId) {
		subjectRepository.delete(subjectId);
	}

}
