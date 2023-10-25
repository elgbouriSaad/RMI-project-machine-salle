/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lachgar
 */
public class SalleForm extends javax.swing.JInternalFrame {

  
    IDao<Salle> daos = null;
    DefaultTableModel model = null;
    private int id;
     
    
    

    /**
     * Creates new form MachineForm
     */
     
     
           
     
    public void load(){
        try {
            model.setRowCount(0);
            for(Salle s : daos.findAll())
                model.addRow(new Object[]{
                    s.getId(),
                    s.getCode()
                    
                });
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public SalleForm() {
        initComponents();
        
       
        
        model = (DefaultTableModel) listsalle.getModel();
        try {
        
            daos = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/salle");
            
            
        } catch (NotBoundException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        model = (DefaultTableModel) listsalle.getModel();
        
        load();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bnAdd = new javax.swing.JButton();
        bnUpdate = new javax.swing.JButton();
        bnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listsalle = new javax.swing.JTable();

        setBackground(java.awt.Color.black);
        setClosable(true);
        setForeground(new java.awt.Color(0, 153, 153));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion des Salles");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations machine"));

        jLabel1.setText("Code: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 75, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        bnAdd.setText("Add");
        bnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddActionPerformed(evt);
            }
        });

        bnUpdate.setText("Edit");
        bnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnUpdateActionPerformed(evt);
            }
        });

        bnDelete.setText("Delete");
        bnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(bnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bnAdd)
                .addGap(18, 18, 18)
                .addComponent(bnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bnDelete)
                .addContainerGap())
        );

        listsalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Code"
            }
        ));
        listsalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listsalleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listsalleMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listsalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Informations Salle");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddActionPerformed
        try {
            // TODO add your handling code here:
            String code = txtCode.getText().toString();
        
            daos.create(new Salle(code));
            load();
        } catch (Exception ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_bnAddActionPerformed

    private void bnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnUpdateActionPerformed
        
         int selectedRow = listsalle.getSelectedRow();
         
        if (selectedRow >= 0) {
        int id = Integer.parseInt(model.getValueAt(selectedRow, 0).toString()); 
        String code = txtCode.getText();
     
        try {
            
          
            Salle s = daos.findById(id);
            s.setCode(code);
          

            boolean updated = daos.update(s);

            if (updated) {
                txtCode.setText("");
              
                load();
            } 
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
                                     

            }
    }//GEN-LAST:event_bnUpdateActionPerformed

    private void bnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeleteActionPerformed

           int reponse=JOptionPane.showConfirmDialog(this, "vous voulez vraiment supprimer cette Salle ?");
       
          if(reponse==0)
              
          {    try {
              if(daos.delete(daos.findById(id)))
              {
                  
                  JOptionPane.showMessageDialog(this, "Salle  supprimee !!");
                      txtCode.setText("");
                  
                     
                  load();
              }   } catch (RemoteException ex) {
                   Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
               }
       }
        
        
        
    }//GEN-LAST:event_bnDeleteActionPerformed

    private void listsalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listsalleMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_listsalleMousePressed

    private void listsalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listsalleMouseClicked
        id=Integer.parseInt(model.getValueAt(listsalle.getSelectedRow(), 0).toString());
        if( id !=0 )
        {
           txtCode.setText(model.getValueAt(listsalle.getSelectedRow(), 1).toString());
         
          
        }
    }//GEN-LAST:event_listsalleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAdd;
    private javax.swing.JButton bnDelete;
    private javax.swing.JButton bnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable listsalle;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}