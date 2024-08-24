/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author autologon
 */
public class TestaAbstrata {
    
    public static void main(String[] args) {
        
        Quadrado q1 = new Quadrado("Quadrado",4);
        Triangulo t1 = new Triangulo("Triangulo",3,3,5,5,2.5);
        System.out.println("Area: " + q1.getNomeFigura() + " " + q1.obterArea());
        System.out.println("Area: " + t1.getNomeFigura() + " " + t1.obterArea());
        
        FiguraPlana f1;
        f1=q1;
        System.out.println("Area figura plana: " + f1.obterArea());
        
        f1=t1;
        System.out.println("Area figura plana: " + f1.obterArea());
        
        Triangulo t2;
        
        
        t2=(Triangulo) f1;
    }
    
}
