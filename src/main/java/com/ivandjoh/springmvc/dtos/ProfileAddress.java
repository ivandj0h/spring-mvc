package com.ivandjoh.springmvc.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProfileAddress {

        @JsonProperty("id")
        private Long Id;
        @JsonProperty("street")
        private String street;
        @JsonProperty("city")
        private String city;
        @JsonProperty("state")
        private String state;
        @JsonProperty("zip")
        private String zip;

        public ProfileAddress(long Id, String street, String city, String state, String zip) {
                this.Id = Id;
                this.street = street;
                this.city = city;
                this.state = state;
                this.zip = zip;
        }
}
