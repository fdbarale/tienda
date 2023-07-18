/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

/**
 *
 * @author pc
 */
public class Fabricante {
    private int codigoFab;
    private String nombreFab;

    public Fabricante() {
    }

    public Fabricante(int codigoFab, String nombreFab) {
        this.codigoFab = codigoFab;
        this.nombreFab = nombreFab;
    }

    public int getCodigoFab() {
        return codigoFab;
    }

    public void setCodigoFab(int codigoFab) {
        this.codigoFab = codigoFab;
    }

    public String getNombreFab() {
        return nombreFab;
    }

    public void setNombreFab(String nombreFab) {
        this.nombreFab = nombreFab;
    }
    
}
