import entidades.Filme;
import entidades.Genero;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o REGISTRO: ");
        System.out.println("1-FILME");
        System.out.println("2-SÉRIE");
        int opcao = sc.nextInt();

        System.out.println("Informe o nome do filme/série: ");
        String nome = sc.nextLine();
        System.out.println("Informe o Gênero: ");
        Genero genero = Genero.valueOf(sc.nextLine());
        System.out.println("Informe o Diretor: ");
        String diretor = sc.nextLine();
        System.out.println("Informe o protagonista: ");
        String protagonista = sc.nextLine();
        System.out.println("Informe a classificação: ");
        String classificacao = sc.nextLine();
        sc.close();

        if (opcao == 1) {
            System.out.println("Informe a duração do filme: ");
            int duracao = sc.nextInt();
            Filme filme = new Filme(nome,protagonista,diretor,genero,classificacao);
        } else if (opcao == 2) {
            System.out.println("Informe a quantidade de temporada: ")
        int temporada = sc.nextInt();
            System.out.println("Informe a quantidade de temporadas: ")
            int temporadas = sc.nextInt()
            int episodios = sc.nextInt();
            Serie serie = new (nome,protagonista,diretor,genero,classificacao);


}
    }
}