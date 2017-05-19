/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Login.Login;

public class Consultas {

    String strSql;

    public String ComprobarTerminales(String ventana, String peticion, String valor) {
        switch (ventana) {
            case "Login":
                switch (peticion) {
                    case "ComprobarTermUsuario":
                        strSql = "SELECT COUNT(TERM_NOMB)VALOR FROM TERMINALES WHERE TERM_NOMB = '" + valor + "'";
                        break;
                    case "ComprobarTermPass":
                        strSql = "SELECT COUNT(TERM_PASS)VALOR FROM TERMINALES WHERE TERM_PASS = '" + valor + "'";
                        break;
                    case "ComprobarUsuario":
                        strSql = "SELECT COUNT(USUA_NOMB)VALOR FROM USUARIOS WHERE USUA_NOMB = '" + valor + "'";
                        break;
                    case "ComprobarPass":
                        strSql = "SELECT COUNT(USUA_PASS)VALOR FROM USUARIOS WHERE USUA_PASS = '" + valor + "'";
                        break;
                    case "ComprobarTermEstatus":
                        strSql = "SELECT TERM_ESTA VALOR FROM TERMINALES WHERE TERM_NOMB = '" + valor + "'";
                        break;
                    case "ComprobarUsuaEstatus":
                        strSql = "SELECT USUA_ESTA VALOR FROM USUARIOS WHERE USUA_NOMB = '" + valor + "'";
                        break;
                }
                break;

            case "Home":

            //    break;
        }
        return strSql;
    }

}
