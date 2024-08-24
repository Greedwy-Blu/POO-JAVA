/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author autologon
 */
public class ProfessorHorista extends Professor{
    
    private double salarioHora;
    private double quantidadeHoras;
    
    public ProfessorHorista(int c, String n, String cs, 
                            double s, double q){
        super(c,n,cs);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        setSalarioHora(s);
        setQuantidadeHoras(q);
        
    }
    
    public double getSalarioHora(){
        return salarioHora;
    }
    
    public void setSalarioHora(double s){
        salarioHora=s;
    }
    
    public double getQuantidadeHoras(){
        return quantidadeHoras;
    }
    
    public void setQuantidadeHoras(double q){
        quantidadeHoras=q;
    }
    
    public void mostrarDados(){
        super.mostrarDados();;
        System.out.println("Salario hora: " + salarioHora);
        System.out.println("Quantidade de horas: " + quantidadeHoras);
        System.out.println("Salario final: " + obterSalario());
          System.out.println("Salario final: ");

    }
    
    public double obterSalario(){
        double salario;
        salario = salarioHora * quantidadeHoras;
        return salario;
    }
    
}
