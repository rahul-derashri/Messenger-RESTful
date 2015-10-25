package com.rahul.practise.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.rahul.practise.messenger.model.Message;

public class MessageService {
	public List<Message> getMessages(){
		Message m1 = new Message(1L, "Message 1", "Rahul");
		Message m2 = new Message(1L, "Message 2", "Rahul");
		Message m3 = new Message(1L, "Message 3", "Rahul");
		Message m4 = new Message(1L, "Message 4", "Rahul");
		
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		return list;
	}
	
}
