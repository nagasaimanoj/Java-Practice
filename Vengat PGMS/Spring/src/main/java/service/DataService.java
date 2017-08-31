package service;

import model.Data;
import java.util.List;

public interface DataService {
    void add(Data d);

    List<Data> show(Data d);

    void delete(Data d);
}