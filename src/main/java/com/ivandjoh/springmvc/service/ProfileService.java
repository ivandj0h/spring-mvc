package com.ivandjoh.springmvc.service;

import com.ivandjoh.springmvc.dtos.Profile;
import org.springframework.http.ResponseEntity;

public interface ProfileService {
    ResponseEntity<Profile> getProfile();
}
