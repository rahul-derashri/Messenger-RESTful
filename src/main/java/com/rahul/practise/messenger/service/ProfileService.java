package com.rahul.practise.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rahul.practise.messenger.database.Database;
import com.rahul.practise.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = Database.getProfiles();
	
	public ProfileService() {
		profiles.put("rahul", new Profile(1l, "rahul", "Rahul", "Derashri"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String name){
		return profiles.get(name);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if( profile.getId() <= 0 ){
			return null;
		}
		
		profiles.put(profile.getName(), profile);
		return profile;
	}
	
	
	public Profile removeProfile(String name){
		return profiles.remove(name);
	}
}
