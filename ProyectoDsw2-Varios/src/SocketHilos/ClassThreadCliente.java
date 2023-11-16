package SocketHilos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClassThreadCliente extends Thread{


	//1. declaramos variables
	private Socket cliente = null;
	private DataOutputStream dos = null;
	private DataInputStream dis = null;
	private boolean parar = false;
	private static final int BUFFER_SIZE = 8194;
	
	//2. Creamos un constructor
	public ClassThreadCliente(Socket cli){
		this.cliente = cli;
	}
	
	// ********************************
	//3. Metodo run
	
	@Override
	public void run(){
		// Obtenemos los flujos
		try {
			dos = new DataOutputStream(this.cliente.getOutputStream()); 
			dis = new DataInputStream(this.cliente.getInputStream());
			
			//creamos un buffer...
			byte[] data=new byte[BUFFER_SIZE];
			
			//aplicamos un bucle
			while(!parar){
				//leer archivo que el servidor envia
				
			} // fin del bucle while ...
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} // fin del catch ..
			
	} //  fin del metodo RUN
}
