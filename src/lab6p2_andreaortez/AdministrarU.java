package lab6p2_andreaortez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarU {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;//ROM

    public AdministrarU(String path) {
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
                    bw.write("Artista" + "|");
                    bw.write(u.getUser() + "|");
                    bw.write(u.getContra() + "|");
                    bw.write(u.getEdad() + "|");
                    bw.write(((Artista) u).getNombre() + "\n");
                }
                if (u instanceof Oyente) {
                    bw.write("Oyente" + "|");
                    bw.write(u.getUser() + "|");
                    bw.write(u.getContra() + "|");
                    bw.write(u.getEdad() + "\n");
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
        usuarios = new ArrayList();

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNext()) {
                    String cad = sc.nextLine();
                    String[] token = cad.split("\\|");
                    for (int i = 0; i < token.length - 1; i++) {
                        if (token[0].equals("Artista")) {
                            usuarios.add(new Artista(token[4], token[1], token[2], Integer.parseInt(token[3])));
                        }
                        if (token[0].equals("Oyente")) {
                            usuarios.add(new Oyente(token[1], token[2], Integer.parseInt(token[3])));
                        }
//                        String[] song = token[4].split(",");
//                        for (int i = 0; i < song.length - 1; i ++) {
//                            usuarios.get(cont).getAccesorios().add(song[i]);
//                        }
//                        String[] album = token[5].split(",");
//                        for (int i = 0; i < album.length - 1; i ++) {
//                            usuarios.get(cont).getAccesorios().add(album[i]);
//                        }
                    }
                }
            } catch (Exception e) {
            }
            sc.close();

        }//FIN IF

    }
}
