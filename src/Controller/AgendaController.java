package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.List;

public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

    public void atualizaTabela() {
        AgendamentoDAO dao = new AgendamentoDAO();
        List<Agendamento> agendamentos = dao.selectAll();
        helper.preencherTabela(agendamentos);
    }

    public void atualizaCliente() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.selectAll();
        helper.preencherCliente(clientes);
    }

    public void atualizaServico() {
        ServicoDAO dao = new ServicoDAO();
        List<Servico> servicos = dao.selectAll();
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