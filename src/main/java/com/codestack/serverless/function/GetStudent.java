package com.codestack.serverless.function;

import java.util.function.Supplier;

import org.springframework.stereotype.Component;

@Component
public class GetStudent implements Supplier<Student>{

	
	
	@Override
	public Student get() {
		
		System.out.println(Thread.currentThread().getName());
		
		Student st = new Student();
		st.setName("Dharmendra Jaypuria");
		st.setRollNo("157917");
		st.setDepartment("MCA");
		
		return st;
	}

}
