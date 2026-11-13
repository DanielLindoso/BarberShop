package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Agenda extends javax.swing.JFrame {
    private final AgendaController controller;

    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Idcaixa = new javax.swing.JLabel();
        Idtexto = new javax.swing.JTextField();
        Clientecaixa = new javax.swing.JLabel();
        ClienteCaixaopcao = new javax.swing.JComboBox<>();
        Caixaserviço = new javax.swing.JLabel();
        Servicoscaixa = new javax.swing.JComboBox<>();
        Caixavalor = new javax.swing.JLabel();
        Textovalor = new javax.swing.JTextField();
        Caixadata = new javax.swing.JLabel();
        Datatexto = new javax.swing.JTextField();
        Observacao = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        Textoobservacao = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Botaoagendar = new javax.swing.JToggleButton();
        Caixarelatorio = new javax.swing.JScrollPane();
        Caixatabela = new javax.swing.JTable();
        caixahora = new javax.swing.JTextField();
        Fundo2 = new javax.swing.JLabel();
        Fundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Idcaixa.setText("Id");
        getContentPane().add(Idcaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 40, 20));

        Idtexto.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(Idtexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 202, 50, 20));

        Clientecaixa.setText("Cliente");
        getContentPane().add(Clientecaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 70, 20));

        ClienteCaixaopcao.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(ClienteCaixaopcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 160, -1));

        Caixaserviço.setText("Serviços");
        getContentPane().add(Caixaserviço, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 20));

        Servicoscaixa.setBackground(new java.awt.Color(204, 204, 204));
        Servicoscaixa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ServicoscaixaItemStateChanged(evt);
            }
        });
        getContentPane().add(Servicoscaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, -1));

        Caixavalor.setText("Valor R$");
        getContentPane().add(Caixavalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 90, 20));

        Textovalor.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(Textovalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 160, 20));

        Caixadata.setText("Data");
        getContentPane().add(Caixadata, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 60, 20));

        Datatexto.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(Datatexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 130, 20));

        Observacao.setText("Observações");
        getContentPane().add(Observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, 20));

        Hora.setText("hora");
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        Textoobservacao.setViewportView(jTextArea1);
        getContentPane().add(Textoobservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 246, 320, 170));

        Botaoagendar.setBackground(new java.awt.Color(51, 51, 51));
        Botaoagendar.setText("Agendar");
        Botaoagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoagendarActionPerformed(evt);
            }
        });
        getContentPane().add(Botaoagendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 210, -1));

        Caixatabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        Caixarelatorio.setViewportView(Caixatabela);
        getContentPane().add(Caixarelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 840, 190));

        caixahora.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(caixahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 401, 90, 20));

        Fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Agenda-PainelFundo.png"))); 
        getContentPane().add(Fundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 880, 330));

        Fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/fundoagendamento.jpg"))); 
        getContentPane().add(Fundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 1500, 880));

        pack();
    }// </editor-fold>                        

    private void ServicoscaixaItemStateChanged(java.awt.event.ItemEvent evt) {                                              
        this.controller.atualizaValor();
    }                                             

    private void BotaoagendarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.controller.agendar();
    }                                             

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Agenda().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton Botaoagendar;
    private javax.swing.JLabel Caixadata;
    private javax.swing.JScrollPane Caixarelatorio;
    private javax.swing.JLabel Caixaserviço;
    private javax.swing.JTable Caixatabela;
    private javax.swing.JLabel Caixavalor;
    private javax.swing.JComboBox<String> ClienteCaixaopcao;
    private javax.swing.JLabel Clientecaixa;
    private javax.swing.JTextField Datatexto;
    private javax.swing.JLabel Fundo1;
    private javax.swing.JLabel Fundo2;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Idcaixa;
    private javax.swing.JTextField Idtexto;
    private javax.swing.JLabel Observacao;
    private javax.swing.JComboBox<String> Servicoscaixa;
    private javax.swing.JScrollPane Textoobservacao;
    private javax.swing.JTextField Textovalor;
    private javax.swing.JTextField caixahora;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
        this.controller.atualizaValor();
    }

    public JTable getCaixatabela() { return Caixatabela; }
    public void setCaixatabela(JTable Caixatabela) { this.Caixatabela = Caixatabela; }
    public JComboBox<String> getClienteCaixaopcao() { return ClienteCaixaopcao; }
    public void setClienteCaixaopcao(JComboBox<String> ClienteCaixaopcao) { this.ClienteCaixaopcao = ClienteCaixaopcao; }
    public JComboBox<String> getServicoscaixa() { return Servicoscaixa; }
    public void setServicoscaixa(JComboBox<String> Servicoscaixa) { this.Servicoscaixa = Servicoscaixa; }
    public JTextField getTextovalor() { return Textovalor; }
    public void setTextovalor(JTextField Textovalor) { this.Textovalor = Textovalor; }
    public JTextField getDatatexto() { return Datatexto; }
    public void setDatatexto(JTextField Datatexto) { this.Datatexto = Datatexto; }
    public JTextField getIdtexto() { return Idtexto; }
    public void setIdtexto(JTextField Idtexto) { this.Idtexto = Idtexto; }
    public JTextField getCaixahora() { return caixahora; }
    public void setCaixahora(JTextField caixahora) { this.caixahora = caixahora; }
    public JTextArea getjTextArea1() { return jTextArea1; }
    public void setjTextArea1(JTextArea jTextArea1) { this.jTextArea1 = jTextArea1; }
}