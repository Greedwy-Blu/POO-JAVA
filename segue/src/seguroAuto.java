/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Gabriel Oliveira Alves da silva
 * @author autologon
 */
public class seguroAuto extends Seguro {
    private  double franquia;
    private  String revavem;
    private String marca;
    private  String modelo;
    private  int anoFabricacao;
    private int anoModelo;

    public seguroAuto(double franquia, String revavem, String marca, String modelo, int anoFabricacao, int anoModelo, int numeroApolice, Data dataInicio, Data dataFim, double valor) {
        super(numeroApolice, dataInicio, dataFim, valor);
        this.franquia = franquia;
        this.revavem = revavem;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }

    
    
    public double getFranquia() {
        return franquia;
    }

    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }

    public String getRevavem() {
        return revavem;
    }

    public void setRevavem(String revavem) {
        this.revavem = revavem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }


    @Override
public String toString() {
    return super.toString() +
            "\nNúmero da Apólice: " + getNumeroApolice() +
                "\nData de Início: " + getDataInicio() +
                "\nData de Fim: " + getDataFim() +
                "\nValor: " + getValor() +
           "\nFranquia: " + this.franquia +
           "\nRENAVAM: " + this.revavem +
           "\nMarca: " + this.marca +
           "\nModelo: " + this.modelo +
           "\nAno de Fabricação: " + this.anoFabricacao +
           "\nAno do Modelo: " + this.anoModelo;
}
   
    
    
    
}