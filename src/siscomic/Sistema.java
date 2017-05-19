/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscomic;

/**
 *
 * @author LEO
 */
public class Sistema {

    public String InformacionSistema() {
        String informacion;
        informacion = System.getProperty("user.name");
        informacion = informacion + "_" + System.getProperty("os.name");
        informacion = informacion + "_" + System.getProperty("os.arch");
        informacion = informacion + "_" + System.getProperty("os.version");
        System.out.println(informacion);
        return informacion;
    }

}
