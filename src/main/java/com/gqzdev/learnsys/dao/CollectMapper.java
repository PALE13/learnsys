package com.gqzdev.learnsys.dao;

import java.util.HashMap;
import java.util.List;

import com.gqzdev.learnsys.model.Collect;

public interface CollectMapper {
	void saveEntity(HashMap<String, Object> map);
	
	List<Collect> searchEntityBySId(Integer SId);	
	
	void deleteEntity(HashMap<String, Object> map);
}