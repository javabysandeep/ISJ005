package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "employee_type")
//@DiscriminatorValue("emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "employee_name")
    private String employeeName;
}
