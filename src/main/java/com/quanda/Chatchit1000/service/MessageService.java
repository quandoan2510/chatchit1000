package com.quanda.Chatchit1000.service;

import java.util.List;
import java.util.Optional;

import com.quanda.Chatchit1000.model.Message;

public interface MessageService {
	
	List<Message> findAll();
	
	Optional<Message> findLastestMessage(String username);
	
	void save(Message message);
	
	void remove(Message message);
	
	Optional<Message> findById(Long id);
	
	List<Message> findByUsername(String username);
}
