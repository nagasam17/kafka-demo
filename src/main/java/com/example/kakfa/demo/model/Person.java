package com.example.kakfa.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    Person(String fName, String lName, LocalDate dob){
        this.firstName = fName;
        this.lastName = lName;
        this.dateOfBirth = dob;
    }

}
