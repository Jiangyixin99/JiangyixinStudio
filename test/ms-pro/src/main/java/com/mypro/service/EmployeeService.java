package com.mypro.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypro.entity.po.Employee;
import com.mypro.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeMapper employeeMapper;

    //这句应该没用 我暂时不知道
    public EmployeeMapper getEmployeeMapper() {
        return employeeMapper;
    }

    public void insertEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    public void deleteById(Integer id){
        employeeMapper.deleteById(id);
    }
    public List<Employee> selectAllEmployee() {
        List<Employee> list = employeeMapper.selectAllEmployee();
        return list;
    }


    public Employee selectById(Integer id) {
        return employeeMapper.selectById(id);
    }

    //分页查询
    public PageInfo<Employee> selectPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Employee> list = employeeMapper.selectAllEmployee();
        return PageInfo.of(list);
    }


}
