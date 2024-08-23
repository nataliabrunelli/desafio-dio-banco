public abstract class Conta implements InterfaceConta {

  private static final int AGENCIA_PADRAO = 001;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  // Método Construtor
  public Conta(Banco banco, Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.saldo = 0;
    this.cliente = cliente;
    banco.adicionarContas(this);
  }

  // Getters e Setters
  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  // Métodos Implementados da Interface
  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  protected void imprimirInfosExtrato() {

    System.out.println("Cliente: " + this.cliente.getNome());
    System.out.println(String.format("Agência: %d", this.agencia));
    System.out.println(String.format("Número: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }
}