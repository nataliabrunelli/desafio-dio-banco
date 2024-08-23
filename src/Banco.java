import java.util.ArrayList;
import java.util.List;

public class Banco {

  private String nome;
  private List<Conta> contas = new ArrayList<>();

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Conta> getContas() {
    return this.contas;
  }

  public void setContas(List<Conta> contas) {
    this.contas = contas;
  }

  public Banco(String nome) {
    this.setNome(nome);
  }

  public void adicionarContas(Conta conta) {
    contas.add(conta);
  }

  public List<Conta> imprimirContasCorrente() {
    List<Conta> contasCorrente = contas.stream().filter(c -> c instanceof ContaCorrente).toList();
    System.out.println("Lista de Contas Corrente: ");
    contasCorrente.forEach(conta -> System.out.println("Conta: " + conta.getNumero()));
    return contasCorrente;

    // Se o sout vem depois do return dá erro, porque em Java, quando um método atinge a instrução return, ele imediatamente sai do método, e qualquer código após essa instrução nunca será executado
  }

  public List<Conta> imprimirContasPoupanca() {
    List<Conta> contasPoupanca = contas.stream().filter(c -> c instanceof ContaPoupanca).toList();
    System.out.println("Lista de Contas Poupanca: ");
    contasPoupanca.forEach(conta -> System.out.println("Conta: " + conta.getNumero()));
    return contasPoupanca;
  }
}
