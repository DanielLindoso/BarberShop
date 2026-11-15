package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper implements IHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(List<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getCaixatabela().getModel();
        tableModel.setNumRows(0);

        for (Agendamento a : agendamentos) {
            tableModel.addRow(new Object[]{
                a.getId(),
                a.getCliente().getNome(),
                a.getServico().getDescricao(),
                a.getValor(),
                a.getData(),
                a.getHora(),
                a.getObservacao()
            });
        }
    }

    public void preencherCliente(List<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getClienteCaixaopcao().getModel();
        comboBoxModel.removeAllElements();
        for (Cliente c : clientes) {
            comboBoxModel.addElement(c);
        }
    }

    public void preencherServico(List<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getServicoscaixa().getModel();
        comboBoxModel.removeAllElements();
        for (Servico s : servicos) {
            comboBoxModel.addElement(s);
        }
    }

    public Servico obterServico() {
        return (Servico) view.getServicoscaixa().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTextovalor().setText(String.valueOf(valor));
    }

    @Override
    public Agendamento obterModelo() {
        Cliente cliente = (Cliente) view.getClienteCaixaopcao().getSelectedItem();
        Servico servico = (Servico) view.getServicoscaixa().getSelectedItem();
        
        String data = view.getDatatexto().getText();
        String hora = view.getCaixahora().getText();
        String observacao = view.getjTextArea1().getText();
        float valor = servico.getValor(); 

        return new Agendamento(0, cliente, servico, valor, data, hora, observacao);
    }

    @Override
    public void limparTela() {
        view.getDatatexto().setText("");
        view.getCaixahora().setText("");
        view.getjTextArea1().setText("");
        view.getTextovalor().setText("");
    }
}