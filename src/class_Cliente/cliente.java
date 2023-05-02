/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package class_Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author Leandro
 */
public class cliente extends javax.swing.JFrame implements Runnable {

    String Datos = "";
    boolean init = false;// control de mostrar datos o no
    int sub_start = 0;// control de substring
    int final_start = 0;// control de substring
    String dato_posiciones;

    public cliente() {
        initComponents();
    }

    //Metodo para transmitir desde servidor a cliente//
    
    //En este metodo tenemos las coordenadas de los buses que son llamados con los SubString.
    public void llenarVentana(String mensaje) {

        if (init == true) {

            this.dato_posiciones = mensaje;

            dato_posiciones = mensaje.substring(sub_start, final_start);

            JTA3.append(dato_posiciones);

           // exito.setText(mensaje.substring(7, 10));
            /*  
            if( mensaje.substring(7, 10).equals("P01")){
               move.setLayout(null);
               move.setLocation(0, 0);
                exito.setText("exito");
            }else{
                 move.setLocation(700, 700);
            }*/
            
             if (mensaje.substring(7, 10).equals("P01"))
            {
                lblBus1.setLayout(null);
                lblBus1.setLocation(514, 163);
                
                //exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(7, 10).equals("P02"))
            {
                lblBus1.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(7, 10).equals("P03"))
            {
                lblBus1.setLocation(768, 118);
            }
            if (mensaje.substring(7, 10).equals("P04"))
            {
                lblBus1.setLocation(796, 174);             
            } 
             if (mensaje.substring(7, 10).equals("P05"))
            {
                lblBus1.setLocation(780, 297);
            }
             if (mensaje.substring(7, 10).equals("P06"))
            {
                lblBus1.setLocation(703, 410);
            }
              if (mensaje.substring(7, 10).equals("P07"))
            {
                lblBus1.setLocation(632, 440);
            }
               if (mensaje.substring(7, 10).equals("P08"))
            {
                lblBus1.setLocation(459, 421);
            }
                if (mensaje.substring(7, 10).equals("P09"))
            {
                lblBus1.setLocation(392, 418);
            }
                 if (mensaje.substring(7, 10).equals("P10"))
            {
                lblBus1.setLocation(255, 425);
            }
                  if (mensaje.substring(7, 10).equals("P11"))
            {
                lblBus1.setLocation(126, 404);
            } if (mensaje.substring(7, 10).equals("P12"))
            {
                lblBus1.setLocation(158, 376);
            }
             if (mensaje.substring(7, 10).equals("P13"))
            {
                lblBus1.setLocation(28, 359);
            }
              if (mensaje.substring(7, 10).equals("P14"))
            {
                lblBus1.setLocation(58, 319);
            }
               if (mensaje.substring(7, 10).equals("P15"))
            {
                lblBus1.setLocation(134, 316);
            }
                if (mensaje.substring(7, 10).equals("P16"))
            {
                lblBus1.setLocation(229, 303);
            }
                 if (mensaje.substring(7, 10).equals("P17"))
            {
                lblBus1.setLocation(151, 237);
            }
                  if (mensaje.substring(7, 10).equals("P18"))
            {
                lblBus1.setLocation(190, 190);
            }
                   if (mensaje.substring(7, 10).equals("P19"))
            {
                lblBus1.setLocation(273, 202);
            }
                    if (mensaje.substring(7, 10).equals("P20"))
            {
                lblBus1.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
            
            //----------------------------------------------------------------------------------------------------//
            //----------------------------------BUS 2----------------------------------------------------------
             if (mensaje.substring(17, 20).equals("P01"))
            {
                lblBus2.setLayout(null);
                lblBus2.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(17, 20).equals("P02"))
            {
                lblBus2.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(17, 20).equals("P03"))
            {
                lblBus2.setLocation(768, 118);
            }
            if (mensaje.substring(17, 20).equals("P04"))
            {
                lblBus2.setLocation(796, 174);             
            } 
             if (mensaje.substring(17, 20).equals("P05"))
            {
                lblBus2.setLocation(780, 297);
            }
             if (mensaje.substring(17, 20).equals("P06"))
            {
                lblBus2.setLocation(703, 410);
            }
              if (mensaje.substring(18, 21).equals("P07"))
            {
                lblBus2.setLocation(632, 440);
            }
               if (mensaje.substring(17, 20).equals("P08"))
            {
                lblBus2.setLocation(459, 421);
            }
                if (mensaje.substring(17, 20).equals("P09"))
            {
                lblBus2.setLocation(392, 418);
            }
                 if (mensaje.substring(17, 20).equals("P10"))
            {
                lblBus2.setLocation(255, 425);
            }
                  if (mensaje.substring(17, 20).equals("P11"))
            {
                lblBus2.setLocation(126, 404);
            } if (mensaje.substring(17, 20).equals("P12"))
            {
                lblBus2.setLocation(158, 376);
            }
             if (mensaje.substring(17, 20).equals("P13"))
            {
                lblBus2.setLocation(28, 359);
            }
              if (mensaje.substring(17, 20).equals("P14"))
            {
                lblBus2.setLocation(58, 319);
            }
               if (mensaje.substring(17, 20).equals("P15"))
            {
                lblBus2.setLocation(134, 316);
            }
                if (mensaje.substring(17, 20).equals("P16"))
            {
                lblBus2.setLocation(229, 303);
            }
                 if (mensaje.substring(17, 20).equals("P17"))
            {
                lblBus2.setLocation(151, 237);
            }
                  if (mensaje.substring(17, 20).equals("P18"))
            {
                lblBus2.setLocation(190, 190);
            }
                   if (mensaje.substring(17, 20).equals("P19"))
            {
                lblBus2.setLocation(273, 202);
            }
                    if (mensaje.substring(17, 20).equals("P20"))
            {
                lblBus2.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
                    
            //---------------------------------------------------------------------------------//
            //-----------------Bus3---------Bus3-------------Bus3------------------------------//
             if (mensaje.substring(27, 30).equals("P01"))
            {
                lblBus3.setLayout(null);
                lblBus3.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(27, 30).equals("P02"))
            {
                lblBus3.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(27, 30).equals("P03"))
            {
                lblBus3.setLocation(768, 118);
            }
            if (mensaje.substring(27, 30).equals("P04"))
            {
                lblBus3.setLocation(796, 174);             
            } 
             if (mensaje.substring(27, 30).equals("P05"))
            {
                lblBus3.setLocation(780, 297);
            }
             if (mensaje.substring(27, 30).equals("P06"))
            {
                lblBus3.setLocation(703, 410);
            }
              if (mensaje.substring(27, 30).equals("P07"))
            {
                lblBus3.setLocation(632, 440);
            }
               if (mensaje.substring(27, 30).equals("P08"))
            {
                lblBus3.setLocation(459, 421);
            }
                if (mensaje.substring(27, 30).equals("P09"))
            {
                lblBus3.setLocation(392, 418);
            }
                 if (mensaje.substring(27, 30).equals("P10"))
            {
                lblBus3.setLocation(255, 425);
            }
                  if (mensaje.substring(27, 30).equals("P11"))
            {
                lblBus3.setLocation(126, 404);
            } if (mensaje.substring(27, 30).equals("P12"))
            {
                lblBus3.setLocation(158, 376);
            }
             if (mensaje.substring(27, 30).equals("P13"))
            {
                lblBus3.setLocation(28, 359);
            }
              if (mensaje.substring(27, 30).equals("P14"))
            {
                lblBus3.setLocation(58, 319);
            }
               if (mensaje.substring(27, 30).equals("P15"))
            {
                lblBus3.setLocation(134, 316);
            }
                if (mensaje.substring(27, 30).equals("P16"))
            {
                lblBus3.setLocation(229, 303);
            }
                 if (mensaje.substring(27, 30).equals("P17"))
            {
                lblBus3.setLocation(151, 237);
            }
                  if (mensaje.substring(27, 30).equals("P18"))
            {
                lblBus3.setLocation(190, 190);
            }
                   if (mensaje.substring(27, 30).equals("P19"))
            {
                lblBus3.setLocation(273, 202);
            }
                    if (mensaje.substring(27, 30).equals("P20"))
            {
                lblBus3.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
            
                    
             //---------------------------------------------------------------------------------//
            //-----------------Bus4---------Bus4-------------Bus4------------------------------//
             if (mensaje.substring(37, 40).equals("P01"))
            {
                lblBus4.setLayout(null);
                lblBus4.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(37, 40).equals("P02"))
            {
                lblBus4.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(37, 40).equals("P03"))
            {
                lblBus4.setLocation(768, 118);
            }
            if (mensaje.substring(37, 40).equals("P04"))
            {
                lblBus4.setLocation(796, 174);             
            } 
             if (mensaje.substring(37, 40).equals("P05"))
            {
                lblBus4.setLocation(780, 297);
            }
             if (mensaje.substring(37, 40).equals("P06"))
            {
                lblBus4.setLocation(703, 410);
            }
              if (mensaje.substring(37, 40).equals("P07"))
            {
                lblBus4.setLocation(632, 440);
            }
               if (mensaje.substring(37, 40).equals("P08"))
            {
                lblBus4.setLocation(459, 421);
            }
                if (mensaje.substring(37, 40).equals("P09"))
            {
                lblBus4.setLocation(392, 418);
            }
                 if (mensaje.substring(37, 40).equals("P10"))
            {
                lblBus4.setLocation(255, 425);
            }
                  if (mensaje.substring(37, 40).equals("P11"))
            {
                lblBus4.setLocation(126, 404);
            } if (mensaje.substring(37, 40).equals("P12"))
            {
                lblBus4.setLocation(158, 376);
            }
             if (mensaje.substring(37, 40).equals("P13"))
            {
                lblBus4.setLocation(28, 359);
            }
              if (mensaje.substring(37, 40).equals("P14"))
            {
                lblBus4.setLocation(58, 319);
            }
               if (mensaje.substring(37, 40).equals("P15"))
            {
                lblBus4.setLocation(134, 316);
            }
                if (mensaje.substring(37, 40).equals("P16"))
            {
                lblBus4.setLocation(229, 303);
            }
                 if (mensaje.substring(37, 40).equals("P17"))
            {
                lblBus4.setLocation(151, 237);
            }
                  if (mensaje.substring(37, 40).equals("P18"))
            {
                lblBus4.setLocation(190, 190);
            }
                   if (mensaje.substring(37, 40).equals("P19"))
            {
                lblBus4.setLocation(273, 202);
            }
                    if (mensaje.substring(37, 40).equals("P20"))
            {
                lblBus4.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
            
        //---------------------------------------------------------------------------------//
        //------------Bus5 cordenadas mapa------------------------------------------------//
             if (mensaje.substring(47, 50).equals("P01"))
            {
                lblBus5.setLayout(null);
                lblBus5.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(47, 50).equals("P02"))
            {
                lblBus5.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(47, 50).equals("P03"))
            {
                lblBus5.setLocation(768, 118);
            }
            if (mensaje.substring(47, 50).equals("P04"))
            {
                lblBus5.setLocation(796, 174);             
            } 
             if (mensaje.substring(47, 50).equals("P05"))
            {
                lblBus5.setLocation(780, 297);
            }
             if (mensaje.substring(47, 50).equals("P06"))
            {
                lblBus5.setLocation(703, 410);
            }
              if (mensaje.substring(47, 50).equals("P07"))
            {
                lblBus5.setLocation(632, 440);
            }
               if (mensaje.substring(47, 50).equals("P08"))
            {
                lblBus5.setLocation(459, 421);
            }
                if (mensaje.substring(47, 50).equals("P09"))
            {
                lblBus5.setLocation(392, 418);
            }
                 if (mensaje.substring(47, 50).equals("P10"))
            {
                lblBus5.setLocation(255, 425);
            }
                  if (mensaje.substring(47, 50).equals("P11"))
            {
                lblBus5.setLocation(126, 404);
            } if (mensaje.substring(47, 50).equals("P12"))
            {
                lblBus5.setLocation(158, 376);
            }
             if (mensaje.substring(47, 50).equals("P13"))
            {
                lblBus5.setLocation(28, 359);
            }
              if (mensaje.substring(47, 50).equals("P14"))
            {
                lblBus5.setLocation(58, 319);
            }
               if (mensaje.substring(47, 50).equals("P15"))
            {
                lblBus5.setLocation(134, 316);
            }
                if (mensaje.substring(47, 50).equals("P16"))
            {
                lblBus5.setLocation(229, 303);
            }
                 if (mensaje.substring(47, 50).equals("P17"))
            {
                lblBus5.setLocation(151, 237);
            }
                  if (mensaje.substring(47, 50).equals("P18"))
            {
                lblBus5.setLocation(190, 190);
            }
                   if (mensaje.substring(47, 50).equals("P19"))
            {
                lblBus5.setLocation(273, 202);
            }
                    if (mensaje.substring(47, 50).equals("P20"))
            {
                lblBus5.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
                    
             //---------------------------------------------------------------------------------//
        //------------Bus6 cordenadas mapa----------------------------------------------------------------//
             if (mensaje.substring(57, 60).equals("P01"))
            {
                lblBus6.setLayout(null); //sirve para cambiar la posicion
                lblBus6.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(57, 60).equals("P02"))
            {
                lblBus6.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(57, 60).equals("P03"))
            {
                lblBus6.setLocation(768, 118);
            }
            if (mensaje.substring(57, 60).equals("P04"))
            {
                lblBus6.setLocation(796, 174);             
            } 
             if (mensaje.substring(57, 60).equals("P05"))
            {
                lblBus6.setLocation(780, 297);
            }
             if (mensaje.substring(57, 60).equals("P06"))
            {
                lblBus6.setLocation(703, 410);
            }
              if (mensaje.substring(57, 60).equals("P07"))
            {
                lblBus6.setLocation(632, 440);
            }
               if (mensaje.substring(57, 60).equals("P08"))
            {
                lblBus6.setLocation(459, 421);
            }
                if (mensaje.substring(57, 60).equals("P09"))
            {
                lblBus6.setLocation(392, 418);
            }
                 if (mensaje.substring(57, 60).equals("P10"))
            {
                lblBus6.setLocation(255, 425);
            }
                  if (mensaje.substring(57, 60).equals("P11"))
            {
                lblBus6.setLocation(126, 404);
            } if (mensaje.substring(57, 60).equals("P12"))
            {
                lblBus6.setLocation(158, 376);
            }
             if (mensaje.substring(57, 60).equals("P13"))
            {
                lblBus6.setLocation(28, 359);
            }
              if (mensaje.substring(57, 60).equals("P14"))
            {
                lblBus6.setLocation(58, 319);
            }
               if (mensaje.substring(57, 60).equals("P15"))
            {
                lblBus6.setLocation(134, 316);
            }
                if (mensaje.substring(57, 60).equals("P16"))
            {
                lblBus6.setLocation(229, 303);
            }
                 if (mensaje.substring(57, 60).equals("P17"))
            {
                lblBus6.setLocation(151, 237);
            }
                  if (mensaje.substring(57, 60).equals("P18"))
            {
                lblBus6.setLocation(190, 190);
            }
                   if (mensaje.substring(57, 60).equals("P19"))
            {
                lblBus6.setLocation(273, 202);
            }
                    if (mensaje.substring(57, 60).equals("P20"))
            {
                lblBus6.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
                    
            //---------------------------------------------------------------------------------//
            //------------Bus7 cordenadas mapa----------------------------------------------------------------//
             if (mensaje.substring(67, 70).equals("P01"))
            {
                lblBus7.setLayout(null); //sirve para cambiar la posicion
                lblBus7.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(67, 70).equals("P02"))
            {
                lblBus7.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(67, 70).equals("P03"))
            {
                lblBus7.setLocation(768, 118);
            }
            if (mensaje.substring(67, 70).equals("P04"))
            {
                lblBus7.setLocation(796, 174);             
            } 
             if (mensaje.substring(67, 70).equals("P05"))
            {
                lblBus7.setLocation(780, 297);
            }
             if (mensaje.substring(67, 70).equals("P06"))
            {
                lblBus7.setLocation(703, 410);
            }
              if (mensaje.substring(67, 70).equals("P07"))
            {
                lblBus7.setLocation(632, 440);
            }
               if (mensaje.substring(67, 70).equals("P08"))
            {
                lblBus7.setLocation(459, 421);
            }
                if (mensaje.substring(67, 70).equals("P09"))
            {
                lblBus7.setLocation(392, 418);
            }
                 if (mensaje.substring(67, 70).equals("P10"))
            {
                lblBus7.setLocation(255, 425);
            }
                  if (mensaje.substring(67, 70).equals("P11"))
            {
                lblBus7.setLocation(126, 404);
            } if (mensaje.substring(67, 70).equals("P12"))
            {
                lblBus7.setLocation(158, 376);
            }
             if (mensaje.substring(67, 70).equals("P13"))
            {
                lblBus7.setLocation(28, 359);
            }
              if (mensaje.substring(67, 70).equals("P14"))
            {
                lblBus7.setLocation(58, 319);
            }
               if (mensaje.substring(67, 70).equals("P15"))
            {
                lblBus7.setLocation(134, 316);
            }
                if (mensaje.substring(67, 70).equals("P16"))
            {
                lblBus7.setLocation(229, 303);
            }
                 if (mensaje.substring(67, 70).equals("P17"))
            {
                lblBus7.setLocation(151, 237);
            }
                  if (mensaje.substring(67, 70).equals("P18"))
            {
                lblBus7.setLocation(190, 190);
            }
                   if (mensaje.substring(67, 70).equals("P19"))
            {
                lblBus7.setLocation(273, 202);
            }
                    if (mensaje.substring(67, 70).equals("P20"))
            {
                lblBus7.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
                    
            //----------------------------------------------------------------------------------//
            //------------Bus8 cordenadas mapa----------------------------------------------------------------//
             if (mensaje.substring(77, 80).equals("P01"))
            {
                lblBus8.setLayout(null); //sirve para cambiar la posicion
                lblBus8.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(77, 80).equals("P02"))
            {
                lblBus8.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(77, 80).equals("P03"))
            {
                lblBus8.setLocation(768, 118);
            }
            if (mensaje.substring(77, 80).equals("P04"))
            {
                lblBus8.setLocation(796, 174);             
            } 
             if (mensaje.substring(77, 80).equals("P05"))
            {
                lblBus8.setLocation(780, 297);
            }
             if (mensaje.substring(77, 80).equals("P06"))
            {
                lblBus8.setLocation(703, 410);
            }
              if (mensaje.substring(77, 80).equals("P07"))
            {
                lblBus8.setLocation(632, 440);
            }
               if (mensaje.substring(77, 80).equals("P08"))
            {
                lblBus8.setLocation(459, 421);
            }
                if (mensaje.substring(77, 80).equals("P09"))
            {
                lblBus8.setLocation(392, 418);
            }
                 if (mensaje.substring(77, 80).equals("P10"))
            {
                lblBus8.setLocation(255, 425);
            }
                  if (mensaje.substring(77, 80).equals("P11"))
            {
                lblBus8.setLocation(126, 404);
            } if (mensaje.substring(77, 80).equals("P12"))
            {
                lblBus8.setLocation(158, 376);
            }
             if (mensaje.substring(77, 80).equals("P13"))
            {
                lblBus8.setLocation(28, 359);
            }
              if (mensaje.substring(77, 80).equals("P14"))
            {
                lblBus8.setLocation(58, 319);
            }
               if (mensaje.substring(77, 80).equals("P15"))
            {
                lblBus8.setLocation(134, 316);
            }
                if (mensaje.substring(77, 80).equals("P16"))
            {
                lblBus8.setLocation(229, 303);
            }
                 if (mensaje.substring(77, 80).equals("P17"))
            {
                lblBus8.setLocation(151, 237);
            }
                  if (mensaje.substring(77, 80).equals("P18"))
            {
                lblBus8.setLocation(190, 190);
            }
                   if (mensaje.substring(77, 80).equals("P19"))
            {
                lblBus8.setLocation(273, 202);
            }
                    if (mensaje.substring(77, 80).equals("P20"))
            {
                lblBus8.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
                    
            //----------------------------------------------------------------------------------//
            //------------Bus9 cordenadas mapa----------------------------------------------------------------//
             if (mensaje.substring(87, 90).equals("P01"))
            {
                lblBus9.setLayout(null); //sirve para cambiar la posicion
                lblBus9.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(87, 90).equals("P02"))
            {
                lblBus9.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(87, 90).equals("P03"))
            {
                lblBus9.setLocation(768, 118);
            }
            if (mensaje.substring(87, 90).equals("P04"))
            {
                lblBus9.setLocation(796, 174);             
            } 
             if (mensaje.substring(87, 90).equals("P05"))
            {
                lblBus9.setLocation(780, 297);
            }
             if (mensaje.substring(87, 90).equals("P06"))
            {
                lblBus9.setLocation(703, 410);
            }
              if (mensaje.substring(87, 90).equals("P07"))
            {
                lblBus9.setLocation(632, 440);
            }
               if (mensaje.substring(87, 90).equals("P08"))
            {
                lblBus9.setLocation(459, 421);
            }
                if (mensaje.substring(87, 90).equals("P09"))
            {
                lblBus9.setLocation(392, 418);
            }
                 if (mensaje.substring(87, 90).equals("P10"))
            {
                lblBus9.setLocation(255, 425);
            }
                  if (mensaje.substring(87, 90).equals("P11"))
            {
                lblBus9.setLocation(126, 404);
            } if (mensaje.substring(87, 90).equals("P12"))
            {
                lblBus9.setLocation(158, 376);
            }
             if (mensaje.substring(87, 90).equals("P13"))
            {
                lblBus9.setLocation(28, 359);
            }
              if (mensaje.substring(87, 90).equals("P14"))
            {
                lblBus9.setLocation(58, 319);
            }
               if (mensaje.substring(87, 90).equals("P15"))
            {
                lblBus9.setLocation(134, 316);
            }
                if (mensaje.substring(87, 90).equals("P16"))
            {
                lblBus9.setLocation(229, 303);
            }
                 if (mensaje.substring(87, 90).equals("P17"))
            {
                lblBus9.setLocation(151, 237);
            }
                  if (mensaje.substring(87, 90).equals("P18"))
            {
                lblBus9.setLocation(190, 190);
            }
                   if (mensaje.substring(87, 90).equals("P19"))
            {
                lblBus9.setLocation(273, 202);
            }
                    if (mensaje.substring(87, 90).equals("P20"))
            {
                lblBus9.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
                    
            //----------------------------------------------------------------------------------//
            //------------Bus10 cordenadas mapa----------------------------------------------------------------//
             if (mensaje.substring(97, 100).equals("P01"))
            {
                lblBus10.setLayout(null); //sirve para cambiar la posicion
                lblBus10.setLocation(514, 163);
                
               // exito.setText("exito");
                //Si el bus está en la coordenada P01, le digo que pase a la P02.
            }
            if (mensaje.substring(97, 100).equals("P02"))
            {
                lblBus10.setLocation(681, 148);// Si está acá, le digo que pase a P03 con su coordenada.
            }
            if (mensaje.substring(97, 100).equals("P03"))
            {
                lblBus10.setLocation(768, 118);
            }
            if (mensaje.substring(97, 100).equals("P04"))
            {
                lblBus10.setLocation(796, 174);             
            } 
             if (mensaje.substring(97, 100).equals("P05"))
            {
                lblBus10.setLocation(780, 297);
            }
             if (mensaje.substring(97, 100).equals("P06"))
            {
                lblBus10.setLocation(703, 410);
            }
              if (mensaje.substring(97, 100).equals("P07"))
            {
                lblBus10.setLocation(632, 440);
            }
               if (mensaje.substring(97, 100).equals("P08"))
            {
                lblBus10.setLocation(459, 421);
            }
                if (mensaje.substring(97, 100).equals("P09"))
            {
                lblBus10.setLocation(392, 418);
            }
                 if (mensaje.substring(97, 100).equals("P10"))
            {
                lblBus10.setLocation(255, 425);
            }
                  if (mensaje.substring(97, 100).equals("P11"))
            {
                lblBus10.setLocation(126, 404);
            } if (mensaje.substring(97, 100).equals("P12"))
            {
                lblBus10.setLocation(158, 376);
            }
             if (mensaje.substring(97, 100).equals("P13"))
            {
                lblBus10.setLocation(28, 359);
            }
              if (mensaje.substring(97, 100).equals("P14"))
            {
                lblBus10.setLocation(58, 319);
            }
               if (mensaje.substring(97, 100).equals("P15"))
            {
                lblBus10.setLocation(134, 316);
            }
                if (mensaje.substring(97, 100).equals("P16"))
            {
                lblBus10.setLocation(229, 303);
            }
                 if (mensaje.substring(97, 100).equals("P17"))
            {
                lblBus10.setLocation(151, 237);
            }
                  if (mensaje.substring(97, 100).equals("P18"))
            {
                lblBus10.setLocation(190, 190);
            }
                   if (mensaje.substring(97, 100).equals("P19"))
            {
                lblBus10.setLocation(273, 202);
            }
                    if (mensaje.substring(97, 100).equals("P20"))
            {
                lblBus10.setLocation(412, 180);
            }
            else
            {
                //lblBus1.setLocation(28, 44);
            }
            
            
            
            //------------SubString para determinar las posiciones de los Buses----------------//
            //-----------------------------------------------------------------------------------//
            //----------------------------------------------------------------------------------//
            if (sub_start == 1) {
                b1.setText(dato_posiciones = mensaje.substring(1, 11));
            }
            if (sub_start == 11) {
                b2.setText(dato_posiciones = mensaje.substring(11, 21));
            }
            if (sub_start == 22) {
                b3.setText(dato_posiciones = mensaje.substring(21, 30));
            }
            if (sub_start == 30) {
                b4.setText(dato_posiciones = mensaje.substring(31, 40));
            }

            if (sub_start == 40) {
                b5.setText(dato_posiciones = mensaje.substring(40, 50));
            }
            if (sub_start == 50) {
                b6.setText(dato_posiciones = mensaje.substring(50, 60));
            }
            if (sub_start == 60) {
                b7.setText(dato_posiciones = mensaje.substring(60, 70));
            }

            if (sub_start == 70) {
                b8.setText(dato_posiciones = mensaje.substring(70, 80));
            }
            if (sub_start == 80) {
                b9.setText(dato_posiciones = mensaje.substring(80, 90));
            }
             if (sub_start == 90) {
                b10.setText(dato_posiciones = mensaje.substring(90, 100));
            }
        }

    }

    // Metodo para rellenar el campo de la hora en cliente
    public void llenarHora(String mensaje2) {
        String tiempo = mensaje2;
        if (mensaje2.length() > 6) {
            tiempo = mensaje2.substring(0, 6);
        }
        lbl1.setText(tiempo);

    }

    // Metdo para rellenar el dia de la semana, segun sea el dia laboral
    public void llenarDia(String mensaje3) {

        String dia = mensaje3;
        if (mensaje3.length() > 10) {
            dia = mensaje3.substring(0, 10);

        }
        Dia.setText(dia);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Dia = new javax.swing.JLabel();
        mostrar = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        bus1 = new javax.swing.JButton();
        bus2 = new javax.swing.JButton();
        bus3 = new javax.swing.JButton();
        bus4 = new javax.swing.JButton();
        bus5 = new javax.swing.JButton();
        bus6 = new javax.swing.JButton();
        bus9 = new javax.swing.JButton();
        bus7 = new javax.swing.JButton();
        bus8 = new javax.swing.JButton();
        bus10 = new javax.swing.JButton();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBus1 = new javax.swing.JLabel();
        lblBus4 = new javax.swing.JLabel();
        lblBus5 = new javax.swing.JLabel();
        lblBus2 = new javax.swing.JLabel();
        lblBus3 = new javax.swing.JLabel();
        lblBus6 = new javax.swing.JLabel();
        lblBus9 = new javax.swing.JLabel();
        lblBus8 = new javax.swing.JLabel();
        lblBus7 = new javax.swing.JLabel();
        lblBus10 = new javax.swing.JLabel();
        PARADA1 = new javax.swing.JLabel();
        PARADA2 = new javax.swing.JLabel();
        PARADA3 = new javax.swing.JLabel();
        PARADA4 = new javax.swing.JLabel();
        PARADA5 = new javax.swing.JLabel();
        PARADA6 = new javax.swing.JLabel();
        PARADA7 = new javax.swing.JLabel();
        PARADA8 = new javax.swing.JLabel();
        PARADA9 = new javax.swing.JLabel();
        PARADA10 = new javax.swing.JLabel();
        PARADA11 = new javax.swing.JLabel();
        PARADA12 = new javax.swing.JLabel();
        PARADA13 = new javax.swing.JLabel();
        PARADA14 = new javax.swing.JLabel();
        PARADA15 = new javax.swing.JLabel();
        PARADA16 = new javax.swing.JLabel();
        PARADA17 = new javax.swing.JLabel();
        PARADA18 = new javax.swing.JLabel();
        PARADA19 = new javax.swing.JLabel();
        PARADA20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("CLIENTE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 6, 95, 45));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Hora Actual:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 69, -1, 40));

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 69, 85, 40));

        JTA3.setColumns(20);
        JTA3.setRows(5);
        jScrollPane1.setViewportView(JTA3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 121, 212, 400));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Dia de operación:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanel1.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 81, 156, 28));

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 121, -1, -1));

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 150, -1, -1));

        bus1.setText("Bus 1 ");
        bus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus1ActionPerformed(evt);
            }
        });
        jPanel1.add(bus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 185, -1, -1));

        bus2.setText("Bus 2");
        bus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus2ActionPerformed(evt);
            }
        });
        jPanel1.add(bus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 214, -1, -1));

        bus3.setText("Bus 3");
        bus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus3ActionPerformed(evt);
            }
        });
        jPanel1.add(bus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 243, -1, -1));

        bus4.setText("Bus 4 ");
        bus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus4ActionPerformed(evt);
            }
        });
        jPanel1.add(bus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 272, -1, -1));

        bus5.setText("Bus 5");
        bus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus5ActionPerformed(evt);
            }
        });
        jPanel1.add(bus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 301, -1, -1));

        bus6.setText("Bus 6");
        bus6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus6ActionPerformed(evt);
            }
        });
        jPanel1.add(bus6, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 330, -1, -1));

        bus9.setText("Bus 9");
        bus9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus9ActionPerformed(evt);
            }
        });
        jPanel1.add(bus9, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 427, -1, -1));

        bus7.setText("Bus 7");
        bus7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus7ActionPerformed(evt);
            }
        });
        jPanel1.add(bus7, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 359, -1, -1));

        bus8.setText("Bus 8");
        bus8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus8ActionPerformed(evt);
            }
        });
        jPanel1.add(bus8, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 394, -1, -1));

        bus10.setText("Bus 10");
        bus10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus10ActionPerformed(evt);
            }
        });
        jPanel1.add(bus10, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 459, -1, -1));

        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 23));

        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 70, 23));

        b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 70, 23));

        b4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 70, 23));

        b5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 70, 23));

        b6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 70, 23));

        b7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 70, 23));

        b8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 70, 23));

        b9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 70, 26));

        b10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 70, 24));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusDorado (1).jpeg"))); // NOI18N
        jPanel2.add(lblBus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 50));

        lblBus4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusAzul2 (1).png"))); // NOI18N
        jPanel2.add(lblBus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 40));

        lblBus5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusBlanco (1).png"))); // NOI18N
        jPanel2.add(lblBus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, 30));

        lblBus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusAmarillo (1).jpeg"))); // NOI18N
        jPanel2.add(lblBus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        lblBus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusNaranja (1).png"))); // NOI18N
        jPanel2.add(lblBus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        lblBus6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusNegro (1).jpeg"))); // NOI18N
        jPanel2.add(lblBus6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 40));

        lblBus9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusRojo (1).png"))); // NOI18N
        jPanel2.add(lblBus9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, 30));

        lblBus8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusRosa (1).png"))); // NOI18N
        jPanel2.add(lblBus8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        lblBus7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusVerde (1).png"))); // NOI18N
        jPanel2.add(lblBus7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 30));

        lblBus10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/BusVioleta (1).jpg"))); // NOI18N
        jPanel2.add(lblBus10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        PARADA1.setText("PARADA1");
        jPanel2.add(PARADA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 70, 40));

        PARADA2.setText("PARADA2");
        jPanel2.add(PARADA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 160, 70, 40));

        PARADA3.setText("PARADA3");
        jPanel2.add(PARADA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 70, 40));

        PARADA4.setText("PARADA4");
        jPanel2.add(PARADA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 170, 60, 40));

        PARADA5.setText("PARADA5");
        jPanel2.add(PARADA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 290, 60, 40));

        PARADA6.setText("PARADA6");
        jPanel2.add(PARADA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 410, 60, 40));

        PARADA7.setText("PARADA7");
        jPanel2.add(PARADA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 430, 70, 40));

        PARADA8.setText("PARADA8");
        jPanel2.add(PARADA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 420, 70, 40));

        PARADA9.setText("PARADA9");
        jPanel2.add(PARADA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 70, 40));

        PARADA10.setText("PARADA10");
        jPanel2.add(PARADA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 70, 40));

        PARADA11.setText("PARADA11");
        jPanel2.add(PARADA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 70, 50));

        PARADA12.setText("PARADA12");
        jPanel2.add(PARADA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 70, 40));

        PARADA13.setText("PARADA13");
        jPanel2.add(PARADA13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 70, 40));

        PARADA14.setText("PARADA14");
        jPanel2.add(PARADA14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 40));

        PARADA15.setText("PARADA15");
        jPanel2.add(PARADA15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 70, 30));

        PARADA16.setText("PARADA16");
        jPanel2.add(PARADA16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 70, 50));

        PARADA17.setText("PARADA17");
        jPanel2.add(PARADA17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 30));

        PARADA18.setText("PARADA18");
        jPanel2.add(PARADA18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 156, -1, 40));

        PARADA19.setText("PARADA19");
        jPanel2.add(PARADA19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 70, 40));

        PARADA20.setText("PARADA20");
        jPanel2.add(PARADA20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_Cliente/RutaMapa (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 490));

        jLabel3.setText("P01=Ciudad Deportiva Rafael Ángel Pérez");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 220, 30));

        jLabel4.setText("P02=Super Lian, Hatillo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 220, -1));

        jLabel5.setText("P03=Plasticos Tosso");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 220, -1));

        jLabel7.setText("P05=Colegio María Auxiliadora");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 170, -1));

        jLabel8.setText("P06=Escuela Juan Rafael Mora");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 160, -1));

        jLabel9.setText("P07=Hotel Caribbean, Amón");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 160, -1));

        jLabel11.setText("P11=Rotonda De Betania");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 160, -1));

        jLabel14.setText("P13=Escuela República Dominicana");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 160, -1));

        jLabel15.setText("P14=Abastecedor Los Sauces");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 160, 20));

        jLabel16.setText("P15=Parque De Monte Azul");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 160, -1));

        jLabel17.setText("P16=Cevichería Costa Azul");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 160, -1));

        jLabel18.setText("P18=Plaza América");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 160, -1));

        jLabel19.setText("P19=Rest. La Fortuna, Hatillo 4");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 170, -1));

        jLabel20.setText("P20=Terminal Hatillo");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 160, -1));

        jLabel6.setText("P04=Parqueo De Yamuni, San Francisco");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 218, -1));

        jLabel21.setText("P08=Parque San Francisco");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 168, -1));

        jLabel22.setText("P12=Colegio Salesiano Don Bosco");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 160, -1));

        jLabel23.setText("P17=Taller Gernon");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 160, -1));

        jLabel25.setText("P10=Acueductos Y Alcantarillados Guadalupe");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        jLabel10.setText("P09=Liceo Nocturno José Joaquín Jiménez Nuñez");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton para mostrar el recorrido de los buses
    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:

        this.init = true;
        this.sub_start = 0;
        this.final_start = 101;
    }//GEN-LAST:event_mostrarActionPerformed

    // Boton para limpiar el recorrido de los buses
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        this.init = false;
        this.sub_start = 0;
        this.final_start = 0;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
    }//GEN-LAST:event_clearActionPerformed

    // Boton para mostrar el recorrido del bus1
    private void bus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus1ActionPerformed
        this.init = true;
        this.sub_start = 1;
        this.final_start = 11;
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");

    }//GEN-LAST:event_bus1ActionPerformed

        // Boton para mostrar el recorrido del bus2
    private void bus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus2ActionPerformed
        this.init = true;
        this.sub_start = 11;
        this.final_start = 21;
        b1.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
    }//GEN-LAST:event_bus2ActionPerformed

        // Boton para mostrar el recorrido del bus3
    private void bus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus3ActionPerformed
        // TODO add your handling code here:
        this.init = true;
        this.sub_start = 22;
        this.final_start = 32;
        b1.setText("");
        b2.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
    }//GEN-LAST:event_bus3ActionPerformed

        // Boton para mostrar el recorrido del bus4
    private void bus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus4ActionPerformed
        // TODO add your handling code here:
        this.init = true;
        this.sub_start = 30;
        this.final_start = 40;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
    }//GEN-LAST:event_bus4ActionPerformed
    // Boton para mostrar el recorrido del bus5
    private void bus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus5ActionPerformed
        // TODO add your handling code here:
        this.init = true;
        this.sub_start = 40;
        this.final_start = 49;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
    }//GEN-LAST:event_bus5ActionPerformed
    // Boton para mostrar el recorrido del bus6
    private void bus6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus6ActionPerformed
        // TODO add your handling code here:
        this.init = true;
        this.sub_start = 50;
        this.final_start = 59;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
    }//GEN-LAST:event_bus6ActionPerformed
    // Boton para mostrar el recorrido del bus7
    private void bus7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus7ActionPerformed
        // TODO add your handling code here:
        this.init = true;
        this.sub_start = 60;
        this.final_start = 69;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
    }//GEN-LAST:event_bus7ActionPerformed
    // Boton para mostrar el recorrido del bus8
    private void bus8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus8ActionPerformed
        // TODO add your handling code here:
        this.init = true;
        this.sub_start = 70;
        this.final_start = 79;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b9.setText("");
        b10.setText("");
    }//GEN-LAST:event_bus8ActionPerformed
    // Boton para mostrar el recorrido del bus9
    private void bus9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus9ActionPerformed
        // TODO add your handling code here:
        this.init = true;
        this.sub_start = 80;
        this.final_start = 89;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b10.setText("");
    }//GEN-LAST:event_bus9ActionPerformed
    // Boton para mostrar el recorrido del bus10
    private void bus10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus10ActionPerformed
        // TODO add your handling code here:
        this.init = true;
        this.sub_start = 90;
        this.final_start = 99;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b9.setText("");
    }//GEN-LAST:event_bus10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }
