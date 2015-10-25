package com.rahul.practise.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.rahul.practise.messenger.model.Message;

public class Database {
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	//private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();
	
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	/*public static Map<Long, Profile> getProfiles(){
		return profiles;
	}*/
	
}
