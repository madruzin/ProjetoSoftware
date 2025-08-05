package variaveis;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        System.out.print("Digite o seu nome : ");
        nome = entrada.nextLine();
        System.out.println("Você digitou " + nome);

        int nota;
        System.out.println("Digite a nota ");
        nota = entrada.nextInt();
        System.out.println("A sua nota foi " + nota);

        double raio;
        System.out.println("Digite o raio ");
        raio = entrada.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;
        System.out.println("A area é igual a " + area);
        System.out.println("O perimetro é igual a " + perimetro);


        entrada.close();

    }
}
