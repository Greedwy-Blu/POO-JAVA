/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author autologon
 */
public class VeiculoPasseio extends Veiculo{
    
    private int nroPortas;
    
    public VeiculoPasseio(String marca, String modelo, int anoFabricacao, int nroPortas){
        super(marca,modelo,anoFabricacao);
        setNroPortas(nroPortas);
    }

    public int getNroPortas() {
        return nroPortas;
    }

    public void setNroPortas(int nroPortas) {
        this.nroPortas = nroPortas;
    }
    
    
    
}
