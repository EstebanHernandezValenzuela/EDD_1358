package laberinto.fes;

import java.util.ArrayList;

public class Pila <T>{
	  ArrayList<T> stack;
	    T top, base;
	    int tam;
	    protected T valor;
	    protected T valor2;
	    public Pila() {
	    	stack = new ArrayList<T>(this.tam);
	        top = null;
	        base = null;
	        tam = 0;
	    }

	    public boolean isEmpty() {
	        return this.top == null;
	    }

	    public T getTop(){
	        return this.top;
	    }
	    
	    public int lenght() {
	        return this.tam;
	    }
	    
	    public void pop(){
	        if (isEmpty()){
	            System.out.println("No hay valores disponibles");
	        } else{
	            System.out.println("El tope es: " + top);
	            stack.remove(stack. get(stack. size()-1));
	            top = stack. get(stack. size()-1);
	            
	        }
	    }
	    
	    public T peek(){
	        return stack. get(stack. size()-1);
	    }
	    
	    public void push(T valor,T valor2){
	    	this.valor=valor;
	    	this.valor2=valor2;
	        stack.add((T) (valor+","+valor2));
	        if (isEmpty()){
	            this.base = (T) (valor+","+valor2);
	            this.top = base;
	        }else{
	             top = stack. get(stack. size()-1);
	        }
	    }
	    
	    
	    public T getValor() {
			return valor;
		}

		public void setValor(T valor) {
			this.valor = valor;
		}

		public T getValor2() {
			return valor;
		}

		public void setValor2(T valor2) {
			this.valor2 = valor2;
		}

		@Override
	    public String toString(){
	        String estado = "";
	        
	        for(T elemento : stack){
	            if(elemento != null){
	                
	                estado += "\n "+elemento.toString();
	            }
	        }
	        return estado;
	    }
	}


