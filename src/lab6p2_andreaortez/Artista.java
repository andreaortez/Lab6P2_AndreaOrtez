
package lab6p2_andreaortez;

import java.util.ArrayList;

public class Artista extends Usuario{
    private String nombre;
    ArrayList <Lanzamiento> lanzamientos = new ArrayList();

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

    public ArrayList<Lanzamiento> getLanzamientos() {
        return lanzamientos;
    }

    public void setLanzamientos(ArrayList<Lanzamiento> lanzamientos) {
        this.lanzamientos = lanzamientos;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", lanzamientos=" + lanzamientos + '}';
    }
    
}
