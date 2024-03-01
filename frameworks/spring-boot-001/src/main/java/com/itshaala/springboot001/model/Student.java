package com.itshaala.springboot001.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
}