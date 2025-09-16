package entidades;

public class serie extends Catalago{
    private int temporada;
    private int epsodios;


    public serie(String nomeFilme, String protagonista, Genero genero, String diretor, int classificacao, int duracao, int Temporada, int epsodios) {
        super(nomeFilme, protagonista, genero, diretor, classificacao);
        this.temporada = temporada;
        this.epsodios = epsodios;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\ntemporada: " + temporada +
                "\nepsodios: " + epsodios;

    }
}
