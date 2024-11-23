/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller9.EJ2;

/**
 *
 * @author JESUS DAVID
 */
public class Pez extends Animal{
    
    String TipoDeAgua;

    public Pez(String especie, String TipoDeAgua){
        
        

            super(especie);
           this.TipoDeAgua = TipoDeAgua;
                   
                   }           
    
    @Override
    
    public void mostrarDetalles(){
        
        super.mostrarDetalles();
        System.out.println("Especie:" + especie + "tipo de agua:" + TipoDeAgua  );
        
    }
    
}
