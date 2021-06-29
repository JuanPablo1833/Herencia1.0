/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1833;

/**
 *
 * @author Dell
 */
public class Gato extends Animal {
    private String Raza;
    private String Maulla;
    private float Edad;

    public Gato() {
    }

    public Gato(String Raza, String Maulla, float Edad) {
        this.Raza = Raza;
        this.Maulla = Maulla;
        this.Edad = Edad;
    }

    public Gato(String Raza, String Maulla, float Edad, String TiempDeVida, String Especimen, String Genero) {
        super(TiempDeVida, Especimen, Genero);
        this.Raza = Raza;
        this.Maulla = Maulla;
        this.Edad = Edad;
    }

    public float getEdad() {
        return Edad;
    }

    public void setEdad(float Edad) {
        this.Edad = Edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getMaulla() {
        return Maulla;
    }

    public void setMaulla(String Maulla) {
        this.Maulla = Maulla;
    }

    @Override
    public String toString() {
        return "Gato{" + "Raza=" + Raza + ", Maulla=" + Maulla + ", Edad=" + Edad + '}';
    }
 
  
    
    
    
}
