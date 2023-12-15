package com.itshaala;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
}
