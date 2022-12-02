package com.teste.paulocavalcante.apisul.controller;


import com.teste.paulocavalcante.apisul.services.ElevadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elevador")
public class ElevadorController {

    @Autowired
    private ElevadorService elevadorService;
}
