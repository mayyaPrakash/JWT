package com.jwt.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
		System.out.println("Hello World");

		List<Integer> a= Arrays.asList(12,67,1,2,3,4,5);
		Comparator<Integer> c=(i1,i2)->i2-i1;

		Collections.sort(a);
		System.out.println("==="+a);


		a.stream().filter(i->i%2==0).forEach(System.out::println);
		a.stream().map(i->i*2).forEach(System.out::println);
		//System.out.println(a.stream().reduce(0,(c,e)->c+e));

	}

}
