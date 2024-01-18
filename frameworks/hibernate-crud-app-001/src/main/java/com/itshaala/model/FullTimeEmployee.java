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
@Table(name = "full_time_emp")
public class FullTimeEmployee extends Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "salary")
    private int salary;
}
