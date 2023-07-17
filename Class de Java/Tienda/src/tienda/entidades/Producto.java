/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

/**
 *
 * @author pc
 */
public class Producto {
    private int codigoProd;
    private String nombreProd;
    private double precio;
    private int codigoFabricante;

    public Producto() {
    }

    public Producto(int codigoProd, String nombreProd, double precio, int codigoFabricante) {
        this.codigoProd = codigoProd;
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }
    
}
