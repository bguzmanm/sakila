package cl.sustantiva.sakila.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/")
public class HomeController {

    /**
     * Muestra la Página de Inicio
     *
     * @param request objeto {@link HttpServletRequest} que contiene la información
     *                de la solicitud que le hace el cliente al {@link HttpServlet}
     * @return un objeto {@link String} con la respuesta a la solicitud
     */
    @GetMapping
    public String paginaInicio(HttpServletRequest request) {

        // Mostrar página
        return "index";
    }

}
