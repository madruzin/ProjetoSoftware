package entidades;

public class PagamentoBoleto extends Pagamento{
    //atributos
    private String codigoBarras;

    public PagamentoBoleto(String nomeCLiente, double valorPagamento, String dataPagamento , String codigoBarras) {
        super(nomeCLiente, valorPagamento, dataPagamento);
        this.codigoBarras = codigoBarras;
    }

    //SETTER
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    //GETTER
    public String getCodigoBarras() {
        return codigoBarras;
    }

    @Override
    public String toString() {
        return "nomeCLiente='" + getNomeCLiente() +
                "| valor do Pagamento=" + getValorPagamento() +
                "| Data Pagamento='" + getDataPagamento()+
                "| codigoBarras=" + codigoBarras
                ;

    }
}
