
package simplelist;
/**
 *
 * @author ivned
 */
public class SimpleList {
   public static void main(String[] args) {
      // TODO code application logic here
      Listas miLista = new Listas();
      //PRIMER PELICULA
      miLista.add("Pelicula: Spiderman: Far From Home");
      miLista.add("Clasificacion: B ");
      miLista.add("Genero: Ciencia Ficcion");
      
      //SEGUNDA PELICULA
      miLista.add("\nPelicula: Encanto");
      miLista.add("Clasificacion: AA");
      miLista.add("Genero: Musica\\Comedia"); 
      
      //TERCER PELICULA
      miLista.add("\nPelicula:Scream 5");
      miLista.add("Clasificacion: B15");
      miLista.add("Genero: Terror\\Suspenso");  
      
      //CUARTA PELICULA
      miLista.add("\nPelicula:Clifford: El Gran Perro Rojo");
      miLista.add("Clasificacion: A");
      miLista.add("Genero: Comedia\\Infantil");
      
      //QUINTA PELICULA
      miLista.add("\nPelicula:Kingsman: El Origen");
      miLista.add("Clasificacion: B15");
      miLista.add("Genero: Acción\\Aventura"); 
      
      //SEXTA PELICULA
      miLista.add("\nPelicula:John Wick: Parabellum");
      miLista.add("Clasificacion:R");
      miLista.add("Genero: Acción\\Suspenso");     
      
      miLista.printList();//Imprime la Lista
      System.out.println("\nConteo de Nodos" + miLista.length());//Cuenta todos los nodos que hay en la lista
      System.out.println("-------------------------");
      
      System.out.println("Despues de Borrar");
      miLista.deleteAt(0);//Elimina el primer nodo de la lista y se recorren hacia arriba los demas nodos
      miLista.deleteAt(0);//Elimina el primer nodo de la lista y se recorren hacia arriba los demas nodos
      miLista.deleteAt(0);//Elimina el primer nodo de la lista y se recorren hacia arriba los demas nodos
      miLista.printList();           
      System.out.println("\nConteo de Nodos" + miLista.length());//  Cuenta los  nodos despues de borrar los nodos  
      System.out.println("---------------------");
  
      System.out.println("\nDespues de Insertar");
     
      miLista.add("\nPelicula: The Jack in the Box");
      miLista.add("Clasificación: B15");
      miLista.add("Genero: Terror");
      miLista.printList();
      System.out.println("\nConteo de Nodos" + miLista.length());
         System.out.println("---------------------");
        
      
      
    System.out.println("\nDespues de insertar al inicio");
      System.out.println("");
      miLista.insertAt(1, "Genero: Infantil\\Fantasia");
      miLista.insertAt(1, "Clasificación: A");
      miLista.insertAt(1, "Pelicula: Coraline y la puerta secreta");
      miLista.printList();
      System.out.println("\nConteo de Nodos" + miLista.length());
         System.out.println("---------------------");
      
      System.out.println("Borrar Toda la Lista");
      miLista.clear();
      miLista.printList();
      System.out.println("\nConteo de Nodos" + miLista.length());
      System.out.println("---------------------");
      
      
      
      
      
}
       }
      
   



      
   

