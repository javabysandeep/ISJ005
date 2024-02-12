package com.itshaala;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
    private List<String> courseContent;


}
