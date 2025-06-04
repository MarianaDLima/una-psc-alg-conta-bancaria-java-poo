package br.com.una.banco.pooEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int numeroConta, opcao;
        double saldoInicial=0, valorDeposito=0, saque=0, saldo = 0;
        Usuario dados = new Usuario();

        System.out.println("Informe seu nome: ");
        dados.setNome(sc.nextLine());
        System.out.println("Digite o numero da conta : ");
        dados.setNumeroConta(sc.nextInt());
        System.out.println("informe saldo inicial : ");
        dados.setSaldoInicial(sc.nextDouble());
        System.out.println("Conta bancaria criada com sucesso ! \n Escolha uma ds opções abaixo: ");

        Conta conta = new Conta();
        conta.setUser(dados);


        System.out.println("Digite 1 para depositar valor, Digite 2 para sacar valor ,  Digite 3 para consultar saldo ou Digite 0 para encerrar: ");
        opcao = sc.nextInt();

        while ( opcao != 0  ){
            if (opcao == 1){
                System.out.println("Valor a ser depositado: ");
                valorDeposito = sc.nextDouble();
                conta.setDeposito(valorDeposito);
                conta.realizarDeposito();
                System.out.println("Deposito de R$ " + valorDeposito + " realizado com sucesso.");

            }
             else if ( opcao == 2){
                System.out.println("Qual valor deseja sacar? ");
                saque = sc.nextDouble();
                conta.setSaque(saque);
                conta.realizarSaque();
            }
             else if(saque <= saldo){
                System.out.println("Saque de" + saque + " realizado com sucesso. ");

            }
             else if (opcao == 3){
                 conta.saldoAtual();

            }
            System.out.println("Digite 1 para depositar valor, Digite 2 para sacar valor ,  Digite 3 para consultar saldo ou Digite 0 para encerrar: ");
            opcao = sc.nextInt();
        }


    }
}
