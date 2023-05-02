package class_bus_server;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_PosicionBus1 extends Observable implements Runnable {

    public boolean iterar = false;
//arreglo paradas
     String[] paradas = {"P01", "P02", "P03", "P04", "P05", "P06","P07", "P08",
        "P09","P10", "P11", "P12", "P13", "P14", "P15", "P16","P17",
        "P18", "P19", "P20"};
    //parada inicial del bus
    int i = 1;
//clase monitor
    class_monitor monitor;

    int horas;

    public class_PosicionBus1(class_monitor m) {

        this.monitor = m;

    }
//metodo arranque hilo
    public void start() {
        iterar = true;
        this.i = 1;
        new Thread(this).start();
    }
//metodo stop hilo
    public void stop() {
        iterar = false;
    }

    @Override
    public void run() {

        String posicion;

        try {
           
            while (iterar) {

                posicion = "";
                //posicion bus
                posicion = paradas[i - 1];
                //notifica observers
                setChanged();
                notifyObservers(posicion);
                this.clearChanged();

                monitor.bus1(posicion);

                if (i < 21) {
                    i++;
                }
                if (i == 21) {
                    i = 1;
                }
                if (monitor.compara_b1_b10() == true) {
                    Thread.sleep(0);
                    //hay concurrencia no espera y notifica mensaje 
                    setChanged();
                    notifyObservers("Concurrencia Bus 10 y Bus 9 \n");
                    this.clearChanged();

                } else {
                    Thread.sleep(3000);// espera 3 segundo tiempo entre paradas
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(class_PosicionBus1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
