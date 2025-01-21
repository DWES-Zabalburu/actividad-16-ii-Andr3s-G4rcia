/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestoreventos.Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DAW1
 */
public class Evento {
    private int id;
    private String descripcion;
    private Date fecha;
    private String lugar;
    private boolean mayorEdad;
    private List<Persona> personasAsistentes = new ArrayList<>();
}
