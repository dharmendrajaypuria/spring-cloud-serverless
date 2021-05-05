package com.codestack.serverless;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudServerlessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerlessApplication.class, args);
	}
	
	@Bean
	public Function<String, Integer> findLength(){
		return (input) -> new StringBuffer(input).length();
	}
	
	@Bean
	public Supplier<String> getMessage(){
		return () -> "Hello Buddy";
	}
	
	@Bean
	public Consumer<String> printMessage(){
		return (input) -> System.out.println(input);
	}

}
