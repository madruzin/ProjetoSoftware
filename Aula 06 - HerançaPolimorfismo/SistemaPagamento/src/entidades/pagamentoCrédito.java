package entidades;

public class pagamentoCrédito extends Pagamento {
    private String pagamentoCrédito;

    public pagamentoCrédito(String nomeCLiente, double valorPagamento, String dataPagamento , String pagamentoCrédito) {
        super(nomeCLiente, valorPagamento, dataPagamento);
    }

    //setter
    public void setPagamentoCrédito(String pagamentoCrédito) {
        this.pagamentoCrédito = pagamentoCrédito;
    }

    //getter

    public String getPagamentoCrédito() {
        return pagamentoCrédito;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "\nnomeCLiente='" + getNomeCLiente() +
                "\nvalor do Pagamento=" + getValorPagamento() +
                "\nData Pagamento='" + getDataPagamento()+
                "\nCartão de Credito=" + pagamentoCrédito;
    }
}
