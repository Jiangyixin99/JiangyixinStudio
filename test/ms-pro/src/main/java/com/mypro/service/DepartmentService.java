package com.mypro.service;

import com.mypro.entity.po.Department;
import com.mypro.exception.BusinessException;
import com.mypro.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;
    public List<Department> selectDepartment(){
        return departmentMapper.selectDepartment();
    }
}
