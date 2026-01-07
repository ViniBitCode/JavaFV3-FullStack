/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Mascota;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    
    public void crearMascota(Mascota mascota) {
        
        mascotaJpa.create(mascota);
        
    }

    public ArrayList<Mascota> traerListaMascota() {
        
        List<Mascota> lista_aux = mascotaJpa.findMascotaEntities();
        ArrayList<Mascota> lista_mascotas = new ArrayList<Mascota> (lista_aux);
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
    
    public List<Mascota> buscar_por_nombre(String nombre){
        return mascotaJpa.findByNombre(nombre);
    }
    
}
