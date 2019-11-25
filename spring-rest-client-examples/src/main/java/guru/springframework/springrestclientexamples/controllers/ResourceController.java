package guru.springframework.springrestclientexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.springrestclientexamples.services.ApiService;

@Controller
public class ResourceController {

    private ApiService apiService;

    public ResourceController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"/resourcelist"})
    public String index(Model model){
    	model.addAttribute("resources", apiService.getResources());

        return "resourcelist";
    }
  
}
