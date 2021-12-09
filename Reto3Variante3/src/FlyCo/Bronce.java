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
public class Bronce extends Asiento {

  public Bronce(String ID, char tipo) {
    super(ID, tipo);
  }

  @Override
  public String imprimirMenuPantalla() {
    String aux = "";
    if(super.getTipo() == 'b'){
      aux = "BRONCE";
    }
    return aux;
  }

  
}
