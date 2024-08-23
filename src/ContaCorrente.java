public class ContaCorrente extends Conta {

  // Método Construtor com Cliente como parâmetro, porque não consegue chamar mais o construtor padrão sem nada
  public ContaCorrente(Banco banco, Cliente cliente) {
    super(banco, cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("Extrato Conta Corrente");
    super.imprimirInfosExtrato();
  }

}