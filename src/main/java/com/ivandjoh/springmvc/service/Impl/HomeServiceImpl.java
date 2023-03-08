package com.ivandjoh.springmvc.service.Impl;

import com.ivandjoh.springmvc.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public String getHome() {
        return "home";
    }
}
