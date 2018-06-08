package com.willjsporter.service;

import com.willjsporter.mocks.DatabaseClass;
import com.willjsporter.model.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfileService {

    private Map<String, Profile> profiles = DatabaseClass.getProfiles();


    public ProfileService() {
        profiles.put("willjsporter", new Profile(1, "willjsporter", "will", "porter"));
        profiles.put("koushikjavabrains", new Profile(2, "koushikjavabrains", "Koushik", "javabrains"));
    }

    public List<Profile> getAllProfiles() {
        return new ArrayList<>(profiles.values());
    }

    public Profile getProfile(String profileName) {
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile) {
        profile.setId(profiles.size() + 1);
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile updateProfile(Profile profile) {
        if (!profiles.containsKey(profile.getProfileName())) {
            return null;
        }

        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile removeProfile(String profileName) {
        return profiles.remove(profileName);
    }
}
