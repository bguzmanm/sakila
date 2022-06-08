package cl.sustantiva.sakila.model;

import cl.sustantiva.sakila.model.idao.IFilmDAO;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class FilmDAO implements IFilmDAO {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template){
        this.template = template;
    }

    @Override
    public boolean create(Film f) {
        return false;
    }

    @Override
    public List<Film> read() {
        String sql = "select film_id, title, description, release_year, rating from film";

        return this.template.query(sql, new FilmRowMapper());
    }

    @Override
    public Film read(int id) {
        return null;
    }

    @Override
    public boolean update(Film f) {
        return false;
    }

    @Override
    public boolean delete(Film f) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
