/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package class_bus_server;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author andre
 */
public class ventana_log extends javax.swing.JFrame implements Observer {
//******* variable utiles*********
    private boolean interruptor = false;
    private int I = 0;
    private final int servicio = 5;
    private String[] dia
            = {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            };
    private int dia_entero = 0;
    private int activo = 0;
    private int activador = 0;
    private int desactivador = 0;
    RelojDigital R;
    private String domingo = "Domingo";

    //variable posicines bus inicializadas como fuera de servicio
    String posicion_bus1 = "   ", posicion_bus2 = "   ", posicion_bus3 = "   ", posicion_bus4 = "   ",
            posicion_bus5 = "   ", posicion_bus6 = "   ", posicion_bus7 = "   ", posicion_bus8 = "   ",
            posicion_bus9 = "   ", posicion_bus10 = "   ";
    int HORAS, MIN;
    boolean Transmicion = false;
    String dia_operacion;

    class_PosicionBus1 Bus1;
    class_PosicionBus2 Bus2;
    class_PosicionBus3 Bus3;
    class_PosicionBus4 Bus4;
    class_PosicionBus5 Bus5;
    class_PosicionBus6 Bus6;
    class_PosicionBus7 Bus7;
    class_PosicionBus8 Bus8;
    class_PosicionBus9 Bus9;
    class_PosicionBus10 Bus10;
//********* fin de variables utiles
//arranque hilos
    Thread t1;
    Thread t2;
    Thread t3;
    Thread t4;
    Thread t5;
    Thread t6;
    Thread t7;
    Thread t8;
    Thread t9;
    Thread t10;

