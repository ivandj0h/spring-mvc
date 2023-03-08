package com.ivandjoh.springmvc.dtos;

import lombok.Data;

import java.util.List;

@Data
public class Profile {

    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private ProfileAddress address;
    private List<ProfileHobbies> hobbies;
}
