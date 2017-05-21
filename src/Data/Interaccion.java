package Data;

import Entity.EntTerminales;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

    private Connection cn;
    ResultSet rs;
    Statement st;
    PreparedStatement ps;
    ResultSet res;
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

    public Object[] poblar_combox(String tabla, String nombrecol, String sql) {
        int registros = 0;
        try {
            cn = new Conexion().conectado();
            ps = cn.prepareStatement("SELECT count(*) as total FROM " + tabla);
            res = ps.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[] datos = new Object[registros];
        try {
            cn = new Conexion().conectado();
            ps = cn.prepareStatement(sql);
            res = ps.executeQuery();
            int i = 0;
            while (res.next()) {
                datos[i] = res.getObject(nombrecol);
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return datos;
    }
}
