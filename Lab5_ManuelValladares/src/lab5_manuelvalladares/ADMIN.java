/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_manuelvalladares;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mevl1
 */
public class ADMIN {
    private String usuario;
    private String contraseña;

    public ADMIN() {
    }

    public ADMIN(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "ADMIN{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

   
}
