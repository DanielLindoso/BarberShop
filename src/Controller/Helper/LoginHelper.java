package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper implements IHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    @Override
    public Usuario obterModelo() {
        String nome = view.getTxtUsuario().getText(); 
        String senha = view.getTxtSenha().getText();  
        return new Usuario(0, nome, senha);
    }

    @Override
    public void limparTela() {
        view.getTxtUsuario().setText("");
        view.getTxtSenha().setText("");
    }
}