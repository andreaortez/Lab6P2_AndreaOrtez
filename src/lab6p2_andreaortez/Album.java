
package lab6p2_andreaortez;

import java.util.ArrayList;

public class Album extends Lanzamiento{
    private ArrayList <Cancion> canciones = new ArrayList();
    private int cant;

    public Album() {
    }

    public Album(int cant, String titulo, String fecha, int likes, String album) {
        super(titulo, fecha, likes, album);
        this.cant = cant;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Album{" + "canciones=" + canciones + ", cant=" + cant + '}';
    }
    
}
