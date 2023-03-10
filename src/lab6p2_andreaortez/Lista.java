
package lab6p2_andreaortez;

import java.util.ArrayList;

public class Lista {
    private String nombre, oyente;
    private int likes;
    ArrayList <Cancion> canciones = new ArrayList();

    public Lista() {
    }

    public Lista(String nombre, int likes, String oyente) {
        this.nombre = nombre;
        this.oyente = oyente;
        this.likes = likes;
    }

    public String getOyente() {
        return oyente;
    }

    public void setOyente(String oyente) {
        this.oyente = oyente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Lista{" + "nombre=" + nombre + ", likes=" + likes + ", canciones=" + canciones + '}';
    }
    
}
