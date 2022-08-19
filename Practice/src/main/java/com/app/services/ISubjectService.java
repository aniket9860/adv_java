package com.app.services;

import java.util.List;

import com.app.entity.Subject;

public interface ISubjectService {

	List<Subject> getallsubjects();
	
	Subject addSubject(Subject sub);
}
