package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import Model.Agendamento;

public class Main {
    public static void main(String[] args) {
        // Teste Serviço
        Servico servico = new Servico(1, "Corte Degradê", 45.0f);
        System.out.println("Servico: " + servico.getDescricao());

        // Teste Cliente (Agora precisa de todos os parâmetros da herança)
        // Formato: id, nome, sexo, dataNascimento(String), telefone, email, rg, endereco, cep
        Cliente cliente = new Cliente(1, "Joao Silva", 'M', "01/01/1990", "11999998888", "joao@email.com", "1234567", "Rua das Flores, 123", "00000-000");
        System.out.println("Cliente: " + cliente.getNome());

        // Teste Usuário
        Usuario barbeiro = new Usuario(1, "Carlos", 'M', "01/01/1985", "11988887777", "carlos@email.com", "7654321", "senha123", "admin");
        System.out.println("Usuario: " + barbeiro.getNome());
        
        // Teste Agendamento (Construtor que criamos)
        Agendamento agendamento = new Agendamento(1, cliente, servico, 45.0f, "28/11/2023 14:00");
        System.out.println("Agendamento para: " + agendamento.getCliente().getNome());
        
        System.out.println("Testes concluidos com sucesso!");
    }
}