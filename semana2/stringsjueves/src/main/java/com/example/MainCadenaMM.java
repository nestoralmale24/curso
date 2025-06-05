package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainCadenaMM {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "pepe", "DANIEL");

        List<String> mayusculas = palabras.stream().map(String :: toUpperCase).collect(Collectors.toList());

        System.out.println(mayusculas);

        List<String> minusculas = palabras.stream().map(String :: toLowerCase).collect(Collectors.toList());
        System.out.println(minusculas);
    }
}