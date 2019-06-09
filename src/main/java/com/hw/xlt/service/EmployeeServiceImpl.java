package com.hw.xlt.service;

import com.hw.xlt.constant.Constant;
import com.hw.xlt.mapper.EmployeeServiceDao;
import com.hw.xlt.model.Employee;
import com.hw.xlt.model.EmployeeResponse;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service("employeeService")
@MapperScan("com.hw.xlt.mapper")
public class EmployeeServiceImpl implements EmployeeService, Serializable {




    @Autowired
    private EmployeeServiceDao employeeServiceDao;

    @Override
    public EmployeeResponse findAllEmployees() {

        EmployeeResponse employeeResponse=new EmployeeResponse();
        List<Employee> list=new ArrayList<>();
        try {
            list=employeeServiceDao.findEmployeeAll();
            if(list.size()>0){
                employeeResponse.setResult(list);
                employeeResponse.setCode("200");
                employeeResponse.setMessage("find all employees successfully.");
                employeeResponse.setStatus(Constant.Status.SUCCESS);
            }
        } catch (ApplicationException e) {
            e.printStackTrace();
            employeeResponse.setCode("500");
            employeeResponse.setMessage("find all employees failed.");
            employeeResponse.setStatus(Constant.Status.FAIL);
        }

        return employeeResponse;
    }

    @Override
    public EmployeeResponse findEmployees(Employee employee) {
        EmployeeResponse employeeResponse=new EmployeeResponse();
        List<Employee> list=new ArrayList<>();
        try {
            list=employeeServiceDao.findEmployeeByCondition(employee);
            if(list.size()>0){
                employeeResponse.setResult(list);
                employeeResponse.setCode("200");
                employeeResponse.setMessage("find employee by condition successfully.");
                employeeResponse.setStatus(Constant.Status.SUCCESS);
            }
        } catch (ApplicationException e) {
            e.printStackTrace();
            employeeResponse.setCode("500");
            employeeResponse.setMessage("find employee by condition failed.");
            employeeResponse.setStatus(Constant.Status.FAIL);
        }
        return employeeResponse;
    }
}
