package com.generation.desafio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewControler {

    @GetMapping(path = "/acesso")
    public String viewMetods(String msg){
         return "Acesso Liberado";
    }
}
