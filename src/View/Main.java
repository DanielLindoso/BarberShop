package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.DAO.UsuarioDAO;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando inserção de dados de teste ---");

        try {
            // 1. Inserir um Usuário para o Login
            // Formato: (id, nome, sexo, dataNascimento, telefone, email, rg, senha, nivelAcesso)
            Usuario usuario = new Usuario(0, "barbeiro", 'M', "18/07/1990", "30212121", "barbeiro@email.com", "12345", "barbeiro", "admin");
            new UsuarioDAO().insert(usuario);
            System.out.println("✅ Usuário 'barbeiro' inserido com sucesso!");

            // 2. Inserir um Cliente
            // Formato: (id, nome, sexo, dataNascimento, telefone, email, rg, endereco, cep)
            Cliente cliente = new Cliente(0, "João Silva", 'M', "01/01/1990", "11999998888", "joao@email.com", "1234567", "Rua A, 123", "00000-000");
            new ClienteDAO().insert(cliente);
            System.out.println("✅ Cliente 'João Silva' inserido com sucesso!");

            // 3. Inserir um Serviço
            // Formato: (id, descricao, valor)
            Servico servico = new Servico(0, "Corte Simples", 30.0f);
            new ServicoDAO().insert(servico);
            System.out.println("✅ Serviço 'Corte Simples' inserido com sucesso!");

            System.out.println("--- Todos os dados iniciais foram inseridos! ---");
            System.out.println("Agora você pode rodar o Login.java e entrar com: barbeiro / barbeiro");

        } catch (Exception e) {
            System.err.println("❌ Erro ao inserir dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}