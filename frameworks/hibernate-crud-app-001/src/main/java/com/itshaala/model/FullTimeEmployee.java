package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Builder
@Entity
//@DiscriminatorValue("fte")
public class FullTimeEmployee extends Employee {
    @Column(name = "salary")
    private int salary;
}
