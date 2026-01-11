/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladoraLogica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class ControladoraLogica {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void crearMascota(Mascota mascota) {

        controladoraPersistencia.crearMascota(mascota);

    }

    public ArrayList<Mascota> traerListaMascotas() {

        return controladoraPersistencia.traerListaMascota();

    }

    public void eliminar_mascota(int id) {

        controladoraPersistencia.eliminarMascota(id);

    }

    public Mascota buscarMascota(int id) {

        return controladoraPersistencia.buscarMascota(id);

    }

    public List<Mascota> buscar_por_nombre(String nombre) {
        return controladoraPersistencia.buscar_por_nombre(nombre);

    }

    public List<Usuario> traer_lista_usuarios() {

        return controladoraPersistencia.traer_lista_usuarios();

    }

    public void crear_usuario(Usuario usuario) {

        controladoraPersistencia.agregar_usuario(usuario);

    }

}
