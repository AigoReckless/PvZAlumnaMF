package presentacion;

import logica.Caracubo;
import logica.Comandos;
import logica.Nuez;
import logica.ZombieComun;
import logica.LanzaGuisantes;
import logica.Deportista;
import logica.Girasol;
import logica.Juego;
import logica.Fichero;
import logica.Tablero;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class JuegoI extends javax.swing.JFrame {

    /** Atributo que pertmite jugar una partida. */
    private Juego juego;
    /** Atributo que creará un tablero en interfaz.*/
    private JLabel[][] tableroI;
    /** Atributo que permite leer los datos del jugador.*/
    private Fichero le;
    
    /** Constructor de JuegoI
     * @param j partida en curso
     * @throws java.io.FileNotFoundException señala que un intento de abrir el archivo
        * indicado por un nombre de ruta especificado ha fallado.
     * @throws java.lang.ClassNotFoundException se lanza cuando una aplicación intenta cargar en una clase a través de su 
         * nombre de cadena usando ciertos métodos de los cuales no se puede encontrar una para la clase con el nombre especificado.
     */
    public JuegoI(Juego j) throws IOException, FileNotFoundException, ClassNotFoundException {
        juego = j;
        tableroI = new JLabel[5][9];
        le= new Fichero();
        le.leerDatos();
        juego.setTotalEnemigos(juego.getPartida().getEnemigosAparecidos());
        
        initComponents();
        botonesTransparentes();
        actualizarCasillas();
                
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        ayuda.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        normas.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        perdio.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        gano.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        salir.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        salirGuardar.setIconImage(new ImageIcon("src/images/icono.png").getImage());
     
   
        ImageIcon gano = new ImageIcon("src/images/dialogo.jpg");
        ImageIcon Gano = new ImageIcon(gano.getImage().getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(),Image.SCALE_DEFAULT));
        jLabel24.setIcon(Gano);
        
        ImageIcon perdio = new ImageIcon("src/images/dialogo.jpg");
        ImageIcon Perdio = new ImageIcon(perdio.getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(),Image.SCALE_DEFAULT));
        jLabel25.setIcon(Perdio);
        
        ImageIcon ayuda = new ImageIcon("src/images/blank.jpg");
        ImageIcon Ayuda = new ImageIcon(ayuda.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(),Image.SCALE_DEFAULT));
        jLabel27.setIcon(Ayuda);
        
        ImageIcon normas = new ImageIcon("src/images/blank.jpg");
        ImageIcon Normas = new ImageIcon(normas.getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(),Image.SCALE_DEFAULT));
        jLabel28.setIcon(Normas);
        
        ImageIcon gs = new ImageIcon("src/images/dialogo3.jpg");
        ImageIcon GS = new ImageIcon(gs.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(),Image.SCALE_DEFAULT));
        jLabel32.setIcon(GS);
        
        ImageIcon salir = new ImageIcon("src/images/dialogo4.jpg");
        ImageIcon Salir = new ImageIcon(salir.getImage().getScaledInstance(jLabel34.getWidth(), jLabel34.getHeight(),Image.SCALE_DEFAULT));
        jLabel34.setIcon(Salir);
       
        ImageIcon tablero = new ImageIcon("src/images/tablero.jpg");
        ImageIcon cesped = new ImageIcon(tablero.getImage().getScaledInstance(tableroJ.getWidth(), tableroJ.getHeight(),Image.SCALE_DEFAULT));
        tableroJ.setIcon(cesped);
        
        jLabel3.setText(Integer.toString(juego.getPartida().getTurno()));
        jLabel2.setText(Integer.toString(juego.getPartida().getSoles()));
        juego.setTurnosTotales(juego.getPartida().getTurnoInicial()+30);
        
        
    }
    
    /** Método que permitirá poner los botones de la interfaz transparentes.
     */
    public void botonesTransparentes(){
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setBorderPainted(false);
        
        jButton6.setOpaque(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setBorderPainted(false);
        
        jButton8.setOpaque(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setBorderPainted(false);
        
        jButton9.setOpaque(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setBorderPainted(false);
        
        jButton10.setOpaque(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setBorderPainted(false);
        
        jButton11.setOpaque(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setBorderPainted(false);
        
        jButton12.setOpaque(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setBorderPainted(false);
        
        
        
    }
    /** Método que permitirá rellenar las casillas del tablero mediante coordenadas.
     */
    public void rellenar(){
        tableroI[0][0]= c11;
        tableroI[1][0]= c12;
        tableroI[2][0]= c13;
        tableroI[3][0]= c14;
        tableroI[4][0]= c15;
        tableroI[0][1]= c21;
        tableroI[1][1]= c22;
        tableroI[2][1]= c23;
        tableroI[3][1]= c24;
        tableroI[4][1]= c25;
        tableroI[0][2]= c31;
        tableroI[1][2]= c32;
        tableroI[2][2]= c33;
        tableroI[3][2]= c34;
        tableroI[4][2]= c35;
        tableroI[0][3]= c41;
        tableroI[1][3]= c42;
        tableroI[2][3]= c43;
        tableroI[3][3]= c44;
        tableroI[4][3]= c45;
        tableroI[0][4]= c51;
        tableroI[1][4]= c52;
        tableroI[2][4]= c53;
        tableroI[3][4]= c54;
        tableroI[4][4]= c55;
        tableroI[0][5]= c61;
        tableroI[1][5]= c62;
        tableroI[2][5]= c63;
        tableroI[3][5]= c64;
        tableroI[4][5]= c65;
        tableroI[0][6]= c71;
        tableroI[1][6]= c72;
        tableroI[2][6]= c73;
        tableroI[3][6]= c74;
        tableroI[4][6]= c75;
        tableroI[0][7]= c81;
        tableroI[1][7]= c82;
        tableroI[2][7]= c83;
        tableroI[3][7]= c84;
        tableroI[4][7]= c85;
        tableroI[0][8]= c91;
        tableroI[1][8]= c92;
        tableroI[2][8]= c93;
        tableroI[3][8]= c94;
        tableroI[4][8]= c95;
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gano = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        perdio = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ayuda = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        normas = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        salirGuardar = new javax.swing.JDialog();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        salir = new javax.swing.JDialog();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        c11 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        c13 = new javax.swing.JLabel();
        c14 = new javax.swing.JLabel();
        c15 = new javax.swing.JLabel();
        c21 = new javax.swing.JLabel();
        c31 = new javax.swing.JLabel();
        c51 = new javax.swing.JLabel();
        c61 = new javax.swing.JLabel();
        c71 = new javax.swing.JLabel();
        c81 = new javax.swing.JLabel();
        c91 = new javax.swing.JLabel();
        c41 = new javax.swing.JLabel();
        c22 = new javax.swing.JLabel();
        c23 = new javax.swing.JLabel();
        c24 = new javax.swing.JLabel();
        c25 = new javax.swing.JLabel();
        c32 = new javax.swing.JLabel();
        c33 = new javax.swing.JLabel();
        c34 = new javax.swing.JLabel();
        c35 = new javax.swing.JLabel();
        c42 = new javax.swing.JLabel();
        c43 = new javax.swing.JLabel();
        c44 = new javax.swing.JLabel();
        c45 = new javax.swing.JLabel();
        c52 = new javax.swing.JLabel();
        c53 = new javax.swing.JLabel();
        c54 = new javax.swing.JLabel();
        c55 = new javax.swing.JLabel();
        c62 = new javax.swing.JLabel();
        c63 = new javax.swing.JLabel();
        c64 = new javax.swing.JLabel();
        c65 = new javax.swing.JLabel();
        c72 = new javax.swing.JLabel();
        c73 = new javax.swing.JLabel();
        c74 = new javax.swing.JLabel();
        c75 = new javax.swing.JLabel();
        c82 = new javax.swing.JLabel();
        c83 = new javax.swing.JLabel();
        c84 = new javax.swing.JLabel();
        c85 = new javax.swing.JLabel();
        c92 = new javax.swing.JLabel();
        c93 = new javax.swing.JLabel();
        c94 = new javax.swing.JLabel();
        c95 = new javax.swing.JLabel();
        tableroJ = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        gSBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        gano.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        gano.setMinimumSize(new java.awt.Dimension(490, 193));
        gano.getContentPane().setLayout(null);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gano.getContentPane().add(jButton2);
        jButton2.setBounds(190, 120, 100, 40);

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENHORABUENA, LO HAS CONSEGUIDO , O NO ;)");
        gano.getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 70, 430, 36);

        jLabel24.setMaximumSize(new java.awt.Dimension(490, 193));
        jLabel24.setMinimumSize(new java.awt.Dimension(490, 193));
        jLabel24.setPreferredSize(new java.awt.Dimension(490, 193));
        gano.getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 0, 490, 193);

        perdio.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        perdio.setMinimumSize(new java.awt.Dimension(490, 193));
        perdio.getContentPane().setLayout(null);

        jButton3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        perdio.getContentPane().add(jButton3);
        jButton3.setBounds(190, 130, 100, 40);

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BUENO LO CONSEGUISTE, ");
        perdio.getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 40, 240, 50);

        jLabel26.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("HAS LLEGADO AL FINAL DE TU VIDA, POR FIN");
        perdio.getContentPane().add(jLabel26);
        jLabel26.setBounds(70, 80, 400, 40);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dialogo.jpg"))); // NOI18N
        perdio.getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 0, 490, 193);

        ayuda.setMinimumSize(new java.awt.Dimension(678, 427));
        ayuda.getContentPane().setLayout(null);

        jLabel15.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel15.setText("Ayuda para jugar a Plantas vs Zombies: ");
        ayuda.getContentPane().add(jLabel15);
        jLabel15.setBounds(90, 40, 462, 32);

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel16.setText("- G <columna> <fila> : colocar girasol.");
        ayuda.getContentPane().add(jLabel16);
        jLabel16.setBounds(180, 120, 320, 19);

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel17.setText("- L <columna> <fila> : colocar LanzaGuisantes.");
        ayuda.getContentPane().add(jLabel17);
        jLabel17.setBounds(180, 150, 350, 19);

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel18.setText("- N <columna> <fila> : colocar una Nuez.");
        ayuda.getContentPane().add(jLabel18);
        jLabel18.setBounds(180, 180, 340, 19);

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel19.setText("- P <columna> <fila> : colocar un Petacereza.");
        ayuda.getContentPane().add(jLabel19);
        jLabel19.setBounds(180, 210, 360, 19);

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel20.setText("- Pulsa Enviar para pasar turno.");
        ayuda.getContentPane().add(jLabel20);
        jLabel20.setBounds(180, 240, 340, 19);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ayuda.getContentPane().add(jButton7);
        jButton7.setBounds(230, 330, 240, 60);
        ayuda.getContentPane().add(jLabel27);
        jLabel27.setBounds(0, 0, 678, 427);

        normas.setMinimumSize(new java.awt.Dimension(678, 427));
        normas.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel6.setText("- El objetivo del juego es eliminar a los Zombies que aparecen por la derecha mediante el uso de ");
        normas.getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 50, 670, 40);

        jLabel7.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel7.setText("Normas para jugar a Plantas vs Zombies: ");
        normas.getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 20, 475, 32);

        jLabel8.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel8.setText("- Los soles se usan como unidad de dinero. Necesitas soles para comprar Girasoles y LanzaGuisantes.");
        normas.getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 100, 656, 19);

        jLabel9.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel9.setText("- Los Girasoles cuestan 20 soles y, a su vez, producen 20 soles más cada 2 turnos de la partida.");
        normas.getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 130, 611, 19);

        jLabel10.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel10.setText("- Para plantarlas, tienes que seleccionar la casilla en la que quieres plantarlo. ¿Cómo? Con coordenadas ");
        normas.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 270, 687, 19);

        jLabel11.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel11.setText("- Por su parte, los LanzaGuisantes cuestan 50 soles y son los capaces de matar a los zombies.");
        normas.getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 160, 600, 19);

        jLabel12.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel12.setText("- Visualiza la casilla en la que quieres plantar y teclea el número de columna y luego de fila. ");
        normas.getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 290, 733, 19);

        jLabel13.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel13.setText("- Las nueces cuestan 50 soles y, pero estas aguantan mucho ya que tienen 10 puntos de vida.");
        normas.getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 190, 600, 19);

        jLabel14.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel14.setText("- Los petacerezas cuestan 50 soles y, estos explotan a los dos turnos de ser plantados haciendo ");
        normas.getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 220, 615, 19);

        jLabel29.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel29.setText("plantas como armas.");
        normas.getContentPane().add(jLabel29);
        jLabel29.setBounds(20, 80, 620, 14);

        jLabel30.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel30.setText("daño a todas las casillas adyacentes.");
        normas.getContentPane().add(jLabel30);
        jLabel30.setBounds(20, 240, 320, 20);

        jLabel31.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel31.setText("Al pulsar enter aparecerá.");
        normas.getContentPane().add(jLabel31);
        jLabel31.setBounds(20, 310, 310, 14);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        normas.getContentPane().add(jButton6);
        jButton6.setBounds(270, 340, 150, 40);

        jLabel28.setMaximumSize(new java.awt.Dimension(678, 427));
        jLabel28.setMinimumSize(new java.awt.Dimension(678, 427));
        jLabel28.setPreferredSize(new java.awt.Dimension(678, 427));
        normas.getContentPane().add(jLabel28);
        jLabel28.setBounds(0, 0, 678, 427);

        salirGuardar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        salirGuardar.setMinimumSize(new java.awt.Dimension(490, 193));
        salirGuardar.getContentPane().setLayout(null);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        salirGuardar.getContentPane().add(jButton8);
        jButton8.setBounds(60, 120, 120, 40);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        salirGuardar.getContentPane().add(jButton9);
        jButton9.setBounds(290, 120, 140, 40);

        jLabel33.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("y guardar la partida?");
        salirGuardar.getContentPane().add(jLabel33);
        jLabel33.setBounds(130, 60, 340, 40);

        jLabel21.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("¿Seguro que deseas salir ");
        salirGuardar.getContentPane().add(jLabel21);
        jLabel21.setBounds(100, 40, 330, 28);

        jLabel32.setMaximumSize(new java.awt.Dimension(490, 193));
        jLabel32.setMinimumSize(new java.awt.Dimension(490, 193));
        jLabel32.setPreferredSize(new java.awt.Dimension(490, 193));
        salirGuardar.getContentPane().add(jLabel32);
        jLabel32.setBounds(0, 0, 490, 193);

        salir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        salir.setMinimumSize(new java.awt.Dimension(490, 193));
        salir.getContentPane().setLayout(null);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        salir.getContentPane().add(jButton10);
        jButton10.setBounds(30, 120, 130, 50);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        salir.getContentPane().add(jButton11);
        jButton11.setBounds(350, 120, 110, 40);

        jLabel22.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("¿Seguro que deseas salir?");
        salir.getContentPane().add(jLabel22);
        jLabel22.setBounds(90, 50, 322, 28);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        salir.getContentPane().add(jButton12);
        jButton12.setBounds(200, 120, 102, 40);

        jLabel34.setMaximumSize(new java.awt.Dimension(490, 193));
        jLabel34.setMinimumSize(new java.awt.Dimension(490, 193));
        jLabel34.setPreferredSize(new java.awt.Dimension(490, 193));
        salir.getContentPane().add(jLabel34);
        jLabel34.setBounds(0, 0, 490, 193);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setMinimumSize(new java.awt.Dimension(1150, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 520));
        jPanel1.setLayout(null);

        c11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c11.setPreferredSize(new java.awt.Dimension(80, 100));
        c11.setRequestFocusEnabled(false);
        jPanel1.add(c11);
        c11.setBounds(60, 60, 80, 80);

        c12.setPreferredSize(new java.awt.Dimension(80, 100));
        c12.setRequestFocusEnabled(false);
        jPanel1.add(c12);
        c12.setBounds(60, 150, 80, 80);

        c13.setPreferredSize(new java.awt.Dimension(80, 100));
        c13.setRequestFocusEnabled(false);
        jPanel1.add(c13);
        c13.setBounds(60, 240, 80, 80);

        c14.setPreferredSize(new java.awt.Dimension(95, 94));
        c14.setRequestFocusEnabled(false);
        jPanel1.add(c14);
        c14.setBounds(60, 330, 80, 80);

        c15.setPreferredSize(new java.awt.Dimension(95, 94));
        c15.setRequestFocusEnabled(false);
        jPanel1.add(c15);
        c15.setBounds(60, 420, 80, 80);

        c21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c21.setPreferredSize(new java.awt.Dimension(80, 100));
        c21.setRequestFocusEnabled(false);
        jPanel1.add(c21);
        c21.setBounds(150, 60, 80, 80);

        c31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c31.setPreferredSize(new java.awt.Dimension(80, 100));
        c31.setRequestFocusEnabled(false);
        jPanel1.add(c31);
        c31.setBounds(240, 60, 80, 80);

        c51.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c51.setPreferredSize(new java.awt.Dimension(80, 100));
        c51.setRequestFocusEnabled(false);
        jPanel1.add(c51);
        c51.setBounds(420, 60, 80, 80);

        c61.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c61.setPreferredSize(new java.awt.Dimension(80, 100));
        c61.setRequestFocusEnabled(false);
        jPanel1.add(c61);
        c61.setBounds(510, 60, 80, 80);

        c71.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c71.setPreferredSize(new java.awt.Dimension(80, 100));
        c71.setRequestFocusEnabled(false);
        jPanel1.add(c71);
        c71.setBounds(600, 60, 80, 80);

        c81.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c81.setPreferredSize(new java.awt.Dimension(80, 100));
        c81.setRequestFocusEnabled(false);
        jPanel1.add(c81);
        c81.setBounds(690, 60, 80, 80);

        c91.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c91.setPreferredSize(new java.awt.Dimension(80, 100));
        c91.setRequestFocusEnabled(false);
        jPanel1.add(c91);
        c91.setBounds(780, 60, 80, 80);

        c41.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c41.setPreferredSize(new java.awt.Dimension(80, 100));
        c41.setRequestFocusEnabled(false);
        jPanel1.add(c41);
        c41.setBounds(330, 60, 80, 80);

        c22.setPreferredSize(new java.awt.Dimension(80, 100));
        c22.setRequestFocusEnabled(false);
        jPanel1.add(c22);
        c22.setBounds(150, 150, 80, 80);

        c23.setPreferredSize(new java.awt.Dimension(80, 100));
        c23.setRequestFocusEnabled(false);
        jPanel1.add(c23);
        c23.setBounds(150, 240, 80, 80);

        c24.setPreferredSize(new java.awt.Dimension(95, 94));
        c24.setRequestFocusEnabled(false);
        jPanel1.add(c24);
        c24.setBounds(150, 330, 80, 80);

        c25.setPreferredSize(new java.awt.Dimension(95, 94));
        c25.setRequestFocusEnabled(false);
        jPanel1.add(c25);
        c25.setBounds(150, 420, 80, 80);

        c32.setPreferredSize(new java.awt.Dimension(80, 100));
        c32.setRequestFocusEnabled(false);
        jPanel1.add(c32);
        c32.setBounds(240, 150, 80, 80);

        c33.setPreferredSize(new java.awt.Dimension(80, 100));
        c33.setRequestFocusEnabled(false);
        jPanel1.add(c33);
        c33.setBounds(240, 240, 80, 80);

        c34.setPreferredSize(new java.awt.Dimension(95, 94));
        c34.setRequestFocusEnabled(false);
        jPanel1.add(c34);
        c34.setBounds(240, 330, 80, 80);

        c35.setPreferredSize(new java.awt.Dimension(95, 94));
        c35.setRequestFocusEnabled(false);
        jPanel1.add(c35);
        c35.setBounds(240, 420, 80, 80);

        c42.setPreferredSize(new java.awt.Dimension(80, 100));
        c42.setRequestFocusEnabled(false);
        jPanel1.add(c42);
        c42.setBounds(330, 150, 80, 80);

        c43.setPreferredSize(new java.awt.Dimension(80, 100));
        c43.setRequestFocusEnabled(false);
        jPanel1.add(c43);
        c43.setBounds(330, 240, 80, 80);

        c44.setPreferredSize(new java.awt.Dimension(95, 94));
        c44.setRequestFocusEnabled(false);
        jPanel1.add(c44);
        c44.setBounds(330, 330, 80, 80);

        c45.setPreferredSize(new java.awt.Dimension(95, 94));
        c45.setRequestFocusEnabled(false);
        jPanel1.add(c45);
        c45.setBounds(330, 420, 80, 80);

        c52.setPreferredSize(new java.awt.Dimension(80, 100));
        c52.setRequestFocusEnabled(false);
        jPanel1.add(c52);
        c52.setBounds(420, 150, 80, 80);

        c53.setPreferredSize(new java.awt.Dimension(80, 100));
        c53.setRequestFocusEnabled(false);
        jPanel1.add(c53);
        c53.setBounds(420, 240, 80, 80);

        c54.setPreferredSize(new java.awt.Dimension(95, 94));
        c54.setRequestFocusEnabled(false);
        jPanel1.add(c54);
        c54.setBounds(420, 330, 80, 80);

        c55.setPreferredSize(new java.awt.Dimension(95, 94));
        c55.setRequestFocusEnabled(false);
        jPanel1.add(c55);
        c55.setBounds(420, 420, 80, 80);

        c62.setPreferredSize(new java.awt.Dimension(80, 100));
        c62.setRequestFocusEnabled(false);
        jPanel1.add(c62);
        c62.setBounds(510, 150, 80, 80);

        c63.setPreferredSize(new java.awt.Dimension(80, 100));
        c63.setRequestFocusEnabled(false);
        jPanel1.add(c63);
        c63.setBounds(510, 240, 80, 80);

        c64.setPreferredSize(new java.awt.Dimension(95, 94));
        c64.setRequestFocusEnabled(false);
        jPanel1.add(c64);
        c64.setBounds(510, 330, 80, 80);

        c65.setPreferredSize(new java.awt.Dimension(95, 94));
        c65.setRequestFocusEnabled(false);
        jPanel1.add(c65);
        c65.setBounds(510, 420, 80, 80);

        c72.setPreferredSize(new java.awt.Dimension(80, 100));
        c72.setRequestFocusEnabled(false);
        jPanel1.add(c72);
        c72.setBounds(600, 150, 80, 80);

        c73.setPreferredSize(new java.awt.Dimension(80, 100));
        c73.setRequestFocusEnabled(false);
        jPanel1.add(c73);
        c73.setBounds(600, 240, 80, 80);

        c74.setPreferredSize(new java.awt.Dimension(95, 94));
        c74.setRequestFocusEnabled(false);
        jPanel1.add(c74);
        c74.setBounds(600, 330, 80, 80);

        c75.setPreferredSize(new java.awt.Dimension(95, 94));
        c75.setRequestFocusEnabled(false);
        jPanel1.add(c75);
        c75.setBounds(600, 420, 80, 80);

        c82.setPreferredSize(new java.awt.Dimension(80, 100));
        c82.setRequestFocusEnabled(false);
        jPanel1.add(c82);
        c82.setBounds(690, 150, 80, 80);

        c83.setPreferredSize(new java.awt.Dimension(80, 100));
        c83.setRequestFocusEnabled(false);
        jPanel1.add(c83);
        c83.setBounds(690, 240, 80, 80);

        c84.setPreferredSize(new java.awt.Dimension(95, 94));
        c84.setRequestFocusEnabled(false);
        jPanel1.add(c84);
        c84.setBounds(690, 330, 80, 80);

        c85.setPreferredSize(new java.awt.Dimension(95, 94));
        c85.setRequestFocusEnabled(false);
        jPanel1.add(c85);
        c85.setBounds(690, 420, 80, 80);

        c92.setPreferredSize(new java.awt.Dimension(80, 100));
        c92.setRequestFocusEnabled(false);
        jPanel1.add(c92);
        c92.setBounds(780, 150, 80, 80);

        c93.setPreferredSize(new java.awt.Dimension(80, 100));
        c93.setRequestFocusEnabled(false);
        jPanel1.add(c93);
        c93.setBounds(780, 240, 80, 80);

        c94.setPreferredSize(new java.awt.Dimension(95, 94));
        c94.setRequestFocusEnabled(false);
        jPanel1.add(c94);
        c94.setBounds(780, 330, 80, 80);

        c95.setPreferredSize(new java.awt.Dimension(95, 94));
        c95.setRequestFocusEnabled(false);
        jPanel1.add(c95);
        c95.setBounds(780, 420, 80, 80);

        tableroJ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableroJ.setRequestFocusEnabled(false);
        jPanel1.add(tableroJ);
        tableroJ.setBounds(0, 0, 930, 530);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(109, 121, 933, 533);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(670, 80, 140, 30);

        enviar.setText("Siguiente turno");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar);
        enviar.setBounds(820, 80, 130, 30);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 25)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("1");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setInheritsPopupMenu(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 90, 170, 70);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 48)); // NOI18N
        jLabel3.setText("1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(930, 20, 90, 60);

        jToolBar1.setRollover(true);

        gSBtn.setText("Guardar");
        gSBtn.setFocusable(false);
        gSBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gSBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gSBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gSBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(gSBtn);
        jToolBar1.add(jSeparator2);

        jButton4.setText("Guía");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1052, 25);

        jLabel23.setToolTipText("");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(979, 59, 63, 53);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tablero2.png"))); // NOI18N
        jLabel36.setLabelFor(jLabel2);
        jLabel36.setRequestFocusEnabled(false);
        jLabel36.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel36);
        jLabel36.setBounds(110, 30, 457, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Turno:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(850, 30, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /** Método que, al pulsar el botón "enviar", plantará la planta seleccionada en las coordenadas
     * introducidas por el usuario.
     */
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if (juego.isFinMalo()) finLose();
        juego.getComandos().lecturaComando(jTextField1.getText(), juego);
        juego.actualizar(juego);
        actualizarCasillas();
        jLabel3.setText(Integer.toString(juego.getPartida().getTurno()));
        jLabel2.setText(Integer.toString(juego.getPartida().getSoles()));
        jTextField1.setText(null);
    
        if (juego.getPartida() !=null) if (juego.getTurnosTotales() == juego.getPartida().getTurno()) juego.setFin(true);
        if (juego.isFin()) finWin();
        if (juego.isFinMalo()) finLose();
        
    }//GEN-LAST:event_enviarActionPerformed
    /** Método que, al pulsar "aceptar" en el cuadro de diálogo que aparece una vez 
     * ganas la partida, nos llevará de vuelta al menú del juego guardando los puntos obtenidos.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        juego.getJugador().actualizar(juego.getPartida());
        le.borrarJugador(juego.getJugador().getDNI());
        le.añadirJugador(juego.getJugador());
        juego.getJugador().seTermino();
        try {
            le.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(JuegoI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        gano.dispose();
        MenuJuego mj = new MenuJuego(juego.getJugador());
    }//GEN-LAST:event_jButton2ActionPerformed
    /** Método que, al pulsar "aceptar" en el cuadro de diálogo que aparece una vez 
     * pierdes la partida, nos llevará de vuelta al menú del juego.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        juego.getJugador().actualizar(juego.getPartida());
        juego.getJugador().seTermino();
        le.borrarJugador(juego.getJugador().getDNI());
        le.añadirJugador(juego.getJugador());
        
        try {
            le.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(JuegoI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        perdio.dispose();
        MenuJuego mj = new MenuJuego(juego.getJugador());
    }//GEN-LAST:event_jButton3ActionPerformed
    /** Método que, al pulsar "ayuda", nos abrirá un cuadro de diálogo con la ayuda necesaria para
     * poder jugar la partida.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ayuda.setLocationRelativeTo(this);
        ayuda.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        ayuda.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    /** Método que, al pulsar "aceptar" dentro del cuadro de diálogo de Normas, cerrará el cuadro.
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        normas.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

   /** Método que, al pulsar "aceptar" dentro del cuadro de diálogo de Ayuda, cerrará el cuadro. 
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ayuda.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    /** Método que, al pulsar "aceptar" dentro del cuadro de diálogo que aprece al pulsar el botón de
     * guardar y salir, nos guardará los datos recolectados en la partida y nos llevará de vuelta al
     * menú principal del juego. 
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        juego.getPartida().setEnemigosAparecidos(juego.getTotalEnemigos());
        juego.getJugador().setPartidaNoFin(juego.getPartida());
        le.borrarJugador(juego.getJugador().getDNI());
        le.añadirJugador(juego.getJugador());
        try {
            le.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(JuegoI.class.getName()).log(Level.SEVERE, null, ex);
        }
        MenuJuego mj = new MenuJuego(juego.getJugador());
        this.dispose();
        salirGuardar.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed
    /** Método que, al pulsar "cancelar" dentro del cuadro de diálogo que aparece al pulsar el botón de 
     * guardar y salir, nos cerrará el cuadro y nos llevará de vuelta a la partida
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        salirGuardar.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed
    /** Método que, al pulsar la X en la esquina superior derecha de la pantalla, nos mostrará el cuadro
     * de diálogo de Salir en el centro de la pantalla. 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salir.setLocationRelativeTo(this);
        salir.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    /** Método que, al pulsar Guardar Salir en la esquina superior derecha de la pantalla, nos mostrará 
     * el cuadro de diálogo de Guardar Salir en el centro de la pantalla. 
     */
    private void gSBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gSBtnActionPerformed
        salirGuardar.setLocationRelativeTo(this);
        salirGuardar.setVisible(true);
    }//GEN-LAST:event_gSBtnActionPerformed
    /** Método que, al pulsar "guardar y salir" dentro del cuadro de diálogo que aparece al pulsar la X en la esquina 
     * superior derecha de la pantalla, nos llevará de vuelta al menú principal del juego guardando la partida sin
     * finalizar.
     */
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        juego.getPartida().setEnemigosAparecidos(juego.getTotalEnemigos());
        juego.getJugador().setPartidaNoFin(juego.getPartida());
        le.borrarJugador(juego.getJugador().getDNI());
        le.añadirJugador(juego.getJugador());
        try {
            le.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(JuegoI.class.getName()).log(Level.SEVERE, null, ex);
        }
        MenuJuego mj = new MenuJuego(juego.getJugador());
        this.dispose();
        salir.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed
    /** Método que, al pulsar "canceal" dentro del cuadro de diálogo que aparece al pulsar la X en la esquina 
     * superior derecha de la pantalla, nos cerrará el cuadro para volver a la partida.
     */
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        salir.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed
    /** Método que, al pulsar "salir" dentro del cuadro de diálogo que aparece al pulsar la X en la esquina 
     * superior derecha de la pantalla, nos llevará de vuelta al menú principal del juego. 
     */
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        MenuJuego mj = new MenuJuego(juego.getJugador());
        this.dispose();
        salir.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed
    
    /** Método que guardará los datos y puntos del jugador al ganar una partida.
     */
    public void finWin(){
        enviar.setVisible(false);
        juego.getPartida().ganada();
        juego.getPartida().calcularPuntos();
        gano.setLocationRelativeTo(this);
        gano.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        gano.setVisible(true);
        
    }
    
    /** Método que guardará los datos del jugador al perder una partida.
     */
    public void finLose(){
        enviar.setVisible(false);
        perdio.setLocationRelativeTo(this);
        perdio.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        perdio.setVisible(true);

    }
    
    /** Método que actualizará las casillas del tablero a cada turno que pasa
     * También se incluirán las imágenes relativas al personaje en cada casilla. 
     */
    public void actualizarCasillas(){
        rellenar();
        Tablero t = juego.getPartida().getTablero();
        for (int i = 0; i<t.loncolumna();i++){
            for (int j = 0 ;j<t.lonfila();j++){
                if (t.getTableroPos(j+1, i+1)!= null){
                    if (t.getTableroPos(j+1, i+1) instanceof Girasol ){
                        ImageIcon f = new ImageIcon("src/images/girasol.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof LanzaGuisantes ){
                        ImageIcon f = new ImageIcon("src/images/Lanzagisantes.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof Nuez ){
                        ImageIcon f = new ImageIcon("src/images/nuez.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }

                    else if (t.getTableroPos(j+1, i+1) instanceof ZombieComun){
                        ImageIcon f = new ImageIcon("src/images/zombiecomun.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof Deportista ){
                        ImageIcon f = new ImageIcon("src/images/deportista.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                    else if (t.getTableroPos(j+1, i+1) instanceof Caracubo ){
                        ImageIcon f = new ImageIcon("src/images/caracubo.png");
                        ImageIcon h = new ImageIcon(f.getImage().getScaledInstance(tableroI[i][j].getWidth(), tableroI[i][j].getHeight(), Image.SCALE_DEFAULT));
                        tableroI[i][j].setIcon(h);
                    }
                }
                else tableroI[i][j].setIcon(null);
            }
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ayuda;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c13;
    private javax.swing.JLabel c14;
    private javax.swing.JLabel c15;
    private javax.swing.JLabel c21;
    private javax.swing.JLabel c22;
    private javax.swing.JLabel c23;
    private javax.swing.JLabel c24;
    private javax.swing.JLabel c25;
    private javax.swing.JLabel c31;
    private javax.swing.JLabel c32;
    private javax.swing.JLabel c33;
    private javax.swing.JLabel c34;
    private javax.swing.JLabel c35;
    private javax.swing.JLabel c41;
    private javax.swing.JLabel c42;
    private javax.swing.JLabel c43;
    private javax.swing.JLabel c44;
    private javax.swing.JLabel c45;
    private javax.swing.JLabel c51;
    private javax.swing.JLabel c52;
    private javax.swing.JLabel c53;
    private javax.swing.JLabel c54;
    private javax.swing.JLabel c55;
    private javax.swing.JLabel c61;
    private javax.swing.JLabel c62;
    private javax.swing.JLabel c63;
    private javax.swing.JLabel c64;
    private javax.swing.JLabel c65;
    private javax.swing.JLabel c71;
    private javax.swing.JLabel c72;
    private javax.swing.JLabel c73;
    private javax.swing.JLabel c74;
    private javax.swing.JLabel c75;
    private javax.swing.JLabel c81;
    private javax.swing.JLabel c82;
    private javax.swing.JLabel c83;
    private javax.swing.JLabel c84;
    private javax.swing.JLabel c85;
    private javax.swing.JLabel c91;
    private javax.swing.JLabel c92;
    private javax.swing.JLabel c93;
    private javax.swing.JLabel c94;
    private javax.swing.JLabel c95;
    private javax.swing.JButton enviar;
    private javax.swing.JButton gSBtn;
    private javax.swing.JDialog gano;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog normas;
    private javax.swing.JDialog perdio;
    private javax.swing.JDialog salir;
    private javax.swing.JDialog salirGuardar;
    private javax.swing.JLabel tableroJ;
    // End of variables declaration//GEN-END:variables
}