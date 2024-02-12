package com.itshaala;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private int courseId;
    private String courseName;
    private String courseContent;
}
