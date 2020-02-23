package com.spring.web.example.springWebTutorial.controller;

import com.spring.web.example.springWebTutorial.repository.PetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetController {

    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping("/list")
    public String index(Model model) {

        model.addAttribute("pets", petRepository.findAll());
        return "index";
    }
}
