package com.lance.mybatis.service;

import com.lance.mybatis.domain.Department;

import java.util.List;

public interface DepartmentService {

	/**
	 * findAll
	 * @return
	 */
	List<Department> findAll();

    void delete(int id);

	Department findOne(int id);

	void insert(Department department);

	void update(Department department);

}
