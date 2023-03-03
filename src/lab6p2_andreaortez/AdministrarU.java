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
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario u : usuarios) {
                if (u instanceof Artista) {
                    bw.write(u.getUser() + "|");
                    bw.write(u.getContra() + "|");
                    bw.write(u.getEdad() + "1|");
                    bw.write(((Artista) u).getNombre()+ "\n");
                }
                if (u instanceof Oyente) {
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
        int cont = 0;

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNext()) {
                    String cad = sc.nextLine();
                    String[] token = cad.split("\\|");
                    for (Usuario u : usuarios) {
                        if (u instanceof Artista) {
                            usuarios.add(new Artista(token[3], token[0], token[1], Integer.parseInt(token[2])));
                        }
                        if (u instanceof Oyente) {
                            usuarios.add(new Oyente(token[0], token[1], Integer.parseInt(token[2])));
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
                    cont++;
                }
            } catch (Exception e) {
            }
            sc.close();

        }//FIN IF
    }
}
