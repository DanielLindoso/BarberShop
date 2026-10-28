package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() {
        try {
            // Inicializa o banco de dados
            Model.DAO.Banco.inicia(); 
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 1. Pega o usuário e senha digitados na tela
        Usuario usuario = helper.obterModelo();
        
        // 2. Pesquisa no Banco de Dados
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuarioAutenticado = dao.selectPorNomeESenha(usuario);
        
        // 3. Verifica se o usuário existe
        if (usuarioAutenticado != null) {
            // Login sucesso! Abre o Menu e fecha o Login
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose(); 
        } else {
            // Login falhou
            view.exibeMensagem("Usuario ou senha invalidos");
        }
    }
}