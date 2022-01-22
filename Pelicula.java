/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivned
 */
public class Pelicula {
   private String titulo,clasificacion,genero;
 
 public static byte total=0; //Variable de Clase
 
 public Pelicula(String titulo, String clasificacion, String genero){
     this.titulo=titulo;
     this.clasificacion=clasificacion;
     this.genero=genero;
     
     total ++; //total=total+1;
 }
 public String getTitulo(){
     return titulo;
 }
 public void setTitulo(String titulo){
     this.titulo=titulo;
 }
 public String geTClasificacion(){
     return clasificacion;
 }
 public void setClasificacion(String clasificacion){
     this.clasificacion=clasificacion;
 }
 public String getGenero(){
     return genero;
 }
 public void setGenero(String genero){
     this.genero=genero;
 }

 public String getDatos(){
     String texto = "Titulo:" + titulo + "\nClasificacion:" + clasificacion +
             "\nGenero: " + genero; 
 
      texto +=""; //texto=texto+"Si";
 
     texto+=""; //texto=texto+"No";
 return texto;
 
 }
}
