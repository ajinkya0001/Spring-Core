package com.spring.core.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student std = ctx.getBean(Student.class);
		std.enrollCourse();
	}
}
