package Hilos;

public class TestHilos {

	public static void main(String[] args) {
		//realizamos las respectivas instancias 
		//de la clase tanto para herencia como para interface..
		
		     //herencia hilos Thread
		ClassHerenciaHilos herehilo1=new ClassHerenciaHilos();
		     //interface...
		Thread intefhilo2=new Thread(new ClassInterfazHilos());
		
		//ejecutamos los respectivos hilos
		herehilo1.start();
		intefhilo2.start();	

	}   //fin del metodo principal...

}   //fin de la clase 