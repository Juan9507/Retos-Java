/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4variante3juan;

import java.util.ArrayList;

/**
 *
 * @author 57317
 */
public class Reto4Variante3Juan {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Condominio condo = new Condominio();
    Inmueble inmu1 = new Inmueble("A1","1",700000.0,72023394);
    condo.agregarInmueble(inmu1);
    Inmueble inmu2 = new Inmueble("A12","",4,9);
    condo.agregarInmueble(inmu2);
    Inmueble inmu3 = new Inmueble("A12","33277591",6,9);
    condo.agregarInmueble(inmu3);
    Inmueble inmu4 = new Inmueble("A21","4",8,9);
    condo.agregarInmueble(inmu4);
    condo.mostrar();
    System.out.println(condo.desviacionEstandarCostoInmueble());
  }
  
}
