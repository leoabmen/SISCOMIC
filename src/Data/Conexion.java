package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private final String url = "jdbc:mysql://localhost/siscomic";
    PreparedStatement psPrepararSentencia;
    Connection con = null;

    public Conexion() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            //con = DriverManager.getConnection(url,"root","arnoediad");
            con = DriverManager.getConnection(url, "root", "leoncito");

            if (con != null) {
                System.out.println("Conexión a base de datos. Listo...");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection conectado() {
        return con;
    }

    public void desconectar() {
        con = null;
        System.out.println("conexion terminada");

    }
}
