package ControladoraLogica;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String nombre_mascota;
    private int edad;
    private String raza;
    private int telefono;
    private String nombre_duenio;
    private String direccion_duenio;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_registrado;

    public Mascota() {
    }

    public Mascota(String nombre_mascota, int edad, String raza, int telefono, String nombre_duenio, String direccion_duenio, Date fecha_registrado) {
        this.nombre_mascota = nombre_mascota;
        this.edad = edad;
        this.raza = raza;
        this.telefono = telefono;
        this.nombre_duenio = nombre_duenio;
        this.direccion_duenio = direccion_duenio;
        this.fecha_registrado = fecha_registrado;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getDireccion_duenio() {
        return direccion_duenio;
    }

    public void setDireccion_duenio(String direccion_duenio) {
        this.direccion_duenio = direccion_duenio;
    }

    public Date getFecha_registrado() {
        return fecha_registrado;
    }

    public void setFecha_registrado(Date fecha_registrado) {
        this.fecha_registrado = fecha_registrado;
    }
    
    
   
    
}
