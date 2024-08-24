/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author autologon
 */
public class ItemPedido {
    
    private Produto produto;
    private double quantidade;
    private double preco;
    
    public ItemPedido(Produto produto, double quantidade, double preco){
        setProduto(produto);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
