package com.example.Utilidades;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);   
        
        System.out.print("Introduce una palabra: ");
        String cadena_texto = sc.nextLine().toLowerCase();

        UtilString.dameNumVocales(cadena_texto);
        UtilString.esPalindrome(cadena_texto);    
        UtilString.eliminarEspacio(cadena_texto);    
        UtilString.cambiarSentido(cadena_texto);
        UtilString.reemplazar(cadena_texto); 
    }
}