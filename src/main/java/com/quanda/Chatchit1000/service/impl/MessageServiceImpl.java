package com.quanda.Chatchit1000.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.quanda.Chatchit1000.model.Message;
import com.quanda.Chatchit1000.repository.MessageRepository;
import com.quanda.Chatchit1000.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository messRepository;
	
	@Value("${spring.datasource.url}")
	private String url;

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		System.err.println("Vao dây" + url);
		for (Message massage : messRepository.findAll()) {
			System.err.println("massage ==>" + massage.getUsername());
		}
		return (List<Message>) messRepository.findAll();
	}

	@Override
	public Optional<Message> findLastestMessage(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Message message) {
		// TODO Auto-generated method stub
		messRepository.save(message);
	}

	@Override
	public void remove(Message message) {
		// TODO Auto-generated method stub
		messRepository.delete(message);
	}

	@Override
	public Optional<Message> findById(Long id) {
		// TODO Auto-generated method stub
		return messRepository.findById(id);
	}

	@Override
	public List<Message> findByUsername(String username) {
		// TODO Auto-generated method stub
		return messRepository.find(username);
	}

}
