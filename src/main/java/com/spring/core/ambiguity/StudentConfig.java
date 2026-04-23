package com.spring.core.ambiguity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan     //  no need to specify the package name bcoz same package
public class StudentConfig {

}
