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
public class Listas {
    private Nodo inicio;//ACCESO A MI LISTA, PUNTO DE PARTIDA
 private Nodo fin;
 private int tama;
 
 public Listas(){
      inicio = null;
      fin= null;
      tama=0;
   }  
 public void add(String valor){
    Nodo nuevo=new Nodo(valor);   
    if(inicio==null){//Lista Vacia
         inicio=nuevo;//conectamos el primer nodo a la lista  
         fin = nuevo;  
    }else{
      fin.setSiguiente(nuevo);
      fin= nuevo;//Nos movemos al final de la lista
      } 
    tama++;
}
  //IMPRIMIR LA LISTA
   public void printList(){
      Nodo  temp = inicio;//aqui empezamos
         //WHILE
         while (temp != null) {//Mientras Temp! = NULL Nos vamos a mover             
             System.out.println( temp.getDato() );
            temp = temp.getSiguiente();//mover a temp al siguiente nodo 
         }        
   }
   public void clear(){
      inicio=null;
      fin=null;
   }
    //CONTAR LOS NODOS
   public int length(){//O(N)
      int iCont=0;
      Nodo  temp = inicio;//aqui empezamos
         //WHILE
         while (temp != null) {//Mientras Temp! = NULL Nos vamos a mover             
           iCont ++;
            temp = temp.getSiguiente();//mover a temp al siguiente nodo  
   }
         return iCont;
   }
   private void insertAtBeginnig(Nodo nuevo){
      nuevo.setSiguiente(inicio);//Primero conectamos el nuevo nodo a la lista
      inicio=nuevo;
   }
   public void insertAt(int pos, String valor){
      Nodo nuevo = new Nodo(valor);
      //VALIDAR
      //SITUACIONES
      //INSERTAR AL INICIO
      if(pos==1){
         insertAtBeginnig(nuevo);
      }
      else{
         //movernos al nodo previo a la posicion
         Nodo temp=inicio;
         for (int i = 0; i < (pos + 1); i++) {
            temp=temp.getSiguiente();//mover temp al siguiente nodo
         }        
      }
   }
   public void deleteAt(int pos){
      int iTamaLista=length();
      //Validar
      if(iTamaLista==1){
         clear();
      }else{
         if(pos==0){
            inicio=inicio.getSiguiente();
         }
         else{
            Nodo temp=inicio;
            temp=temp.getSiguiente();
         }
      }
   }
}