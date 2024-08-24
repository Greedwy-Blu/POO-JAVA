/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author autologon
 */
public class Triangulo extends FiguraPlana {
    
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;
    private double base;
    
    public Triangulo(String nomeFigura, double lado1, double lado2, double lado3,
                     double altura, double base){
        super(nomeFigura);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
        setAltura(altura);
        setBase(base);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double obterArea(){
        double area;
        area=base*altura/2;
        return area;
    }
    
    
    
}
