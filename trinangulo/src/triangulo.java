/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebri
 */
public class triangulo {
    private float lado1;
    private float lado2;
    private float lado3;
    public float maior;
    public  float soma;
    
    public void recebe(float l1,float l2, float l3){
     
        l1= lado1;
        l2=lado2;
        l3=lado3;
       
        if(l1>l2 && l1>l3){
            maior=l1;
        }
        else if(l2>l1 && l2>l3){
             maior=l2;
        }
        else{
        maior=l3;
        }
    }
    
    
    public void somador(float l1,float l2, float l3){
         l1= lado1;
        l2=lado2;
        l3=lado3;
        
        
        if(maior > l1 && maior > l2){ // l3 é maior
            soma=l1+l2;
            if(soma == maior){
                System.out.println("é um triangulo");
            }
            else{
                System.out.println("não triangulo");
            }
        }
        else if(maior > l2 && maior > l3){ // l1 é maior
             soma=l2+l3;
            if(soma == maior){
                System.out.println("é um triangulo");
            }
            else{
                System.out.println("não triangulo");
            }

        }
        else if(maior > l1 && maior > l3){  // l2é maior
             soma=l1+l3;
            if(soma == maior){
                System.out.println("é um triangulo");
            }
            else{
                System.out.println("não triangulo");
            }
        }
            
        
    }
    
    
}
