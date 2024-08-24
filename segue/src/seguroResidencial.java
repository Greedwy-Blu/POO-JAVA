/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Gabriel Oliveira Alves da silva
 * @author autologon
 */
public class seguroResidencial extends Seguro{
    private double franquia;
    private int anoContrucao;

    public seguroResidencial(double franquia, int anoContrucao, int numeroApolice, Data dataInicio, Data dataFim, double valor) {
        super(numeroApolice, dataInicio, dataFim, valor);
        this.franquia = franquia;
        this.anoContrucao = anoContrucao;
    }

   
    
    
    public double getFranquia() {
        return franquia;
    }

    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }

    public int getAnoContrucao() {
        return anoContrucao;
    }

    public void setAnoContrucao(int anoContrucao) {
        this.anoContrucao = anoContrucao;
    }

    @Override
    public String toString() {
       return super.toString() +
                 "\nSeguro Residencial: " +
                "\nNúmero da Apólice: " + getNumeroApolice() +
                "\nData de Início: " + getDataInicio() +
                "\nData de Fim: " + getDataFim() +
                "\nValor: " + getValor() +
                "\nFranquia: " + franquia +
                "\nAno de Construção: " + anoContrucao;
    }

    
}
