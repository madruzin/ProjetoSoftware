import entidades.Pagamento;
import entidades.PagamentoBoleto;
import entidades.pagamentoCrédito;
import entidades.pagamentoPix;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pagamento> pagamentos = new ArrayList<>();
        String opcao;
        while (true) {

            System.out.println("1 - Cadastrar pagamento");
            System.out.println("2 - Listar pagamentos");
            System.out.println("3 - Sair");
            opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();

                System.out.print("Digita a data de Pagamento: ");
                String dataPagamento = sc.nextLine();

                System.out.print("Digite o valor do Pagamento: ");
                double valorPagamento = sc.nextDouble();
                sc.nextLine();

                System.out.println("Informe o metodo de pagamento:");
                System.out.println("1- BOLETO");
                System.out.println("2- PIX");
                System.out.println("3- CRÉDITO");
                int metodoPagamento = sc.nextInt();
                sc.nextLine();

                Pagamento pagamento = null;
                switch (metodoPagamento) {
                    case 1:
                        System.out.print("Digite o código de barras:");
                        String codigoBarras = sc.nextLine();
                        pagamento = new PagamentoBoleto(nome, valorPagamento, dataPagamento, codigoBarras);
                        break;
                    case 2:
                        System.out.println("Digite a chave do pix:");
                        String chavePix = sc.nextLine();
                        pagamento = new pagamentoPix(nome, valorPagamento, dataPagamento, chavePix);
                        break;
                    case 3:
                        System.out.println("Digite o numero do cartão:");
                        String numeroCartao = sc.nextLine();
                        pagamento = new pagamentoCrédito(nome, valorPagamento, dataPagamento, numeroCartao);
                        break;
                    default:
                        System.out.println("OPÇÃO INVALIDA");
                        continue;
                }
                pagamentos.add(pagamento);
            }
        else if (opcao.equals("2")) {
            System.out.println("\nLista de pagamentos");
            for (Pagamento pagamento : pagamentos) {
                System.out.println(pagamento.toString());
                ;
            }
        }
        }
    }
}
