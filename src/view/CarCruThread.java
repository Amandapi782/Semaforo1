package view;

import java.util.concurrent.Semaphore;

public class CarCruThread{
	
	public static Semaphore semaforo;
	

	public static void main(String[] args) {
	    int totalCarros = 4;
	    int percCarros = 1;
	    semaforo = new Semaforo();
	    for (int i = 0; i < totalCarros; i++){
	    	CarCruThread transito = new CarCruThread ();
	    	transito.start();
	    }

	}


	private void start() {
		// TODO Auto-generated method stub
		
	}

}
