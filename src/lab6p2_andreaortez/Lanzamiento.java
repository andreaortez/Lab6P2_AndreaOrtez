
package lab6p2_andreaortez;

public class Lanzamiento {
    protected String titulo, fecha;
    protected int likes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, String fecha, int likes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
//        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

//    public String getAlbum() {
//        return album;
//    }
//
//    public void setAlbum(String album) {
//        this.album = album;
//    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
