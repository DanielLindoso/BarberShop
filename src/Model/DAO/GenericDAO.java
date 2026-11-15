package Model.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public abstract class GenericDAO<T> {
    private static final SessionFactory factory;
    
    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Falha ao criar SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    protected Session getSession() {
        return factory.openSession();
    }

    public void insert(T entity) {
        Session session = getSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    public abstract List<T> selectAll();
}