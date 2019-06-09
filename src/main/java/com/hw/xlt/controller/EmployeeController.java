package com.hw.xlt.controller;


import com.hw.xlt.model.Employee;
import com.hw.xlt.model.EmployeeResponse;
import com.hw.xlt.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@RestController(value="/employee")
 * 里面的value代表的是EmployeeController类生成的bean的名字
* */
@RestController(value="employeeController")
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/getList", method = RequestMethod.GET, produces="application/json")
    public EmployeeResponse getList() {

         EmployeeResponse employeeResponse =  employeeService.findAllEmployees();
         return employeeResponse;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces="application/json")
    public EmployeeResponse searchEmployee(@Param("employee") Employee employee){

        EmployeeResponse employeeResponse=employeeService.findEmployees(employee);
        return employeeResponse;
    }

}
