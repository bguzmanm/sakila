package cl.sustantiva.sakila.model.dao;

import cl.sustantiva.sakila.model.entity.Actor;
import cl.sustantiva.sakila.model.mapper.ActorRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ActorDAO implements IActorDAO {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Actor> readActorByFilm(int film_id) {
        String sql = "SELECT a.actor_id, a.first_name, a.last_name " +
                "FROM actor a INNER JOIN film_actor fa ON a.actor_id = fa.actor_id WHERE fa.film_id = ?";

        return template.query(sql, new Object[]{film_id}, new ActorRowMapper());
    }

    @Override
    public List<Actor> read() {
        String sql = "select actor_id, first_name, last_name from actor";

        return template.query(sql, new ActorRowMapper());
    }
}
