package br.com.una.banco.pooEx;

public class Conta {
       private double  deposito=0, saque=0,saldoAtual=0;
       private Usuario user;

    public Conta(double deposito, double saque, double saldoAtual, Usuario user) {
        this.deposito = deposito;
        this.saque = saque;
        this.saldoAtual = saldoAtual;
        this.user = user;
    }

    public Conta() {
    }

    public void realizarDeposito(){
        this.saldoAtual = this.user.getSaldoInicial() + this.deposito;
    }

    public void realizarSaque(){
        this.saldoAtual = this.getSaldoAtual() - this.saque;
        if (saque > saldoAtual){
            System.out.println("Saldo insuficiente para realizar esta operação.");
        }
        else if (saque > 5000.00){
            System.out.println("Valor do saque acima do permitido.");
        }
    }
    public void saldoAtual (){
        System.out.println("Saldo atual: "+ saldoAtual);
    }


    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}

