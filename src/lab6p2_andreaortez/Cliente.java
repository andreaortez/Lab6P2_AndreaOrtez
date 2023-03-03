
package lab6p2_andreaortez;

import java.util.ArrayList;

public class Cliente extends Usuario{
    ArrayList <Cancion> cancionesf = new ArrayList();
    ArrayList <Lista> lista = new ArrayList();
    ArrayList <Lista> like = new ArrayList();

    public Cliente() {
    }

    public Cliente(String user, String contra, int edad) {
        super(user, contra, edad);
    }

    @Override
    public String toString() {
        return "Cliente{" + "cancionesf=" + cancionesf + ", lista=" + lista + ", like=" + like + '}';
    }
    
}
