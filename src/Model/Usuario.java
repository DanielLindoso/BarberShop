package Model;

public class Usuario extends Pessoa {
    private String senha;
    private String nivelAcesso;

    public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String senha, String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    // Construtor reduzido (usado no Helper e no Banco)
    public Usuario(int id, String nome, String senha) {
        super(id, nome, ' ', "01/01/2000", "", "", "");
        this.senha = senha;
    }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(String nivelAcesso) { this.nivelAcesso = nivelAcesso; }
}