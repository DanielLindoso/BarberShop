package Model;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "agendamentos")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;

    private float valor;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    private String hora;
    private String observacao;

    // Construtor padrão (Hibernate exige)
    public Agendamento() {
    }

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data, String hora, String observacao) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.hora = hora;
        this.observacao = observacao;
  
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data + " " + hora);
        } catch (ParseException ex) {
            this.data = null;
        }
    }

    // Getters e Setters
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
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
}