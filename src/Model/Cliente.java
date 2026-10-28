package Model;

public class Cliente extends Pessoa {
    private String endereco;
    private String cep;

    // O construtor deve chamar o super()
    public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    // Getters e Setters apenas para os atributos específicos do Cliente
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
}