package Model.DAO;

import Model.Agendamento;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class AgendamentoDAO extends GenericDAO<Agendamento> {
    @Override
    public List<Agendamento> selectAll() {
        Session session = getSession();
        Query<Agendamento> query = session.createQuery("from Agendamento", Agendamento.class);
        List<Agendamento> agendamentos = query.list();
        session.close();
        return agendamentos;
    }
}