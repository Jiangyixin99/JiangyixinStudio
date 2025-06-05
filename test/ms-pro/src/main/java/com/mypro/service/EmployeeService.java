package com.mypro.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypro.entity.po.Employee;
import com.mypro.mapper.DepartmentMapper;
import com.mypro.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeMapper employeeMapper;
    private DepartmentMapper departmentMapper;
    //这句应该没用 我暂时不知道
    public EmployeeMapper getEmployeeMapper() {
        return employeeMapper;
    }

    //TODO 插入数据判断是否为空 和 判断长度是否过长 用正则表达式 
    public void insertEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    public void deleteById(Integer id){
        employeeMapper.deleteById(id);
    }

    public List<Employee> selectAllEmployee(Employee employee) {
        return employeeMapper.selectAllEmployee(employee);
    }

    public Employee selectById(Integer id) {
        return employeeMapper.selectById(id);
    }

    //分页查询
    public PageInfo<Employee> selectPage(Employee employee, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Employee> list = employeeMapper.selectAllEmployee(employee);
        return PageInfo.of(list);
    }


}
