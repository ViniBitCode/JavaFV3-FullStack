/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import ControladoraLogica.Mascota;
import ControladoraLogica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

public class ControladoraPersistencia {

    MascotaJpaController mascotaJpa = new MascotaJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public void crearMascota(Mascota mascota) {

        mascotaJpa.create(mascota);

    }

    public ArrayList<Mascota> traerListaMascota() {

        List<Mascota> lista_aux = mascotaJpa.findMascotaEntities();
        ArrayList<Mascota> lista_mascotas = new ArrayList<Mascota>(lista_aux);
        return lista_mascotas;

    }

    public void eliminarMascota(int id) {
        try {
            mascotaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Mascota buscarMascota(int id) {

        return mascotaJpa.findMascota(id);

    }

    public List<Mascota> buscar_por_nombre(String nombre) {
        return mascotaJpa.findByNombre(nombre);
    }

    public List<Usuario> traer_lista_usuarios() {

        return usuarioJpa.findUsuarioEntities();

    }

    public void agregar_usuario(Usuario usuario) {

        usuarioJpa.create(usuario);

    }

    public ArrayList<Usuario> traerListaUsuario() {
        List<Usuario> lista_aux = usuarioJpa.findUsuarioEntities();
        ArrayList<Usuario> lista_usuario = new ArrayList<Usuario>(lista_aux);
        return lista_usuario;
    }

    public void eliminar_usuario(int id_eliminar) {

        try {
            usuarioJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    public Usuario buscar_usuario(int id_buscar) {

        return usuarioJpa.findUsuario(id_buscar);

    }

    public void editar_usuario(Usuario usuario) {

        try {
            usuarioJpa.edit(usuario);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }
}
