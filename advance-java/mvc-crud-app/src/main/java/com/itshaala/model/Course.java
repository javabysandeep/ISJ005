package com.itshaala.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;

}
