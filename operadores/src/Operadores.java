import java.util.Date;

import javax.xml.crypto.Data;

public class Operadores {
    public static void main(String[] args) throws Exception {
        // Atribuição é feito com o sinal de igualdade = exemplo:
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // operadores artiméticos são eles soma +, subtração -, divisão /, multiplicação
        // *, modulo/resto %;
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // operadores unarios ++ incremente um numero a expressão -- decrementa um
        // numero a expressão ! nega um valor a expressão

        int n1 = 5;
        n1 = - n1; //converte de positivo para negativo
        System.out.println(n1);

        n1 = n1 * -1; // converte de negativo para positivo
        System.out.println(n1);

        //operador ternario

        int a,b;
        a = 5;
        b = 5;
        //declara varivavel  | condição | se | senao
        String resultado1 = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado1);

        /*Operadores aritméticos
        == igualdade
        != diferente
        > maior que
        < menor que 
        >= maior ou igual que
        <= menor ou igual que 

        */

        /*Operadores Lógicos
        && e
        || ou */ 

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2){
            System.out.println("Verdadeiro");
        }else System.out.println("falso");
    }
}
