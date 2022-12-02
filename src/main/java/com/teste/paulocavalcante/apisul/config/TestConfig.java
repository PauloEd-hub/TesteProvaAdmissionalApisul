package com.teste.paulocavalcante.apisul.config;

import com.teste.paulocavalcante.apisul.entities.Elevador;
import com.teste.paulocavalcante.apisul.repositories.ElevadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ElevadorRepository elevadorRepository;


    @Override
    public void run(String... args) throws Exception {
        List<Elevador> elevadores = new ArrayList<>();

    }
}
