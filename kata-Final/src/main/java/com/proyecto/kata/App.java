package com.proyecto.kata;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    static char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static int cont = 0;
    static char letraRepite;
    static String  lista = "";

    public static void main( String[] args ){
        App app = new App();
        System.out.println(app.lastSurvivors("dd"));
        
    }

    public static String lastSurvivors(String dato){
        
        for(int i = 0; i<dato.length(); i++){
            for(int j = i+1; j<dato.length(); j++){
                if(dato.charAt(i) == dato.charAt(j)){
                    cont++;
                    letraRepite = dato.charAt(i);
                }

            }
        }

        String datoDuplicaddo = posicion(letraRepite, dato);


        return datoDuplicaddo;
    }

    public static String posicion(char caracter, String dato){
        int [] indiceDatosRepetidos = new int [2];
        int conta = 0;

        for(int i = 0; i<dato.length(); i++){
            if(dato.charAt(i) == caracter){
                indiceDatosRepetidos[conta] = i;
                conta ++;
            }
        }

        for(int i = 0; i<dato.length(); i++){
            if(i != indiceDatosRepetidos[1]){
                lista = lista.concat(String.valueOf(dato.charAt(i)));
            }
        }


        return lista;
    }
}
