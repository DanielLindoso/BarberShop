package Model;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario extends Pessoa {
    private String senha;
    private String nivelAcesso;
    
        // Construtor vazio exigido pelo Hibernate
    public Usuario() {
    }

    public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String senha, String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    // Construtor reduzido para login
    public Usuario(int id, String nome, String senha) {
        super(id, nome, ' ', "01/01/2000", "", "", "");
        this.senha = senha;
    }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(String nivelAcesso) { this.nivelAcesso = nivelAcesso; }
}