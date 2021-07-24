package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public void addCourse(Course course);
	public Course getCourse(long CourseId);
}
