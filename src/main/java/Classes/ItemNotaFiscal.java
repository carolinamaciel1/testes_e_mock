package Classes;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class ItemNotaFiscal {

    private int    sequencial;
    private float  quantidade;
    private Produto produto;

    public ItemNotaFiscal(int sequencial, float quantidade, Produto produto) {
        this.sequencial = sequencial;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

}
