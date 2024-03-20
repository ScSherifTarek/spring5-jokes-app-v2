package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeGenerator jokeGenerator;

    public JokeController(JokeGenerator jokeGenerator) {
        this.jokeGenerator = jokeGenerator;
    }

    @RequestMapping({"/", ""})
    public String index(Model model) {
        model.addAttribute("joke", jokeGenerator.getRandomOne());
        return "index";
    }
}
