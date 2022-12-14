package com.proyecto;

import static org.junit.Assert.*;

import org.junit.Test;

/**
Normas:
Un juego lo gana el primer jugador que ha ganado al menos cuatro puntos en total y al menos dos puntos más que el oponente.
La puntuación de ejecución de cada juego se describe de una manera peculiar del tenis: las puntuaciones de cero a tres puntos 
se describen como "Amor", "Quince", "Treinta" y "Cuarenta" respectivamente.
Si cada jugador ha anotado al menos tres puntos y los puntajes son iguales, el puntaje es "Dos".
Si cada lado ha anotado al menos tres puntos y un jugador tiene un punto más que su oponente, 
el puntaje del juego es "Ventaja" para el jugador que va en cabeza.
*/
public class AppTest 
{
    /*
    Un juego lo gana el primer jugador que ha ganado al menos cuatro puntos en total y al menos dos puntos más que el oponente.
  */   
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

}
