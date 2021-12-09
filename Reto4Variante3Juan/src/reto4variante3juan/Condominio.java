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
public class Condominio {

  //Inserte acá los atributos
  private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

  //Inserte acá el método constructor
  public Condominio() {

  }
  

  //Inserte acá los SETTERS Y GETTERS
  public ArrayList<Inmueble> getInmuebles() {
    return inmuebles;
  }
  
  public void setInmuebles(ArrayList<Inmueble> inmuebles) {  
    this.inmuebles = inmuebles;
  }

  //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
  public void agregarInmueble(Inmueble i) {
    boolean verdad = false;
    if (inmuebles.size() == 0) {
      inmuebles.add(i);
    }
    for (int index = 0; index < inmuebles.size(); index++) {
      if (inmuebles.get(index).getIDArrendador().equals(i.getIDArrendador())) {
        verdad = true;
        break;
      }
    }
    if (verdad == false) {
      inmuebles.add(i);
    }
  }

  public void eliminarInmueble(String ID) {
    boolean encontrado = false;
    int aux = 0;
    for (int index = 0; index < inmuebles.size(); index++) {
      if (inmuebles.get(index).getnCasa().equals(ID)) {
        encontrado = true;
        aux = index;
        break;
      }
    }
    if (encontrado) {
      inmuebles.remove(inmuebles.get(aux));
    }
  }
  
  public double calcularArriendoMensualCondominio(){
    double suma = 0;
    for (int index = 0; index < inmuebles.size(); index++) {
      suma += inmuebles.get(index).getCostoMensual();
    }
    return suma;
  }
  
  public double promedioCostoInmueble(){
    double suma = calcularArriendoMensualCondominio();
    double prom = suma / inmuebles.size();
    return prom;
  }

  public double desviacionEstandarCostoInmueble() {
    // Calculo promedio 
    double promedio = promedioCostoInmueble();
    // Tamaño de arraylist 
    int n = inmuebles.size();
    // Varianza  
    double aux = 0;
    for (int index = 0; index < inmuebles.size(); index++) {
      aux += Math.pow(inmuebles.get(index).getCostoMensual() - promedio, 2);
    }  
    double varianza = aux / n;
    double desviacion = Math.sqrt(varianza);
    return desviacion;

  }

  public void mostrar() {
    System.out.println("EN MOSTRAR");
    for (int index = 0; index < inmuebles.size(); index++) {
      System.out.print(inmuebles.get(index).getnCasa() + "/ ");
      System.out.print(inmuebles.get(index).getIDArrendador() + "/ ");
      System.out.print(inmuebles.get(index).getCostoMensual() + "/ ");
      System.out.print(inmuebles.get(index).getCantidadMesesArrendado() + "/ ");
      System.out.println("\n");
    }
  }

}
