package com.proyecto.kata;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestComprobarDosIguales()
    {
        assertEquals("eui", App.lastSurvivors("ddui"));
    }

   @Test
    public void TestComprobarDosIgualesMaslarga(){
        assertEquals("etuy", App.lastSurvivors("dtduy"));
    }

    //        System.out.println(app.lastSurvivors("dtduyfibgfi"));
    @Test
    public void TestComprobarDosIgualesMaslarga1(){
        try {
            App.lastSurvivors("dtduyfibgfi");  
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Es demasiado largo");           
  
        }
    }
}
