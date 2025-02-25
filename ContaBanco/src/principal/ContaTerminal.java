package principal;

import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        int numeroConta;

        String agencia;

        String nomeCliente;

        double saldo;

        final String MENSAGEM = "Olá %s, obrigado por criar uma conta em nosso " +
                "banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao banco.\nPara começar, digite seu nome completo!");
        nomeCliente = scanner.nextLine();

        System.out.println("Agora digite sua agência");
        agencia = scanner.nextLine();

        System.out.println("Agora digite o número da sua conta");
        numeroConta = scanner.nextInt();

        System.out.println("Por fim, digite o seu saldo");
        saldo = scanner.nextDouble();

        String mensagemFormat = String.format(MENSAGEM, nomeCliente, agencia, numeroConta, saldo);

        System.out.println(mensagemFormat);


    }
}
