package com.rahul.practise.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.rahul.practise.messenger.model.Message;
import com.rahul.practise.messenger.model.Profile;

public class Database {
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<String, Profile> profiles = new HashMap<String, Profile>();
	
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
	
}
