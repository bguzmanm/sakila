package cl.sustantiva.sakila.model.idao;

import cl.sustantiva.sakila.model.Actor;

import java.util.List;

public interface IActorDAO {

    public List<Actor> readActorByFilm(int film_id);
    

}
