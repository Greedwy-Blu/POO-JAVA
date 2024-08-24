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
        CadastroVeiculo cadastro = new CadastroVeiculo();
        Veiculo v1 = new Veiculo(1, "Carro Utilitário");
        Veiculo v2 = new Veiculo(2, "Carro Passeio");
        Veiculo v3 = new Veiculo(3, "Carro da");
        cadastro.adicionaVeiculo(v1);
        cadastro.adicionaVeiculo(v2);
        cadastro.adicionaVeiculo(v3);
        cadastro.excluiVeiculoFaixa(1, 2);
        cadastro.mostraVeiculosUtilitarios();
    }
}
