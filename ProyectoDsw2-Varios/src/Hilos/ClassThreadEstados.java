package Hilos;

public class ClassThreadEstados  extends Thread{
	
	@Override
	public void run(){	
		//suma de los 10 primeros numero impares		
		 int sumaimpares=0;
		 //aplicamos un bucle for....
		 for(int t=1;t<=10;t++){		 
			 //aplicamos una condicion...
			 if(t%2!=0){
				 //imprimimos los numeros por pantalla
				 System.out.println("numeros impares "+t);
				 //acumulamos la suma de numeros impares
				 sumaimpares=sumaimpares+t;
				 try {
					 //hacemos un retardo de 2 segundos (2000 milisegundos)
					ClassThreadEstados.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  //fin del catch....			 
			 }   //fin de la condicion...
		 }   //fin del bucle for...		
		System.out.println("suma de numeros impares "+sumaimpares);
	}   //fin del metodo run...

}  //fin de la clase ....
