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
public class Perro extends Animal {
  private String Raza;
  private String Ladra;
  private float Edad;

    public Perro() {
    }

    public Perro(String Raza, String Ladra, float Edad) {
        this.Raza = Raza;
        this.Ladra = Ladra;
        this.Edad = Edad;
    }

    public Perro(String Raza, String Ladra, float Edad, String TiempDeVida, String Especimen, String Genero) {
        super(TiempDeVida, Especimen, Genero);
        this.Raza = Raza;
        this.Ladra = Ladra;
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

    public String getLadra() {
        return Ladra;
    }

    public void setLadra(String Ladra) {
        this.Ladra = Ladra;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + ", Ladra=" + Ladra + ", Edad=" + Edad + '}';
    }

  
    
}
