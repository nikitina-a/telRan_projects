package de.telran.hellospringweb.controller;

import de.telran.hellospringweb.dto.HelloDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    //Using Spring MVC
    @RequestMapping(method = RequestMethod.GET, value = "/hello/{name}")
    public String hello(Model model, @PathVariable String name) {
        //model.addAttribute("name", name);
        return "hello";
    }

    // Without template
    @GetMapping("/string-hello/{name}")
    @ResponseBody
    public String stringHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // ObjectMapper with Jackson
    @GetMapping("/json-hello/{name}")
    @ResponseBody
    public HelloDto jsonHello(@PathVariable String name) {
        HelloDto helloDto = new HelloDto(name,"Hey you!");
        return helloDto;

    }

}
