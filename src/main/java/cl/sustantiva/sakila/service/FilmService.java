package cl.sustantiva.sakila.service;

import cl.sustantiva.sakila.model.entity.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilms();
    Film getOne(int id);
    boolean update (Film f);
    boolean update(int film_id, String title, String description, int release_year, String rating);
    boolean create(String title, String description, int release_year, String rating);
    boolean delete(int film_id);

    List<Film> getFilmsByActor(int actor_id);

}
