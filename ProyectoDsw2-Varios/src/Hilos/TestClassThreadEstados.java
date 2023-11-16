package Hilos;

public class TestClassThreadEstados {

	public static void main(String[] args) throws InterruptedException {
		//instanciamos...
		  //primer estado se refiere cuando se crea el objeto..
		ClassThreadEstados hilo1=new ClassThreadEstados();
		ClassThreadEstados hilo2=new ClassThreadEstados();
		//segundo estado de un hilo
		hilo1.start();
		//tercer estado de un hilo es cuando se aplica el metodo sleep()
		//retardo de 2 (2000 milisegundos)
		hilo1.sleep(2000);
		
		//segundo estado para el hilo2
		hilo2.start();
		
		//cuarto estado es cuando se aplica el metodo stop()
	    hilo2.stop();
		

	}   //fin del metodo 

}  //fin de la clase...
