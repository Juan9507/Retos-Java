/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyCo;

/**
 *
 * @author 57317
 */
public abstract class Asiento {
  //Inserte acá los atributos
  private char tipo;
  private String ID;
  private boolean pantallaEncendida = false;
  private double inclinacionSilla = 90;
  private boolean luzLecturaEncendida = false;
  private boolean luzAsistenciaEncendida = false;
  private boolean aireAcondicionadoEncendido = false;

  //Inserte acá el método constructor
  public Asiento(String ID, char tipo) {
    this.tipo = tipo;
    this.ID = ID;
  }
  
  
  //Inserte acá los SETTERS Y GETTERS

  public char getTipo() {
    return tipo;
  }

  public void setTipo(char tipo) {
    this.tipo = tipo;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public boolean isPantallaEncendida() {
    return pantallaEncendida;
  }

  public void setPantallaEncendida(boolean pantallaEncendida) {
    this.pantallaEncendida = pantallaEncendida;
  }

  public double getInclinacionSilla() {
    return inclinacionSilla;
  }

  public void setInclinacionSilla(double inclinacionSilla) {
    this.inclinacionSilla = inclinacionSilla;
  }

  public boolean isLuzLecturaEncendida() {
    return luzLecturaEncendida;
  }

  public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
    this.luzLecturaEncendida = luzLecturaEncendida;
  }

  public boolean isLuzAsistenciaEncendida() {
    return luzAsistenciaEncendida;
  }

  public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
    this.luzAsistenciaEncendida = luzAsistenciaEncendida;
  }

  public boolean isAireAcondicionadoEncendido() {
    return aireAcondicionadoEncendido;
  }

  public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
    this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
  }
  //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
  public void gestionarAireAcondicionado(){
    if(this.aireAcondicionadoEncendido == false){
      this.aireAcondicionadoEncendido = true;
    }else{
      this.aireAcondicionadoEncendido = false;
    }
  }
  
  public void gestionarPantalla(){
    if(this.pantallaEncendida == false){
      this.pantallaEncendida = true;
    }else{
      this.pantallaEncendida = false;
    }
  }
  
  public void gestionarLuzLectura(){
    if(this.luzLecturaEncendida == false){
      this.luzLecturaEncendida = true;
    }else{
      this.luzLecturaEncendida = false;
    }
  }
  
  public void gestionarLuzAsistencia(){
    if(this.luzAsistenciaEncendida == false ){
      this.luzAsistenciaEncendida = true;
    }else {
      this.luzAsistenciaEncendida = false;
    }
  }
  
  public void aumentarInclinacion(double d){
    double aux = this.inclinacionSilla + d;
    if(aux <= 135){
      this.inclinacionSilla = aux;
    }else{
      this.inclinacionSilla = 135;
    }
  }
  
  public void disminuirInclinacion(double d){
    double aux = this.inclinacionSilla + d;
    if(aux <= 90){
      this.inclinacionSilla = aux;
    }else{
      this.inclinacionSilla = 0;
    }
  }
  
  public abstract String imprimirMenuPantalla();

}
