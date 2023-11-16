package Hilos;

public class ClassInterfazHilos implements Runnable{

	@Override
	public void run() {
		//*************** Suma de los 10 primeros numeros naturales pares
		//acumulador
		int sumapares = 0;
		//aplicamos un bucle for
		for(int z=1 ; z<=10 ; z++){
			//aplicamos condicion
			if( z%2 == 0){
			    //emitimos msj por consola
				System.out.println("pares : " + z);
				sumapares= sumapares + z;
			  }
			} // fin de bucle for
		
		//imprimimos la rpta por pantalla
		System.out.println("LA SUMA DE LOS 10 NROS PARES ES : " + sumapares);
				
		//*************** Suma de los 10 primeros numeros naturales impares
		//acumulador
		int sumaimpares = 0;		
		//aplicamos un bucle for
		for(int w=1 ; w<=10 ; w++){
			//aplicamos condicion
			if( w%2 != 0){
				//emitimos msj por consola
				System.out.println("impares : " + w);
				sumaimpares= sumaimpares + w;
				}
		} // fin de bucle for

	} // fin del metodo run

}// fin de la clase
