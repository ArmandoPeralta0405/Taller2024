/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;

/**
 *
 * @author Liz
 */
public interface ConProveedor {
    public boolean agregar(Object obj);
    public boolean modificar(Object obj);
    public boolean eliminar(Object obj);
    public int nuevoID();
    public ArrayList<Object[]> consultar(String criterio);
    public boolean consultarDatos(Object obj);
    public boolean verificarDuplicacion(String criterio);
    public ArrayList<Object[]> obtenerExtracto(String criterio);
}