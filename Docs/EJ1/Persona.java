/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller9.Docs.EJ1;

/**
 *
 * @author JESUS DAVID
 */
public class Persona {
    
    String nombre;
    String edad;
    
    
    public Persona (String nombre, String edad){
        
        this.edad = edad;
        this.nombre = nombre;
    
    }

   public void mostrarDetalles() {
        System.out.println("Nombre:" + nombre + "Edad:" + edad);
    }
    
}
