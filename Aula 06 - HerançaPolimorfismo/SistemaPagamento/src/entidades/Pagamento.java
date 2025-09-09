package entidades;

public abstract class Pagamento {
    private String nomeCLiente;
    private double valorPagamento;
    private String DataPagamento;

//construtor
    public Pagamento(String nomeCLiente, double valorPagamento, String dataPagamento) {
        this.nomeCLiente = nomeCLiente;
        this.valorPagamento = valorPagamento;
        DataPagamento = dataPagamento;
    }
//Setters
    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCLiente = nomeCLiente;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        DataPagamento = dataPagamento;
    }
//Getters
    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public String getDataPagamento() {
        return DataPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "\nnomeCLiente='" + nomeCLiente +
                "\nvalorPagamento=" + valorPagamento +
                "\nDataPagamento='" + DataPagamento;
    }
}
