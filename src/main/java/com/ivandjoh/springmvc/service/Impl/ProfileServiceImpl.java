package com.ivandjoh.springmvc.service.Impl;

import com.ivandjoh.springmvc.dtos.Profile;
import com.ivandjoh.springmvc.dtos.ProfileAddress;
import com.ivandjoh.springmvc.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Override
    public ResponseEntity<Profile> getProfile() {

        Profile profile = new Profile();
        profile.setId(1L);
        profile.setFirstName("Juna");
        profile.setLastName("Djoh");
        profile.setAge(7);
        profile.setEmail("juna@juna.us");
        profile.setPhone("+1-444-456-7890");
        profile.setAddress(
                new ProfileAddress(1L, "123 Main St", "New York", "NY", "12345")
        );
        profile.setHobbies(List.of(new String[]{"Coding", "Reading", "Traveling"}));

        return new ResponseEntity<>(profile, null, 200);
    }
}
