/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Education
 */
public class CalculadoraJunitTest {

    @Test
    public void SomarNumerosPositivos() {
        Calculadora calc = new Calculadora();
        //Cenário de teste 1: Soma de dois valores
        int soma = calc.soma(3, 7);

        //Cenário de teste 2: Soma de dois valores sendo um zero
        soma = calc.soma(3, 0);
        System.out.println(soma);

        //Cenário de teste 3: Soma de dois valores sendo que ambos são zero
        soma = calc.soma(0, 0);
        System.out.println(soma);

        //Cenário de teste 4: Soma de dois valores sendo um negativo
        soma = calc.soma(3, -1);
        System.out.println(soma);

    }
    
}
