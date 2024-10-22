package org.factoriaf5;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void esDoublePositivoTest()
    {
        assertTrue(App.esDoublePositivo("1"));
        assertFalse(App.esDoublePositivo("0"));
        assertFalse(App.esDoublePositivo(""));
    }
    @Test
    public void calculaIMCTest()
    {
        Double peso = 53.88;
        Double altura = 1.95;
        Double imc = 14.16;
        assertTrue(App.calcularIMC(peso, altura).equals(imc));
    }
    @Test
    public void evaluaResultadoIMCTest()
    {
        assertTrue(App.evaluarResultadoIMC(15.0).equals("delgadez severa"));
        assertTrue(App.evaluarResultadoIMC(16.0).equals("delgadez moderada"));
        assertTrue(App.evaluarResultadoIMC(17.0).equals("delgadez leve"));
        assertTrue(App.evaluarResultadoIMC(18.5).equals("peso normal"));
        assertTrue(App.evaluarResultadoIMC(25.0).equals("sobrepeso"));
        assertTrue(App.evaluarResultadoIMC(30.0).equals("obesidad leve"));
        assertTrue(App.evaluarResultadoIMC(35.0).equals("obesidad moderada"));
        assertTrue(App.evaluarResultadoIMC(40.0).equals("obesidad morbida"));
    }

}
