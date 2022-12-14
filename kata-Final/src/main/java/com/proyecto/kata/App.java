package com.proyecto.kata;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    static char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static int cont = 0;
    static char letraRepite = ' ';
    static String  lista = "";
    static String datoDuplicaddo = "";


    public static void main( String[] args ) {
        App app = new App();
        System.out.println(app.lastSurvivors("ddui"));
        System.out.println(app.lastSurvivors("dtduy"));
        app.lastSurvivors("dtduyfgdg");
        try {
            App.lastSurvivors("dtduyfibgfi");  
        } catch (Exception e) {
            System.out.println(e.getMessage());           
  
        }
        
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

        datoDuplicaddo = posicion(letraRepite, dato);

        try {
            if(datoDuplicaddo.length() >= 8){
                throw  new ExcepcionesPropias("Es demasiado largo");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return datoDuplicaddo;
    }

    public static String posicion(char caracter, String dato){
        int [] indiceDatosRepetidos = new int [2];
        int conta = 0;
        lista = "";

        for(int i = 0; i<dato.length(); i++){
            if(dato.charAt(i) == caracter){
                indiceDatosRepetidos[conta] = i;
                conta ++;
            }
        }

        for(int i = 0; i<dato.length(); i++){
            if(indiceDatosRepetidos[0] == i){
                lista = lista.concat(String.valueOf(buscarAbecedario(dato.charAt(i))));
            }
            if(i != indiceDatosRepetidos[1] && i != indiceDatosRepetidos[0]){
                lista = lista.concat(String.valueOf(dato.charAt(i)));
            }
        }


        return lista;
    }

    public static char buscarAbecedario(char dato){
        char sol = ' ';
        for(int i = 0; i< letras.length; i++){
            if(letras[i] == dato){
                sol = letras[i+1];
            }
        }
        return sol;
    }
}
