public class TiposVariaveis {
    public static void TiposVariaveis(String[] args) throws Exception {
        byte quantidade = 123; // declaração de um byte
        short ano = 2023; // declaração de um short
        int idade = 28; // declaração de um inteiro
        long cpf = 31243884319L; // declaração de um long
        float pi = 3.14F; // declaração de um float
        double salarioMinimo = 2500; // maneira correta para representar milhar em double
        double salarioMaximo = 2.500; // maneira incorreta para representar milhar em double, este valor refere a 2.5

        // declarando uma constante, SEMPRE DEVE SER DECLARADO EM CAIXA ALTA
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 3.15;

        // CLASSE STRING

        String texto; // sem inicialização = valor null
        String nome = "Pedro"; // com inicizalição
        String meuNome = new String("Gustavo"); // declarando utilizando o metodo new
        String tamanho = "Gustavo Diego Schmidt";
        System.out.println(tamanho.length());

        // comparando Strings

        String nome1 = "Carlos";
        String nome2 = "Carla";

        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais!");
        } else
            System.out.println("Os nomes não são iguais!");

        // Para ignorar influencia da caixa alta
        String nome3 = "GUSTAVO";
        String nome4 = "GusTAvO";

        if (nome3.equalsIgnoreCase(nome4)) {
            System.out.println("Os nomes são iguais!");
        } else
            System.out.println("Os nomes são diferentes!");

        System.out.println("nome2.compareTo(nome1) = " + nome2.compareTo(nome1));
        System.out.println("nome1.compareTo(nome2) = " + nome1.compareTo(nome2));

        String texto1 = "A API de Strings é uma das mais utilizadas na linguagem Java";
        String linguagem = texto1.substring(texto1.indexOf("Java"), texto1.length());

        if (linguagem.compareToIgnoreCase("java") == 0) {
            System.out.println("compareToIgnoreCase: Encontrei a linguagem! Ela é " + linguagem);
        }

        if (linguagem.compareTo("java") == 0) {
            System.out.println("compareTo: Encontrei a linguagem! Ela é " + linguagem);
        }

        // pricipais metodos da classe String
        String primeiroNome = "Gustavo";
        String sobrenome = "Schmidt";

        String nomeCompleto = primeiroNome + sobrenome; // concatenando duas Strings com +

        System.out.println(nomeCompleto = primeiroNome.concat(" " + sobrenome)); // utilizando .concat

        // metodo valueOf

        double numero1 = 102939939.939;
        boolean booleano = false;

        System.out.println("Retorna Valor : " + String.valueOf(numero1));
        System.out.println("Retorna Valor: " + String.valueOf(booleano));

        // metodo lenght

        String nomeCurso = "Java Developer DIO ";
        System.out.println("O tamanho da String nomeCurso é : " + nomeCurso.length());

        // metodo charAt

        if (nomeCurso.charAt(1) == 'A') {
            System.out.println("O caracter A está na posicção 1");
        } else
            System.out.println("O caracter nao está na posicição 1");

        // metodo getChars
        nomeCurso = "Curso Java Web";
        // É A DIFERENÇA DO 1º E 2º PARÂMETRO DO MÉTODO getChars
        // SE DIMINUIR OS 2 O RESULTADO TEM QUE SER O MESMO INICIADO NO ARRAY
        char[] numIndice = new char[7];

        nomeCurso.getChars(2, 9, numIndice, 0);
        System.out.print("Valores Copiados \n");

        for (char caracter : numIndice) {
            System.out.print("[" + caracter + "]");
        }

        System.out.println("Abaixo indice demonstrativo dos valores copiados");

        int[] b = { 0, 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < b.length; i++) {
            System.out.print("[" + b[i] + "]");

        }
        System.out.println();
        // metodo replace

        String animal = "mesquite";
        String animalAlterado = animal.replace('e', 'o');
        System.out.println(animalAlterado);

        // Fim modulo Tipos de variaveis
    }
}
