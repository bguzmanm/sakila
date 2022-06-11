package cl.sustantiva.sakila.model.mapper;

import cl.sustantiva.sakila.model.entity.Film;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmRowMapper implements RowMapper<Film> {
    @Override
    public Film mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Film(rs.getInt("film_id"), rs.getString("title"), rs.getString("description"),
                rs.getInt("release_year"), rs.getString("rating"));
    }
}
