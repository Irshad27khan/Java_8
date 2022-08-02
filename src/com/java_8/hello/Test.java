package com.java_8.hello;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,4,5,2);
//		List<Integer> numbers1 = numbers.stream().sorted().collect(Collectors.toList());
//		System.out.println(numbers1)
		
//		List<Integer> numbers1 = numbers.stream().sorted().distinct().collect(Collectors.toList());
//		System.out.println(numbers1);
		
		List<Integer> numbers1 = numbers.stream().sorted().peek(System.out::println).distinct().collect(Collectors.toList());
		System.out.println(numbers1);
		
		List<Integer> numbers2 = numbers.stream().sorted().peek(System.out::println).skip(0).collect(Collectors.toList());
		System.out.println(numbers2);
	}

}
