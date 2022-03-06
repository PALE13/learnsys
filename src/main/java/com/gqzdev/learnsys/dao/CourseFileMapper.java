package com.gqzdev.learnsys.dao;

import com.gqzdev.learnsys.model.CourseFile;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CourseFileMapper {
	void saveEntity(CourseFile collegeFile);
	
	List<CourseFile> searchEntity(int id);
	
	CourseFile searchEntityById(int id);
	
	List<CourseFile> searchAllEntity();
	
	List<CourseFile> searchEntityByTerm(@Param("courseId") int courseId, @Param("teacherId") int teacherId);
	
	void deleteEntity(Integer id);
}