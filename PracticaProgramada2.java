
import javax.swing.JOptionPane;

/**
 *
 * @author Justin´s PC
 */
public class PracticaProgramada2 {

    
    public static void main(String[] args) {
        double TempVuelta;
        double Tempits;
        double PromedioVuelta = 0;
        double PromedioPits = 0;
        String LecVuelta;
        String LecPits;
        

        for (int i = 0; i < 10; i++) {
            LecVuelta = JOptionPane.showInputDialog("Ingrese el tiempo por vuelta");
            TempVuelta = Double.parseDouble(LecVuelta);
            PromedioVuelta = PromedioVuelta + TempVuelta / 10;
            JOptionPane.showMessageDialog(null, LecVuelta);

        }
        
        JOptionPane.showMessageDialog(null, PromedioVuelta);
        
        for (int i = 0; i < 10; i++) {
            LecPits = JOptionPane.showInputDialog("Ingrese el tiempo de Pits");
            Tempits = Double.parseDouble(LecPits);
            JOptionPane.showMessageDialog(null, LecPits);
            PromedioPits = PromedioPits + Tempits / 10;

        }
        JOptionPane.showMessageDialog(null, PromedioPits);
        
        
        JOptionPane.showMessageDialog(null, PromedioVuelta-PromedioPits);
        
        
        int CantidadNiños;
        String LecturaCantidad;
        double estatura = 0;
        String Lecturaestatura;
        double promedioEstatura = 0;
        int Menor100 = 0;
        int Entre100y120 = 0;
        int Entre121y130 = 0;
        int Entre131y140 = 0;
        int mayor140 = 0;
        LecturaCantidad = JOptionPane.showInputDialog("Ingrese la cantidad de niños");
        CantidadNiños = Integer.parseInt(LecturaCantidad);

        for (int i = 0; i < CantidadNiños; i++) {
            Lecturaestatura = JOptionPane.showInputDialog("Ingrese la estatura de los niños: ");
            estatura = Double.parseDouble(Lecturaestatura);
            if (estatura < 100) {
                Menor100 = Menor100 + 1;

            }
            if (estatura > 100 && estatura < 120) {
                Entre100y120 = Entre100y120 + 1;
            }
            if (estatura > 121 && estatura < 130) {
                Entre121y130 = Entre121y130 + 1;
            }
            if (estatura > 131 && estatura < 140) {
                Entre131y140 = Entre131y140 + 1;
            }
            if (estatura > 140) {
                mayor140 = mayor140 + 1;
            }
        }
       JOptionPane.showMessageDialog(null,"Los niños menores a 100 cm son: " + Menor100 + "\nLos niños entre 100 y 120cm son: " + Entre100y120 + "\nLos niños entre 121 y 130cm son: " + Entre121y130 + "\nLos niños entre 131 y 130cm son: " + Entre131y140 + "\nLos niños mayores a 140cm son: " + mayor140);
        promedioEstatura = promedioEstatura + estatura;
        JOptionPane.showMessageDialog(null,"El promedio de estatura es: " + promedioEstatura / CantidadNiños);
      
        
        
    }
}
