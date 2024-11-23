
package co.edu.udec.s2.taller9.Docs.EJ1;

/**
 *
 * @author JESUS DAVID
 */
public class Empleado extends Persona{
    
    String departamento;

    public Empleado(String nombre, String edad, String departamento){
        
        

            super(nombre, edad);
           this.departamento = departamento;
                   
                   }           
    
    @Override
    public void mostrarDetalles(){
        
        super.mostrarDetalles();
        System.out.println("Nombre:" + nombre + "edad:" + edad + "Departamento:"+ departamento );
        
    }
    
}
