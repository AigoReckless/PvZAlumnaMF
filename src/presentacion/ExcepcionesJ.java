
package presentacion;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase-interfaz ExcepcionesJ nos mostrará cuadros de diálogo cuando se presente una excepción en la partida*/
public class ExcepcionesJ extends javax.swing.JDialog {

    /** Constructor de Excepciones
     * @param parent
     * @param modal
     * @param t
     */
    public ExcepcionesJ(java.awt.Frame parent, boolean modal,int t) {
        super(parent, modal);
        initComponents();
        
        
        jDialog1.setLocationRelativeTo(parent);
        jDialog2.setLocationRelativeTo(parent);
        jDialog3.setLocationRelativeTo(parent);
        jDialog4.setLocationRelativeTo(parent);
        jDialog1.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        jDialog2.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        jDialog3.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        jDialog4.setIconImage(new ImageIcon("src/images/icono.png").getImage());
        if (t==1)jDialog1.setVisible(true);
        if (t==2)jDialog2.setVisible(true);
        if (t==3)jDialog3.setVisible(true);
        if (t==4)jDialog4.setVisible(true);
        
        ImageIcon dSoles = new ImageIcon("src/images/dialogo.jpg");
        ImageIcon soles = new ImageIcon(dSoles.getImage().getScaledInstance(dialogo1.getWidth(), dialogo1.getHeight(),Image.SCALE_DEFAULT));
        dialogo1.setIcon(soles);
        
        ImageIcon dCas = new ImageIcon("src/images/dialogo.jpg");
        ImageIcon casillas = new ImageIcon(dCas.getImage().getScaledInstance(dialogo3.getWidth(), dialogo3.getHeight(),Image.SCALE_DEFAULT));
        dialogo3.setIcon(casillas);
        
        ImageIcon dOcu = new ImageIcon("src/images/dialogo.jpg");
        ImageIcon ocupada = new ImageIcon(dOcu.getImage().getScaledInstance(dialogo2.getWidth(), dialogo2.getHeight(),Image.SCALE_DEFAULT));
        dialogo2.setIcon(ocupada);
        
        ImageIcon dCom = new ImageIcon("src/images/dialogo.jpg");
        ImageIcon comando = new ImageIcon(dCom.getImage().getScaledInstance(dialogo4.getWidth(), dialogo4.getHeight(),Image.SCALE_DEFAULT));
        dialogo4.setIcon(comando);

    }

    public ExcepcionesJ(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dialogo1 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dialogo2 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dialogo3 = new javax.swing.JLabel();
        jDialog4 = new javax.swing.JDialog();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dialogo4 = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(490, 193));
        jDialog1.getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NO TIENES SUFICIENTES SOLES PARA ESO");
        jDialog1.getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 70, 380, 40);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton1);
        jButton1.setBounds(200, 130, 90, 30);
        jDialog1.getContentPane().add(dialogo1);
        dialogo1.setBounds(0, 0, 490, 190);

        jDialog2.setMinimumSize(new java.awt.Dimension(490, 193));
        jDialog2.getContentPane().setLayout(null);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDialog2.getContentPane().add(jButton2);
        jButton2.setBounds(190, 120, 110, 40);

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("ESTA CASILLA ESTA OCUPADA PRUEBA CON OTRA ");
        jDialog2.getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 50, 470, 80);

        dialogo2.setPreferredSize(new java.awt.Dimension(490, 193));
        jDialog2.getContentPane().add(dialogo2);
        dialogo2.setBounds(0, 0, 490, 193);

        jDialog3.setMinimumSize(new java.awt.Dimension(500, 200));
        jDialog3.getContentPane().setLayout(null);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(jButton3);
        jButton3.setBounds(190, 130, 100, 30);

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESA CASILLA NO EXISTE PRUEBA CON OTRA");
        jDialog3.getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 70, 403, 24);
        jDialog3.getContentPane().add(dialogo3);
        dialogo3.setBounds(0, 0, 490, 193);

        jDialog4.setMinimumSize(new java.awt.Dimension(500, 200));
        jDialog4.getContentPane().setLayout(null);

        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDialog4.getContentPane().add(jButton4);
        jButton4.setBounds(190, 130, 100, 30);

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("El comando introducido no es valido ");
        jDialog4.getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 70, 332, 28);

        jLabel6.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Puedes consultar la ayuda");
        jDialog4.getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 90, 280, 28);

        dialogo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dialogo.jpg"))); // NOI18N
        jDialog4.getContentPane().add(dialogo4);
        dialogo4.setBounds(0, 0, 490, 193);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /** Método que cierra el diálogo correspondiente al pulsar jButton1 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        jDialog1.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /** Método que cierra el diálogo correspondiente al pulsar jButton2
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        jDialog2.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    /** Método que cierra el diálogo correspondiente al pulsar jButton3
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        jDialog3.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    /** Método que cierra el diálogo correspondiente al pulsar jButton4
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        jDialog4.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dialogo1;
    private javax.swing.JLabel dialogo2;
    private javax.swing.JLabel dialogo3;
    private javax.swing.JLabel dialogo4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
