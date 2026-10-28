package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public Usuario obterModelo() {
        // Se der erro aqui, é porque os campos do Login não foram renomeados
        String nome = view.getTxtUsuario().getText(); 
        String senha = view.getTxtSenha().getText();  
        return new Usuario(0, nome, senha);
    }

    public void limparTela() {
        view.getTxtUsuario().setText("");
        view.getTxtSenha().setText("");
    }
}