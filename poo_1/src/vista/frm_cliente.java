/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import modelo.Cliente;
import modelo.Empleado;
/**
 *
 * @author user
 */
public class frm_cliente extends javax.swing.JFrame {

    /**
     * Creates new form frm_cliente
     */
    public frm_cliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_nit = new javax.swing.JLabel();
        txt_cnit = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_cnombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_capellido = new javax.swing.JTextField();
        lbl_cdireccion = new javax.swing.JLabel();
        txt_cdireccion = new javax.swing.JTextField();
        lbl_ctelefono = new javax.swing.JLabel();
        txt_ctelefono = new javax.swing.JTextField();
        txt_cfn = new javax.swing.JTextField();
        lbl_cfn = new javax.swing.JLabel();
        btn_caceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_etelefono = new javax.swing.JTextField();
        txt_efn = new javax.swing.JTextField();
        lbl_efn = new javax.swing.JLabel();
        btn_caceptar1 = new javax.swing.JButton();
        lbl_enombre = new javax.swing.JLabel();
        txt_enombre = new javax.swing.JTextField();
        lbl_eapellido = new javax.swing.JLabel();
        txt_eapellido = new javax.swing.JTextField();
        lbl_edireccion = new javax.swing.JLabel();
        lbl_ecodigo = new javax.swing.JLabel();
        txt_ecodigo = new javax.swing.JTextField();
        txt_edireccion = new javax.swing.JTextField();
        lbl_etelefono = new javax.swing.JLabel();
        lbl_epuesto = new javax.swing.JLabel();
        txt_epuesto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nit.setText("nit");

        lbl_nombre.setText("nombre");

        lbl_apellido.setText("apellido");

        lbl_cdireccion.setText("direccion");

        lbl_ctelefono.setText("telefono");

        lbl_cfn.setText("fecha nacimiento");

        btn_caceptar.setText("aceptar");
        btn_caceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_caceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_cdireccion)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cdireccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_cfn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cfn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_ctelefono)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ctelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_caceptar)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_apellido)
                                .addGap(18, 18, 18)
                                .addComponent(txt_capellido, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nombre)
                                    .addComponent(lbl_nit))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cnombre)
                                    .addComponent(txt_cnit))))
                        .addGap(246, 246, 246))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit)
                    .addComponent(txt_cnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_cnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(txt_capellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cdireccion)
                    .addComponent(txt_cdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ctelefono)
                    .addComponent(txt_ctelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cfn)
                    .addComponent(txt_cfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_caceptar))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        lbl_efn.setText("fecha nacimiento");

        btn_caceptar1.setText("aceptar");
        btn_caceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_caceptar1ActionPerformed(evt);
            }
        });

        lbl_enombre.setText("nombre");

        lbl_eapellido.setText("apellido");

        lbl_edireccion.setText("direccion");

        lbl_ecodigo.setText("codigo");

        lbl_etelefono.setText("telefono");

        lbl_epuesto.setText("puesto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_edireccion)
                                .addGap(18, 18, 18)
                                .addComponent(txt_edireccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_efn)
                                .addGap(18, 18, 18)
                                .addComponent(txt_efn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_etelefono)
                                .addGap(18, 18, 18)
                                .addComponent(txt_etelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_caceptar1)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_eapellido)
                                .addGap(18, 18, 18)
                                .addComponent(txt_eapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_enombre)
                                    .addComponent(lbl_ecodigo))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_enombre)
                                    .addComponent(txt_ecodigo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_epuesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_epuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(246, 246, 246))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ecodigo)
                    .addComponent(txt_ecodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_epuesto)
                    .addComponent(txt_epuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_enombre)
                    .addComponent(txt_enombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_eapellido)
                    .addComponent(txt_eapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_edireccion)
                    .addComponent(txt_edireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_etelefono)
                    .addComponent(txt_etelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_efn)
                    .addComponent(txt_efn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_caceptar1))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_caceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_caceptarActionPerformed
        // TODO add your handling code here:
        Cliente obj_cliente = new Cliente();
        obj_cliente.setNit(this.txt_cnit.getText());
        obj_cliente.setNombre(this.txt_cnombre.getText());
        obj_cliente.setApellido(this.txt_eapellido.getText());
        obj_cliente.setDireccion(this.txt_cdireccion.getText());
        obj_cliente.setTelefono(this.txt_ctelefono.getText());
        obj_cliente.setFecha_nacimiento(this.txt_cfn.getText());
        obj_cliente.agregar();
    }//GEN-LAST:event_btn_caceptarActionPerformed

    private void btn_caceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_caceptar1ActionPerformed
        // TODO add your handling code here:
         Empleado obj_empleado = new Empleado();
         obj_empleado.setCodigo_empleado(this.txt_ecodigo.getText());
         obj_empleado.setPuesto(this.txt_epuesto.getText());
         obj_empleado.setNombre(this.txt_enombre.getText());
         obj_empleado.setApellido(this.txt_eapellido.getText());
         obj_empleado.setDireccion(this.txt_edireccion.getText());
         obj_empleado.setTelefono(this.txt_etelefono.getText());
         obj_empleado.setFecha_nacimiento(this.txt_efn.getText());
         obj_empleado.agregar();
    }//GEN-LAST:event_btn_caceptar1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_caceptar;
    private javax.swing.JButton btn_caceptar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cdireccion;
    private javax.swing.JLabel lbl_cfn;
    private javax.swing.JLabel lbl_ctelefono;
    private javax.swing.JLabel lbl_eapellido;
    private javax.swing.JLabel lbl_ecodigo;
    private javax.swing.JLabel lbl_edireccion;
    private javax.swing.JLabel lbl_efn;
    private javax.swing.JLabel lbl_enombre;
    private javax.swing.JLabel lbl_epuesto;
    private javax.swing.JLabel lbl_etelefono;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JTextField txt_capellido;
    private javax.swing.JTextField txt_cdireccion;
    private javax.swing.JTextField txt_cfn;
    private javax.swing.JTextField txt_cnit;
    private javax.swing.JTextField txt_cnombre;
    private javax.swing.JTextField txt_ctelefono;
    private javax.swing.JTextField txt_eapellido;
    private javax.swing.JTextField txt_ecodigo;
    private javax.swing.JTextField txt_edireccion;
    private javax.swing.JTextField txt_efn;
    private javax.swing.JTextField txt_enombre;
    private javax.swing.JTextField txt_epuesto;
    private javax.swing.JTextField txt_etelefono;
    // End of variables declaration//GEN-END:variables
}
