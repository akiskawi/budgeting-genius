package com.akiskawi.mt.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String firstName;
    private String lastName;
    private String picture;
    private String email;
}
