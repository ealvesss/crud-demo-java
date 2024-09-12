package com.example.cruddemo.Entities;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Person {
    @Id
    public Integer id;

    public Gender gender;

    public String name;

    public Date birthday;

}
