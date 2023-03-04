package lab6p2_andreaortez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Bitacora {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public Bitacora(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Usuario u : usuarios) {
                if (u instanceof Artista) {
                    bw.write(u.getUser() + "-> ");
                    bw.write("Artista" + "-> ");
                    bw.write(new Date() + "\n");
                }
                if (u instanceof Oyente) {
                    bw.write(u.getUser() + "-> ");
                    bw.write("Oyente" + "->");
                    bw.write(new Date() + "\n");
                }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
}
