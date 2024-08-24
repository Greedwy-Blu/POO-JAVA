/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebri
 */
public abstract class Carro {
    protected String marca;
    protected String modelo;
    protected int ano;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstrato para exibir informações do carro
    public abstract void exibirInformacoes();
    
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}

