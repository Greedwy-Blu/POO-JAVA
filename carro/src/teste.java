/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebri
 */

public class teste {
    public static void main(String[] args) {
        // Criando alguns objetos CarroEspecifico
        CarroEspecifico carro1 = new CarroEspecifico("Toyota", "Corolla", 2020, "Prata");
        CarroEspecifico carro2 = new CarroEspecifico("Honda", "Civic", 2018, "Preto");

        // Criando um gerenciador de carros com capacidade para 3 carros
        GerenciadorDeCarros gerenciador = new GerenciadorDeCarros(3);

        // Adicionando carros ao gerenciador
        gerenciador.adicionarCarro(carro1);
        gerenciador.adicionarCarro(carro2);

        // Exibindo carros no gerenciador
        gerenciador.exibirCarros();

        // Removendo o primeiro carro
        gerenciador.removerCarro(0);

        // Exibindo carros após remoção
        gerenciador.exibirCarros();

        // Atualizando o segundo carro
        CarroEspecifico novoCarro = new CarroEspecifico("Hyundai", "HB20", 2022, "Branco");
        gerenciador.atualizarCarro(0, novoCarro);

        // Exibindo carros após atualização
        gerenciador.exibirCarros();
    }
}