package com.example;

import java.util.Arrays;
import java.util.List;

public class MainParImpar {
	public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4);

    int evens = numbers.stream().filter(x -> x % 2 == 0).mapToInt(Integer :: intValue).sum();

    System.out.println(evens);

    int odd = numbers.stream().filter(x -> x % 2 != 0).mapToInt(Integer :: intValue).sum();
    System.out.println(odd);
    }
}