// Declaracion desde el Frame .
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dia;
    private javax.swing.JTextArea JTA3;
    private javax.swing.JLabel PARADA1;
    private javax.swing.JLabel PARADA10;
    private javax.swing.JLabel PARADA11;
    private javax.swing.JLabel PARADA12;
    private javax.swing.JLabel PARADA13;
    private javax.swing.JLabel PARADA14;
    private javax.swing.JLabel PARADA15;
    private javax.swing.JLabel PARADA16;
    private javax.swing.JLabel PARADA17;
    private javax.swing.JLabel PARADA18;
    private javax.swing.JLabel PARADA19;
    private javax.swing.JLabel PARADA2;
    private javax.swing.JLabel PARADA20;
    private javax.swing.JLabel PARADA3;
    private javax.swing.JLabel PARADA4;
    private javax.swing.JLabel PARADA5;
    private javax.swing.JLabel PARADA6;
    private javax.swing.JLabel PARADA7;
    private javax.swing.JLabel PARADA8;
    private javax.swing.JLabel PARADA9;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JButton bus1;
    private javax.swing.JButton bus10;
    private javax.swing.JButton bus2;
    private javax.swing.JButton bus3;
    private javax.swing.JButton bus4;
    private javax.swing.JButton bus5;
    private javax.swing.JButton bus6;
    private javax.swing.JButton bus7;
    private javax.swing.JButton bus8;
    private javax.swing.JButton bus9;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblBus1;
    private javax.swing.JLabel lblBus10;
    private javax.swing.JLabel lblBus2;
    private javax.swing.JLabel lblBus3;
    private javax.swing.JLabel lblBus4;
    private javax.swing.JLabel lblBus5;
    private javax.swing.JLabel lblBus6;
    private javax.swing.JLabel lblBus7;
    private javax.swing.JLabel lblBus8;
    private javax.swing.JLabel lblBus9;
    private javax.swing.JButton mostrar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

    }
}
