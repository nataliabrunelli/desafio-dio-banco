public interface InterfaceConta {

  // Métodos da conta 
  void sacar(double valor);

  void depositar(double valor);

  void transferir(double valor, Conta contaDestino);

  void imprimirExtrato();
}