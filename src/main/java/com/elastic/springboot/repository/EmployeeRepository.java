package com.elastic.springboot.repository;

import com.elastic.springboot.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {

    List<Employee> findByFirstname(String firstName);

}
