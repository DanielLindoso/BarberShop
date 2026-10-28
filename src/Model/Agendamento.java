package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    private int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private Date data;
    private String observacao;
    private String hora;

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            this.data = null;
        }
    }
    
        // Construtor extra para receber a hora separada e observação (usado no Banco.java)
    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data, String hora, String observacao) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.hora = hora;
        this.observacao = observacao;
        try {
            // Junta a data e a hora para fazer o parse correto
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data + " " + hora);
        } catch (ParseException ex) {
            this.data = null;
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Servico getServico() { return servico; }
    public void setServico(Servico servico) { this.servico = servico; }
    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
}