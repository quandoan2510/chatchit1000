package com.quanda.Chatchit1000.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quanda.Chatchit1000.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
	
	@Query("select m from Message m where LOWER(m.username) = LOWER(:username) ORDER BY m.id DESC")
	public List<Message> find(@Param("username")String username);

}
