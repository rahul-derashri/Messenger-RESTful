package com.rahul.practise.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rahul.practise.messenger.database.Database;
import com.rahul.practise.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = Database.getMessages();
	
	public MessageService() {
		Message m1 = new Message(1L, "Message 1", "Rahul");
		Message m2 = new Message(2L, "Message 2", "Rahul");
		Message m3 = new Message(3L, "Message 3", "Rahul");
		Message m4 = new Message(4L, "Message 4", "Rahul");
		messages.put(1l, m1);
		messages.put(2l, m2);
		messages.put(3l, m3);
		messages.put(4l, m4);
	}
	
	public List<Message> getMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message msg){
		msg.setId(messages.size()+1);
		messages.put( msg.getId(), msg);
		return msg;
	}
	
	public Message updateMessage(Message msg){
		if( msg.getId() < 0 ){
			return null;
		}
		
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}
