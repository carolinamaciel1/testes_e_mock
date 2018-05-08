package Classes;

import java.util.Calendar;
import java.util.ArrayList;


public class NotaFiscal {
    private int  numero;
    private Calendar dataEmissao;
    private ArrayList<ItemNotaFiscal> items;
    private Cliente cliente;

    public NotaFiscal() {
        this.items = new ArrayList<ItemNotaFiscal>();
    }

    public NotaFiscal(int numero, Calendar dataEmissao, ArrayList<ItemNotaFiscal> items, Cliente cliente) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.items = items;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public ArrayList<ItemNotaFiscal> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemNotaFiscal> items) {
        this.items = items;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int inserirItemNotaFiscal (ItemNotaFiscal item) {
        this.items.add(item);
        return 0;
    }

    public float calcularValorNota() {
        float valorNota = 0;
        // Pecorre a lista de itens
        for (ItemNotaFiscal itnf : this.items) {
            // vai somando ao valor da nota a quantidade de cada item * o valor
            // do produto associado ao item
            valorNota = valorNota + (itnf.getQuantidade() * itnf.getProduto().getValor());
        }

        return valorNota;

    }

}
