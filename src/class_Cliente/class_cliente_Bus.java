/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_Cliente;

import class_bus_server.class_PosicionBus1;
import class_bus_server.class_monitor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Leandro
 */
public class class_cliente_Bus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cliente ventana = new cliente();

       // Creacion del puerto para la comunicacion del servidor con el cliente
       
        final String HOST = "localhost"; // dirección IP del servidor
        final int PUERTO = 8080; // puerto de comunicación
        DataInputStream in;// Deja ingresar el mensaje del servidor
        DataOutputStream out;// Cliente manda mensaje, pero en este caso no es necesario
        ventana.setVisible(true); // Hace visible la interfaz de cliente
        try
        {

            boolean continuar = true;

            while (continuar)
            {
                // creación del socket
                Socket socketCliente = new Socket(HOST, PUERTO); // Creacion del socket

                // flujo de entrada
                in = new DataInputStream(socketCliente.getInputStream());
                out = new DataOutputStream(socketCliente.getOutputStream());

                // Recompila el mensjae desde servidor
                String mensaje = in.readUTF();
                String mensaje2 = in.readUTF();
                
                //String mensaje3 = in.readUTF();
                // System.out.println(mensaje);

                // in.readUTF();
                //  ventana = new cliente( mensaje);
                
                //Llamado del objeto desde la clase de servidor.
                ventana.llenarVentana(mensaje);
                ventana.llenarHora(mensaje2);
                //ventana.llenarDia(mensaje3);

                System.out.println("");

                // lectura de la respuesta del servidor
                //String respuestaServidor = entrada.readLine();
                //System.out.println("Respuesta del servidor: " + respuestaServidor);
                
                
                // cierre del socket
                socketCliente.close();

            }
        } catch (IOException e)
        {
            System.out.println("Error " + e);
        }

     
    }

}
