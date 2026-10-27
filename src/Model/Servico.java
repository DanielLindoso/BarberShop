package Model;

public class Servico {
    private int id;
    private String descricao;
    private float valor;

    // Construtor com 3 parâmetros (Alt+Insert > Constructor)
    public Servico(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters e Setters (Alt+Insert > Getter and Setter) - Apenas descricao e valor
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }
    // O ID não precisa de setter, mas pode ter getter se necessário.
}