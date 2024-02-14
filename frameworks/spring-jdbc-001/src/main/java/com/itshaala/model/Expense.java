package com.itshaala.model;

import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Expense {
    private int id;
    private String expense;
    private int amount;
    private Date dateTime;
    private String description;
}
