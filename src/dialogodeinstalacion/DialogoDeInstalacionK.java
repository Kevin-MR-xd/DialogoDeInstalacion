package dialogodeinstalacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevonnn
 *
 * JOptionPane Este programa ilustra el cuadro de diálogo del objeto
 * JOptionPane.
 *
 */
public class DialogoDeInstalacionK {

    public void Entrada() {
        JOptionPane.showMessageDialog(null, "Antes de comenzar la instalación, " + "cierre todas las aplicaciones.");
    }
    
    public static void main(String[] args) {
        DialogoDeInstalacionK cadena = new DialogoDeInstalacionK();
        cadena.Entrada();
    }

}
