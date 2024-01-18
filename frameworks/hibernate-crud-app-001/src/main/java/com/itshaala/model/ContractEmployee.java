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
@Table(name = "contract_employee")
public class ContractEmployee extends Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_amount")
    private int invoiceAmount;
}
