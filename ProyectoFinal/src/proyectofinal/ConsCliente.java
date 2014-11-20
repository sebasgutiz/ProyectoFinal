/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class ConsCliente extends javax.swing.JFrame {

    /**
     * Creates new form ConsCliente
     */
    public ConsCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        btDelCs = new javax.swing.JButton();
        btModCs = new javax.swing.JButton();
        btAtrasCs = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel1.setText("Consulta General");

        btDelCs.setText("Eliminar");
        btDelCs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelCsActionPerformed(evt);
            }
        });

        btModCs.setText("Modificar");
        btModCs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModCsActionPerformed(evt);
            }
        });

        btAtrasCs.setText("Atras");
        btAtrasCs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasCsActionPerformed(evt);
            }
        });

        jtConsulta.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Direccion", "Telefono", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAtrasCs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btModCs)
                                .addGap(32, 32, 32)
                                .addComponent(btDelCs)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtrasCs)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btDelCs)
                        .addComponent(btModCs)))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Mostrar();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btAtrasCsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasCsActionPerformed
        this.setVisible(false);
        new MenuPpal().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtrasCsActionPerformed

    private void btModCsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModCsActionPerformed
        //TODO add your handling code here:

    }//GEN-LAST:event_btModCsActionPerformed

    private void btDelCsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelCsActionPerformed
//        if (this.jlVentana.getSelectedIndex() >= 0 && this.jlVentana.getSelectedIndex() < this.modelo.size()) {
//            
//        } else {
//            JOptionPane.showMessageDialog(this, "NO HAY UN CONTACTO SELECCIONADO","Error",JOptionPane.ERROR_MESSAGE);
//        }  
//        // TODO add your handling code here:
    }//GEN-LAST:event_btDelCsActionPerformed

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
            java.util.logging.Logger.getLogger(ConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtrasCs;
    private javax.swing.JButton btDelCs;
    private javax.swing.JButton btModCs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtConsulta;
    // End of variables declaration//GEN-END:variables
    private BaseDatos bd;
    private DefaultTableModel modelo = new DefaultTableModel();

    public void Mostrar() {
        generaMatrizDatos();

    }

    /**
     * @return the bd
     */
    public BaseDatos getBd() {
        return bd;
    }

    /**
     * @param bd the bd to set
     */
    public void setBd(BaseDatos bd) {
        this.bd = bd;
    }

    /**
     * @return the modelo
     */
    public DefaultTableModel getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public void generaMatrizDatos() {
        ArrayList lista = bd.getClientes();
        Object[][] matriz = new Object[lista.size()][5];
        for (int i = 0; i < lista.size(); i++) {
            Cliente cTemp = (Cliente) lista.get(i);

            matriz[i][0] = cTemp.getIdCliente();
            matriz[i][1] = cTemp.getNomCliente();
            matriz[i][2] = cTemp.getDirCliente();
            matriz[i][3] = cTemp.getTelCliente();
            matriz[i][4] = cTemp.getEmailCliente();

        }
        String[] identificadores = new String[]{"Id", "Nombre", "Direccion", "Telefono", "Email"};
        modelo.setDataVector(matriz, identificadores);
        jtConsulta.setModel(modelo);
    }
}
