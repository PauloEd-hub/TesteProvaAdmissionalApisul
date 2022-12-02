package com.teste.paulocavalcante.apisul.services;

import com.teste.paulocavalcante.apisul.repositories.ElevadorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ElevadorService implements  IElevadorService{

    @Autowired
    private ElevadorRepository elevadorRepository;
    @Override
    public List<Integer> andarMenosUtilizado() {
        return null;
    }

    @Override
    public List<Character> elevadorMaisFrequentado() {
        return null;
    }

    @Override
    public List<Character> periodoMaiorFluxoElevadorMaisFrequentado() {
        return null;
    }

    @Override
    public List<Character> elevadorMenosFrequentado() {
        return null;
    }

    @Override
    public List<Character> periodoMenorFluxoElevadorMenosFrequentado() {
        return null;
    }

    @Override
    public List<Character> periodoMaiorUtilizacaoConjuntoElevadores() {
        return null;
    }

    @Override
    public float percentualDeUsoElevadorA() {
        return 0;
    }

    @Override
    public float percentualDeUsoElevadorB() {
        return 0;
    }

    @Override
    public float percentualDeUsoElevadorC() {
        return 0;
    }

    @Override
    public float percentualDeUsoElevadorD() {
        return 0;
    }

    @Override
    public float percentualDeUsoElevadorE() {
        return 0;
    }
}
