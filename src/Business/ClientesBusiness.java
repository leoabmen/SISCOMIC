/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Data.*;
import Entity.*;
import Clientes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Oscar
 */
public class ClientesBusiness implements ActionListener {
    
    Clientes vistaCliente=new Clientes();
    CRUDCliente modeloCliente=new CRUDCliente();
     public ClientesBusiness(Clientes vistaCliente, CRUDCliente modeloCliente)
     {
         this.vistaCliente=vistaCliente;
         this.modeloCliente=modeloCliente;
         this.vistaCliente.btnGuardar.addActionListener(this);
         this.vistaCliente.btnActualizar.addActionListener(this);
         this.vistaCliente.btnEliminar.addActionListener(this);
         
     }
     public void inicializar()
     {
     
     }
     public void llenarTabla(JTable tablaD)
     {
         DefaultTableModel modelT=new DefaultTableModel();
         tablaD.setModel(modelT);
         modelT.addColumn("ID");
         modelT.addColumn("NOMBRE");
         modelT.addColumn("APATERNO");
         modelT.addColumn("AMATERNO");
         modelT.addColumn("E-MAIL");
         modelT.addColumn("TELEFONO");
         modelT.addColumn("DIRECCION");
         modelT.addColumn("SEXO");
         modelT.addColumn("RFC");
         modelT.addColumn("EMPRESA");
         modelT.addColumn("DESCUENTO");
         modelT.addColumn("CREDITO");
         
        Object[] columnas = new Object[12];
        int numRegistros = modeloCliente.llenar().size();
        for(int i=0;i<numRegistros;i++)
        {
         columnas[0]=modeloCliente.llenar().get(i).getId();
         columnas[1]=modeloCliente.llenar().get(i).getNombre();
         columnas[2]=modeloCliente.llenar().get(i).getApaterno();
         columnas[3]=modeloCliente.llenar().get(i).getAmaterno();
         columnas[4]=modeloCliente.llenar().get(i).getMail();
         columnas[5]=modeloCliente.llenar().get(i).getTelefono();
         columnas[6]=modeloCliente.llenar().get(i).getdireccion();
         columnas[7]=modeloCliente.llenar().get(i).getsexo();
         columnas[8]=modeloCliente.llenar().get(i).getRfc();
         columnas[9]=modeloCliente.llenar().get(i).getEmpresa();
         columnas[10]=modeloCliente.llenar().get(i).getDescuento();
         columnas[11]=modeloCliente.llenar().get(i).getCredito();
         modelT.addRow(columnas);
         
        }
     }

    
    
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()== vistaCliente.btnGuardar)
        {
            
            String Nombre= vistaCliente.txtNombre.getText();
            String Paterno= vistaCliente.txtPaterno.getText();
            String Materno= vistaCliente.txtMaterno.getText();
            String Correo= vistaCliente.txtCorreo.getText();
            String Tel= vistaCliente.txtTelefono.getText();
            String Direc= vistaCliente.txtDireccion.getText();
            int Sexo= (int) vistaCliente.cbSexo.getSelectedItem();
            String RFC= vistaCliente.txtRfc.getText();
            String Empresa= vistaCliente.txtEmpresa.getText();
            String Descuento= (String)vistaCliente.chDescuento.getText();
            String Descripcion= vistaCliente.chCredito.getText();
            
            String Respuesta=modeloCliente.insertarCliente(Nombre, Paterno, Materno, Correo, Tel, Direc, Sexo, RFC, Empresa, 0, 0);
        }
    }
    
}
