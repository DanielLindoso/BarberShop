package Model.DAO;

import Model.Usuario;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class UsuarioDAO extends GenericDAO<Usuario> {
    
    @Override
    public List<Usuario> selectAll() {
        Session session = getSession();
        Query<Usuario> query = session.createQuery("from Usuario", Usuario.class);
        List<Usuario> usuarios = query.list();
        session.close();
        return usuarios;
    }

    public Usuario selectPorNomeESenha(Usuario usuario) {
        Session session = getSession();
        Query<Usuario> query = session.createQuery("from Usuario where nome = :nome and senha = :senha", Usuario.class);
        query.setParameter("nome", usuario.getNome());
        query.setParameter("senha", usuario.getSenha());
        Usuario usuarioEncontrado = query.uniqueResult();
        session.close();
        return usuarioEncontrado;
    }
}