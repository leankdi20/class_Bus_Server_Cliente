package class_bus_server;

import java.util.Observable;
import javax.swing.JLabel;

public class class_monitor {
//variable para bus
    String b1, b2, b3, b4, b5, b6, b7, b8, b9, b10 = "";
    //variable ventana
    ventana_log vl;

    public class_monitor() {
    }
//******** inicio setea variables
    public String bus1(String B1) {

        this.b1 = B1;

        return B1;
    }

    public String bus2(String B2) {

        this.b2 = B2;

        return b2;

    }

    public String bus3(String B3) {

        this.b3 = B3;

        return b3;

    }

    public String bus4(String B4) {

        this.b4 = B4;

        return b4;

    }

    public String bus5(String B5) {

        this.b5 = B5;

        return b5;

    }

    public String bus6(String B6) {

        this.b6 = B6;

        return b6;

    }

    public String bus7(String B7) {

        this.b7 = B7;
        return b7;

    }

    public String bus8(String B8) {

        this.b8 = B8;

        return b8;

    }

    public String bus9(String B9) {

        this.b9 = B9;

        return b9;

    }

    public String bus10(String B10) {

        this.b10 = B10;

        return b10;

    }
//***** fin setear variable********
    
//inicio metodos de comparacion para concurrencias********
    public boolean compara_b1_b2() {
        if (this.b1 == this.b2) {

            return true;
        } else {

            return false;
        }
    }

    public boolean compara_b3_b2() {
        if (this.b3 == this.b2) {

            return true;
        } else {
            return false;
        }
    }

    public boolean compara_b4_b3() {
        if (this.b4 == this.b3) {

            return true;
        } else {
            return false;
        }
    }

    public boolean compara_b5_b4() {
        if (this.b5 == this.b4) {

            return true;
        } else {
            return false;
        }
    }

    public boolean compara_b6_b5() {
        if (this.b6 == this.b5) {

            return true;
        } else {
            return false;
        }
    }

    public boolean compara_b7_b6() {
        if (this.b7 == this.b6) {

            return true;
        } else {
            return false;
        }
    }

    public boolean compara_b8_b7() {
        if (this.b8 == this.b7) {

            return true;
        } else {
            return false;
        }
    }

    public boolean compara_b9_b8() {
        if (this.b9 == this.b8) {

            return true;
        } else {
            return false;
        }
    }

    public boolean compara_b10_b9() {
        if (this.b10 == this.b9) {

            return true;
        } else {
            return false;
        }
    }

    public boolean compara_b1_b10() {

        if (this.b1 == this.b10) {

            return true;
        } else {
            return false;
        }
    }
//********* fin de metodos de comparacion concurrencia******
    public void setJLabelBus1(JLabel lblBus1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
