package com.example.kakfa.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;
import java.util.Date;

import static java.lang.Math.floor;


@Getter
@Setter
@Builder
public class Customer extends Person {
    private Integer Age;
    private CustomerType customerType;

    public Customer(String fName, String lName, LocalDate dob){
        super(fName, lName, dob);
        this.setAge(dob);
        this.setCustomerType();
    }
    public Customer (Person p ){
        super(p.getFirstName(), p.getLastName(), p.getDateOfBirth());
        this.setAge(p.getDateOfBirth());
        this.setCustomerType();
    }
    void setAge(LocalDate dateOfBirth)
    {
        LocalDate currentDate = LocalDate.now();
        this.Age = Period.between(dateOfBirth, currentDate).getYears();

    }
    void setCustomerType()
    {
        if(this.Age%2==0){
            this.customerType = CustomerType.EVEN;
        }
        else
        {
            this.customerType = CustomerType.ODD;
        }
    }
}
