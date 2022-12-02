package com.teste.paulocavalcante.apisul.entities;

import com.teste.paulocavalcante.apisul.enums.Turno;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "UsoDoElevador")
public class UsoDoElevador {
    private Elevador elevador;
    private Integer andar;
   @ManyToOne
    private Turno turno;


    public UsoDoElevador(Elevador elevador, Integer andar, Turno turno) {
        this.elevador = elevador;
        this.andar = andar;
        this.turno = turno;
    }
}
