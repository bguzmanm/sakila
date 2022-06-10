package cl.sustantiva.sakila.controller;

import cl.sustantiva.sakila.model.ActorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ActorController {

    @Autowired
    ActorDAO aDAO = new ActorDAO();

    @RequestMapping(value="/actoresPelicula/{id}", method = RequestMethod.GET)
    public String getActoresByPelicula(@PathVariable("id") int id, Model model){

        model.addAttribute("actores", aDAO.readActorByFilm(id));
        return "actoresPelicula";


    }


}
