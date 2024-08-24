/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author autologon
 */
public class Pedido {
    
    private int numeroPedido;
    private String dataPedido;
    private Cliente cliente;
    private ItemPedido itens[] = new ItemPedido[10];
    
    public Pedido(int numeroPedido, String dataPedido, Cliente cliente){
        setNumeroPedido(numeroPedido);
        setDataPedido(dataPedido);
        setCliente(cliente);
    }
    
    public void incluiItemPedido(ItemPedido item){
        
        if (verificaProdutoItens(item.getProduto().getCodigo())){
            System.out.println("Produto já anteriormente incluido no vetor itens");
            return;
        }
        
        for (int i = 0; i < itens.length; i++) {
            if (itens[i]==null){
                itens[i]=item;
                System.out.println("Item incluido no pedido");
                return;
            }
        }
        System.out.println("Item nao incluido. Vetor cheio");
        
    }
    
    public void alteraItemPedido(ItemPedido item){
        
        // ! é o operador lógico not
        
        if (!verificaProdutoItens(item.getProduto().getCodigo())){
            System.out.println("Produto nao cadastrado no vetor itens");
            return;
        }
        
        for (int i = 0; i < itens.length; i++) {
            if (itens[i]!=null){
                if (itens[i].getProduto().getCodigo()==item.getProduto().getCodigo()){
                    itens[i].setQuantidade(item.getQuantidade());
                    return;
                }
            }
            
        }
    }
    
    public double obtemValorTotalPedido(){
        double valorTotal=0;
        
        for (int i = 0; i < itens.length; i++) {
            if (itens[i]!=null){
                valorTotal=valorTotal + itens[i].getQuantidade() * itens[i].getPreco();
            }
            
        }
        
        return valorTotal;
    }
    
    public void mostrarItensPedido(){
        
        for (int i = 0; i < itens.length; i++) {
            if (itens[i]!=null){
                System.out.println("Codigo Produto: " + itens[i].getProduto().getCodigo());
                System.out.println("Nome Produto: " + itens[i].getProduto().getNome());
                System.out.println("Quantidade: " + itens[i].getQuantidade());
                System.out.println("Preco: " + itens[i].getPreco());
            }
            
        }
        
    }
    
    public boolean verificaProdutoItens(int codigo){
        
        for (int i = 0; i < itens.length; i++) {
            
            if (itens[i]!=null){
                if (itens[i].getProduto().getCodigo()==codigo){
                    return true;
                }
            }
            
        }
        return false;
        
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void mostraDadosPedido(){
        System.out.println("Numero: " +numeroPedido + " Data Pedido: " + dataPedido);
        System.out.println("Cliente: " + cliente.getNome());
        mostrarItensPedido();
    }
    
    
    
    
}
