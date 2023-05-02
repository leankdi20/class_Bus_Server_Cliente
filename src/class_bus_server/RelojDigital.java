package class_bus_server;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andres aviles
 */
public class RelojDigital extends Observable implements Runnable {

    int horas, minutos, segundos;
    String TIEMPO;

    String[] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    public RelojDigital(int horas, int minutos, int segundos) {

//variable segundos, minutos y horas
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    public RelojDigital() {
    }
//metodo run implementado runnable

    @Override
    public void run() {

        String tiempo;
        try {
            while (true) {
//variable tiempo
                tiempo = "";
//suma horas a la variable
                if (horas < 10) {
                    tiempo += "0" + horas;
                } else {
                    tiempo += horas;
                }
//suma minutos a la variable
                tiempo += ":";//formato reloj

                if (minutos < 10) {
                    tiempo += "0" + minutos;
                } else {
                    tiempo += minutos;
                }
//añade  puntos para formato
                tiempo += ":";//formato reloj
//añade segundos
                if (segundos < 10) {
                    tiempo += "0" + segundos;
                } else {
                    tiempo += segundos;
                }
//pequno retraso para mejor procesamiento
                Thread.sleep(2);
//notificar observadores
                this.setChanged();
                this.notifyObservers(tiempo);
                this.clearChanged();
//variable tiempo se le hace un nuevo set
                this.TIEMPO = tiempo;
                //incrementa segundos
                segundos++;
//logica cambio de 24 horas a 0
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                    if (minutos == 60) {
                        minutos = 0;

                        horas++;
                        if (horas == 24) {

                            horas = 0;
                        }
                    }
                }
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(RelojDigital.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
