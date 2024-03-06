package com.itshaala.springboot008commandlinerunner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Person {
    @Value("${person.id}")
    private int personId;

    @Value("${person.name}")
    private String personName;

    @Value("${person.age}")
    private int personAge;

    @Value("${person.address}")
    private String address;

}
