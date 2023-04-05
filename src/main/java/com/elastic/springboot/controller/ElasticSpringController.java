package com.elastic.springboot.controller;

import com.elastic.springboot.model.Employee;
import com.elastic.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ElasticSpringController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/saveEmployee")
    public int saveEmployee(@RequestBody List<Employee> employees) {
        System.out.println(employees.toString());
        repository.saveAll(employees);
        return employees.size();
    }

    @GetMapping("/findEverything")
    public Iterable<Employee> findAllEmployees() {
        return repository.findAll();
    }

    @GetMapping("/findByFName/{firstName}")
    public List<Employee> findByFirstName(@PathVariable String firstName) {
        return repository.findByFirstname(firstName);
    }


}
