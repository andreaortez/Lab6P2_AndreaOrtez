package lab6p2_andreaortez;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

public class FrameP extends javax.swing.JFrame {

    int tipo;
    AdministrarU au = new AdministrarU("./usuarios.txt");
    AdministrarC ac = new AdministrarC("./canciones.txt");
    AdministrarL al = new AdministrarL("./lanzamientos.txt");
    AdministrarP ap = new AdministrarP("./playlists.txt");
    Bitacora b = new Bitacora("./bitacora.txt");
    DefaultMutableTreeNode nodo_seleccionado;
    Usuario actual;

    public FrameP() throws IOException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        au.cargarArchivo();
        ac.cargarArchivo();
        al.cargarArchivo();
        ap.cargarArchivo();

        pn_registrarA.setVisible(false);
        pn_registrarO.setVisible(false);
        S_Artista.setVisible(false);

        b.setUsuarios(au.getUsuarios());

        System.out.println(au.getUsuarios().size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarC = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_title = new javax.swing.JTextField();
        tf_time = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cb_albumes = new javax.swing.JComboBox<>();
        bt_agregarC = new javax.swing.JButton();
        AgregarL = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cb_songp = new javax.swing.JComboBox<>();
        pn_cancionesp = new javax.swing.JPanel();
        bt_agregarCP = new javax.swing.JButton();
        bt_agregarP = new javax.swing.JButton();
        S_Oyente = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        crearC1 = new javax.swing.JLabel();
        crearL1 = new javax.swing.JLabel();
        eliminarL1 = new javax.swing.JLabel();
        EditarL1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_oyente = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_canciones = new javax.swing.JList<>();
        S_Artista = new javax.swing.JPanel();
        pn_crearL = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_fecha = new javax.swing.JTextField();
        tf_titulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_cat = new javax.swing.JComboBox<>();
        pn_album = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cb_canciones = new javax.swing.JComboBox<>();
        bt_agregarS = new javax.swing.JButton();
        bt_agregarL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_artista = new javax.swing.JTree();
        barra = new javax.swing.JPanel();
        crearC = new javax.swing.JLabel();
        eliminarL = new javax.swing.JLabel();
        EditarL = new javax.swing.JLabel();
        crearL = new javax.swing.JLabel();
        Iniciar_Registrar = new javax.swing.JPanel();
        pn_iniciarsesión = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_contra = new javax.swing.JTextField();
        bt_iniciar = new javax.swing.JButton();
        tf_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pn_registrarA = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreA = new javax.swing.JTextField();
        tf_usuarioA = new javax.swing.JTextField();
        bt_registrarA = new javax.swing.JButton();
        tf_contraA = new javax.swing.JTextField();
        tf_edadA = new javax.swing.JTextField();
        pn_registrarO = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_usuarioO = new javax.swing.JTextField();
        bt_registrarO = new javax.swing.JButton();
        tf_contraO = new javax.swing.JTextField();
        tf_edadO = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(32, 32, 32));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Agregar Canción");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Título");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 104, -1, -1));

        tf_title.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(tf_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 370, -1));

        tf_time.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(tf_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 370, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Album");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Duración");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 203, -1, -1));

        cb_albumes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(cb_albumes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 370, -1));

        bt_agregarC.setBackground(new java.awt.Color(25, 187, 81));
        bt_agregarC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_agregarC.setText("Agregar");
        bt_agregarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarCMouseClicked(evt);
            }
        });
        jPanel1.add(bt_agregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 394, -1, 40));

        javax.swing.GroupLayout AgregarCLayout = new javax.swing.GroupLayout(AgregarC.getContentPane());
        AgregarC.getContentPane().setLayout(AgregarCLayout);
        AgregarCLayout.setHorizontalGroup(
            AgregarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        AgregarCLayout.setVerticalGroup(
            AgregarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(32, 32, 32));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Agregar Lista");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        tf_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel3.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 370, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Canción");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, 30));

        cb_songp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel3.add(cb_songp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 370, -1));

        pn_cancionesp.setBackground(new java.awt.Color(32, 32, 32));

        bt_agregarCP.setBackground(new java.awt.Color(25, 187, 81));
        bt_agregarCP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_agregarCP.setText("Agregar Canción");
        bt_agregarCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarCPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_cancionespLayout = new javax.swing.GroupLayout(pn_cancionesp);
        pn_cancionesp.setLayout(pn_cancionespLayout);
        pn_cancionespLayout.setHorizontalGroup(
            pn_cancionespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_cancionespLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(bt_agregarCP)
                .addGap(216, 216, 216))
        );
        pn_cancionespLayout.setVerticalGroup(
            pn_cancionespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_cancionespLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(bt_agregarCP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(pn_cancionesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 660, 160));

        bt_agregarP.setBackground(new java.awt.Color(25, 187, 81));
        bt_agregarP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_agregarP.setText("Agregar");
        bt_agregarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarPMouseClicked(evt);
            }
        });
        jPanel3.add(bt_agregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, 40));

        javax.swing.GroupLayout AgregarLLayout = new javax.swing.GroupLayout(AgregarL.getContentPane());
        AgregarL.getContentPane().setLayout(AgregarLLayout);
        AgregarLLayout.setHorizontalGroup(
            AgregarLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        AgregarLLayout.setVerticalGroup(
            AgregarLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        S_Oyente.setBackground(new java.awt.Color(32, 32, 32));
        S_Oyente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        crearC1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        crearC1.setForeground(new java.awt.Color(255, 255, 255));
        crearC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearC1.setText("Ver otras listas");
        crearC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearC1MouseClicked(evt);
            }
        });

        crearL1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        crearL1.setForeground(new java.awt.Color(255, 255, 255));
        crearL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearL1.setText("Crear Lista");
        crearL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearL1MouseClicked(evt);
            }
        });

        eliminarL1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        eliminarL1.setForeground(new java.awt.Color(255, 255, 255));
        eliminarL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarL1.setText("Eliminar Lista");
        eliminarL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarL1MouseClicked(evt);
            }
        });

        EditarL1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        EditarL1.setForeground(new java.awt.Color(255, 255, 255));
        EditarL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditarL1.setText("Editar Lista");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EditarL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eliminarL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(crearC1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(crearL1)
                .addGap(47, 47, 47)
                .addComponent(EditarL1)
                .addGap(51, 51, 51)
                .addComponent(eliminarL1)
                .addGap(49, 49, 49)
                .addComponent(crearC1)
                .addGap(218, 218, 218))
        );

        S_Oyente.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 720));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Listas");
        jt_oyente.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jt_oyente);

        S_Oyente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 350, 630));

        jScrollPane3.setViewportView(jl_canciones);

        S_Oyente.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 370, 620));

        S_Artista.setBackground(new java.awt.Color(32, 32, 32));
        S_Artista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_crearL.setBackground(new java.awt.Color(32, 32, 32));
        pn_crearL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Título de publicación");
        pn_crearL.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Lanzamiento");
        pn_crearL.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 190, 30));

        tf_fecha.setBackground(new java.awt.Color(51, 51, 51));
        tf_fecha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_fecha.setForeground(new java.awt.Color(255, 255, 255));
        pn_crearL.add(tf_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 290, -1));

        tf_titulo.setBackground(new java.awt.Color(51, 51, 51));
        tf_titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_titulo.setForeground(new java.awt.Color(255, 255, 255));
        pn_crearL.add(tf_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 290, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoría");
        pn_crearL.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        cb_cat.setBackground(new java.awt.Color(51, 51, 51));
        cb_cat.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cb_cat.setForeground(new java.awt.Color(255, 255, 255));
        cb_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álbum", "Single" }));
        pn_crearL.add(cb_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 290, -1));

        pn_album.setBackground(new java.awt.Color(32, 32, 32));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Canción");

        cb_canciones.setBackground(new java.awt.Color(51, 51, 51));
        cb_canciones.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cb_canciones.setForeground(new java.awt.Color(153, 153, 153));

        bt_agregarS.setBackground(new java.awt.Color(25, 187, 81));
        bt_agregarS.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_agregarS.setText("Agregar Canción");
        bt_agregarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_albumLayout = new javax.swing.GroupLayout(pn_album);
        pn_album.setLayout(pn_albumLayout);
        pn_albumLayout.setHorizontalGroup(
            pn_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_albumLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addGap(57, 57, 57)
                .addGroup(pn_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_agregarS)
                    .addComponent(cb_canciones, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pn_albumLayout.setVerticalGroup(
            pn_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_albumLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(pn_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_canciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(bt_agregarS)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pn_crearL.add(pn_album, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 540, 240));

        bt_agregarL.setBackground(new java.awt.Color(25, 187, 81));
        bt_agregarL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_agregarL.setForeground(new java.awt.Color(255, 255, 255));
        bt_agregarL.setText("Agregar Lanzamiento");
        bt_agregarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarLMouseClicked(evt);
            }
        });
        pn_crearL.add(bt_agregarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        S_Artista.add(pn_crearL, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 630, 720));

        jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jt_artista.setBackground(new java.awt.Color(51, 51, 51));
        jt_artista.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_artista.setForeground(new java.awt.Color(255, 255, 255));
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Lanzamientos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Albumes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Singles");
        treeNode1.add(treeNode2);
        jt_artista.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_artista);

        S_Artista.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 400, 640));

        barra.setBackground(new java.awt.Color(0, 0, 0));
        barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearC.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        crearC.setForeground(new java.awt.Color(255, 255, 255));
        crearC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearC.setText("Agregar Canción");
        crearC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCMouseClicked(evt);
            }
        });
        barra.add(crearC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 250, 32));

        eliminarL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        eliminarL.setForeground(new java.awt.Color(255, 255, 255));
        eliminarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarL.setText("Eliminar Lanzamiento");
        eliminarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarLMouseClicked(evt);
            }
        });
        barra.add(eliminarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, 250, 32));

        EditarL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        EditarL.setForeground(new java.awt.Color(255, 255, 255));
        EditarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditarL.setText("Editar Lanzamiento");
        barra.add(EditarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 32));

        crearL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        crearL.setForeground(new java.awt.Color(255, 255, 255));
        crearL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearL.setText("Crear Lanzamiento");
        crearL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearLMouseClicked(evt);
            }
        });
        barra.add(crearL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 32));

        S_Artista.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        Iniciar_Registrar.setBackground(new java.awt.Color(32, 32, 32));
        Iniciar_Registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_iniciarsesión.setBackground(new java.awt.Color(32, 32, 32));
        pn_iniciarsesión.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÚSICA PARA TODOS.");
        pn_iniciarsesión.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1390, -1));

        tf_contra.setBackground(new java.awt.Color(51, 51, 51));
        tf_contra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_contra.setForeground(new java.awt.Color(153, 153, 153));
        tf_contra.setText("Contraseña");
        tf_contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_contraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_contraMouseExited(evt);
            }
        });
        pn_iniciarsesión.add(tf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 432, 40));

        bt_iniciar.setBackground(new java.awt.Color(25, 187, 81));
        bt_iniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        bt_iniciar.setText("INICIAR SESIÓN");
        bt_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarMouseClicked(evt);
            }
        });
        pn_iniciarsesión.add(bt_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 160, 40));

        tf_usuario.setBackground(new java.awt.Color(51, 51, 51));
        tf_usuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_usuario.setForeground(new java.awt.Color(153, 153, 153));
        tf_usuario.setText("Ingrese su usuario");
        tf_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_usuarioMouseExited(evt);
            }
        });
        pn_iniciarsesión.add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 432, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No tienes cuenta, dale click aqui para registrarte");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        pn_iniciarsesión.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        Iniciar_Registrar.add(pn_iniciarsesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, -1, 393));

        pn_registrarA.setBackground(new java.awt.Color(32, 32, 32));
        pn_registrarA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MÚSICA PARA TODOS.");
        pn_registrarA.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1390, -1));

        tf_nombreA.setBackground(new java.awt.Color(51, 51, 51));
        tf_nombreA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_nombreA.setForeground(new java.awt.Color(153, 153, 153));
        tf_nombreA.setText("Nombre Artístico");
        tf_nombreA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_nombreAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_nombreAMouseExited(evt);
            }
        });
        pn_registrarA.add(tf_nombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 432, 40));

        tf_usuarioA.setBackground(new java.awt.Color(51, 51, 51));
        tf_usuarioA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_usuarioA.setForeground(new java.awt.Color(153, 153, 153));
        tf_usuarioA.setText("Nombre de usuario");
        tf_usuarioA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_usuarioAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_usuarioAMouseExited(evt);
            }
        });
        pn_registrarA.add(tf_usuarioA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 432, 40));

        bt_registrarA.setBackground(new java.awt.Color(25, 187, 81));
        bt_registrarA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_registrarA.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrarA.setText("REGISTRARSE");
        bt_registrarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarAMouseClicked(evt);
            }
        });
        pn_registrarA.add(bt_registrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 150, 40));

        tf_contraA.setBackground(new java.awt.Color(51, 51, 51));
        tf_contraA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_contraA.setForeground(new java.awt.Color(153, 153, 153));
        tf_contraA.setText("Contraseña");
        tf_contraA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_contraAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_contraAMouseExited(evt);
            }
        });
        pn_registrarA.add(tf_contraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 432, 40));

        tf_edadA.setBackground(new java.awt.Color(51, 51, 51));
        tf_edadA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_edadA.setForeground(new java.awt.Color(153, 153, 153));
        tf_edadA.setText("Edad");
        tf_edadA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_edadAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_edadAMouseExited(evt);
            }
        });
        pn_registrarA.add(tf_edadA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 432, 40));

        Iniciar_Registrar.add(pn_registrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 460));

        pn_registrarO.setBackground(new java.awt.Color(32, 32, 32));
        pn_registrarO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MÚSICA PARA TODOS.");
        pn_registrarO.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1390, -1));

        tf_usuarioO.setBackground(new java.awt.Color(51, 51, 51));
        tf_usuarioO.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_usuarioO.setForeground(new java.awt.Color(153, 153, 153));
        tf_usuarioO.setText("Nombre de usuario");
        tf_usuarioO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_usuarioOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_usuarioOMouseExited(evt);
            }
        });
        pn_registrarO.add(tf_usuarioO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 432, 40));

        bt_registrarO.setBackground(new java.awt.Color(25, 187, 81));
        bt_registrarO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_registrarO.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrarO.setText("REGISTRARSE");
        bt_registrarO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarOMouseClicked(evt);
            }
        });
        pn_registrarO.add(bt_registrarO, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 150, 40));

        tf_contraO.setBackground(new java.awt.Color(51, 51, 51));
        tf_contraO.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_contraO.setForeground(new java.awt.Color(153, 153, 153));
        tf_contraO.setText("Contraseña");
        tf_contraO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_contraOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_contraOMouseExited(evt);
            }
        });
        pn_registrarO.add(tf_contraO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 432, 40));

        tf_edadO.setBackground(new java.awt.Color(51, 51, 51));
        tf_edadO.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_edadO.setForeground(new java.awt.Color(153, 153, 153));
        tf_edadO.setText("Edad");
        tf_edadO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_edadOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_edadOMouseExited(evt);
            }
        });
        pn_registrarO.add(tf_edadO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 432, 40));

        Iniciar_Registrar.add(pn_registrarO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Iniciar_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(S_Artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(S_Oyente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Iniciar_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(S_Artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(S_Oyente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_contraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraMouseEntered
        if ("Contraseña".equals(tf_contra.getText())) {
            tf_contra.setText("");
        }
    }//GEN-LAST:event_tf_contraMouseEntered

    private void tf_contraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraMouseExited
        if (tf_contra.getText().isEmpty()) {
            tf_contra.setText("Contraseña");
        }
    }//GEN-LAST:event_tf_contraMouseExited

    private void tf_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioMouseEntered
        if ("Ingrese su usuario".equals(tf_usuario.getText())) {
            tf_usuario.setText("");
        }
    }//GEN-LAST:event_tf_usuarioMouseEntered

    private void tf_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioMouseExited
        if (tf_usuario.getText().isEmpty()) {
            tf_usuario.setText("Ingrese su usuario");
        }
    }//GEN-LAST:event_tf_usuarioMouseExited

    private void tf_nombreAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombreAMouseEntered
        if ("Nombre Artístico".equals(tf_nombreA.getText())) {
            tf_nombreA.setText("");
        }
    }//GEN-LAST:event_tf_nombreAMouseEntered

    private void tf_nombreAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombreAMouseExited
        if (tf_nombreA.getText().isEmpty()) {
            tf_nombreA.setText("Nombre Artístico");
        }
    }//GEN-LAST:event_tf_nombreAMouseExited

    private void tf_usuarioAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioAMouseEntered
        if ("Nombre de usuario".equals(tf_usuarioA.getText())) {
            tf_usuarioA.setText("");
        }
    }//GEN-LAST:event_tf_usuarioAMouseEntered

    private void tf_usuarioAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioAMouseExited
        if (tf_usuarioA.getText().isEmpty()) {
            tf_usuarioA.setText("Nombre de usuario");
        }
    }//GEN-LAST:event_tf_usuarioAMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        pn_iniciarsesión.setVisible(false);
        int op = Integer.parseInt(JOptionPane.showInputDialog("1-> Artista\n2-> Oyente\nIngrese opción:"));
        if (op == 1) {
            pn_registrarA.setVisible(true);
        } else if (op == 2) {
            pn_registrarO.setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void bt_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarMouseClicked
        if (ValidarUsuario(tf_usuario.getText(), tf_contra.getText())) {
            switch (tipo) {
                case 1://artista
                    Iniciar_Registrar.setVisible(false);
                    S_Artista.setVisible(true);
                    pn_crearL.setVisible(false);
                    pn_album.setVisible(false);
                    barra.setVisible(true);

                    DefaultTreeModel m = (DefaultTreeModel) jt_artista.getModel();
                    DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

                    for (Lanzamiento l : ((Artista) actual).getLanzamientos()) {
                        if (l instanceof Album) {
                            for (int i = 0; i < raiz.getChildCount(); i++) {
                                if (("Albumes").equals(raiz.getChildAt(i).toString())) {
                                    for (Cancion c : ((Album) l).getCanciones()) {
                                        ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(new DefaultMutableTreeNode(c.getTitulo()));
                                    }
                                }
                            }
                        } else {
                            for (int i = 0; i < raiz.getChildCount(); i++) {
                                if (("Single").equals(raiz.getChildAt(i).toString())) {
                                    for (Cancion c : ((Album) l).getCanciones()) {
                                        ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(new DefaultMutableTreeNode(c.getTitulo()));
                                    }
                                }
                            }
                        }
                    }
                    m.reload();
                    break;
                case 2://oyente
                    Iniciar_Registrar.setVisible(false);
                    S_Artista.setVisible(false);
                    S_Oyente.setVisible(true);

                    DefaultListModel modelo = (DefaultListModel) jl_canciones.getModel();

                    for (Cancion c : ((Oyente) actual).getCancionesf()) {
                        modelo.addElement(c.getTitulo());
                    }
                    jl_canciones.setModel(modelo);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "No existe este usuario");
        }
    }//GEN-LAST:event_bt_iniciarMouseClicked

    private void tf_contraAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraAMouseEntered
        if ("Contraseña".equals(tf_contraA.getText())) {
            tf_contraA.setText("");
        }
    }//GEN-LAST:event_tf_contraAMouseEntered

    private void tf_contraAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraAMouseExited
        if (tf_contraA.getText().isEmpty()) {
            tf_contraA.setText("Contraseña");
        }
    }//GEN-LAST:event_tf_contraAMouseExited

    private void tf_edadAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_edadAMouseEntered
        if ("Edad".equals(tf_edadA.getText())) {
            tf_edadA.setText("");
        }
    }//GEN-LAST:event_tf_edadAMouseEntered

    private void tf_edadAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_edadAMouseExited
        if (tf_edadA.getText().isEmpty()) {
            tf_edadA.setText("Edad");
        }
    }//GEN-LAST:event_tf_edadAMouseExited

    private void bt_registrarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarAMouseClicked
        Artista a = new Artista(tf_nombreA.getText(), tf_usuarioA.getText(), tf_contraA.getText(), Integer.parseInt(tf_edadA.getText()));
        au.getUsuarios().add(a);
        try {
            au.escribirArchivo();
            b.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
        }

        S_Artista.setVisible(true);
        pn_registrarA.setVisible(false);
    }//GEN-LAST:event_bt_registrarAMouseClicked

    private void tf_usuarioOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioOMouseEntered
        if ("Nombre de usuario".equals(tf_usuarioO.getText())) {
            tf_usuarioO.setText("");
        }
    }//GEN-LAST:event_tf_usuarioOMouseEntered

    private void tf_usuarioOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioOMouseExited
        if (tf_usuarioO.getText().isEmpty()) {
            tf_usuarioO.setText("Nombre de usuario");
        }
    }//GEN-LAST:event_tf_usuarioOMouseExited

    private void bt_registrarOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarOMouseClicked
        Oyente o = new Oyente(tf_usuarioO.getText(), tf_contraO.getText(), Integer.parseInt(tf_edadO.getText()));
        au.getUsuarios().add(o);
        try {
            au.escribirArchivo();
            b.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_registrarOMouseClicked

    private void tf_contraOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraOMouseEntered
        if ("Contraseña".equals(tf_contraO.getText())) {
            tf_contraO.setText("");
        }
    }//GEN-LAST:event_tf_contraOMouseEntered

    private void tf_contraOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_contraOMouseExited
        if (tf_contraO.getText().isEmpty()) {
            tf_contraO.setText("Contraseña");
        }
    }//GEN-LAST:event_tf_contraOMouseExited

    private void tf_edadOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_edadOMouseEntered
        if ("Edad".equals(tf_edadO.getText())) {
            tf_edadO.setText("");
        }
    }//GEN-LAST:event_tf_edadOMouseEntered

    private void tf_edadOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_edadOMouseExited
        if (tf_edadO.getText().isEmpty()) {
            tf_edadO.setText("Edad");
        }
    }//GEN-LAST:event_tf_edadOMouseExited

    private void bt_agregarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarLMouseClicked
        if (cb_cat.getSelectedItem().toString().equals("Álbum")) {
            al.getLanzamientos().add(new Album());
            int p = al.getLanzamientos().size() - 1;
            int cant = ((Album) al.getLanzamientos().get(p)).getCanciones().size();
            Album a = new Album(cant, tf_titulo.getText(), tf_fecha.getText(), 0);
            al.getLanzamientos().set(p, a);

            pn_album.setVisible(true);
            cb_canciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            for (Cancion c : ac.getCanciones()) {
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_canciones.getModel();
                modelo.addElement(c);
                cb_canciones.setModel(modelo);
            }
        } else {
            al.getLanzamientos().add(new Single());

            pn_album.setVisible(true);
            cb_canciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            for (Cancion c : ac.getCanciones()) {
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_canciones.getModel();
                modelo.addElement(c);
                cb_canciones.setModel(modelo);
            }
        }
        try {
            al.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_agregarLMouseClicked

    private void crearCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCMouseClicked
        AgregarC.setVisible(true);
        AgregarC.pack();
        AgregarC.setLocationRelativeTo(this);
        AgregarC.setVisible(true);

        cb_albumes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        for (Lanzamiento c : al.getLanzamientos()) {
            if (c instanceof Album) {
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_albumes.getModel();
                modelo.addElement(c.toString());
                cb_albumes.setModel(modelo);
            }
        }
    }//GEN-LAST:event_crearCMouseClicked

    private void eliminarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLMouseClicked
        if (jt_artista.getSelectionCount() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.OK_OPTION) {
                DefaultTreeModel modelo = (DefaultTreeModel) jt_artista.getModel();
                modelo.removeNodeFromParent(nodo_seleccionado);
                jt_artista.setModel((TreeModel) modelo);
                JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            }
        }
    }//GEN-LAST:event_eliminarLMouseClicked

    private void crearLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearLMouseClicked
        pn_crearL.setVisible(true);
        pn_album.setVisible(false);
    }//GEN-LAST:event_crearLMouseClicked

    private void crearC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearC1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearC1MouseClicked

    private void crearL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearL1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearL1MouseClicked

    private void eliminarL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarL1MouseClicked
        if (jt_oyente.getSelectionCount() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.OK_OPTION) {
                DefaultTreeModel modelo = (DefaultTreeModel) jt_oyente.getModel();
                modelo.removeNodeFromParent(nodo_seleccionado);
                jt_oyente.setModel((TreeModel) modelo);
                JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            }
        }
    }//GEN-LAST:event_eliminarL1MouseClicked

    private void bt_agregarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarSMouseClicked
        if (cb_cat.getSelectedItem().toString().equals("Álbum")) {
            int p = al.getLanzamientos().size() - 1;

            Cancion c = new Cancion();
            for (Cancion s : ac.getCanciones()) {
                if (s.getTitulo().equals(cb_canciones.getSelectedItem().toString())) {
                    c = s;
                }
            }
            ((Album) al.getLanzamientos().get(p)).getCanciones().add(c);
        } else {
            int p = al.getLanzamientos().size() - 1;
            for (Cancion c : ac.getCanciones()) {
                if (c.getTitulo().equals(cb_canciones.getSelectedItem().toString())) {
                    Single s = new Single(c, tf_titulo.getText(), tf_fecha.getText(), 0);
                    al.getLanzamientos().set(p, s);
                }
            }
            pn_album.setVisible(false);

            cb_albumes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            for (Lanzamiento c : al.getLanzamientos()) {
                if (c instanceof Album) {
                    DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_albumes.getModel();
                    modelo.addElement(c.toString());
                    cb_albumes.setModel(modelo);
                }
            }
        }
    }//GEN-LAST:event_bt_agregarSMouseClicked

    private void bt_agregarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarCMouseClicked
        Cancion c = new Cancion(tf_title.getText(), Integer.parseInt(tf_time.getText()), cb_albumes.getSelectedItem().toString());
        ac.getCanciones().add(c);
        try {
            ac.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_agregarCMouseClicked

    private void bt_agregarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarPMouseClicked
        Lista l = new Lista(tf_nombre.getText(), 0, actual.toString());
        ap.getPlaylists().add(l);
        try {
            ap.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
        }

        pn_cancionesp.setVisible(true);

        cb_songp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        for (Cancion c : ac.getCanciones()) {
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_albumes.getModel();
            modelo.addElement(c.toString());
            cb_songp.setModel(modelo);
        }
    }//GEN-LAST:event_bt_agregarPMouseClicked

    private void bt_agregarCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarCPMouseClicked
        int pos = ap.getPlaylists().size()-1;
        Cancion c= new Cancion();
        for (Cancion s : ac.getCanciones()) {
            if (s.getTitulo().equals(cb_songp.getSelectedItem().toString())) {
                c=s;
            }
        }
        ap.getPlaylists().get(pos).getCanciones().add(c);
        
        try {
            ap.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_agregarCPMouseClicked

    private boolean ValidarUsuario(String admin, String contra) {
        for (Usuario u : au.getUsuarios()) {
            if (u.getUser().equals(admin) && u.getContra().equals(contra)) {
                actual = u;
                if (u instanceof Artista) {
                    tipo = 1;
                } else if (u instanceof Oyente) {
                    tipo = 2;
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrameP().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FrameP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgregarC;
    private javax.swing.JDialog AgregarL;
    private javax.swing.JLabel EditarL;
    private javax.swing.JLabel EditarL1;
    private javax.swing.JPanel Iniciar_Registrar;
    private javax.swing.JPanel S_Artista;
    private javax.swing.JPanel S_Oyente;
    private javax.swing.JPanel barra;
    private javax.swing.JButton bt_agregarC;
    private javax.swing.JButton bt_agregarCP;
    private javax.swing.JButton bt_agregarL;
    private javax.swing.JButton bt_agregarP;
    private javax.swing.JButton bt_agregarS;
    private javax.swing.JButton bt_iniciar;
    private javax.swing.JButton bt_registrarA;
    private javax.swing.JButton bt_registrarO;
    private javax.swing.JComboBox<String> cb_albumes;
    private javax.swing.JComboBox<String> cb_canciones;
    private javax.swing.JComboBox<String> cb_cat;
    private javax.swing.JComboBox<String> cb_songp;
    private javax.swing.JLabel crearC;
    private javax.swing.JLabel crearC1;
    private javax.swing.JLabel crearL;
    private javax.swing.JLabel crearL1;
    private javax.swing.JLabel eliminarL;
    private javax.swing.JLabel eliminarL1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> jl_canciones;
    private javax.swing.JTree jt_artista;
    private javax.swing.JTree jt_oyente;
    private javax.swing.JPanel pn_album;
    private javax.swing.JPanel pn_cancionesp;
    private javax.swing.JPanel pn_crearL;
    private javax.swing.JPanel pn_iniciarsesión;
    private javax.swing.JPanel pn_registrarA;
    private javax.swing.JPanel pn_registrarO;
    private javax.swing.JTextField tf_contra;
    private javax.swing.JTextField tf_contraA;
    private javax.swing.JTextField tf_contraO;
    private javax.swing.JTextField tf_edadA;
    private javax.swing.JTextField tf_edadO;
    private javax.swing.JTextField tf_fecha;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombreA;
    private javax.swing.JTextField tf_time;
    private javax.swing.JTextField tf_title;
    private javax.swing.JTextField tf_titulo;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_usuarioA;
    private javax.swing.JTextField tf_usuarioO;
    // End of variables declaration//GEN-END:variables
}
