package com.gqzdev.learnsys.dao;

import java.util.Map;

import com.gqzdev.learnsys.model.Admin;

public interface AdminMapper {
	Admin searchEntityByAccount(Map<String, String> map);
	
	Admin getEntityById(Integer id);
	
	void updateEntity(Admin admin);
}