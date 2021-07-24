/**
 * 
 */
package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

/**
 * @author amith
 *
 */
@Service
public class CourseServiceImpl implements CourseService {

	/**
	 * 
	 */
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {		
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getById(courseId);
	}

	@Override
	public void addCourse(Course course) {
		courseDao.save(course);

	}

}
