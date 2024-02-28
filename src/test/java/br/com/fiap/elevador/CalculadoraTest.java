package br.com.fiap.elevador;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    @DisplayName("deve retornar 12 quando somar 5 e 7")
    void somarTeste() {
        double valor1 = 5;
        double valor2 = 7;
        double soma = calc.somar(valor1, valor2);

        assertEquals(soma, 12, 0);
    }

    @Test
    @DisplayName("deve retornar 9.88 quando somar 6.2 e 3.6")
    void somarTeste_Decimais() {
        double valor1 = 6.25;
        double valor2 = 3.63;
        double soma = calc.somar(valor1, valor2);

        assertEquals(soma, 9.88, 88);
    }

    @Test
    @DisplayName("deve retornar 3 quando subtrair 7 de 10")
    void subtrairTeste() {
        double valor1 = 10;
        double valor2 = 7;
        double subtracao = calc.subtrair(valor1, valor2);
    }

    @Test
    @DisplayName("deve retornar 5.33 quando subtrair 6.27 de 11.60")
    void subtrairTeste_Decimais() {
        double valor1 = 6.27;
        double valor2 = 11.60;
        double subtracao = calc.subtrair(valor1, valor2);
    }

}
