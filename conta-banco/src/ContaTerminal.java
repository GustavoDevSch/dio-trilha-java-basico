import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        ContaUsuario conta = new ContaUsuario();

        System.out.println("Deseja criar uma conta em nosso Banco DIO: S ou N"); // S = sim N = Não
        String sim = sc.next();
        sc.nextLine();

        if (sim.equalsIgnoreCase("S")) {
            System.out.println("Digite o numero da Conta: ");
            conta.numeroDaConta = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o numero da Agencia: ");
            conta.agencia = sc.next();
            sc.nextLine();

            System.out.println("Digite seu nome completo: ");
            conta.nomeCliente = sc.next();
            sc.nextLine();

            System.out.println("Deseja fazer um depósito Inicial: S ou N "); // S = sim N = Não
            sim = sc.next();
            sc.nextLine();

            if (sim.equalsIgnoreCase("S")) {
                System.out.println("Digite o valor do depósito: R$");
                conta.saldo = sc.nextDouble();

                conta.mostrarDados();

            } else {
                System.out.println("Seu saldo é de R$: " + conta.saldo);
            }

            System.out.println("Deseja Realizar uma operação de saque? S ou N"); // S = sim N = Não
            sim = sc.next();
            sc.nextLine();
            if (sim.equalsIgnoreCase("S")) {
                System.out.println("Digite o valor a ser sacado: ");
                double valorSaque = sc.nextDouble();
                conta.sacar(valorSaque);
            } else {
                conta.mostrarDados();
            }

        } else {
            System.out.println("Operação Cancelada!");
        }

        sc.close();
    }
}
