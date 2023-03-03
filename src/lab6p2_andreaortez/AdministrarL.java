package lab6p2_andreaortez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarL {
    private ArrayList<Lanzamiento> lanzamientos = new ArrayList();
    private File archivo = null;//ROM

    public AdministrarL(String path) {
        archivo = new File(path);
    }

    public ArrayList<Lanzamiento> getLanzamientos() {
        return lanzamientos;
    }

    public void setLanzamientos(ArrayList<Lanzamiento> lanzamientos) {
        this.lanzamientos = lanzamientos;
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
            for (Lanzamiento l : lanzamientos) {
                if (l instanceof Album) {
                    bw.write("Album" + "|");
                    bw.write(l.getTitulo() + "|");
                    bw.write(l.getFecha() + "|");
                    bw.write(l.getLikes() + "|");
                    bw.write(((Album) l).getCant() + "\n");
                }
                if (l instanceof Single) {
                    bw.write("Single" + "|");
                    bw.write(l.getTitulo() + "|");
                    bw.write(l.getFecha() + "|");
                    bw.write(l.getLikes() + "|");
                    bw.write(((Single) l).getCancion().getTitulo()+ ",");
                    bw.write(((Single) l).getCancion().getTiempo()+ ",");
                    bw.write(((Single) l).getCancion().getReferencia()+ "\n");
                }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() throws IOException {
        Scanner sc = null;
        lanzamientos = new ArrayList();

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNext()) {
                    String cad = sc.nextLine();
                    String[] token = cad.split("\\|");
                    for (Lanzamiento l : lanzamientos) {
                        if (l instanceof Album) {
                            lanzamientos.add(new Album(Integer.parseInt(token[4]), token[1], token[2], Integer.parseInt(token[3])));
                        }
                        if (l instanceof Single) {
                            String[] song = token[4].split(",");
                            for (int i = 0; i < song.length - 1; i++) {
                                Cancion c = new Cancion (song[0],Integer.parseInt(song[1]),song[2]);
                                lanzamientos.add(new Single(c, token[1], token[2], Integer.parseInt(token[3])));
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
