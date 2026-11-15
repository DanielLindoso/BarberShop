package Model.DAO;

import Model.Servico;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class ServicoDAO extends GenericDAO<Servico> {
    @Override
    public List<Servico> selectAll() {
        Session session = getSession();
        Query<Servico> query = session.createQuery("from Servico", Servico.class);
        List<Servico> servicos = query.list();
        session.close();
        return servicos;
    }
}