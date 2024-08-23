public class ContaPoupanca extends Conta {

  // Método Construtor com Cliente como parâmetro, porque não consegue chamar mais o construtor padrão sem nada
  public ContaPoupanca(Banco banco, Cliente cliente) {
    super(banco,cliente);
  }

  @Override
  public void imprimirExtrato() {

    System.out.println("Extrato Conta Poupança");
    super.imprimirInfosExtrato();
  }
}