package cl.sustantiva.sakila.service;


import cl.sustantiva.sakila.model.dao.IActorDAO;
import cl.sustantiva.sakila.model.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    IActorDAO aDAO;

    @Override
    public List<Actor> getAll() {

        return aDAO.read();
    }

    @Override
    public Actor getOne(int actor_id) {
        return null;
    }

    @Override
    public List<Actor> getActorByFilm(int film_id) {
        return aDAO.readActorByFilm(film_id);
    }
}
