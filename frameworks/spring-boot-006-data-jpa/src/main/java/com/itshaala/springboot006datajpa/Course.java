package com.itshaala.springboot006datajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Course {

    @Id
    private int id;
    private String course_name;
    private int price;
}