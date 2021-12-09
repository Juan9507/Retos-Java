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
public abstract class Vehiculo {
  //Inserte acá los atributos
  private String nombreConductor; // se le aisgna el dato en el metodo constructor
  private int nPasajeros = 0;
  private double cantidadDinero = 0;
  private int nMaximoPasajeros; // se le aisgna el dato en el metodo constructor
  private double localizacionX = 0;
  private double localizacionY = 0;
  private boolean aireAcondicionadoActivado = false;
  private boolean motorEncendido = false;
  private boolean wifiEncendido = false;
  private boolean enMarcha = false;
  
  //Inserte acá el método constructor
  public Vehiculo(String nombreConductor,int nMaximoPasajeros) {
    this.nombreConductor = nombreConductor;
    this.nMaximoPasajeros = nMaximoPasajeros;
  }
  
  public Vehiculo(String nombreConductor) {
    this.nombreConductor = nombreConductor;
    this.nMaximoPasajeros = 1;
  }

  //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
  public void dejarPasajero(){
    if(this.enMarcha == false){
      if(this.nPasajeros > 0){
        this.nPasajeros -= 1;
      }
    }
  }
  public double calcularDistanciaAcopio(){
   return Math.sqrt(Math.pow(0.0 - this.localizacionX, 2) + Math.pow(0.0 - this.localizacionY, 2));
  }
  public void gestionarAireAcondicionado(){
    if(this.motorEncendido == true && this.aireAcondicionadoActivado == false){
      this.aireAcondicionadoActivado = true;
    }else if(this.motorEncendido == false || this.aireAcondicionadoActivado == true){
      this.aireAcondicionadoActivado = false;
    }
  }
  public void gestionarMotor(){
    if(this.motorEncendido == false){
      this.motorEncendido = true;
    }else{
      this.motorEncendido = false;
      this.aireAcondicionadoActivado = false;
      this.wifiEncendido = false;
      this.enMarcha = false;
    }
  }
  public void gestionarWifi(){
    if(this.motorEncendido == true && this.wifiEncendido == false){
      this.wifiEncendido = true;
    }else if(this.motorEncendido == false || this.wifiEncendido == true){
      this.wifiEncendido = false;
    }
  }
  
  public abstract void gestionarMarcha();
  
  public void moverDerecha(double d){
    if(this.enMarcha == true){
      this.localizacionX += d;
    }
  }
  public void moverIzquierda(double d){
    if(this.enMarcha == true){
      this.localizacionX -= d;
    }
  }
  public void moverArriba(double d){
    if(this.enMarcha == true){
      this.localizacionY += d;
    }
  }
  public void moverAbajo(double d){
    if(this.enMarcha == true){
      this.localizacionY -= d;
    }
  }
  
  
  //Inserte acá los SETTERS Y GETTERS

  public String getNombreConductor() {
    return nombreConductor;
  }

  public void setNombreConductor(String nombreConductor) {
    this.nombreConductor = nombreConductor;
  }

  public int getnPasajeros() {
    return nPasajeros;
  }

  public void setnPasajeros(int nPasajeros) {
    this.nPasajeros = nPasajeros;
  }

  public double getCantidadDinero() {
    return cantidadDinero;
  }

  public void setCantidadDinero(double cantidadDinero) {
    this.cantidadDinero = cantidadDinero;
  }

  public int getnMaximoPasajeros() {
    return nMaximoPasajeros;
  }

  public void setnMaximoPasajeros(int nMaximoPasajeros) {
    this.nMaximoPasajeros = nMaximoPasajeros;
  }

  public double getLocalizacionX() {
    return localizacionX;
  }

  public void setLocalizacionX(double localizacionX) {
    this.localizacionX = localizacionX;
  }

  public double getLocalizacionY() {
    return localizacionY;
  }

  public void setLocalizacionY(double localizacionY) {
    this.localizacionY = localizacionY;
  }

  public boolean isAireAcondicionadoActivado() {
    return aireAcondicionadoActivado;
  }

  public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
    this.aireAcondicionadoActivado = aireAcondicionadoActivado;
  }

  public boolean isMotorEncendido() {
    return motorEncendido;
  }

  public void setMotorEncendido(boolean motorEncendido) {
    this.motorEncendido = motorEncendido;
  }

  public boolean isWifiEncendido() {
    return wifiEncendido;
  }

  public void setWifiEncendido(boolean wifiEncendido) {
    this.wifiEncendido = wifiEncendido;
  }

  public boolean isEnMarcha() {
    return enMarcha;
  }

  public void setEnMarcha(boolean enMarcha) {
    this.enMarcha = enMarcha;
  }
  
}
