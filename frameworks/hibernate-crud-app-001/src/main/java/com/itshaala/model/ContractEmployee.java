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
//@DiscriminatorValue("c2h")
public class ContractEmployee extends Employee {
    @Column(name = "invoice_amount")
    private int invoiceAmount;
}
