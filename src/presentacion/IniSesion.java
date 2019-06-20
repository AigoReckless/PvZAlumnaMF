package presentacion;

import logica.Jugador;
import logica.Fichero;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ImageIcon;


public class IniSesion extends javax.swing.JFrame {
    /** Atributo que relaciona ciertos componentes del inicio con la interfaz*/
    private MenuInicio inicio;
    /** Atributo que permite leer los datos del jugador*/
    private Fichero lecEscr;
    
    /** Constructor de IniSesión
     * @param inicio pantalla de inicio
     * @throws java.io.FileNotFoundException señala que un intento de abrir el archivo
        * indicado por un nombre de ruta especificado ha fallado
     * @throws java.lang.ClassNotFoundException se lanza cuando una aplicación intenta cargar en una clase a través de su 
         * nombre de cadena usando ciertos métodos de los cuales no se puede encontrar una para la clase con el nombre especificado.
     */
    public IniSesion( MenuInicio inicio) throws IOException, FileNotFoundException, ClassNotFoundException {
        this.inicio = inicio;
        lecEscr = new Fichero();
        
        initComponents();
 
        this.setLocationRelativeTo(this.inicio);
        this.setVisible(true);
        
        this.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        fallo.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        iniS.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        
        lecEscr.leerDatos();
        fallo.setLocationRelativeTo(this);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        iniS = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dialogo = new javax.swing.JLabel();
        fallo = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fail = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        inise = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        iniS.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        iniS.setMinimumSize(new java.awt.Dimension(490, 193));
        iniS.getContentPane().setLayout(null);
        iniS.getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 30, 400, 40);
        iniS.getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 50, 200, 40);

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Quieres iniciar sesión?");
        iniS.getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 80, 200, 30);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        iniS.getContentPane().add(jButton2);
        jButton2.setText("Sí");
        jButton2.setBounds(80, 110, 68, 32);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        iniS.getContentPane().add(jButton3);
        jButton3.setText("No");
        jButton3.setBounds(330, 110, 73, 32);

        // NOI18N
        iniS.getContentPane().add(dialogo);
        dialogo.setBounds(0, 0, 500, 193);

        fallo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        fallo.setMinimumSize(new java.awt.Dimension(490, 193));
        fallo.getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("El DNI que has indicado no está registrado o es erróneo.");
        fallo.getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 60, 400, 24);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        fallo.getContentPane().add(jButton4);
        jButton4.setBounds(190, 130, 90, 30);

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Debes registrarte primero.");
        fallo.getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 90, 280, 30);

       // NOI18N
        fallo.getContentPane().add(fail);
        fail.setBounds(0, 0, 490, 193);

        label1.setText("label1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        inise.setMaximumSize(new java.awt.Dimension(678, 427));
        inise.setMinimumSize(new java.awt.Dimension(678, 427));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(240, 240));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 70, 140, 30);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar);
        aceptar.setBounds(140, 180, 210, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Introduce tu DNI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 80, 130, 14);

        setBounds(0, 0, 485, 311);
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /** Método que nos mosotrará los cuadros de diálogo correspondientes (si funciona 
     * correctamente o si hay algún fallo) al puslar el botón aceptar
     */
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String dni = jTextField1.getText().toUpperCase();
        if (lecEscr.buscarJugador(dni)!= null){
            Jugador j = lecEscr.buscarJugador(dni);
            iniS.setLocationRelativeTo(this);
            iniS.setVisible(true);
        }
        else fallo.setVisible(true);
        
    }//GEN-LAST:event_aceptarActionPerformed
    /** Método que te llevará al menú principal del juego al pulsar "sí" (jButton2) en el
     * cuadro de diálogo emergente al confirmar el inicio de sesión
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String dni = jTextField1.getText().toUpperCase();
        Jugador j = lecEscr.buscarJugador(dni);
        MenuJuego mj = new MenuJuego(j);
        inicio.dispose();
        this.dispose();
        iniS.dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    /** Método que cerrará el cuadro de diálogo emergente para denegar la opción
     * a entrar al menú principal del juego pulsando "no" (jButton3)
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        iniS.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    /** Método que cerrará el cuadro de diálogo emergente al pulsar "aceptar" (jButton4) 
     * debido a un fallo en el inicio de sesión
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        fallo.dispose();
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel dialogo;
    private javax.swing.JLabel fail;
    private javax.swing.JDialog fallo;
    private javax.swing.JDialog iniS;
    private javax.swing.JLabel inise;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
