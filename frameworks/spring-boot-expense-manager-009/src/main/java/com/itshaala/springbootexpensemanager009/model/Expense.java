package com.itshaala.springbootexpensemanager009.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int expenseId;

    @Column(name = "remark")
    private String expenseRemark;

    @Column(name = "amount")
    private int expenseAmount;

    @Column(name = "payment_mode")
    private String expensePaymentMode;

    @Column(name = "date")
    private Date date;
}
