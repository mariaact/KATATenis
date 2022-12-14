package com.proyecto;


/**
 * Hello world!
 *
 */
public class App{
    static int marcadorj1 =0;
    static int marcadorj2 =0;
    static int anteriorj1 = 0;



    public static void main( String[] args ){
        String [] numeros1 = App.marcadorTenis("0-1-0-1-1-1-0-1-0-1");
        System.out.println(numeros1[0] + "   y   " + numeros1[1]);
    }

   /* public static int [] puntuancionTenis(String puntos){

        String [] puntosj1j2 = puntos.split("-");


        //System.out.println(puntosj1j2[0] + "  y  "+ puntosj1j2[1]);
        for(int i = 0; i < puntosj1j2.length; i++){
            if(i % 2 == 0){
                switch(puntosj1j2[i]){
                    case "Love": 
                    System.out.println("estoy en switch love");
                    marcadorj1 = marcadorj1 + 0;
                    anteriorj1 = 0;
                    break;
    
                    case "15":
                    System.out.println("estoy en switch 15");
                    marcadorj1 = marcadorj1 + 1;
                    anteriorj1 = 1;
                    break;
    
                    case "30":
                    System.out.println("estoy en switch 30");
                    marcadorj1 = marcadorj1 + 2;
                    anteriorj1 = 2;
                    break;
    
                    case "40":
                    System.out.println("estoy en switch 40 ");
                    marcadorj1 = marcadorj1 + 3;
                    anteriorj1 = 3;
                    break;
    
                   /* case "all":
                    System.out.println("estoy en switch all");
                    break;
                }
            }else{
                switch(puntosj1j2[i]){
                    case "Love": 
                    System.out.println("estoy en switch love");
                    marcadorj2 = marcadorj2 + 0;
                    break;
    
                    case "15":
                    System.out.println("estoy en switch 15");
                    marcadorj2 = marcadorj2 + 1;
                    break;
    
                    case "30":
                    System.out.println("estoy en switch 30");
                    marcadorj2 = marcadorj2 + 2;
                    break;
    
                    case "40":
                    System.out.println("estoy en switch 40 ");
                    marcadorj2 = marcadorj2 + 3;
                    break;
    
                    case "all":
                    System.out.println("estoy en switch all");
                    marcadorj2 = marcadorj2 + anteriorj1;

                    break;
                }
            }
            
        }

        int [] numeros = {marcadorj1, marcadorj2};

        if(marcadorj1 >= 4 && (marcadorj2 - marcadorj1 >= 2)){
            System.out.println("Ha ganado el jugador 1");
        }else if(marcadorj2 >= 4 && (marcadorj2 - marcadorj1 >= 2)){
            System.out.println("Ha ganado el jugador 2");
        }

        
        return numeros;
    }*/

    public static String [] marcadorTenis(String puntos){

        String [] puntosj1j2 = puntos.split("-");
         marcadorj1 = 0;
         marcadorj2 = 0;

        for(int i = 0; i < puntosj1j2.length; i++){
            System.out.println("------"+puntosj1j2[i]);

            //jugador 1
            if(i % 2 ==0){
                marcadorj1 += Integer.parseInt(puntosj1j2[i]);
            //jugador 2
            }else{
                marcadorj2 += Integer.parseInt(puntosj1j2[i]);
            }
        }

        String datos [] = transformardatos(marcadorj1, marcadorj2);
        System.out.println(datos[0] + "   /y/   "+ datos[1]);

        
        return datos;
    }

   static public String [] transformardatos(int marcadorj1, int marcadorj2){

    int ventaja1 =0;
    int ventaja2 =0;


        String [] marcadorSolucion= new String [2];


        if(marcadorj1 > 3 || marcadorj2 > 3){
            if(marcadorj1 > 3 ){
                ventaja1 = marcadorj1 - 3 ;
                marcadorj1 = 3;
                if(ventaja1 == 1){
                    System.out.println("ventaja1");
                }else{
                    System.out.println("Ha gando el jugador 1");
                }
            }if(marcadorj2 > 3){
                ventaja2 = marcadorj2 - 3 ;
                marcadorj2 = 3;
                if(ventaja2 == 1){
                    System.out.println("ventaja2");
                }else{
                    System.out.println("Ha gando el jugador 2");
                }
            }
        }

        System.out.println("ventajaaassss" + ventaja1+ventaja2);


        if(marcadorj1 == 0 || marcadorj2 == 0){
            if(marcadorj1 == 0 && marcadorj2 == 0){
                marcadorSolucion[0] ="Love";
                marcadorSolucion[1] ="all";
            }else if(marcadorj1 == 0){
                marcadorSolucion[0] = "Love";
            }else{
                marcadorSolucion[1] ="Love";
            }
        } if(marcadorj1 == 1 || marcadorj2 == 1){
            if(marcadorj1 == 1 && marcadorj2 == 1){
                marcadorSolucion[0] ="15";
                marcadorSolucion[1] ="all";
            }else if(marcadorj1 == 1){
                marcadorSolucion[0] ="15";
            }else{
                marcadorSolucion[1] ="15";
            }
        } if(marcadorj1 == 2 || marcadorj2 ==2){
            if(marcadorj1 == 2 && marcadorj2 == 2){
                marcadorSolucion[0] ="30";
                marcadorSolucion[1] ="all";
            }else if(marcadorj1 == 2){
                marcadorSolucion[0] ="30";
            }else{
                marcadorSolucion[1] ="30";
            }
        } if(marcadorj1 == 3 || marcadorj2 ==3){
            if(marcadorj1 == 3 && marcadorj2 == 3){
                marcadorSolucion[0] ="40";
                marcadorSolucion[1] ="all";
            }else if(marcadorj1 == 3){
                marcadorSolucion[0] ="40";
            }else{
                marcadorSolucion[1] ="40";
            }
        }

        if(ventaja1 == 1){marcadorSolucion[0] = "ad";}if(ventaja2 == 1){marcadorSolucion[1]="";marcadorSolucion[1]="ad";}
        if(ventaja1 >= 2){marcadorSolucion[0] = "WIN";}if(ventaja2 >= 2){marcadorSolucion[1]="";marcadorSolucion[1]="WIN";}



        System.out.println("----------------------fd--------------------------");
        System.out.println(marcadorj1);//1
    
        System.out.println(marcadorSolucion[0] + marcadorSolucion[1]);//3
        System.out.println("-----------------------gdhg-------------------------");

       
        return marcadorSolucion;
    }
}
