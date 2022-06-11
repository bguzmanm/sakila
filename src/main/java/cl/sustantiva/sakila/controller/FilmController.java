package cl.sustantiva.sakila.controller;

import cl.sustantiva.sakila.service.FilmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class FilmController {

    @Autowired
    FilmService fService;

    @RequestMapping(path="/peliculas", method = RequestMethod.GET)
    public String getPeliculas(Model model){

        model.addAttribute("films", fService.getAllFilms());
        return "listadoPeliculas";
    }

    @RequestMapping(path="/peliculas/{id}", method = RequestMethod.GET)
    public String getPelicula(@PathVariable("id") int id, Model model){
        model.addAttribute("pelicula", fService.getOne(id));

        return "pelicula";
    }

    @RequestMapping(value="/peliculas", method = RequestMethod.POST)
    public String updatePelicula(@RequestParam("film_id") int film_id,
                                 @RequestParam("title") String title,
                                 @RequestParam("description") String description,
                                 @RequestParam("release_year") int release_year,
                                 @RequestParam("rating") String rating){

        fService.update(film_id, title, description, release_year, rating);

        return "redirect:/peliculas";
    }
    @RequestMapping(value="/peliculas/new", method = RequestMethod.GET)
    public String crearPelicula(){
        return "nuevaPelicula";
    }

    @RequestMapping(value = "/peliculas/new", method = RequestMethod.POST)
    public String crearPelicula(@RequestParam("title") String title,
                                @RequestParam("description") String description,
                                @RequestParam("release_year") int release_year,
                                @RequestParam("rating") String rating){


        fService.create(title, description, release_year, rating);

        return "redirect:/peliculas";

    }

    @RequestMapping(value="/peliculas/del/{id}", method = RequestMethod.GET)
    public String deletePelicula(@PathVariable("id") int id){

        fService.delete(id);
        return "redirect:/peliculas";
    }

    @RequestMapping(value="/peliculas/actor/{id}")
    public String getFilmsByActor(@PathVariable("id") int actor_id, Model model){

        model.addAttribute("films", fService.getFilmsByActor(actor_id));
        return "listadoPeliculas";
    }


}
