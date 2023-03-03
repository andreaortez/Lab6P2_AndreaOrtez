package lab6p2_andreaortez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarC {

    private ArrayList<Cancion> canciones = new ArrayList();
    private File archivo = null;//ROM

    public AdministrarC(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
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
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Cancion l : canciones) {
                bw.write(l.getTitulo() + "|");
                bw.write(l.getTitulo() + "|");
                bw.write(l.getReferencia() + "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() throws IOException {
        Scanner sc = null;
        canciones = new ArrayList();

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNext()) {
                    String cad = sc.nextLine();
                    String[] token = cad.split("\\|");
                    canciones.add(new Cancion(token[0], Integer.parseInt(token[1]), token[2]));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
