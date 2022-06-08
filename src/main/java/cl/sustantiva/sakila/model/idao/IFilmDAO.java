package cl.sustantiva.sakila.model.idao;

import cl.sustantiva.sakila.model.Film;

import java.util.List;

public interface IFilmDAO {

    public boolean create(Film f);
    public List<Film> read();
    public Film read(int id);
    public boolean update(Film f);
    public boolean delete(Film f);
    public boolean delete(int id);

}
