/*
Jehu Daniel Moraga Galvez 

26/03/2019
Programa de Listas Enlazadas
*/
package ListasEnlazadas;
public class Inicio {
    public static void main(String[] args) {
        ListasEnlazadas miLista=new ListasEnlazadas();
	miLista.InsertarEnPrimero(10);
	miLista.InsertarEnPrimero(15);
	miLista.InsertarEnPrimero(30);
	miLista.InsertarEnPrimero(50);
	miLista.InsertarEnPrimero(40);
	miLista.InsertarEnPrimero(60);
	System.out.println(miLista.Listar());
	System.out.println("borrar");
	miLista.borrarUltimo();
        miLista.borrarPrimero();
	System.out.println(miLista.Listar());
    }
    
}
