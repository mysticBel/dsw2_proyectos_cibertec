package HilosSincronizacion;

public class ClassThreadSincronizacionVII  extends Thread{

	@Override
	public void run(){
		//aplicamos un bucle para 8
		for(int f=1;f<=8;f++){
			//imprimimos por pantalla
			System.out.print("E");
			try {
				ClassThreadSincronizacionVII.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   //fin del catch....
			
		}  //fin del bucle for...
	}//fin del metodo run....
} //fin de la clase...
