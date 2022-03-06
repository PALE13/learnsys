package com.gqzdev.learnsys.dao;

import java.util.List;

import com.gqzdev.learnsys.model.College;

public interface CollegeMapper {
	void saveColege(College college);
	
	List<College> searchCollege();
	
	void deleteCollege(Integer id);
	
	void updateCollege(College college);
	
	College getCollegeById(Integer id);
}