/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebri
 */
class CadastroVeiculo {
    private Veiculo veiculos[] = new Veiculo[100];
    private int tamanho; // Tamanho atual do vetor

    // Construtor
    public CadastroVeiculo() {    
    tamanho = 0;
    }

    // Método para adicionar veículo
    public void adicionaVeiculo(Veiculo v) {
        if (tamanho < 100) {
            veiculos[tamanho] = v;
            tamanho++;
        } else {
            System.out.println("O vetor está cheio. Não é possível adicionar mais veículos.");
        }
    }

    // Método para excluir veículos na faixa de IDs
    public void excluiVeiculoFaixa(int id1, int id2) {
        for (int i = 0; i < tamanho; i++) {
            if (veiculos[i].getId() >= id1 && veiculos[i].getId() <= id2) {
                veiculos[i] = null; // Marca o veículo como excluído
            }
        }
    }

    // Método para mostrar apenas veículos utilitários
    public void mostraVeiculosUtilitarios() {
        for (int i = 0; i < tamanho; i++) {
            // Verifique se o veículo é utilitário (implemente a lógica conforme seus atributos)
            if (veiculos[i] != null && veiculos[i].getModelo().contains("Utilitário")) {
                System.out.println("Veículo utilitário: " + veiculos[i].getModelo());
            }
        }
    }
}