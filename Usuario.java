package br.com.una.banco.pooEx;

public class Usuario {
  private String nome;
  private int numeroConta;
   private double saldoInicial;

    public Usuario(String nome, int numeroConta, double saldoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}
