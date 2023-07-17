public class ContaUsuario {
    
    int numeroDaConta = 1021;
    String agencia;
    String nomeCliente;
    double saldo;

    public void mostrarDados(){
        System.out.println("Informações da sua conta:");
        System.out.println("Numero da conta: " + numeroDaConta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }
    
    public Double sacar(Double valorSaque){
        if(saldo >= valorSaque){
            saldo = saldo - valorSaque;
            System.out.println("Você sacou : " + valorSaque);
            System.out.println("Seu saldo atual é de : R$" + saldo);
            
        }else System.out.println("Saldo insuficiente. ");
        return saldo;
    } 






    /*

    public void criarConta(int numeroConta, String agencia, String nomeCliente, double saldo){
         numeroDaConta = numeroConta;
         agencia = agencia;
         nomeCliente = nomeCliente;
         saldo = saldo;
         
    }

    public void nomeCliente(String nomeCliente){
        nomeCliente = nomeCliente;
    }
    public String agencia(String agencia){
       return agencia = agencia;
    }


    public Double sacar(Double valorSaque){
        if(saldo >= valorSaque){
            saldo = saldo - valorSaque;
            System.out.println("Você sacou : " + valorSaque);
            System.out.println("Seu saldo atual é de : R$" + saldo);
            
        }else System.out.println("Saldo insuficiente. ");
        return saldo;
    } 
    */
}
