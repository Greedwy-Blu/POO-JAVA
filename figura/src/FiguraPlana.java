/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author autologon
 */
public abstract class FiguraPlana {
    
    private String nomeFigura;
    
    public FiguraPlana(String nomeFigura){
        this.nomeFigura=nomeFigura;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    public abstract double obterArea();
    
    
}
