package Business;

import Data.Consultas;
import Data.Interaccion;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author LEO
 */
public class Business {
     Consultas con = new Consultas();

    public void botonEnter(JButton boton) {
        boton.registerKeyboardAction(boton.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);
        boton.registerKeyboardAction(boton.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
    }

    public int ComprobarTerminales(String ventana, String peticion, String valor) {
        int numero;
        String strSql;
        Consultas cs = new Consultas();
        strSql = cs.ComprobarTerminales(ventana, peticion, valor);
    Interaccion in = new Interaccion();
        numero = in.ComprobarTerminales(strSql);
        return numero;
    }

    public void cerrar(JTextField txtCampo) {
        Object[] opciones = {"Aceptar", "Cancelar"};
        Component rootPane = null;
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Esta seguro de cerrar la aplicación?", "Mensaje de Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");

        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            txtCampo.requestFocus();
        }
    }

    public JLabel CalculaHora(JLabel label) {
        String hora, minutos, segundos, ampm;
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        label.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
        return label;
    }
    public void IniciarVentana(JFrame ventana, String nombreVentana){
        URL url = getClass().getResource("/img/logo2.png");
        ImageIcon img = new ImageIcon(url);
        ventana.setIconImage(img.getImage());
        ventana.setLocationRelativeTo(null);
        ventana.setTitle(nombreVentana);
        ventana.setExtendedState(ventana.MAXIMIZED_BOTH);
    }
     public void IniciarVentanaPequeña(JFrame ventana, String nombreVentana){
        URL url = getClass().getResource("/img/logo2.png");
        ImageIcon img = new ImageIcon(url);
        ventana.setIconImage(img.getImage());
        ventana.setLocationRelativeTo(null);
        ventana.setTitle(nombreVentana);
    }
     public void IniciarDialogo(JDialog dialogo,int ancho, int alto, String nombre){
     dialogo.setModal(true);
        dialogo.setSize(ancho, alto);
        dialogo.setLocationRelativeTo(null);
        dialogo.setTitle(nombre);
        dialogo.setVisible(true);
     }
     public void PoblarCombo(String tabla, String campo,JComboBox combo){
try {
          Object[] llenar = con.combox(tabla,campo);
            combo.removeAllItems();
            for (int i = 0; i < llenar.length; i++) {
                combo.addItem((String) llenar[i]);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
     }
}
