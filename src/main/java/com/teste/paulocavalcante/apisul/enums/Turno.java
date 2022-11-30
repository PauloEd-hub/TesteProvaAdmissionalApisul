package com.teste.paulocavalcante.apisul.enums;

import java.util.Arrays;
import java.util.Date;

public enum Turno {
    MATUTINO('M'),
    VESPERTINO('V'),
    NOTURNO('N');

    private char identificador;

    Turno(char identificador) {
        this.identificador = identificador;
    }


    public static Turno getTurnoByIdentificador(char identificador) {
        return Arrays.stream(values())
                .filter(turnoIdentificador -> turnoIdentificador == identificador)
                .findFirst()
                .orElse(null);
    }
}
