/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public abstract class Persona {
    //Estableciendo atributos
    private String nombres;
    private String apellidos;
    private int edad;
    
     //Estableciendo atributos
    public void establecerNombres(String nombres){
        this.nombres=nombres;
    }
    
    public void establecerApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public void establecerEdad(int edad){
        this.edad=edad;
    }
    
    //Recuperando atributos
    public String obtenerNombre(){
        return nombres;
    }
    
    public String obtenerApellido(){
        return apellidos;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    
    //Metodo abstracto obtener profesion
    public abstract void obtenerProfesion();
}   
