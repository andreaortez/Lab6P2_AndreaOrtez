
package lab6p2_andreaortez;

import java.util.ArrayList;

public class Oyente extends Usuario{
    ArrayList <Cancion> cancionesf = new ArrayList();
    ArrayList <Lista> lista = new ArrayList();
    ArrayList <Lista> like = new ArrayList();

    public Oyente() {
    }

    public Oyente(String user, String contra, int edad) {
        super(user, contra, edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>12) {
            this.edad = edad;
        }else{
            
        }
        
    }

    public ArrayList<Cancion> getCancionesf() {
        return cancionesf;
    }

    public void setCancionesf(ArrayList<Cancion> cancionesf) {
        this.cancionesf = cancionesf;
    }

    public ArrayList<Lista> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Lista> lista) {
        this.lista = lista;
    }

    public ArrayList<Lista> getLike() {
        return like;
    }

    public void setLike(ArrayList<Lista> like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cancionesf=" + cancionesf + ", lista=" + lista + ", like=" + like + '}';
    }
    
}
