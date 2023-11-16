package Hilos;

public class TestClassThreadParametros {

	public static void main(String[] args) {
		//realizamos la respectiva instancia...
		ClassThreadParametros hilo1=new ClassThreadParametros("hiloconnumerospares");
		
		//agregamos el valor...
		hilo1.AgregarParametro(40);
		
		//ejecutamos el hilo
		hilo1.start();

	}  //fin del metodo void main...

}   //fin de la clase test...
