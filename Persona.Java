/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_2_actividad1;

/**
 *
 * @author IMPERIO
 */
public class Persona {
 //Atributos
    private double estatura;
    private double peso;

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double obtenerIMC(){
    double imc = this.getPeso() / Math.pow(this.getEstatura(), 2);
        return imc;
        
    }
}
