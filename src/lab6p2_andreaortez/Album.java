
package lab6p2_andreaortez;

import java.util.ArrayList;
import java.util.Date;

public class Album extends Lanzamiento{
    private ArrayList <Cancion> canciones = new ArrayList();
    private int cant;

    public Album() {
    }

    public Album(int cant, String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
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
