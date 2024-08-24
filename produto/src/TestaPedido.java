/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author autologon
 */
public class TestaPedido {
    
    public static void main(String[] args) {
        
        Cliente cli1 = new Cliente(10,"Agenor","Rua Catuaba, 327 - casa2");
        
        Produto p1 = new Produto(5,"Batata","Quilograma",7.85);
        Produto p2 = new Produto(10,"Manga","Duzia",8.75);
        Produto p3 = new Produto(762,"Sal","Quilograma",3.27);
        
        Pedido pe1 = new Pedido(120,"17/04/2024",cli1);
        
        pe1.incluiItemPedido(new ItemPedido(p1,3,7.85));
        
        ItemPedido it1 = new ItemPedido(p2,1,p2.getPreco());
        pe1.incluiItemPedido(it1);
        
        pe1.incluiItemPedido(new ItemPedido(p3,2,p3.getPreco()));
        pe1.mostraDadosPedido();
    }
    
    
}
