package com.example.Projeto.Spring_Boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController // ela vai fazer o papel de um controlador rest
@RequestMapping("/api") // mapeia a url
public class HelloController {

    @GetMapping("path") // get é usado para buscar informações
    public String hello() {
        return "Hello, World!";
    }
    
    
}
