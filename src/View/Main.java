package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Teste Serviço
        Servico servico = new Servico(1, "Corte Degradê", 45.0f);
        System.out.println("Servico: " + servico.getDescricao() + " - R$ " + servico.getValor());

        // Teste Cliente
        Cliente cliente = new Cliente(1, "Joao Silva", 'M', "11999998888", "Rua das Flores, 123");
        System.out.println("Cliente: " + cliente.getNome() + " - Tel: " + cliente.getTelefone());

        // Teste Usuário
        Usuario barbeiro = new Usuario(1, "Carlos", "senha123");
        System.out.println("Usuario: " + barbeiro.getNome() + " (Senha: " + barbeiro.getSenha() + ")");
        
        System.out.println("Testes concluidos com sucesso!");
    }
}