package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.bean.CourseExample;
import com.briup.apps.poll.dao.CourseMapper;
import com.briup.apps.poll.service.ICourseService;

@Service
public class CourseServiceImpl  implements ICourseService{
	
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> findAllCourse() throws Exception {
		// TODO Auto-generated method stub
		CourseExample example=new CourseExample();
		return courseMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public Course findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return courseMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Course> query(String keywords) throws Exception {
		// TODO Auto-generated method stub
		CourseExample example=new CourseExample();
		//添加一个条件，name属性中包含keywords
		example.createCriteria().andNameLike(keywords);
		return courseMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public void saveOrUpdate(Course course) throws Exception {
		// TODO Auto-generated method stub
		//判断Id是否为空，空则保存，不空则更新
		if(course.getId()!=null){
			courseMapper.updateByPrimaryKey(course);
		}
		else{
			courseMapper.insert(course);
		}
	}

	@Override
	public void deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		courseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDelete(List<Long> ids) throws Exception {
		// TODO Auto-generated method stub
		for(long id:ids){
			courseMapper.deleteByPrimaryKey(id);
		}
	}

}
