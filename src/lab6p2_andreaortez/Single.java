
package lab6p2_andreaortez;

import java.util.Date;

public class Single extends Lanzamiento{
    Cancion cancion;

    public Single() {
    }

    public Single(Cancion cancion, String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "Single{" + "cancion=" + cancion + '}';
    }
    
}
