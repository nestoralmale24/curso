package com.example.Utilidades;

public class UtilString {

    public static String dameMayusculas(String cadena){
        return cadena.toUpperCase();
    }

    public static int dameNumeroDeCaracteres(String cadena){
        return cadena.length();
    }


    public static String dameNumVocales(String cadena){
        int contador = 0;

        for(int x = 0 ; x<cadena.length() ; x++){
            if
            ((Character.toLowerCase(cadena.charAt(x)) == 'a') ||
                (Character.toLowerCase(cadena.charAt(x)) == 'e') ||
                (Character.toLowerCase(cadena.charAt(x)) == 'i') ||
                (Character.toLowerCase(cadena.charAt(x)) == 'o') ||
                (Character.toLowerCase(cadena.charAt(x)) == 'u')){
                    contador++;
                }
        }
        System.out.println("La palabra tiene " + contador + " vocales");
        return String.valueOf(contador);
    }

    public static boolean esPalindrome(String cadena) {
       for (int i = 0, j = cadena.length() - 1; i < j; i++, j--) {
           if (cadena.charAt(i) != cadena.charAt(j)) {
                System.out.println("no es palindrome");
                return false;
           }
       }
        System.out.println("es palindrome");
       return true;
   }

   //TRIM: ELIMINA ESPACIOS
   public static String eliminarEspacio(String cadena){
        String sinEspacio = cadena.trim();
        System.out.println(sinEspacio);
        return sinEspacio;
   }

   public static int contarCaracteres(String cadena, char caracter){
        int posicion = 0;
        int contador = 0;

        posicion = cadena.indexOf(caracter);
        while (posicion != -1){
            contador++;
        }

        System.out.println("El caracter " + caracter + " aparece " + contador + " veces");                   
        return contador;
   }
   
   //STRINGBUILDER REVERSE: INVIERTE SENTIDO ESCRITURA
    public static String cambiarSentido(String cadena){
        String invertida = new StringBuilder(cadena).reverse().toString();
        System.out.println(invertida);
        return invertida;
   }

   //REPALCE: REEMPLAZA CARACTERES
    public static String reemplazar(String cadena){
        String reemplazada = cadena.replace("a", "@");
        System.out.println(reemplazada);
        return reemplazada;
   }

}
