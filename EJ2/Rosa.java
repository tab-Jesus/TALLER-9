/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller9.EJ2;

/**
 *
 * @author JESUS DAVID
 */
public class Rosa extends Planta{
    
    String color;

    public Rosa(String color, String tipo){
        
        

            super(tipo);
           this.color = color;
                   
                   }           
    
    @Override
    public void mostrarDetalles(){
        
        super.mostrarDetalles();
        System.out.println("Color:" + color + "tipo:" + tipo );
        
    }
    
}
