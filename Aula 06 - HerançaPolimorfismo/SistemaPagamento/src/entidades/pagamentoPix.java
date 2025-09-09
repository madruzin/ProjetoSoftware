package entidades;

public class pagamentoPix extends Pagamento {
    //atributo
    private String chavePix;

    public pagamentoPix(String nomeCLiente, double valorPagamento, String dataPagamento , String chavePix) {
        super(nomeCLiente, valorPagamento, dataPagamento);
    }


    //setter

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    //Getter

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public String toString() {
        return "nomeCLiente='" + getNomeCLiente() +
                "| valor do Pagamento=" + getValorPagamento() +
                "| Data Pagamento='" + getDataPagamento()+
                "| chave Pix=" + chavePix;
    }
}
