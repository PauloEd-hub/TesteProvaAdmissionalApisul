package com.teste.paulocavalcante.apisul.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Elevador")
public class Elevador {

    private Integer idElevador;

    private Character nome;

    private List<UsoDoElevador> usoDoElevador;
}
