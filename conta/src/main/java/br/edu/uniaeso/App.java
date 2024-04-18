package br.edu.uniaeso;

public class App 
{
    public static void main( String[] args )
    {
        Cliente cli = new Cliente("Vagner", "Pereira", 11111111);
        Conta c1 = new Conta(cli, 00000);
        c1.limite = 200;
        c1.saldo = 100;

        System.out.println("Nome do Cliente: " + c1.dono.nome +" "+ c1.dono.sobrenome);
        System.out.println("Saldo: " + c1.saldo);

        boolean retornoSaque = c1.sacar(100);

        if(retornoSaque) 
        {
            System.out.println("Saque realizado com sucesso");
        } 
        else 
        {
            System.out.println("Saldo insufuciente, sai da liso");
        }

        System.out.println("Saldo: " + c1.saldo);
        
//        System.out.println("Saldo: " + c1.saldo);
//
//        c1.sacar(50);
//
//        System.out.println("Saldo: " + c1.saldo);
//
//        c1.depositar(150);
//
//        System.out.println("Saldo: " + c1.saldo);
    }
}
