/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestoreventos.Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author DAW1
 */

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Evento {
    private static int numEventos=0;
    @EqualsAndHashCode.Include
    private int id;
    private String descripcion;
    private Date fecha;
    private String lugar;
    private boolean mayorEdad;
    private double coste;
    private List<Persona> asistentes = new ArrayList<>();

    public Evento() {
        Evento.numEventos++;
        this.id=Evento.numEventos;
    }

    public Evento(String descripcion, Date fecha, String lugar, boolean mayorEdad, double coste) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.mayorEdad = mayorEdad;
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + ", lugar=" + lugar + ", mayorEdad=" + mayorEdad + ", coste=" + coste + '}';
    }
    
    
    
    
    
}
