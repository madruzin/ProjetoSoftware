import entidades.Livro;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro harryPotter = new Livro("Harry Potter", "J.K. Rowling", 5,50);
        Livro naruto= new Livro("Naruto", "Masashi Kishimoto");

        harryPotter.emprestaLivro(1);
        naruto.emprestaLivro(1);

        System.out.println(harryPotter.toString());
        System.out.println(naruto.toString());

    }
    }
