
package lab6p2_andreaortez;

public class Usuario {
    protected String user, contra;
    protected int edad;

    public Usuario() {
    }

    public Usuario(String user, String contra, int edad) {
        this.user = user;
        this.contra = contra;
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", contra=" + contra + ", edad=" + edad + '}';
    }
    
}
