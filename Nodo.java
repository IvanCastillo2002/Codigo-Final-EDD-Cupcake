/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplelist;

/**
 *
 * @author ivned
 */
public class Nodo {
   private String dato;
   private Nodo siguiente;
   
   public Nodo(){
      this.siguiente=null;
   }
   public Nodo(String dato){
      this.dato=dato;
      this.siguiente=null;   
   } 

   Nodo(int valor) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
   public String getDato( ) {
      return dato;
   }
   public void setDato(String dato) {
      this.dato = dato;
   }
   public Nodo getSiguiente() {
      return siguiente;
   }
   public void setSiguiente(Nodo siguiente) {
      this.siguiente = siguiente;
   }
}
