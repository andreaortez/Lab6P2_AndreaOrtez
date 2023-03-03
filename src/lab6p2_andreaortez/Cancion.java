
package lab6p2_andreaortez;

public class Cancion {
    private String titulo, referencia;
    private int tiempo;

    public Cancion() {
    }

    public Cancion(String titulo, String referencia, int tiempo) {
        this.titulo = titulo;
        this.referencia = referencia;
        this.tiempo = tiempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", referencia=" + referencia + ", tiempo=" + tiempo + '}';
    }
    
}
