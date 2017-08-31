package service;

import model.Data;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.DataDao;
import java.util.List;

@Service
public class DataServiceImplement implements DataService {
    @Autowired
    private DataDao dao1;

    public void setdao1(DataDao dao1) {
        this.dao1 = dao1;
    }

    @Transactional
    public void add(Data d) {
        System.out.println("Add Service working!!!");
        this.dao1.add(d);
    }

    @Transactional

    public List<Data> show(Data d) {
        System.out.println("Show Service working");
        return this.dao1.show(d);
    }

    @Transactional
    public void delete(Data d) {
        System.out.println("Delete service working");
        this.dao1.delete(d);
    }
}