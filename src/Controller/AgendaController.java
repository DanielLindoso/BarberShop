package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

        public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
        
        // LIGA O BANCO DE DADOS ASSIM QUE O CONTROLLER É CRIADO
        try {
            Model.DAO.Banco.inicia();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizaTabela() {
        AgendamentoDAO dao = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = dao.selectAll();
        helper.preencherTabela(agendamentos);
    }

    public void atualizaCliente() { // Ajustado o nome do método para ficar igual ao View
        ClienteDAO dao = new ClienteDAO();
        ArrayList<Cliente> clientes = dao.selectAll();
        helper.preencherCliente(clientes);
    }

    public void atualizaServico() {
        ServicoDAO dao = new ServicoDAO();
        ArrayList<Servico> servicos = dao.selectAll();
        helper.preencherServico(servicos);
    }

    public void atualizaValor() {
        Servico servico = helper.obterServico();
        if (servico != null) {
            helper.setarValor(servico.getValor());
        }
    }

    public void agendar() {
        Agendamento agendamento = (Agendamento) helper.obterModelo();
        new AgendamentoDAO().insert(agendamento);
        
        atualizaTabela();
        helper.limparTela();
    }
}