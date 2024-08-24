/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Gabriel Oliveira Alves da silva
 * @author autologon
 */
public abstract class Seguro {
    private int numeroApolice;
    private Data dataInicio;
    private Data dataFim;
    private double valor;

    public Seguro(int numeroApolice, Data dataInicio, Data dataFim, double valor) {
        this.numeroApolice = numeroApolice;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
    }
    
    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    @Override
    public String toString() {
        return "Seguro:" +
                "\nNúmero da Apólice: " + numeroApolice +
                "\nData de Início: " + dataInicio +
                "\nData de Fim: " + dataFim +
                "\nValor: " + valor;
    }
    
}
