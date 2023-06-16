/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Oficina
 */
public class Lavadora extends Electrodomesticos{
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void comprobarConsumoEnergetico(char letra) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que consumo energetico desea?");
        letra = (char) leer.nextShort();
       
        if (String.valueOf(letra)=="a" || String.valueOf(letra)=="b" || String.valueOf(letra)=="c" || String.valueOf(letra)=="d" || String.valueOf(letra)=="e" || String.valueOf(letra)=="f") {
         this.setConsumoEnergetico(letra);
             } else {
         letra = "f".charAt(0);
         this.setConsumoEnergetico(letra);
         }
    }

    @Override
    public void comprobarColor(String color) {
        
    }

    @Override
    public void crearElectrodomestico() {
        
    }

    @Override
    public void precioFinal() {
        
    }
    
}
