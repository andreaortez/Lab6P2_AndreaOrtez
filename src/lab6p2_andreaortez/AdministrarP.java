
package lab6p2_andreaortez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarP {
    private ArrayList<Lista> playlists = new ArrayList();
    private File archivo = null;//ROM

    public AdministrarP(String path) {
        archivo = new File(path);
    }

    public ArrayList<Lista> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Lista> playlists) {
        this.playlists = playlists;
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
            for (Lista l : playlists) {
                    bw.write(l.getNombre()+ "|");
                    bw.write(l.getLikes() + "|");
                    bw.write(l.getOyente()+ "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() throws IOException {
        Scanner sc = null;
        playlists = new ArrayList();

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNext()) {
                    String cad = sc.nextLine();
                    String[] token = cad.split("\\|");
                    for (Lista l : playlists) {
                            playlists.add(new Lista(token[0], Integer.parseInt(token[1]), token[2]));
//                        if (l instanceof Single) {
//                            String[] song = token[4].split(",");
//                            for (int i = 0; i < song.length - 1; i++) {
//                                Cancion c = new Cancion (song[0],Integer.parseInt(song[1]),song[2]);
//                                lanzamientos.add(new Single(c, token[1], token[2], Integer.parseInt(token[3])));
//                            }
//                        }
                    }
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
