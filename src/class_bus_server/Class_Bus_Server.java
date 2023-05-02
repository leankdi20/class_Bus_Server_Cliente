/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_bus_server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

/**
 *
 * @author andres aviles
 */
import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class Class_Bus_Server {

    public static void main(String[] args) {
        
        
//instancia clse ventana
        ventana_log vl = new ventana_log();
//ventana visible
        vl.setVisible(true);
 //cierra ventana 
        vl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //variables server socket y socket en null
        ServerSocket servidor = null;
        Socket sc = null;
        //variables data in y data out
        DataInputStream in;
        DataOutputStream out;
        
        //puerto en 8080
        final int PUERTO = 8080;

        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            while (true) {
                System.out.println("Esperando a cliente");
                //acepta conexion
                sc = servidor.accept();
                System.out.println("Cliente conectado");

                //in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                //transmision posiciones y mensaje concatenado de posiciones
                out.writeUTF(
                        "\n"
                        + "Bus01:" + vl.posicion_bus1 + "\n"
                        + "Bus02:" + vl.posicion_bus2 + "\n"
                        + "Bus03:" + vl.posicion_bus3 + "\n"
                        + "Bus04:" + vl.posicion_bus4 + "\n"
                        + "Bus05:" + vl.posicion_bus5 + "\n"
                        + "Bus06:" + vl.posicion_bus6 + "\n"
                        + "Bus07:" + vl.posicion_bus7 + "\n"
                        + "Bus08:" + vl.posicion_bus8 + "\n"
                        + "Bus09:" + vl.posicion_bus9 + "\n"
                        + "Bus10:" + vl.posicion_bus10 + "\n"
                );
                // tranmision tiempo
                out.writeUTF(String.format("\n%02d:%02d\n", vl.HORAS, vl.MIN));

           //cierra conexion
                sc.close();
                //mensaje cliente desconectado
                System.out.println("Cliente desconectado");
            }

        } catch (IOException e) {
            System.out.println("Error" + e);
        }

    }

}
