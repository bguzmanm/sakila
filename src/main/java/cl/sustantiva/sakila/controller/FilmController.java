package cl.sustantiva.sakila.controller;

import cl.sustantiva.sakila.model.FilmDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path="/peliculas")
public class FilmController {

    @Autowired
    FilmDAO fDAO = new FilmDAO();

    @GetMapping
    public String getPeliculas(Model model){

        model.addAttribute("films", fDAO.read());
        return "listadoPeliculas";
    }

}
