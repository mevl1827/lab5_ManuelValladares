/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_manuelvalladares;

import java.util.Date;

/**
 *
 * @author mevl1
 */
public class EMPLEADO {
    private String nombre;
    private Date nacimiento;
    private String usuario;
    private String contraseña;
    private String correo;
    private String puesto;

    public EMPLEADO() {
    }

    public EMPLEADO(String nombre, Date nacimiento, String usuario, String contraseña, String correo, String puesto) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "EMPLEADO{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + ", puesto=" + puesto + '}';
    }
    
}
