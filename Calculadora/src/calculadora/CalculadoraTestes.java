/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Education
 */
public class CalculadoraTestes {

    public static void main(String[] args) {
        testeSoma();
        testeSub();
        testeMult();
        testeDiv();

    }
    
    //Teste Soma
    public static void testeSoma() {
        Calculadora calc = new Calculadora();
        //Cenário de teste 1: Soma de dois valores
        int soma = calc.soma(3, 7);
        System.out.println(soma);

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

    //Teste Subtração
    public static void testeSub() {
        Calculadora calc = new Calculadora();
        //Cenário de teste 1: Subtração de dois valores
        int sub = calc.subtracao(3, 7);
        System.out.println(sub);

        //Cenário de teste 2: Subtração de dois valores sendo um zero
        sub = calc.subtracao(3, 0);
        System.out.println(sub);

        //Cenário de teste 3: Subtração de dois valores sendo que ambos são zero
        sub = calc.subtracao(0, 0);
        System.out.println(sub);

        //Cenário de teste 4: Subtração de dois valores sendo um negativo
        sub = calc.subtracao(3, -1);
        System.out.println(sub);
    }
    
    //Teste Multiplicação
    public static void testeMult() {
        Calculadora calc = new Calculadora();
        //Cenário de teste 1: Multiplicação de dois valores
        int mult = calc.multiplicacao(3, 7);
        System.out.println(mult);

        //Cenário de teste 2: Multiplicação de dois valores sendo um zero
        mult = calc.multiplicacao(3, 0);
        System.out.println(mult);

        //Cenário de teste 3: Multiplicação de dois valores sendo que ambos são zero
        mult = calc.multiplicacao(0, 0);
        System.out.println(mult);

        //Cenário de teste 4: Multiplicação de dois valores sendo um negativo
        mult = calc.multiplicacao(3, -1);
        System.out.println(mult);
    }
    
    //Teste Divisão
    public static void testeDiv() {
        Calculadora calc = new Calculadora();
        //Cenário de teste 1: Divisão de dois valores
        double div = calc.divisao(3, 7);
        System.out.println(div);

        //Cenário de teste 2: Divisão de dois valores sendo um zero
        div = calc.divisao(3, 0);
        System.out.println(div);

        //Cenário de teste 3: Divisão de dois valores sendo que ambos são zero
        div = calc.divisao(0, 0);
        System.out.println(div);

        //Cenário de teste 4: Divisão de dois valores sendo um negativo
        div = calc.divisao(3, -1);
        System.out.println(div);
    }
}
