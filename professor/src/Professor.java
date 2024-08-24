/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author autologon
 */
public class Professor {
    
    private int codigo;
    private String nome;
    private String curso;
    
    public Professor(int c, String n, String cs){
        
        setCodigo(c);
        setNome(n);
        setCurso(cs);
        
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int c){
        codigo=c;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome=n;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String c){
        curso=c;
    }
    
    public void mostrarDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
    }
    
}
