package com.hw.xlt.service;

import com.hw.xlt.model.Employee;
import com.hw.xlt.model.EmployeeResponse;

import java.util.List;


public interface EmployeeService {


    EmployeeResponse findAllEmployees();

    EmployeeResponse findEmployees(Employee employee);
}
