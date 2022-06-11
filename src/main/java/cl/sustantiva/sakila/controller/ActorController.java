package cl.sustantiva.sakila.controller;


import cl.sustantiva.sakila.service.ActorService;
import cl.sustantiva.sakila.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ActorController {

    @Autowired
    ActorService aService;

    @Autowired
    FilmService fService;

    @RequestMapping(value="/actores/pelicula/{id}", method = RequestMethod.GET)
    public String getActoresByPelicula(@PathVariable("id") int id, Model model){

        model.addAttribute("pelicula", fService.getOne(id));
        model.addAttribute("actores", aService.getActorByFilm(id));
        return "actores";


    }
    @RequestMapping(value="/actor")
    public String getActor(Model model){

        model.addAttribute("actores", aService.getAll());
        return "actores";

    }


}
