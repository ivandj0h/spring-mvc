package com.ivandjoh.springmvc.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Profile {

    @JsonProperty("id")
    private Long Id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("address")
    private ProfileAddress address;
    @JsonProperty("hobbies")
    private List<String> hobbies;
}
