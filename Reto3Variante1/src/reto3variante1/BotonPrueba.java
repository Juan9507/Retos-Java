/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3variante1;

/**
 *
 * @author 57317
 */
public class BotonPrueba extends Boton { 
 //Inserte acá el método constructor
  public BotonPrueba(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
    super(ancho, alto, colorFondo, colorTexto, texto);
  }
   //Inserte acá la implementación del método abstracto de la clase padre
  @Override
  public void hacerClick() { 
    super.setTexto("Hello World");
  }

  }
