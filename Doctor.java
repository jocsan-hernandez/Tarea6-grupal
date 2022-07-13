/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class Doctor extends Persona{
    private String especialidad; 
    public Doctor(String nombres, String apellidos, int edad){
        establecerEdad(edad);
        establecerNombres(nombres);
        establecerApellidos(apellidos);
    }
    public void establecerEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
    public void obtenerEspecialidad(){
        System.out.println(especialidad);
    }
    @Override
    public void obtenerProfesion() {
        System.out.println("Doctor");
    }
    
}
        