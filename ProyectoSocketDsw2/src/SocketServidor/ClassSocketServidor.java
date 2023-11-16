package SocketServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClassSocketServidor {

	public static void main(String[] args) throws ClassNotFoundException {
		// Aplicamos la clase server socket..

		try {
			// Puertos 1024 --- 6555
			ServerSocket servidor = new ServerSocket(4500);
			// Emitimos un mensaje por consola
			System.out.println("Servidor a la escucha de las peticiones");
			//cliente, aceptamos la peticion del cliente
			Socket clienteservidor = servidor.accept();
			ObjectInputStream recibir = new ObjectInputStream(clienteservidor.getInputStream());;
			// Imprimimos el mensaje de exito
			System.out.println("Mensaje llegado con exito");
			
			// Almacenamos el mensaje en variable de tipo String
			String mensaje = (String) recibir.readObject();
			// imprimimos el msj del cliente por pantalla
			System.out.println("Mensaje desde el cliente " + mensaje);
			// Salida desde el servidor
			ObjectOutputStream enviar= new ObjectOutputStream(clienteservidor.getOutputStream());
			enviar.writeObject("Holi Cliente, la capital de Peru es Lima");
			
			//cerramos
			clienteservidor.close();
			servidor.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // fin del metodo principal

} // fin de la clase
