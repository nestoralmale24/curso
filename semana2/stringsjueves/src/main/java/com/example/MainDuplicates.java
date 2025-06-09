package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,3,2,5);
        System.out.println("inicial: " + numbers);
        
        List<Integer> duplicados = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("sin duplicados: " + duplicados);
    }
}
