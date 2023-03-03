
package lab6p2_andreaortez;

import java.util.ArrayList;

public class Artista extends Usuario{
    private String nombre;
    ArrayList <Cancion> canciones = new ArrayList();
    ArrayList <Album> albumes = new ArrayList();

    public Artista() {
    }

    public Artista(String nombre, String user, String contra, int edad) {
        super(user, contra, edad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList canciones) {
        this.canciones = canciones;
    }

    public ArrayList getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", canciones=" + canciones + ", albumes=" + albumes + '}';
    }
    
}
