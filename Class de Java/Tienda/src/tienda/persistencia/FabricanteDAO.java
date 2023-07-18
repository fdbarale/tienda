/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Oficina
 */
public final class FabricanteDAO extends DAO{
    
    public void guardarFabricante (Fabricante fabricante) throws Exception{
        try {
            if (fabricante == null) {
                throw new Exception ("El usuario no existe, debe cargarlo");
            }
            String sql = "INSERT INTO Fabricante (nombre_fab, nombre_fab)"
                    + "VALUES ('" + fabricante.getCodigoFab() + "','" + fabricante.getNombreFab() + "');";
                                
        } catch (Exception e){
            throw e;
        }
    } 
}
