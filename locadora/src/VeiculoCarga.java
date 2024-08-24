/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author autologon
 */
public class VeiculoCarga extends Veiculo{
    
    private double capacidade;
    
    public VeiculoCarga(String marca, String modelo, int anoFabricacao, double capacidade){
        super(marca,modelo,anoFabricacao);
        setCapacidade(capacidade);
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    
    
    
}
