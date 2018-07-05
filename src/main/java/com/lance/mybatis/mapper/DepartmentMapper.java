package com.lance.mybatis.mapper;

import com.lance.mybatis.domain.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {
	
	/**
	 * findOne
	 * @param id
	 * @return
	 */
	@Select(value="select *from boot_department where id=#{id}")
	Department findOne(int id);
	/**
	 * findOne
	 * @param id
	 * @return
	 */
	@Select(value="delete *from boot_department where id=#{id}")
	void delete(int id);

	/**
	 * findAll
	 * @return
	 */
	List<Department> findAll();
}
