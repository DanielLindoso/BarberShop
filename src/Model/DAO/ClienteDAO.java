package Model.DAO;

import Model.Cliente;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class ClienteDAO extends GenericDAO<Cliente> {
    @Override
    public List<Cliente> selectAll() {
        Session session = getSession();
        Query<Cliente> query = session.createQuery("from Cliente", Cliente.class);
        List<Cliente> clientes = query.list();
        session.close();
        return clientes;
    }
}