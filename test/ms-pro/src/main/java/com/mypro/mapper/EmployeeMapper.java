package com.mypro.mapper;


import com.mypro.entity.po.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectAllEmployee();
    Employee selectById(Integer id);
    void insert(Employee employee);
    void updateEmployee(Employee employee);

    void deleteById(Integer id);
}
