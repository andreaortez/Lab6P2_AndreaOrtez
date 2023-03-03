
package lab6p2_andreaortez;

import java.util.Date;

public class Lanzamiento {
    protected String titulo;
    protected Date fecha;
    protected int likes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, Date fecha, int likes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Lanzamiento{" + "titulo=" + titulo + ", fecha=" + fecha + ", likes=" + likes + '}';
    }
    
}
