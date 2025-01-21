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
public class Persona {
    private int id;
    private Date fnacimiento;
    private String nombre;
    private String apellido;
    private String dni;
    private String contraseña;
    private List<Evento> eventosAsistente = new ArrayList<>();
    
    
    
}
