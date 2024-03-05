package com.itshaala.springboot005springjdbc;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Course {
    private int id;
    private String course_name;
    private int price;
}