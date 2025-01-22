/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestoreventos.Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author DAW1
 */
@Data
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true )
public class Persona {
    private static int numPersonas;
    @EqualsAndHashCode.Include
    private int id;
    private Date fnacimiento;
    private String nombre;
    private String apellido;
    private String dni;
    private String contraseña;
    private List<Evento> eventos = new ArrayList<>();

    public Persona() {
        Persona.numPersonas++;
        this.id=Persona.numPersonas;
    }

    public Persona(Date fnacimiento, String nombre, String apellido, String dni, String contraseña) {
        this.fnacimiento = fnacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.contraseña = contraseña;
    }
    
    public boolean isMayorEdad(){
        GregorianCalendar gcHoy= new GregorianCalendar();
        GregorianCalendar gcFechaNacimiento=new GregorianCalendar();
        gcFechaNacimiento.setTime(this.fnacimiento);
        int añoActual=gcHoy.get(Calendar.YEAR);
        int añoNacimiento= gcFechaNacimiento.get(Calendar.YEAR);
        int edad= añoActual - añoNacimiento;
        // Si no ha cumplido años el dia actual sera MENOR respecto al dia de su nacimiento
        if(gcHoy.get(Calendar.DAY_OF_YEAR) < gcFechaNacimiento.get(Calendar.DAY_OF_YEAR)){
            edad--;
        }
        return edad>=18;
    }
    
    
}
