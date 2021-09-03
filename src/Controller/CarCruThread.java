
package Controller;

import java.util.concurrent.Semaphore;

public class CarCruThread extends Thread {
	  
	  private int numCarro;
	  private java.util.concurrent.Semaphore semaforo;
	  
	  public CarCruThread (int numCarro, Semaphore semaforo){
		  this.numCarro = numCarro;
		  this.semaforo = semaforo;
		  
	  }
	  
	  public void run (){
		  try {
			  semaforo.acquire();
			  entraCarro ();
		  } catch (InterruptedException e) {
			  e.printStackTrace();
		  }
		  finally {
			  semaforo.release();
			  
		  }
	  }
	   
	  public void entraCarro(){
	     System.out.println ("o carro "+numCarro+" entrou");
	     paraCarro();
	     andouCarro();
	  }
	     public void paraCarro (){
	        int TempoEspera = (int) (Math.random() + 1)*5000) ;
	        try {
	        	Thread.sleep(TempoEspera);
	        } catch (InterruptedException e){
	        	e.printStackTrace() ;
	        }
	        	public void andouCarro(){
	        		System.out.println("o carro "+numCarro+" andou");
	        		
	        }
  }
  