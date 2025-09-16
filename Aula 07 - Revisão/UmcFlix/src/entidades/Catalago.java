package entidades;

public class Catalago {
    private String nomeFilme;
    private String protagonista;
    private Genero genero;
    private String diretor;
    private int classificacao;

    public Catalago(String nomeFilme, String protagonista, Genero genero, String diretor, int classificacao) {
        this.nomeFilme = nomeFilme;
        this.protagonista = protagonista;
        this.genero = genero;
        this.diretor = diretor;
        if(classificacao >= 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        }else{
            this.classificacao = 0;
        }

    }
//getters e setters
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        if(classificacao >= 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        }else{
            System.out.println("classificacao invalida");
        }

    }
    //toString
    @Override
    public String toString() {
        return
                "\nFilme: " + nomeFilme +
                "\nProtagonista: " + protagonista +
                "\nGenêro: " + genero +
                "\nDiretor: " + diretor +
                "\nClassificacao: " + classificacao;
    }
}
