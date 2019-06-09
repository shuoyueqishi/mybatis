package com.hw.xlt.mapper;

import com.hw.xlt.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.omg.CORBA.portable.ApplicationException;

import java.util.List;

@Mapper
public interface EmployeeServiceDao {

    public List<Employee> findEmployeeAll() throws ApplicationException;

    public List<Employee> findEmployeeByCondition(Employee employee) throws ApplicationException;
}
