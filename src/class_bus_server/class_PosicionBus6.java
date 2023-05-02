package class_bus_server;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_PosicionBus6 extends Observable implements Runnable {

    public boolean iterar = false;
//arreglo paradas
    String[] paradas = {"P01", "P02", "P03", "P04", "P05", "P06","P07", "P08",
        "P09","P10", "P11", "P12", "P13", "P14", "P15", "P16","P17",
        "P18", "P19", "P20"};
    //posicion inicial bus
    int i = 6;
    class_monitor monitor;

    public class_PosicionBus6(class_monitor m) {

        this.monitor = m;
    }
//metodo arranque hilo
    public void start() {

        iterar = true;
        this.i = 6;
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
                //notifica posicion
                setChanged();
                notifyObservers(posicion);
                this.clearChanged();

                monitor.bus6(posicion);

                if (i < 21) {
                    i++;
                }
                if (i == 21) {
                    i = 1;
                }
                if (monitor.compara_b6_b5() == true) {
                    Thread.sleep(0);
                    //notifica concurrencia y no hay espera
                    setChanged();
                    notifyObservers("Concurrencia Bus 6 y Bus 5 \n");
                    this.clearChanged();

                } else {
                    //eserpa tiempo de ruta
                    Thread.sleep(3000);
                }

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(class_PosicionBus1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
