public class Main {

  public static void main(String[] args) {

    Banco banco = new Banco("Brasil");

    Cliente cliente1 = new Cliente("Natália");
    Cliente cliente2 = new Cliente("Fernada");
    
    Conta cc = new ContaCorrente(banco, cliente1);
    Conta cc2 = new ContaCorrente(banco, cliente2);
    Conta cp = new ContaPoupanca(banco, cliente2);

    cc.depositar(10.00);
    cc.transferir(5.00, cp);

    cc.imprimirExtrato();
    cc2.imprimirExtrato();
    cp.imprimirExtrato();
    banco.imprimirContasCorrente();
    banco.imprimirContasPoupanca();
  }
}
