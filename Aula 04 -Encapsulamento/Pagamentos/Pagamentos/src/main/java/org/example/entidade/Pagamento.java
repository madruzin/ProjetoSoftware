package org.example.entidade;

public class Pagamento {
    private int id;
    private String nomeCliente;
    private double valor;
    private String Data;

//criando um construtor!
    public Pagamento(String nomeCliente, double valor, String data) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        Data = data;
    }

//Criando um Setters (nao colocamos ID,por quem quem gera o ID é o BD
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void setData(String data) {
        Data = data;
    }

    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return Data;
    }
}
