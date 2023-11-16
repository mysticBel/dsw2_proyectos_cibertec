package Hilos;

public class ClassThreadParametros extends Thread {
	
	
	//declaramos una variable global..
	int num;
	
	//creamos un constructor...
	public ClassThreadParametros(String nomhilo){		
		//aplicamos el metodo
		super(nomhilo);
		
	}   //fin del constructor...
	
	//creamos un constructor...
	
	@Override
	public void run(){
	//suma de numeros de pares ....
		//acumulador
		int sumpares=0;
		//aplicamos un bucle for..
		for(int k=1;k<=num;k++){
			
			//aplicamos una condicion...
			if(k%2==0){
				//imprimimos numeros por pantalla
				System.out.println(k + this.getName());
				//acumulamos la suma
				sumpares=sumpares+k;
				
			} //fin de la condicion...
		}  //fin del bucle for...	
		//imprimimos la respectiva suma...
		System.out.println("suma de numeros pares "+sumpares);		
	}   //fin del metodo run...
	
	//creamos el metodo agregarparametro
	public void AgregarParametro(int y){
		this.num=y;
	}   //fin del metodo agregar parametro...
	
	
	
	

}
