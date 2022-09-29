package com.mycompany.practicaprogramada2;
import javax.swing.JOptionPane;






public class PracticaProgramada2 {

    public static void main(String[] args) {

        int Numero;
        String lecturadeNumero;

        lecturadeNumero = JOptionPane.showInputDialog("Digite un numero del 1 al 12: ");
        Numero = Integer.parseInt(lecturadeNumero);

        switch (Numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mes: Enero ");
                JOptionPane.showMessageDialog(null, "Primer Cuatrimestre ");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Mes: Febrero ");
                JOptionPane.showMessageDialog(null, "Primer Cuatrimestre ");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Mes: Marzo ");
                JOptionPane.showMessageDialog(null, "Primer Cuatrimestre ");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Mes: Abril ");
                JOptionPane.showMessageDialog(null, "Primer Cuatrimestre ");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Mes: Mayo ");
                JOptionPane.showMessageDialog(null, "Segundo Cuatrimestre ");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Mes: Junio ");
                JOptionPane.showMessageDialog(null, "Segundo Cuatrimestre ");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Mes: Julio ");
                JOptionPane.showMessageDialog(null, "Segundo Cuatrimestre ");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Mes: Agosto ");
                JOptionPane.showMessageDialog(null, "Segundo Cuatrimestre ");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Mes: Septiembre ");
                JOptionPane.showMessageDialog(null, "Tercer Cuatrimestre ");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Mes: Octubre ");
                JOptionPane.showMessageDialog(null, "Tercer Cuatrimestre ");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Mes: Noviembre ");
                JOptionPane.showMessageDialog(null, "Tercer Cuatrimestre ");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Mes: Diciembre ");
                JOptionPane.showMessageDialog(null, "Tercer Cuatrimestre ");
                break;

        }
        
        
        
        
        
        
        
        int Edad;
        String lecturaEdad;

        lecturaEdad = JOptionPane.showInputDialog("Digite la edad: ");
        Edad = Integer.parseInt(lecturaEdad);

        if (Edad <= 5) {
            JOptionPane.showMessageDialog(null, "Primera infancia");
        }

        if (Edad >= 6 && Edad <= 11) {
            JOptionPane.showMessageDialog(null, "Infancia");
        }
        if (Edad >= 12 && Edad <= 18) {
            JOptionPane.showMessageDialog(null, "Adolescencia");
        }
        if (Edad >= 19 && Edad <= 30) {
            JOptionPane.showMessageDialog(null, "Juventud");
        }
        if (Edad >= 30 && Edad <= 59) {
            JOptionPane.showMessageDialog(null, "Adultez");

        }
        if (Edad > 60) {
            JOptionPane.showMessageDialog(null, "Persona Mayor");
        }

    }
}
