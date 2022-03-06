package com.gqzdev.learnsys.dao;

import com.gqzdev.learnsys.model.DiscussPost;
import java.util.List;

public interface DiscussPostMapper {
	void saveEntity(DiscussPost discussPost);

	List<DiscussPost> searchEntity(Integer id);

	void deleteEntity(Integer id);
}