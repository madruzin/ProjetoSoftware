package org.example;

import org.example.entidade.Pagamento;
import org.example.model.PagamentoCreateDAO;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do pagamento: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a data do pagamento: ");
        String data = sc.nextLine();
        Pagamento pagamento = new Pagamento(nome, valor, data);
        PagamentoCreateDAO dao = new PagamentoCreateDAO();
        dao.inserir(pagamento);

        sc.close();
    }
}