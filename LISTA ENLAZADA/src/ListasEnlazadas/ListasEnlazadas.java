package ListasEnlazadas;
public class ListasEnlazadas
{
    	Nodo Primero;
	public ListasEnlazadas()
	{
		Primero=null;
	}
        
        
        
        
        
	public boolean vacia()
	{
		if (Primero==null)
		{
			return(true);
		} else
		{
			return(false);
		}
	}
        
        
        
        
        
        
        
	public void InsertarEnPrimero(int Dato)
	{
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
	}
        
        
        
        
        
        
        
	public void borrarPrimero()
	{
		Primero=Primero.Siguiente;
	}
        
        
        
        
        
        
	public String Listar()
	{
		String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null)
		{
			Dato+="{" + aux.info + "}";
			aux=aux.Siguiente;
		}
		return(Dato);
	}
        
        
        
        
        
        
	public void borrarUltimo()
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.Siguiente!=null)
		{
			anterior=actual;
			actual=actual.Siguiente;
		}
		anterior.Siguiente=null;
	}
        
        
        
        
        
        
        
	public void borrarPosicion(int pos)
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
		if (pos>0)
		{
			while (k!=pos && actual.Siguiente != null)
			{
				anterior=actual;
				actual=actual.Siguiente;
				k++;
				System.out.println("K       "+k);
			}
			anterior.Siguiente=actual.Siguiente;
		}
	}

       
        public int Locali (int pos){
        int dat=0;
        Nodo Tempo=Primero;
        if(pos>=0 && pos<=100){
            while(Tempo!=null){
            if(Tempo.info==pos){
            Tempo=null;
            }
            else{
            dat++;
            Tempo = Tempo.Siguiente;
            }
            }
        }
        else{
            System.out.println("EL NUMERO NO SE ENCUENTRA EN LA LISTA"); 
        }
        return(dat);
        }
        
        
        
        
        
        
        
        public void Localipri (int pos){
        int dat=0;
        Nodo Tempo=Primero;
        if(pos>=0 && pos<=100){
            while(Tempo!=null){
            if(Tempo.info==pos){
            Tempo=null;
            }
            else{
            dat++;
            Tempo = Tempo.Siguiente;
            }
            
        }
        }
        else{
            System.out.println("EL NUMERO NO SE ENCUENTRA EN LA LISTA"); 
        }
        }
    
        public String MOSTRA1()
	{
		String Dato=" ";
		Nodo aux=Primero;

			Dato+= aux.info;
			aux=aux.Siguiente;

		return(Dato);
	}
}

/*String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null)
		{
			Dato+="{" + aux.info + "}";
			aux=aux.Siguiente;
		}
		return(Dato);
*/