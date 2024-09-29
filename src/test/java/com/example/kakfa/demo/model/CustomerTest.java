package com.example.kakfa.demo.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void getAge() {
        Customer customer = new Customer("Nagaraj", "Sam", LocalDate.parse("1986-04-01"));
        assertEquals(customer.getAge(),38);
        customer = new Customer("Nagaraj", "Sam", LocalDate.parse("1986-12-01"));
        assertEquals(customer.getAge(),37);
    }
}