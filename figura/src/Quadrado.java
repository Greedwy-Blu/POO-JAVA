/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author autologon
 */
public  class Quadrado extends FiguraPlana{
    
    private double lado;
    
    public Quadrado(String nomeFigura, double lado){
        super(nomeFigura);
        setLado(lado);
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double obterArea(){
        double area;
        area=lado*lado;
        return area;
    }
    
}
