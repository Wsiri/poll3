package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Course;

public interface ICourseService {
	
	//查询所有
	List<Course> findAllCourse()  throws Exception;
	
	//通过ID查找
	Course findById(Long id) throws Exception;
	
	//通过关键字查询
	List<Course> query(String keywords) throws Exception;
	
	//保存或更新
	void saveOrUpdate(Course course) throws Exception;
	
	//根据ID删除
	void deleteById(Long id) throws Exception;
	
	//批量删除
	void batchDelete(List<Long> ids) throws Exception;
	
}
