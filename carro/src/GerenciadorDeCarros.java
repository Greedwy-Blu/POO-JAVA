/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebri
 */
public class GerenciadorDeCarros {
    private Carro[] carros;
    private int tamanho;

    // Construtor
    public GerenciadorDeCarros(int capacidade) {
        carros = new Carro[capacidade];
        tamanho = 0;
    }

    // Método para adicionar um carro ao array
    public void adicionarCarro(Carro carro) {
        if (tamanho < carros.length) {
            carros[tamanho] = carro;
            tamanho++;
            System.out.println("Carro adicionado com sucesso.");
        } else {
            System.out.println("Não foi possível adicionar o carro. Array cheio.");
        }
    }

    // Método para remover um carro do array
    public void removerCarro(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                carros[i] = carros[i + 1];
            }
            carros[tamanho - 1] = null;
            tamanho--;
            System.out.println("Carro removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para atualizar informações de um carro no array
    public void atualizarCarro(int indice, Carro novoCarro) {
        if (indice >= 0 && indice < tamanho) {
            carros[indice] = novoCarro;
            System.out.println("Carro atualizado com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para exibir todos os carros no array
    public void exibirCarros() {
        System.out.println("Lista de carros:");
        for (int i = 0; i < tamanho; i++) {
            carros[i].exibirInformacoes();
        }
    }
}

