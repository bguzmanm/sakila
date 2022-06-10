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
        String sql = "insert into film (title, description, release_year, rating) values (?, ?, ?, ?)";

        return template.update(sql,new Object[]{f.getTitle(), f.getDescription(), f.getRelease_year(), f.getRating()}) > 0;
    }


    @Override
    public List<Film> read() {
        String sql = "select film_id, title, description, release_year, rating from film";

        return this.template.query(sql, new FilmRowMapper());
    }

    @Override
    public Film read(int id) {
        String sql = "select film_id, title, description, release_year, rating from film WHERE film_id = ?";

        return this.template.queryForObject(sql, new Object[]{id}, new FilmRowMapper());
    }

    @Override
    public boolean update(Film f) {
        String sql = "UPDATE film set title = ?, description = ?, release_year = ?, rating = ? WHERE film_id = ? ";

        return this.template.update(sql, new Object[]{f.getTitle(), f.getDescription(), f.getRelease_year(), f.getRating(), f.getFilm_id()})>0;
    }

    @Override
    public boolean delete(Film f) {
        return delete(f.getFilm_id());
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM film where film_id = ?";
        return this.template.update(sql,new Object[]{id})>0;

    }
}
