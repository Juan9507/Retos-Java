/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2variante3;

import Variante3.Autobus;
import Variante3.Taxi;

/**
 *
 * @author 57317
 */
public class Reto2Variante3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    /**
    Autobus a = new Autobus("pepe",30);
    a.gestionarMotor();
    a.gestionarMarcha();
    a.moverDerecha(12);
    a.moverArriba(10);
    
    System.out.println("PRIMERA PRUEBA");
    System.out.println(a.getNombreConductor());
    System.out.println(a.getnPasajeros());
    System.out.println(a.getCantidadDinero());
    System.out.println(a.getnMaximoPasajeros());
    System.out.println(a.getLocalizacionX());
    System.out.println(a.getLocalizacionY());
    System.out.println(a.isPuertaAbierta());
    System.out.println(a.isAireAcondicionadoActivado());
    System.out.println(a.isMotorEncendido());
    System.out.println(a.isWifiEncendido());
    System.out.println(a.isEnMarcha());
    System.out.println(a.calcularDistanciaAcopio());
    **/
    /** System.out.println("PRIMERA PRUEBA");
    System.out.println(a.getNombreConductor());
    System.out.println(a.getnPasajeros());
    System.out.println(a.getCantidadDinero());
    System.out.println(a.getnMaximoPasajeros());
    System.out.println(a.getLocalizacionX());
    System.out.println(a.getLocalizacionY());
    System.out.println(a.isPuertaAbierta());
    System.out.println(a.isAireAcondicionadoActivado());
    System.out.println(a.isMotorEncendido());
    System.out.println(a.isWifiEncendido());
    System.out.println(a.isEnMarcha());
    
    System.out.println("SEGUNDA PRUEBA");
    a.recogerPasajero(2);
    System.out.println(a.getNombreConductor());
    System.out.println(a.getnPasajeros());
    System.out.println(a.getCantidadDinero());
    System.out.println(a.getnMaximoPasajeros());
    System.out.println(a.getLocalizacionX());
    System.out.println(a.getLocalizacionY());
    System.out.println(a.isPuertaAbierta());
    System.out.println(a.isAireAcondicionadoActivado());
    System.out.println(a.isMotorEncendido());
    System.out.println(a.isWifiEncendido());
    System.out.println(a.isEnMarcha());
    
    System.out.println("TERCERA PRUEBA");
    a.gestionarPuerta();
    a.gestionarMarcha();
    System.out.println(a.getNombreConductor());
    System.out.println(a.getnPasajeros());
    System.out.println(a.getCantidadDinero());
    System.out.println(a.getnMaximoPasajeros());
    System.out.println(a.getLocalizacionX());
    System.out.println(a.getLocalizacionY());
    System.out.println(a.isPuertaAbierta());
    System.out.println(a.isAireAcondicionadoActivado());
    System.out.println(a.isMotorEncendido());
    System.out.println(a.isWifiEncendido());
    System.out.println(a.isEnMarcha());
    
    System.out.println("CUARTA PRUEBA");
    a.recogerPasajero(2);
    a.gestionarMarcha();
    a.gestionarPuerta();
    System.out.println(a.getNombreConductor());
    System.out.println(a.getnPasajeros());
    System.out.println(a.getCantidadDinero());
    System.out.println(a.getnMaximoPasajeros());
    System.out.println(a.getLocalizacionX());
    System.out.println(a.getLocalizacionY());
    System.out.println(a.isPuertaAbierta());
    System.out.println(a.isAireAcondicionadoActivado());
    System.out.println(a.isMotorEncendido());
    System.out.println(a.isWifiEncendido());
    System.out.println(a.isEnMarcha());
    
    System.out.println("QUINTA PRUEBA");
    a.moverArriba(2);
    a.moverDerecha(5);
    a.gestionarWifi();
    a.gestionarAireAcondicionado();
    System.out.println(a.getNombreConductor());
    System.out.println(a.getnPasajeros());
    System.out.println(a.getCantidadDinero());
    System.out.println(a.getnMaximoPasajeros());
    System.out.println(a.getLocalizacionX());
    System.out.println(a.getLocalizacionY());
    System.out.println(a.isPuertaAbierta());
    System.out.println(a.isAireAcondicionadoActivado());
    System.out.println(a.isMotorEncendido());
    System.out.println(a.isWifiEncendido());
    System.out.println(a.isEnMarcha());
    
    System.out.println("SEXTA PRUEBA");
    a.gestionarMotor();
    a.moverIzquierda(2);
    System.out.println(a.getNombreConductor());
    System.out.println(a.getnPasajeros());
    System.out.println(a.getCantidadDinero());
    System.out.println(a.getnMaximoPasajeros());
    System.out.println(a.getLocalizacionX());
    System.out.println(a.getLocalizacionY());
    System.out.println(a.isPuertaAbierta());
    System.out.println(a.isAireAcondicionadoActivado());
    System.out.println(a.isMotorEncendido());
    System.out.println(a.isWifiEncendido());
    System.out.println(a.isEnMarcha());
    **/
    System.out.println("PRUEBA TAXI");
    Taxi b = new Taxi("pepito");
    b.gestionarMotor();
    b.recogerPasajero();
    b.gestionarSeguros();
    b.gestionarMarcha();
    b.moverAbajo(5);
    b.moverDerecha(6);
    b.moverIzquierda(2);
    b.gestionarSeguros();
    b.gestionarMarcha();
    b.dejarPasajero();
    b.dejarPasajero();
    b.gestionarSeguros();
    b.dejarPasajero();
    System.out.println("Primera prueba taxi"); 
    System.out.println("NOMBRE DE CONDUCTOR "+ b.getNombreConductor()); 
    System.out.println("NUMERO DE PASAJEROS " + b.getnPasajeros());
    System.out.println("CANTIDAD DE DINERO " + b.getCantidadDinero()); 
    System.out.println("NUMERO MAXIMO DE PASAJEROS " + b.getnMaximoPasajeros()); 
    System.out.println("LOCALIZACION X " + b.getLocalizacionX());
    System.out.println("LOCALIZACION Y " +b.getLocalizacionY()); 
    System.out.println("AIRE ACONDICIONADO ACTIVADO " + b.isAireAcondicionadoActivado());
    System.out.println("MOTOR ENCENDIDO " + b.isMotorEncendido()); 
    System.out.println("WIFI ACTIVADI " + b.isWifiEncendido()); 
    System.out.println("EN MARCHA " + b.isEnMarcha()); 
    System.out.println("DISTANCIA RECORRIDA " + b.getDistanciaRecorrida());
    System.out.println("SEGUROS ACTIVADOS " + b.isSegurosActivados());
    /**
    System.out.println("SEGUNDA TAXI");
    b.gestionarMotor();
    b.gestionarMarcha();
    b.recogerPasajero(); 
    System.out.println(b.getNombreConductor()); 
    System.out.println(b.getnPasajeros());
    System.out.println(b.getCantidadDinero()); 
    System.out.println(b.getnMaximoPasajeros()); 
    System.out.println(b.getLocalizacionX());
    System.out.println(b.getLocalizacionY()); 
    System.out.println(b.isAireAcondicionadoActivado());
    System.out.println(b.isMotorEncendido()); 
    System.out.println(b.isWifiEncendido()); 
    System.out.println(b.isEnMarcha()); 
    System.out.println(b.getDistanciaRecorrida());
    System.out.println(b.isSegurosActivados());
     
    System.out.println("TERCERO TAXI");
    b.gestionarMarcha();
    b.recogerPasajero();
    b.moverArriba(10);
    b.moverDerecha(12);
    b.gestionarSeguros();
    b.moverAbajo(10);
    b.moverIzquierda(13);
    System.out.println(b.getNombreConductor()); 
    System.out.println(b.getnPasajeros());
    System.out.println(b.getCantidadDinero()); 
    System.out.println(b.getnMaximoPasajeros()); 
    System.out.println(b.getLocalizacionX());
    System.out.println(b.getLocalizacionY()); 
    System.out.println(b.isAireAcondicionadoActivado());
    System.out.println(b.isMotorEncendido()); 
    System.out.println(b.isWifiEncendido()); 
    System.out.println(b.isEnMarcha()); 
    System.out.println(b.getDistanciaRecorrida());
    System.out.println(b.isSegurosActivados()); 
    
    System.out.println("TERCERA TAXI");
    b.gestionarAireAcondicionado();
    b.gestionarWifi();
    b.gestionarMotor();
    b.presionarBotonPanico();
    System.out.println(b.getNombreConductor()); 
    System.out.println(b.getnPasajeros());
    System.out.println(b.getCantidadDinero()); 
    System.out.println(b.getnMaximoPasajeros()); 
    System.out.println(b.getLocalizacionX());
    System.out.println(b.getLocalizacionY()); 
    System.out.println(b.isAireAcondicionadoActivado());
    System.out.println(b.isMotorEncendido()); 
    System.out.println(b.isWifiEncendido()); 
    System.out.println(b.isEnMarcha()); 
    System.out.println(b.getDistanciaRecorrida());
    System.out.println(b.isSegurosActivados()); 
    
  **/
     
     
    
  }
  
}
