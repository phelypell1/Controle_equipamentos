/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewsClass;

import controller.CarregaTabelas;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import model.EnviaManutencaoBeans;
import Connect_MySql.Connect_MySql;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javafx.scene.input.DataFormat;

/**
 *
 * @author phelype
 */
public final class Manutenção extends javax.swing.JFrame {

    /**
     * Creates new form Manutenção
     */
    public Manutenção() {
        initComponents();
        ListarEnvios();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnviados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistorioco = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCodRemesa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textPatrimonio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textSut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textDefeito = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textObs = new javax.swing.JEditorPane();
        jLabel9 = new javax.swing.JLabel();
        textData = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textTransportadora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textDestinatario = new javax.swing.JTextField();
        btnRegistraEnv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção Equipamentos.");
        setResizable(false);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensSystem/buscar-png-4(1).png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblEnviados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cód. Remessa.:", "Marca.:", "Modelo.:", "Patrimônio.:", "SUT.:", "Defeito.:", "Obs.:", "Envio.:", "Transportadora.:", "Empresa.:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnviados.setToolTipText("");
        tblEnviados.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblEnviados.setSelectionForeground(new java.awt.Color(255, 193, 37));
        tblEnviados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEnviadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEnviados);
        if (tblEnviados.getColumnModel().getColumnCount() > 0) {
            tblEnviados.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        tblHistorioco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblHistorioco);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 20, 17);
        jPanel1.add(textId);
        textId.setBounds(10, 30, 40, 29);

        jLabel2.setText("Cód Remesa.:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 100, 17);
        jPanel1.add(textCodRemesa);
        textCodRemesa.setBounds(10, 80, 110, 29);

        jLabel3.setText("Marca.:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 110, 50, 17);
        jPanel1.add(textMarca);
        textMarca.setBounds(10, 130, 110, 29);

        jLabel4.setText("Modelo.:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 60, 17);
        jPanel1.add(textModelo);
        textModelo.setBounds(10, 180, 110, 29);

        jLabel5.setText("Patrimônio.:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 210, 90, 17);
        jPanel1.add(textPatrimonio);
        textPatrimonio.setBounds(10, 230, 110, 29);

        jLabel6.setText("SUT.:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 260, 50, 17);
        jPanel1.add(textSut);
        textSut.setBounds(10, 280, 110, 29);

        jLabel7.setText("Defeito.:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 310, 60, 17);
        jPanel1.add(textDefeito);
        textDefeito.setBounds(10, 330, 110, 29);

        jLabel8.setText("Obs.:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 360, 80, 17);

        jScrollPane3.setViewportView(textObs);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 380, 190, 50);

        jLabel9.setText("Data envio.:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 440, 100, 17);
        jPanel1.add(textData);
        textData.setBounds(10, 460, 100, 29);

        jLabel10.setText("Transportadora.:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 490, 120, 17);
        jPanel1.add(textTransportadora);
        textTransportadora.setBounds(10, 510, 120, 29);

        jLabel11.setText("Destinatário.:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 540, 100, 17);
        jPanel1.add(textDestinatario);
        textDestinatario.setBounds(10, 560, 120, 29);

        btnRegistraEnv.setText("Registrar Manutenção");
        btnRegistraEnv.setHideActionText(true);
        btnRegistraEnv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistraEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraEnvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistraEnv))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistraEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(995, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public void ListarEnvios(){
        DefaultTableModel table = (DefaultTableModel) tblEnviados.getModel();
        CarregaTabelas tbls = new CarregaTabelas();
        table.setNumRows(0);
        for(EnviaManutencaoBeans env : tbls.List()){
            table.addRow(new Object[]{
                env.getId(),
                env.getCod_remesa(),
                env.getMdi_imp(),
                env.getMdm_id(),
                env.getPatrimonio(),
                env.getSut(),
                env.getDefeito(),
                env.getObs(),
                env.getData_envio(),
                env.getTransporte(),
                env.getDestinatario(),
            });
            }
        }
   public void Consulta(String valor){
        DefaultTableModel table = (DefaultTableModel) tblEnviados.getModel();
        CarregaTabelas tbls = new CarregaTabelas();
        table.setNumRows(0);
        for(EnviaManutencaoBeans env : tbls.BuscaTabela(valor)){
            table.addRow(new Object[]{
                env.getId(),
                env.getCod_remesa(),
                env.getMdi_imp(),
                env.getMdm_id(),
                env.getPatrimonio(),
                env.getSut(),
                env.getDefeito(),
                env.getObs(),
                env.getData_envio(),
                env.getTransporte(),
                env.getDestinatario(),
            });
            }
        }
    private void btnRegistraEnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraEnvActionPerformed
      
    }//GEN-LAST:event_btnRegistraEnvActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Consulta(textBusca.getText());
        
           
            
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblEnviadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEnviadosMouseClicked
       if(tblEnviados.getSelectedRow() != -1){
           textId.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 0).toString());
           textCodRemesa.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 1).toString());
           textMarca.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 2).toString());
           textModelo.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 3).toString());
           textPatrimonio.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 4).toString());
           textSut.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 5).toString());
           textDefeito.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 6).toString());
           textObs.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 7).toString().toString());
           textData.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 8).toString());
           textTransportadora.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(),9).toString());
           textDestinatario.setText(tblEnviados.getValueAt(tblEnviados.getSelectedRow(), 10).toString());
       }
    }//GEN-LAST:event_tblEnviadosMouseClicked

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
            java.util.logging.Logger.getLogger(Manutenção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manutenção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manutenção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manutenção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manutenção().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistraEnv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblEnviados;
    private javax.swing.JTable tblHistorioco;
    private javax.swing.JTextField textBusca;
    private javax.swing.JTextField textCodRemesa;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textDefeito;
    private javax.swing.JTextField textDestinatario;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    private javax.swing.JEditorPane textObs;
    private javax.swing.JTextField textPatrimonio;
    private javax.swing.JTextField textSut;
    private javax.swing.JTextField textTransportadora;
    // End of variables declaration//GEN-END:variables
}
