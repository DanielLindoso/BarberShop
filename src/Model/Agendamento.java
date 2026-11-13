package Model;

public class Agendamento {
    private int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private String data;
    private String hora;
    private String observacao;

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data, String hora, String observacao) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
    }

    // Getters e Setters para todos
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Servico getServico() { return servico; }
    public void setServico(Servico servico) { this.servico = servico; }
    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
}