package com.example.testinclassdevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestInClassDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestInClassDevOpsApplication.class, args);
		 int x = 123;
       
    System.out.println("Sum of x+y = " + x);
	}

}
