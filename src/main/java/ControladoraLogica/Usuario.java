/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladoraLogica;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Basic
    private String nombre_usuario;
    private String contrasenia_usuario;

    @OneToMany(mappedBy = "usuario")
    private ArrayList<Mascota> lista_mascotas;

    public Usuario() {
    }

    public Usuario(String nombre_usuario, String contrasenia_usuario, ArrayList<Mascota> lista_mascotas) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia_usuario = contrasenia_usuario;
        this.lista_mascotas = lista_mascotas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia_usuario() {
        return contrasenia_usuario;
    }

    public void setContrasenia_usuario(String contrasenia_usuario) {
        this.contrasenia_usuario = contrasenia_usuario;
    }

    public ArrayList<Mascota> getLista_mascotas() {
        return lista_mascotas;
    }

    public void setLista_mascotas(ArrayList<Mascota> lista_mascotas) {
        this.lista_mascotas = lista_mascotas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre_usuario=" + nombre_usuario + ", contrasenia_usuario=" + contrasenia_usuario + '}';
    }

}
