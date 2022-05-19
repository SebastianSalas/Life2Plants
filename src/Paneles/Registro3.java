package Paneles;

import Ventanas.Registro1;
import Clases.CambiarPanel;
import Clases.CambiarPanel2;
import static Paneles.Registro.TF_Dire;
import static Paneles.Registro.TF_PNombre;
import static Paneles.Registro.TF_Telefono;
import static Ventanas.Registro12.LB_Pnl;
import Ventanas.Registro12;
import rojerusan.RSNotifyShadowAnimated;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author janie
 */
public class Registro3 extends javax.swing.JPanel {

    /**
     * Creates new form Registro
     */
    public Registro3() {
        initComponents();
        LB_Pnl.setText("Datos personales");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelS = new rojerusan.RSPanelsSlider();
        Principal = new javax.swing.JPanel();
        Visualizar = new javax.swing.JPanel();
        BT_Siguiente = new rojerusan.RSButtonHover();
        TF_Dire = new rojerusan.RSMetroTextFullPlaceHolder();
        TF_Telefono = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        TF_PApellido = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel5 = new javax.swing.JLabel();
        TF_PNombre = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_SNombre = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        TF_SApellido = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principal.setName("Principal"); // NOI18N

        Visualizar.setBackground(new java.awt.Color(255, 255, 255));
        Visualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Siguiente.setBackground(new java.awt.Color(74, 141, 124));
        BT_Siguiente.setText("SIGUIENTE");
        BT_Siguiente.setColorHover(new java.awt.Color(75, 167, 145));
        BT_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SiguienteActionPerformed(evt);
            }
        });
        Visualizar.add(BT_Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 130, -1));

        TF_Dire.setForeground(new java.awt.Color(173, 204, 188));
        TF_Dire.setToolTipText("Digite su dirección...");
        TF_Dire.setBorderColor(new java.awt.Color(173, 204, 188));
        TF_Dire.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TF_Dire.setPhColor(new java.awt.Color(84, 100, 92));
        TF_Dire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_DireKeyTyped(evt);
            }
        });
        Visualizar.add(TF_Dire, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 192, -1));

        TF_Telefono.setForeground(new java.awt.Color(173, 204, 188));
        TF_Telefono.setToolTipText("Digite su teléfono...");
        TF_Telefono.setBorderColor(new java.awt.Color(173, 204, 188));
        TF_Telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TF_Telefono.setPhColor(new java.awt.Color(84, 100, 92));
        TF_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_TelefonoKeyTyped(evt);
            }
        });
        Visualizar.add(TF_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 174, -1));

        jLabel2.setFont(new java.awt.Font("Keep Calm Med", 0, 14)); // NOI18N
        jLabel2.setText("Teléfono");
        Visualizar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 29));

        TF_PApellido.setForeground(new java.awt.Color(173, 204, 188));
        TF_PApellido.setToolTipText("Digite su primer apellido...");
        TF_PApellido.setBorderColor(new java.awt.Color(173, 204, 188));
        TF_PApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TF_PApellido.setPhColor(new java.awt.Color(84, 100, 92));
        TF_PApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_PApellidoKeyTyped(evt);
            }
        });
        Visualizar.add(TF_PApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 174, -1));

        jLabel5.setFont(new java.awt.Font("Keep Calm Med", 0, 14)); // NOI18N
        jLabel5.setText("Primer Apellido");
        Visualizar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 29));

        TF_PNombre.setForeground(new java.awt.Color(173, 204, 188));
        TF_PNombre.setToolTipText("Digite su primer nombre...");
        TF_PNombre.setBorderColor(new java.awt.Color(173, 204, 188));
        TF_PNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TF_PNombre.setPhColor(new java.awt.Color(84, 100, 92));
        TF_PNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_PNombreKeyTyped(evt);
            }
        });
        Visualizar.add(TF_PNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 174, -1));

        jLabel3.setFont(new java.awt.Font("Keep Calm Med", 0, 14)); // NOI18N
        jLabel3.setText("Primer Nombre");
        Visualizar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 29));

        jLabel4.setFont(new java.awt.Font("Keep Calm Med", 0, 14)); // NOI18N
        jLabel4.setText("Segundo Nombre");
        Visualizar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 29));

        TF_SNombre.setForeground(new java.awt.Color(173, 204, 188));
        TF_SNombre.setToolTipText("Digite su segundo nombre...");
        TF_SNombre.setBorderColor(new java.awt.Color(173, 204, 188));
        TF_SNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TF_SNombre.setPhColor(new java.awt.Color(84, 100, 92));
        TF_SNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_SNombreKeyTyped(evt);
            }
        });
        Visualizar.add(TF_SNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 192, -1));

        jLabel6.setFont(new java.awt.Font("Keep Calm Med", 0, 14)); // NOI18N
        jLabel6.setText("Segundo Apellido");
        Visualizar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 29));

        TF_SApellido.setForeground(new java.awt.Color(173, 204, 188));
        TF_SApellido.setToolTipText("Digite su segundo apellido...");
        TF_SApellido.setBorderColor(new java.awt.Color(173, 204, 188));
        TF_SApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TF_SApellido.setPhColor(new java.awt.Color(84, 100, 92));
        TF_SApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_SApellidoKeyTyped(evt);
            }
        });
        Visualizar.add(TF_SApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 192, -1));

        jLabel7.setFont(new java.awt.Font("Keep Calm Med", 0, 14)); // NOI18N
        jLabel7.setText("Dirección");
        Visualizar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, 29));

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Visualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addComponent(Visualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelS.add(Principal, "card2");

        add(PanelS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void BT_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SiguienteActionPerformed
        String primer_nombre = TF_PNombre.getText();
        String segundo_nombre = TF_PNombre.getText();
        String primer_apellido = TF_PNombre.getText();
        String segundo_apellido = TF_PNombre.getText();
        String telefono = TF_Telefono.getText();
        String direccion = TF_Dire.getText();
        if((primer_nombre.equals("")) || (segundo_nombre.equals("")) || (primer_apellido.equals("")) ||  (segundo_apellido.equals("")) || (telefono.equals("")) || (direccion.equals("")) ){
         new rojerusan.RSNotifyShadowAnimated("!Advertencia¡",
        "!Faltan campos por llenar!", 
        3, 
        RSNotifyShadowAnimated.PositionNotify.BottomLeft, 
        RSNotifyShadowAnimated.AnimationNotify.LeftRight, 
        RSNotifyShadowAnimated.TypeNotify.WARNING).setVisible(true);
        }
        else{
        this.setVisible(true);
        new CambiarPanel2(Registro12.pnlPrincipal, new Registro4());
        }          
            
    }//GEN-LAST:event_BT_SiguienteActionPerformed

    private void TF_PNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_TF_PNombreKeyTyped

    private void TF_SNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_SNombreKeyTyped
         char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_TF_SNombreKeyTyped

    private void TF_PApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PApellidoKeyTyped
         char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_TF_PApellidoKeyTyped

    private void TF_SApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_SApellidoKeyTyped
         char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_TF_SApellidoKeyTyped

    private void TF_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_TelefonoKeyTyped
         char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_TF_TelefonoKeyTyped

    private void TF_DireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DireKeyTyped
         char c = evt.getKeyChar();
       if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9') && (c!='-') && (c!='.') && (c!='#')) evt.consume();
    }//GEN-LAST:event_TF_DireKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover BT_Siguiente;
    private rojerusan.RSPanelsSlider PanelS;
    private javax.swing.JPanel Principal;
    public static rojerusan.RSMetroTextFullPlaceHolder TF_Dire;
    public static rojerusan.RSMetroTextFullPlaceHolder TF_PApellido;
    public static rojerusan.RSMetroTextFullPlaceHolder TF_PNombre;
    public static rojerusan.RSMetroTextFullPlaceHolder TF_SApellido;
    public static rojerusan.RSMetroTextFullPlaceHolder TF_SNombre;
    public static rojerusan.RSMetroTextFullPlaceHolder TF_Telefono;
    private javax.swing.JPanel Visualizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
