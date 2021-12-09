/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variante3;

/**
 *
 * @author 57317
 */
public class Taxi extends Vehiculo {
  //Inserte acá los atributos
  private double distanciaRecorrida = 0;
  private boolean segurosActivados = false;
    
  //Inserte acá el método constructor
  public Taxi(String nombreConductor) {
    super(nombreConductor);
  }
    
    
  //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
  public void reiniciarTaximetro(){
    this.distanciaRecorrida = 0;
  }
  public void presionarBotonPanico(){
    super.setEnMarcha(false);
    this.segurosActivados = false;
    super.setnPasajeros(super.getnPasajeros() - 1);
  }
  @Override
  public void dejarPasajero(){
    if(super.getnPasajeros() > 0){
      if(this.segurosActivados == false){
        super.setnPasajeros(super.getnPasajeros() - 1);
        super.setCantidadDinero(super.getCantidadDinero() + this.calcularPasaje()); 
        this.reiniciarTaximetro();
      }
    }
  }
  public void recogerPasajero (){
    if(super.getnPasajeros() == 0){
      super.setnPasajeros(super.getnPasajeros() + 1);
    }
  }
  @Override
  public void gestionarMarcha() {
    if(super.isEnMarcha() == false && this.segurosActivados == true){
      super.setEnMarcha(true);
    }else{
      super.setEnMarcha(false);
    }
  }
  @Override
  public void moverDerecha(double d){
    if(super.isEnMarcha() == true){
      super.setLocalizacionX(super.getLocalizacionX() + d);
      if (super.getnPasajeros() > 0) {
        this.distanciaRecorrida += d;
      }
    }
  }
  @Override
  public void moverIzquierda(double d){
    if(super.isEnMarcha() == true){
      super.setLocalizacionX(super.getLocalizacionX() - d);
      if (super.getnPasajeros() > 0) {
        this.distanciaRecorrida += d;
      }
    }
  }
  @Override
  public void moverArriba(double d){
    if(super.isEnMarcha() == true){
      super.setLocalizacionY(super.getLocalizacionY() + d);
      if (super.getnPasajeros() > 0) {
        this.distanciaRecorrida += d;
      }
    }
  }
  @Override
  public void moverAbajo (double d){
    if(super.isEnMarcha() == true){
      super.setLocalizacionY(super.getLocalizacionY() + d);
      if (super.getnPasajeros() > 0) {
        this.distanciaRecorrida += d;
      }
    }
  }
  public double calcularPasaje(){
    return 3000 + 2300 * this.distanciaRecorrida;
  }
  public void gestionarSeguros(){
    if(super.isEnMarcha() == false && this.segurosActivados == true ){
      this.segurosActivados = false;
    }else {
      this.segurosActivados = true;
    }
  }
  
  
    
    
  //Inserte acá los SETTERS Y GETTERS

  public double getDistanciaRecorrida() {
    return distanciaRecorrida;
  }

  public void setDistanciaRecorrida(double distanciaRecorrida) {
    this.distanciaRecorrida = distanciaRecorrida;
  }

  public boolean isSegurosActivados() {
    return segurosActivados;
  }

  public void setSegurosActivados(boolean segurosActivados) {
    this.segurosActivados = segurosActivados;
  }
  
}
