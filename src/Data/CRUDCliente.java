/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entity.*;

import java.sql.ResultSet;
/**
 *
 * @author Oscar
 */
public class CRUDCliente extends Conexion{
    PreparedStatement sp=null;
    
    public String insertarCliente(String nom,String pat, String mat, String mail, String tel, String direc, int sexoid, String rfc, String empr, int desc, int cred )
    {
        
        int filas;
        String Respuesta=null;
        try {
            String sql="INSERT INTO clientes (CLIE_NOMB,CLIE_PATE,CLIE_MATE,CLIE_MAIL,CLIE_TELE,CLIE_DIRE,CLIE_SEXO_ID,CLIE_RFC,CLIE_EMPR,CLIE_DESC,CLIE_CRED)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            sp = con.prepareStatement(sql);
            sp.setString(1, nom);
            sp.setString(2, pat);
            sp.setString(3, mat);
            sp.setString(4, mail);
            sp.setString(5, tel);
            sp.setString(6, direc);
            sp.setInt(7, sexoid);
            sp.setString(8, rfc);
            sp.setString(9, empr);
            sp.setInt(10, desc);
            sp.setInt(11, cred);
            
           filas=sp.executeUpdate();
           if(filas>0)
           {
              Respuesta="Registro Exitoso";
           }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
      
      return Respuesta; 
      
    
    }
    public int editCliente(String nom,String pat, String mat, String mail, String tel, String direc, int sexoid, String rfc, String empr, int desc, int cred, int id){
        int filAfectadas=0;
        try {
           String sql="UPDATE cliente SET CLIE_NOMB=?,CLIE_PATE=?,CLIE_MATE=?,CLIE_MAIL=?,CLIE_TELE=?,CLIE_DIRE=?,CLIE_SEXO_ID=?,CLIE_RFC=?,CLIE_EMPR=?,CLIE_DESC=?,CLIE_CRED=? WHERE CLIE_ID=?";
            sp=con.prepareStatement(sql);
            sp.setString(1, nom);
            sp.setString(2, pat);
            sp.setString(3, mat);
            sp.setString(4, mail);
            sp.setString(5, tel);
            sp.setString(6, direc);
            sp.setInt(7, sexoid);
            sp.setString(8, rfc);
            sp.setString(9, empr);
            sp.setInt(10, desc);
            sp.setInt(11, cred);
            sp.setInt(12, id);
            filAfectadas = sp.executeUpdate();
        } catch (Exception e) {
        }
        return filAfectadas;  
    }
    public ArrayList<EntCliente> llenar()
    {
        ArrayList listaCliente=new ArrayList();
        EntCliente ent;
        try {
            sp=con.prepareStatement("SELECT * FROM clientes");
            ResultSet rs=sp.executeQuery();
            while(rs.next())
            {
            ent =new EntCliente();
            ent.setId(rs.getInt(1));
            ent.setNombre(rs.getString(2));
            ent.setApaterno(rs.getString(3));
            ent.setAmaterno(rs.getString(4));
            ent.setMail(rs.getString(5));
            ent.setTelefono(rs.getString(6));
            ent.setDireccion(rs.getString(7));
            ent.setId(rs.getInt(8));
            ent.setRfc(rs.getString(9));
            ent.setEmpresa(rs.getString(10));
            ent.setDescuento(rs.getBoolean(11));
            ent.setCredito(rs.getBoolean(12));
            listaCliente.add(ent);
            
            
            }
        } catch (Exception e) {
        }
    return listaCliente;
    }
    
    
}
