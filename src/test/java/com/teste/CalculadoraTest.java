package com.teste;

import com.teste.Calculadora;
import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar("1+1+1");

        Assert.assertEquals(3, soma);
    }

    @Test
    public void testSomarComMock() {
        Calculadora calc = mock(Calculadora.class);

        when(calc.somar("1+2")).thenReturn(10);

        int res = calc.somar("1+2");

        Assert.assertEquals(10, res);
    }

    @Test
    public void deveSomarDoisValores() {
        Calculadora calculadora = new Calculadora();
        int valorA = 1;
        int valorB = 2;

        int soma = calculadora.somar(valorA,valorB);

        Assert.assertEquals(soma, valorA + valorB);
    }
}
