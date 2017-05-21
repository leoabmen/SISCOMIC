/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Oscar
 */
public class EntCliente {
    
    int id;
    String Nombre;
    String Apaterno;
    String Amaterno;
    String mail;
    String Telefono;
    String Direccion;
    int idsexo;
    String rfc;
    String Empresa;
    boolean Descuento;
    boolean Credito;
    
    public EntCliente()
    {
     id=0;   
     Nombre="";
     Apaterno="";
     Amaterno="";
     mail="";
     Telefono="";
     Direccion="";
     idsexo=0;
     rfc="";
     Empresa="";
     Descuento=false;
     Credito=false;
    }
    public int getId()
    {
    return id;
    }
    public void setId(int id)
    {
    this.id=id;
    }
    
    public String getNombre()
    {
    return Nombre;
    }
    public void setNombre(String Nombre)
    {
     this.Nombre=Nombre;
    }
     public String getApaterno()
    {
    return Apaterno;
    }
    public void setApaterno(String Apaterno)
    {
     this.Apaterno=Apaterno;
    }
     public String getAmaterno()
    {
    return Amaterno;
    }
    public void setAmaterno(String Amaterno)
    {
     this.Amaterno=Amaterno;
    }
     public String getMail()
    {
    return mail;
    }
    public void setMail(String Mail)
    {
     this.mail=Mail;
    }
     public String getTelefono()
    {
    return Telefono;
    }
    public void setTelefono(String Telefono)
    {
     this.Telefono=Telefono;
    }
     public String getdireccion()
    {
    return Direccion;
    }
    public void setDireccion(String Direccion)
    {
     this.Direccion=Direccion;
    }
    public int getsexo()
    {
    return idsexo;
    }
    public void setsexo(int idsexo)
    {
     this.idsexo=idsexo;
    }
    public String getRfc()
    {
    return rfc;
    }
    public void setRfc(String rfc)
    {
     this.rfc=rfc;
    }
    public String getEmpresa()
    {
    return Direccion;
    }
    public void setEmpresa(String Empresa)
    {
     this.Empresa=Empresa;
    }
    public boolean getDescuento()
    {
    return Descuento;
    }
    public void setDescuento(boolean Descuento)
    {
     this.Descuento=Descuento;
    }
    public boolean getCredito()
    {
    return Credito;
    }
    public void setCredito( boolean Credito)
    {
     this.Credito=Credito;
    }
    
}
