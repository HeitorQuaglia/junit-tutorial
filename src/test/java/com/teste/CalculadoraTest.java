package com.teste;

import com.teste.Calculadora;
import org.junit.Assert;
import org.junit.Test;

import  org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar("1+1+1");

        Assert.assertEquals(3, soma);
    }
}
