package cl.sustantiva.sakila.model.dao;

import cl.sustantiva.sakila.model.entity.Actor;

import java.util.List;

public interface IActorDAO {

    public List<Actor> readActorByFilm(int film_id);
    public List<Actor> read();


}
