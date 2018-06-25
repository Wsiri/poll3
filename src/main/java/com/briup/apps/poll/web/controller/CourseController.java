package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;

@Api(description="课程相关接口")
@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private ICourseService iCourseService;
	
	
	//查询所有课程
	@GetMapping("findAllCourse")
	@ResponseBody
	public MsgResponse findAllCourse(){
		List<Course> list=new ArrayList<>();
		try {
			list=iCourseService.findAllCourse();
			return MsgResponse.success("查找成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	//通过ID查询课程
	@GetMapping("findById")
	@ResponseBody
	public Course findById(@RequestParam Long id){
		Course course = new Course();
		try {
			course = iCourseService.findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return course;
	}
	
	//通过关键字查询
	@GetMapping("findByKeyword")
	@ResponseBody
	public List<Course> findByKeyword(String keywords){
		List<Course> list=new ArrayList<>();
		try {
			list=iCourseService.query(keywords);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//保存或更新
}
