package com.gerenciadortarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApiController {

    @GetMapping("/teste-api")
    private String teste(){
        return "Sucesso";
    }
    @GetMapping("/teste-api-bem-vindo")
    public String testeBenVindo(@RequestParam(name = "nome")String nome){
        return "Olá "+nome+". Seja muito bem vindo";
    }
}
