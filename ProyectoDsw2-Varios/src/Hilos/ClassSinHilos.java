package Hilos;

public class ClassSinHilos {

	public static void main(String[] args) {
		//*************** Suma de los 10 primeros numeros naturales pares
		
		//acumulador
		int sumapares = 0;
		//aplicamos un bucle for
		for(int x=1 ; x<=10 ; x++){
			//aplicamos condicion
			if( x%2 == 0){
				//emitimos msj por consola
				System.out.println("pares : " + x);
				sumapares= sumapares + x;
			}
		} // fin de bucle for

		//imprimimos la rpta por pantalla
		System.out.println("LA SUMA DE LOS 10 NROS PARES ES : " + sumapares);
		
		//*************** Suma de los 10 primeros numeros naturales impares
		//acumulador
		int sumaimpares = 0;
		//aplicamos un bucle for
		for(int y=1 ; y<=10 ; y++){
			//aplicamos condicion
			if( y%2 != 0){
				//emitimos msj por consola
				System.out.println("impares : " + y);
				sumaimpares= sumaimpares + y;
				}
		} // fin de bucle for

		//imprimimos la rpta por pantalla
		System.out.println("LA SUMA DE LOS 10 NROS IMPARES ES : " + sumaimpares);
		
		
		
	}// fin del metodo principal

}//fin de la clase ClassSinHilos
