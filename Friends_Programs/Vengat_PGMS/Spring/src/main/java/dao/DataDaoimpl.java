package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import model.Data;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository
public class DataDaoimpl implements DataDao {
    @Autowired
    private SessionFactory sf;

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    //Insert the data into table "Data" by using hibernate
    public void add(Data d) {
        Session session = this.sf.getCurrentSession();
        System.out.println("Add Dao working!!!");
        System.out.println(sf);
        session.persist(d);
    }

    //Show the data from table "Data"
    @SuppressWarnings("unchecked")
    public List<Data> show(Data d) {
        Session session = this.sf.getCurrentSession();
        System.out.println("Show Dao working!!!");
        return session.createCriteria(Data.class).list();
    }

    //Delete the data from database
    public void delete(Data d) {
        Session session = this.sf.getCurrentSession();
        System.out.println("Dao working!!!");
        session.delete(d);
    }
}