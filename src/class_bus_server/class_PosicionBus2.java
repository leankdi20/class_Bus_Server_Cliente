package class_bus_server;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_PosicionBus2 extends Observable implements Runnable {

    public boolean iterar = false;

   String[] paradas = {"P01", "P02", "P03", "P04", "P05", "P06","P07", "P08",
        "P09","P10", "P11", "P12", "P13", "P14", "P15", "P16","P17",
        "P18", "P19", "P20"};
    
    int i = 2;

    class_monitor monitor;

    public class_PosicionBus2(class_monitor m) {

        this.monitor = m;
    }

    public void start() {
        iterar = true;
        this.i = 2;
        new Thread(this).start();
    }

    public void stop() {
        iterar = false;
    }

    @Override
    public void run() {
        String posicion;

        try {
           
            while (iterar) {

                posicion = "";
                posicion = paradas[i - 1];
                setChanged();
                notifyObservers(posicion);
                this.clearChanged();

                monitor.bus2(posicion);

                if (i < 21) {
                    i++;
                }
                if (i == 21) {
                    i = 1;
                }

                if (monitor.compara_b1_b2() == true) {
                    Thread.sleep(0);
                    // System.out.println("cocurrencia bus 1 y bus 2");
                    setChanged();
                    notifyObservers("Concurrencia Bus 2 y Bus 1 \n");
                    this.clearChanged();

                } else {
                    Thread.sleep(3500);
                }

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(class_PosicionBus1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
