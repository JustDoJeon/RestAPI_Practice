package com.example.restful.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private Date created_at;
    private Date deleted_at;

}
