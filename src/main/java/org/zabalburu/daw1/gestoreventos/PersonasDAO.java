/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.gestoreventos;

import org.zabalburu.daw1.gestoreventos.Modelo.Persona;

/**
 *
 * @author DAW1
 */
public interface PersonasDAO {
    Persona añadirPersona(Persona nueva);
    void eliminarPersona(int id);
    
}
