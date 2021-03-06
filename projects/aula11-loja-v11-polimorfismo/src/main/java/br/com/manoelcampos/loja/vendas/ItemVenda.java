package br.com.manoelcampos.loja.vendas;

import br.com.manoelcampos.loja.geral.Produto;


public class ItemVenda
{
    private int id;
    private Venda venda;

    private Produto produto;
    private int quantidade;  
    private double percentualDesconto;
    
    public int getQuantidade(){ 
        return quantidade; 
    }
    
    public void setQuantidade(int quantidade){ this.quantidade = quantidade; }
    
    public Produto getProduto(){ return produto; }
    public void setProduto(Produto produto){ this.produto = produto; }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
