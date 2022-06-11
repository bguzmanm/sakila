package cl.sustantiva.sakila.service;

import cl.sustantiva.sakila.model.entity.Actor;

import java.util.List;

public interface ActorService {

    public List<Actor> getAll();
    public Actor getOne(int actor_id);
    public List<Actor> getActorByFilm(int film_id);


}
