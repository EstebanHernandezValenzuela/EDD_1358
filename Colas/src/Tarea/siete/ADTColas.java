package Tarea.siete;

import java.util.ArrayList;

public class ADTColas<T> {

    ArrayList<T> lista;
    T primero,ultimo;
    int tamanio;
    int x=0;
    public ADTColas() {
        lista = new ArrayList<T>(this.tamanio);
        ultimo = null;
        primero = null;
        tamanio = 0;
        
    }

    public boolean isEmpty() {
        return this.primero == null;
        
    }

 
    public int lenght() {
    	System.out.println("Hay "+tamanio+ " elementos");
        return tamanio;
    }
  
    
    public void dequeue(){
        if (isEmpty()){
            System.out.println("No hay valores disponibles");
        } else{
        	System.out.println("Se saco: "+primero);
            lista.remove(lista.get(x));
          
           primero= lista.get(x);
           System.out.println("El primero ahora es: "+primero);
           tamanio=tamanio-1;
            
         
        }
    }

    
    public void enqueue(T value){
        lista.add(value);
        if (isEmpty()){
            this.primero = value;
            this.ultimo=primero;
            tamanio=tamanio+1;
        }else{
             ultimo = lista. get(lista. size()-1);
             tamanio=tamanio+1;
        }
    }
    
    @Override
    public String toString(){
        String estado = "";
        
        for(T elemento : lista){
            if(elemento != null){
                
                estado += "\n "+elemento.toString();
            }
        }
        return estado;
    }

	
	
}