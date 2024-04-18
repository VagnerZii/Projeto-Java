package br.edu.uniaeso;

public class Conta 
{
    int numero;
    Cliente dono;
    double saldo;
    double limite;

    public Conta(){

    }

    public Conta(Cliente dono, int numero)
    {
        this.dono = dono;
        this.numero = numero;
    }

    public boolean sacar(double qtd)
    {
        if(saldo < qtd) {
            return false;
        } else {
            double novoSaldo = this.saldo - qtd;
            this.saldo = novoSaldo;
            return true;
        }
    }

    public void depositar(double qtd)
    {
        saldo += qtd;
    }
}