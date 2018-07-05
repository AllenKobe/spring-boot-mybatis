package com.lance.mybatis.service;

import com.lance.mybatis.domain.Department;
import com.lance.mybatis.domain.UserInfo;
import com.lance.mybatis.mapper.DepartmentMapper;
import com.lance.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> findAll() {
		return departmentMapper.findAll();
	}

	@Override
	public Department findOne(int id) {
		return departmentMapper.findOne(id);
	}

	@Override
	public void delete(int id) {
		 departmentMapper.delete(id);
	}

}
