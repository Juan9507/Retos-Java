/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4variante3juan;

/**
 *
 * @author 57317
 */
public class Inmueble {

  //Inserte acá los atributos
  private String nCasa;
  private String IDArrendador;
  private double costoMensual;
  private int cantidadMesesArrendado;

  //Inserte acá el método constructor
  public Inmueble(String nCasa, String IDArrendador, double costoMensual, int cantidadMesesArrendado) {
    this.nCasa = nCasa;
    this.IDArrendador = IDArrendador;
    this.costoMensual = costoMensual;
    this.cantidadMesesArrendado = cantidadMesesArrendado;
  }
  //Inserte acá los SETTERS Y GETTERS

  public String getnCasa() {
    return nCasa;
  }

  public void setnCasa(String nCasa) {
    this.nCasa = nCasa;
  }

  public String getIDArrendador() {
    return IDArrendador;
  }

  public void setIDArrendador(String IDArrendador) {
    this.IDArrendador = IDArrendador;
  }

  public double getCostoMensual() {
    return costoMensual;
  }

  public void setCostoMensual(double costoMensual) {
    this.costoMensual = costoMensual;
  }

  public int getCantidadMesesArrendado() {
    return cantidadMesesArrendado;
  }

  public void setCantidadMesesArrendado(int cantidadMesesArrendado) {
    this.cantidadMesesArrendado = cantidadMesesArrendado;
  }

}
