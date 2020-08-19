package com.teste;

public class Calculadora {
    public int somar(String expressao) {
        int soma = 0;
        for (String valor : expressao.split("\\+")) {
            soma += Integer.parseInt(valor);
        }
        return soma;
    }

    public int somar(int... n){
        int soma = 0;
        for (int num : n) {
            soma += num;
        }
        return soma;
    }
}
