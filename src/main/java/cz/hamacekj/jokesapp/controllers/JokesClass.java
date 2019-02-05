package cz.hamacekj.jokesapp.controllers;

import cz.hamacekj.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesClass {

    private JokesService jokesService;

    @Autowired
    public JokesClass(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokesService.generateRandomJoke());
        return "chucknorris";
    }

}
