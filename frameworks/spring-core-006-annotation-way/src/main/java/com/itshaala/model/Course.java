package com.itshaala.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
