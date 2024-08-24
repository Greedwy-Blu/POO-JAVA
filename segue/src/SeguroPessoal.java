/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Gabriel Oliveira Alves da silva
 * @author autologon
 */
public class SeguroPessoal extends Seguro{
   private String beneficente;
   private Data dataNascimento;

    public SeguroPessoal(String beneficente, Data dataNascimento, int numeroApolice, Data dataInicio, Data dataFim, double valor) {
        super(numeroApolice, dataInicio, dataFim, valor);
        this.beneficente = beneficente;
        this.dataNascimento = dataNascimento;
    }

   
    
    public String getBeneficente() {
        return beneficente;
    }

    public void setBeneficente(String beneficente) {
        this.beneficente = beneficente;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

   
@Override
public String toString() {
    return super.toString() +
            "\nNúmero da Apólice: " + getNumeroApolice() +
                "\nData de Início: " + getDataInicio() +
                "\nData de Fim: " + getDataFim() +
                "\nValor: " + getValor() +
           "\nBeneficente: " + this.beneficente +
           "\nData de Nascimento: " + this.dataNascimento;
}
}
