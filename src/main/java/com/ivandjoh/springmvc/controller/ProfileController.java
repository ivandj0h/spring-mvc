package com.ivandjoh.springmvc.controller;

import com.ivandjoh.springmvc.dtos.Profile;
import com.ivandjoh.springmvc.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfileController {

    private ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile")
    public ResponseEntity<Profile> getProfile() {
        return profileService.getProfile();
    }
}
