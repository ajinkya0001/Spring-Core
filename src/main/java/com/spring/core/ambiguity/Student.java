package com.spring.core.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
//	@Qualifier("python")       //  by name for Ambiguity it will get wxecuted
	Course course;
//	Course java;   // this is by using the direct bean we can resolve the ambiguity 
	
	void enrollCourse() {
		course.courseDetail();
//		java.courseDetail();
		System.out.println("Enrolled Successfully");
	}
}


/*
 *  AMBIGUITY : 
 * 
 * Over Primary the Qualifier will get first Preference
 * 
 * one more Way is there to resolve the AMBIGUITY BY USING BEAN NAME
 * LIKE DIRECT java
 * 
 * Ambiguity : 
 * 
 * Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
 * No qualifying bean of type 'com.spring.core.ambiguity.Course' available: expected single matching bean but found 2: java,python
 * */
 