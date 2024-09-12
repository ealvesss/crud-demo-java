package com.example.cruddemo.controllers;

import com.example.cruddemo.Entities.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    public PersonController() {}

    @GetMapping("")
    public String GetPersonByName(){
        //todo: Return all person
        return "Default Person Result";
    }

    @PostMapping()
    public String Post(Person person){
        //todo: person will come as parameter and will be persisted in database

        return "Person was Added successfully";
    }

    @DeleteMapping()
    public String Delete(Integer id){
        //todo: with the id we will access the database and delete data that
        // refers to the person with the current id
        return "Person was Deleted successfully";
    }

    @PutMapping()
    public String Put(Person person){
        //todo: in put method we should update information regarding the current person.
        return "Person was Updated successfully";
    }
}
