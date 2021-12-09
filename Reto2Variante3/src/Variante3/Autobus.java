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
public class Autobus extends Vehiculo{
  //Inserte acá los atributos
  private boolean puertaAbierta = false;

  //Inserte acá el método constructor
  public Autobus(String nombreConductor, int nMaximoPasajeros) {
    super(nombreConductor, nMaximoPasajeros);
  }

  //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
  public void recogerPasajero(int estrato) {
    if (super.isEnMarcha() == false && this.puertaAbierta == true) {
      if(super.getnPasajeros() < super.getnMaximoPasajeros()){
        super.setnPasajeros(super.getnPasajeros() + 1);
        super.setCantidadDinero(super.getCantidadDinero() + this.calcularPasaje(estrato));
      }
    }
  }
  
  public void gestionarPuerta(){
    if(this.puertaAbierta == false && super.isEnMarcha() == false){
      this.puertaAbierta = true;
    }else {
      this.puertaAbierta = false;
    }
  }

  public static double calcularPasaje(int estrato) {
    double tarifa = 0;
    if(estrato >= 0 && estrato <=2){
      tarifa = 1500;
    }else if(estrato >=3 && estrato <=4){
      tarifa = 2600;
    }else if(estrato >=5 && estrato <=6){
      tarifa = 3000;
    }
    return tarifa;
  }

  @Override
  public void gestionarMarcha() {
    if(super.isEnMarcha() == false && this.puertaAbierta == false){
      super.setEnMarcha(true);
    }else{
      super.setEnMarcha(false);
    }
  }

  //Inserte acá los SETTERS Y GETTERS

  public boolean isPuertaAbierta() {
    return puertaAbierta;
  }

  public void setPuertaAbierta(boolean puertaAbierta) {
    this.puertaAbierta = puertaAbierta;
  }
  
}
