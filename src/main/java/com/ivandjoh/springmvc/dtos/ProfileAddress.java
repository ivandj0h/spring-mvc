package com.ivandjoh.springmvc.dtos;

import lombok.Data;

@Data
public class ProfileAddress {

        private Long Id;
        private String street;
        private String city;
        private String state;
        private String zip;
}