    public ventana_log() {

        initComponents();
        //mensaje inicial
        JOptionPane.showMessageDialog(null, "Para efectos de facilitar la evaluacion se ingresa hora y dia de inicio... ");
        // ingeresa hora inicio servidor
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas (0-23)"));
        //instancia reloj con ingreso hora, minutos y segundos fijos
        R = new RelojDigital(horas, 00, 00);
//instancia clase monitor
        class_monitor m = new class_monitor();
//pasar objeto monitor a las clases buses
        Bus1 = new class_PosicionBus1(m);
        Bus2 = new class_PosicionBus2(m);
        Bus3 = new class_PosicionBus3(m);
        Bus4 = new class_PosicionBus4(m);
        Bus5 = new class_PosicionBus5(m);
        Bus6 = new class_PosicionBus6(m);
        Bus7 = new class_PosicionBus7(m);
        Bus8 = new class_PosicionBus8(m);
        Bus9 = new class_PosicionBus9(m);
        Bus10 = new class_PosicionBus10(m);
// add observadores
        Bus1.addObserver(this);
        Bus2.addObserver(this);
        Bus3.addObserver(this);
        Bus4.addObserver(this);
        Bus5.addObserver(this);
        Bus6.addObserver(this);
        Bus7.addObserver(this);
        Bus8.addObserver(this);
        Bus9.addObserver(this);
        Bus10.addObserver(this);
//hilos les paso objeto bus
        t1 = new Thread(Bus1);
        t2 = new Thread(Bus2);
        t3 = new Thread(Bus3);
        t4 = new Thread(Bus4);
        t5 = new Thread(Bus5);
        t6 = new Thread(Bus6);
        t7 = new Thread(Bus7);
        t8 = new Thread(Bus8);
        t9 = new Thread(Bus9);
        t10 = new Thread(Bus10);

    }
//metodo text area
    public JTextArea getJtextArea() {
        return JTA1;
    }
//metodo contar concurrencias
    public void contador_concurrencias(int i) {

        I = I + i;

        lbl_contador.setText(Integer.toString(I));
    }
//metodo transmitir
    public void transmitir(String dato) {

        System.out.println(dato);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA1 = new javax.swing.JTextArea();
        lbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lbl_contador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        C1 = new javax.swing.JComboBox<>();
        lbl_Dia = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTA1.setColumns(20);
        JTA1.setRows(5);
        jScrollPane1.setViewportView(JTA1);

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Servicio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Hora Actual:");

        lblEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_contador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_contador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Contador de Concurrencias:");

        C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el dia", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));
        C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        lbl_Dia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Iniciar Prueba");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Dia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C1, 0, 146, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lbl_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//seleccion de dia servidor
    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        String dia_inicio = C1.getSelectedItem().toString();;
        /*if( dia_inicio == "Lunes"){
            int dia_entero = 0;
        }*/
        switch (dia_inicio) {

            case "Lunes":
                dia_entero = 0;
                break;
            case "Martes":
                dia_entero = 1;
                break;
            case "Miercoles":
                dia_entero = 2;
                break;
            case "Jueves":
                dia_entero = 3;
                break;
            case "Viernes":
                dia_entero = 4;
                break;
            case "Sabado":
                dia_entero = 5;
                break;
            case "Domingo":
                dia_entero = 6;
                break;

            default:
                break;

        }
        lbl_Dia.setText("Dia de Operacion:" + dia[dia_entero]);


    }//GEN-LAST:event_C1ActionPerformed
//inicia hilo y observador
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        R.addObserver(this);
        Thread tR = new Thread(R);
        tR.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_log().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C1;
    private javax.swing.JTextArea JTA1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lbl_Dia;
    private javax.swing.JLabel lbl_contador;
    // End of variables declaration//GEN-END:variables
//metodo abstracto relacionado con observables
    @Override
    public void update(Observable o, Object arg) {

        lbl_contador.setOpaque(true);
//observa bus 1
        if (o instanceof class_PosicionBus1) {
            // Se produjo un cambio en el objeto Producto
            JTA1.append("Bus01 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus1 = activa;
            }

        }
        //observa bus 2
        if (o instanceof class_PosicionBus2) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus02 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus2 = activa;
            }

        }
        //observa bus 3
        if (o instanceof class_PosicionBus3) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus03 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus3 = activa;
            }

        }
        //observa bus 4
        if (o instanceof class_PosicionBus4) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus04 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus4 = activa;
            }

        }
         //observa bus 5
        if (o instanceof class_PosicionBus5) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus05 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus5 = activa;
            }

        }
         //observa bus 6
        if (o instanceof class_PosicionBus6) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus06 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus6 = activa;
            }
        }
         //observa bus 7
        if (o instanceof class_PosicionBus7) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus07 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus7 = activa;
            }
        }
         //observa bus 8
        if (o instanceof class_PosicionBus8) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus08 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus8 = activa;
            }
        }
         //observa bus 9
        if (o instanceof class_PosicionBus9) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus09 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus9 = activa;
            }
        }
         //observa bus 10
        if (o instanceof class_PosicionBus10) {
            // Se produjo un cambio en el objeto Inventario
            JTA1.append("Bus10 : " + (String) arg + "  \n");

            String A = "C";
            String activa = (String) arg;
            String activa_sub = activa.substring(0, 1);
            if (activa_sub.equals(A)) {
                contador_concurrencias(1);
            } else {
                this.posicion_bus10 = activa;
            }
        }
        //observa reloj digital
        if (o instanceof RelojDigital) {
            // Se produjo un cambio en el objeto Producto

            lbl1.setText((String) arg);

            String cadena = (String) arg;

            activo = Integer.parseInt(cadena.substring(0, 2));

            this.HORAS = activo;

            int min = Integer.parseInt(cadena.substring(3, 5));

            this.MIN = min;

            int sec = Integer.parseInt(cadena.substring(6, 8));

            System.out.println(activo);
            System.out.println(min);
            //System.out.println(sec);
            lblEstado.setOpaque(true);

            if (dia[dia_entero] == domingo) {

                if (activo >= 5 && activo < 19) {

                    activador++;//Esta variable porque sino el hilo se activa por cada vez que se actualiza la hora
                    //solo es necesario activar el hilo a las 5:00:00 am
//activador al primer momento cierta hora y desactivador tambien
                    if (activador == 1) {

                        lblEstado.setBackground(Color.green);
                        Bus1.start();
                        Bus2.start();
                        Bus3.start();
                        Bus4.start();
                        Bus5.start();
                        Bus6.start();
                        Bus7.start();
                        Bus8.start();
                        Bus9.start();
                        Bus10.start();
                        desactivador = 0;//Variable desactivar cruzado
                    }

                }
                //para con la hora activador y desactivador
                if (activo < 5 || activo >= 19) {

                    lblEstado.setBackground(Color.red);

                    desactivador++;

                    if (desactivador == 1) {//activa una vez cuando la hora de fuera de servicio llega
                        Bus1.stop();
                        Bus2.stop();
                        Bus3.stop();
                        Bus4.stop();
                        Bus5.stop();
                        Bus6.stop();
                        Bus7.stop();
                        Bus8.stop();
                        Bus9.stop();
                        Bus10.stop();
                        activador = 0;//variable cruzada
                        JTA1.append("*fuera de servicio:L-V:5:00am a 0:00AM,D:5am a 19PM*\n");
                    }

                }

            }
            //activador y desactivador domingo
            if (dia[dia_entero] != domingo) {

                if (activo >= 5) {

                    activador++;//Esta variable porque sino el hilo se activa por cada vez que se actualiza la hora
                    //solo es necesario activar el hilo a las 5:00:00 am

                    if (activador == 1) {

                        lblEstado.setBackground(Color.green);
                        Bus1.start();
                        Bus2.start();
                        Bus3.start();
                        Bus4.start();
                        Bus5.start();
                        Bus6.start();
                        Bus7.start();
                        Bus8.start();
                        Bus9.start();
                        Bus10.start();
                        desactivador = 0;//Variable desactivar cruzado
                    }

                }
                if (activo < 5) {

                    lblEstado.setBackground(Color.red);

                    desactivador++;

                    if (desactivador == 1) {//activa una vez cuando la hora de fuera de servicio llega
                        Bus1.stop();
                        Bus2.stop();
                        Bus3.stop();
                        Bus4.stop();
                        Bus5.stop();
                        Bus6.stop();
                        Bus7.stop();
                        Bus8.stop();
                        Bus9.stop();
                        Bus10.stop();
                        activador = 0;//variable cruzada
                        JTA1.append("*fuera de servicio:L-V:5:00am a 0:00AM,D:5am a 19PM*\n");

                    }

                }

            }
//dia de operacion
            if (activo == 0 && min == 0 && sec == 0) {
                System.out.println("cambio de dia");
                dia_entero = dia_entero + 1;

                if (dia_entero == 7) {
                    dia_entero = 0;
                    lbl_Dia.setText("Dia de Operacion:" + dia[dia_entero]);

                } else {
                    lbl_Dia.setText("Dia de Operacion:" + dia[dia_entero]);

                }
                //this.dia_operacion = dia[dia_entero];
                System.out.println(dia);
            }
        }

    }

}
