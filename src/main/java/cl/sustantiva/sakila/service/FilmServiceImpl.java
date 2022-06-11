package cl.sustantiva.sakila.service;

import cl.sustantiva.sakila.model.dao.FilmDAO;
import cl.sustantiva.sakila.model.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmDAO fDAO;

    @Override
    public List<Film> getAllFilms(){

        return fDAO.read();
    }

    @Override
    public Film getOne(int id){
        return fDAO.read(id);
    }
    @Override
    public boolean update(Film f){
        return fDAO.update(f);
    }
    @Override
    public boolean update(int film_id, String title, String description, int release_year, String rating){

        Film f = fDAO.read(film_id);
        f.setDescription(description);
        f.setRating(rating);
        f.setRelease_year(release_year);
        f.setTitle(title);

        return update(f);
    }
    @Override
    public boolean create(String title, String description, int release_year, String reating){
        Film f = new Film(0, title, description, release_year, reating);

        return fDAO.create(f);
    }
    @Override
    public boolean delete(int film_id){
        return fDAO.delete(film_id);

    }

    @Override
    public List<Film> getFilmsByActor(int actor_id) {
        return fDAO.readByActor(actor_id);
    }


}
