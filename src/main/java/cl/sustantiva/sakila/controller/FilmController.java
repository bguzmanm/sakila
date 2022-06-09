package cl.sustantiva.sakila.controller;

import cl.sustantiva.sakila.model.Film;
import cl.sustantiva.sakila.model.FilmDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class FilmController {

    @Autowired
    FilmDAO fDAO = new FilmDAO();

    @RequestMapping(path="/peliculas", method = RequestMethod.GET)
    public String getPeliculas(Model model){

        model.addAttribute("films", fDAO.read());
        return "listadoPeliculas";
    }

    @RequestMapping(path="/peliculas/{id}", method = RequestMethod.GET)
    public String getPelicula(@PathVariable("id") int id, Model model){
        model.addAttribute("pelicula", fDAO.read(id));

        return "pelicula";
    }

    @RequestMapping(value="/peliculas", method = RequestMethod.POST)
    public String updatePelicula(@RequestParam("film_id") int film_id,
                                 @RequestParam("title") String title,
                                 @RequestParam("description") String description,
                                 @RequestParam("release_year") int release_year,
                                 @RequestParam("rating") String rating){

        Film f = fDAO.read(film_id);

        System.out.println(f.toString());

        f.setDescription(description);
        f.setRating(rating);
        f.setRelease_year(release_year);
        f.setTitle(title);

        fDAO.update(f);

        return "redirect:/peliculas";

    }

}
