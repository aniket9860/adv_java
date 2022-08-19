package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.SubjectRepository;
import com.app.entity.Subject;

@Service
@Transactional
public class SubjectServiceImpl implements ISubjectService {

	@Autowired
	SubjectRepository subjdao;

	@Override
	public List<Subject> getallsubjects() {

		return subjdao.findAll();
	}

	@Override
	public Subject addSubject(Subject sub) {

		return subjdao.save(sub);
	}

}
