/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebri
 */
public class CarroEspecifico extends Carro {
    private String cor;

    // Construtor
    public CarroEspecifico(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano);
        this.cor = cor;
    }

    // Sobrescrita do método para exibir informações específicas do carro
    @Override
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);
    }
    
     public String toString() {
        return super.toString() + ", Cor: " + cor;
    }
    
}

// Classe para manipular um array de carros
