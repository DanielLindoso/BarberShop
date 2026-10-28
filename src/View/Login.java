package View;

import Controller.LoginController;

public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    private Controller.LoginController controller;

    public Login() {
        initComponents();
        controller = new Controller.LoginController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        lblSenha.setText("Senha");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 150, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 150, -1));

        jButton1.setText("Entrar");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logo1.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 830));

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.controller.entrarNoSistema();
    }                                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblSenha;

    // Métodos Auxiliares para o Controller
    public void exibeMensagem(String mensagem) {
        javax.swing.JOptionPane.showMessageDialog(null, mensagem);
    }

    public javax.swing.JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public javax.swing.JPasswordField getTxtSenha() {
        return txtSenha;
    }
}