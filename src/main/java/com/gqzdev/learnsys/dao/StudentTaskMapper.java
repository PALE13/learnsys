package com.gqzdev.learnsys.dao;

import java.util.List;

import com.gqzdev.learnsys.model.StudentTask;

public interface StudentTaskMapper {
	void saveEntity(StudentTask studentTask);
	
	List<StudentTask> searchEntity();
	
	List<StudentTask> searchEntityByStuId(Integer stuId);
}