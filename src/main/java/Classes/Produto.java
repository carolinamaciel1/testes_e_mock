package Classes;

public class Produto {
    private String descricao;
    private String unidade;
    private float valor;

    public Produto(String descricao, String unidade, float valor) {
        this.descricao = descricao;
        this.unidade = unidade;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }





}
