/*
Jehu Daniel Moraga Galvez 

26/03/2019
Programa de Listas Enlazadas
*/
package ListasEnlazadas;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        int Y;
        Scanner Leer = new Scanner(System.in);
        System.out.println("BIENVENIDO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+"\n LISTA ENLAZADA");
        ListasEnlazadas miLista=new ListasEnlazadas();
	miLista.InsertarEnPrimero(10);
	miLista.InsertarEnPrimero(15);
	miLista.InsertarEnPrimero(30);
	miLista.InsertarEnPrimero(50);
	miLista.InsertarEnPrimero(40);
	miLista.InsertarEnPrimero(60);
	System.out.println("\n"+miLista.Listar());
        System.out.println("COLOQUE UN DATO PARA SABER SU POSICION EN LA LISTA: ");
        Y=Leer.nextInt();
        System.out.println("La Posicion es:"+miLista.Locali(Y));
	System.out.println("\nBorrado de primer y ultimo Nodo: ");
	miLista.borrarUltimo();
        miLista.borrarPrimero();
	System.out.println("\n"+miLista.Listar());
        System.out.println("\nDato en primer Nodo");
        System.out.println(""+miLista.MOSTRA1());
        
    }
    
}
