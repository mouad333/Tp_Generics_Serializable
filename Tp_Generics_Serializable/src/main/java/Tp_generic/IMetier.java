package Tp_generic;

import java.util.List;

public interface IMetier<T> {
    void add(T o);

    List<T> getAll();

    public T findById(long id);

    void delete(long id);

    public void saveAll();

    public List<T> getAllFromFile();
}
