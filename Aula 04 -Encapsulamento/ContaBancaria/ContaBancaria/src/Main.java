import entidades.ContaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    ContaBancaria conta = new ContaBancaria("Pedro","11999999999",140,55423,1000);


    conta.setNome("Pedro");
    conta.depositar(1500);
    conta.sacar(1000);
    System.out.println("Nome: " + conta.getNome());
    System.out.println("Agencia: " + conta.getAgencia());
    System.out.println("Conta: " + conta.getConta());
    System.out.println("Telefone: " + conta.getTelefone());
    System.out.println("Saldo: " + conta.getSaldo());
    }
}