package Hilos;

public class ClassHerenciaHilos extends Thread {

	//declaramos el metodo void run
	@Override
	public void run() {
		//suma de los 10 primeros numeros impares........
		//acumulador...
			int sumaimpares=0;
			//aplicamos un bucle for..
			
			for(int m=1;m<=10;m++){
				//aplicamos una condicion...
				if(m%2!=0){
					
					//imprimimos por pantalla
					System.out.println("Impares "+m);
					sumaimpares=sumaimpares+m;
				}  //fin de la condicion..
				
			}  //fin del bucle for...
			
				//imprimimo el resultado de la suma de impares por pantalla
			System.out.println("la suma de numeros impares  es "+sumaimpares);
			
		
	}// fin del metodo run

}// fin de la clase

