/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class Deportista extends Persona{
    private String deporte; 
    public Deportista(String nombres, String apellidos, int edad){
        establecerEdad(edad);
        establecerNombres(nombres);
        establecerApellidos(apellidos);
    }
    public void establecerDeporte(String deporte){
        this.deporte=deporte;
    }
    
    public void obtenerDeporte(){
        System.out.println(deporte);
    }


    @Override
    public void obtenerProfesion() {
        System.out.println("Deportista");
    }
    
}
