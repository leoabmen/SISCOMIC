package Data;

import Entity.EntTerminales;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LEO
 */
public class Interaccion {

    Connection cn;
    ResultSet rs;
    Statement st;
    int valor;

    public int ComprobarTerminales(String strSql) {

        try {
            cn = new Conexion().conectado();
            st = cn.createStatement();
            rs = st.executeQuery(strSql);
            while (rs.next()) {

                valor = Integer.parseInt(rs.getString("VALOR"));

            }
           new Conexion().desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return valor;
    }
}
