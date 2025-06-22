package com.mypro.mapper;


import com.mypro.entity.po.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectAllEmployee(Employee employee);

    void insert(Employee employee);

    void updateEmployee(Employee employee);

    void deleteById(Integer id);

    Employee selectById(Integer id);

    Employee selectByUsername(String username);
}
