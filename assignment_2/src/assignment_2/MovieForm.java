/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

/**
 *
 * @author Taylor Johnson
 * date - 10/17/17
 */
public class MovieForm extends javax.swing.JDialog {

    /**
     * Creates new form MovieForm
     */
    public MovieForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        pnlDeclare = new javax.swing.JPanel();
        txtDeclare = new javax.swing.JTextField();
        btnDeclare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tareaView = new javax.swing.JTextArea();
        pnlEditor = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblRating = new javax.swing.JLabel();
        txtRating = new javax.swing.JTextField();
        lblRuntime = new javax.swing.JLabel();
        txtRuntime = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblFormat = new javax.swing.JLabel();
        txtFormat = new javax.swing.JTextField();
        lblRecord = new javax.swing.JLabel();
        btnRight = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlDeclare.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Size", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnDeclare.setText("Declare");
        btnDeclare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDeclareLayout = new javax.swing.GroupLayout(pnlDeclare);
        pnlDeclare.setLayout(pnlDeclareLayout);
        pnlDeclareLayout.setHorizontalGroup(
            pnlDeclareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeclareLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(txtDeclare, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeclare)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDeclareLayout.setVerticalGroup(
            pnlDeclareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeclareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDeclareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeclare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeclare))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tareaView.setEditable(false);
        tareaView.setColumns(20);
        tareaView.setRows(5);
        jScrollPane1.setViewportView(tareaView);

        pnlEditor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movie Detaills Editor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Title:");

        txtTitle.setEnabled(false);

        lblRating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRating.setText("Rating:");

        txtRating.setEnabled(false);

        lblRuntime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRuntime.setText("Runtime:");

        txtRuntime.setEnabled(false);

        lblYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblYear.setText("Release Year:");

        txtYear.setEnabled(false);

        lblFormat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFormat.setText("Format:");

        txtFormat.setEnabled(false);

        lblRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecord.setText("0/0");

        btnRight.setText(">");
        btnRight.setEnabled(false);
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        btnLeft.setText("<");
        btnLeft.setEnabled(false);
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlEditorLayout = new javax.swing.GroupLayout(pnlEditor);
        pnlEditor.setLayout(pnlEditorLayout);
        pnlEditorLayout.setHorizontalGroup(
            pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditorLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitle)
                        .addContainerGap())
                    .addGroup(pnlEditorLayout.createSequentialGroup()
                        .addGroup(pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEditorLayout.createSequentialGroup()
                                .addComponent(lblRating)
                                .addGap(18, 18, 18)
                                .addComponent(txtRating))
                            .addGroup(pnlEditorLayout.createSequentialGroup()
                                .addComponent(lblYear)
                                .addGap(18, 18, 18)
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEditorLayout.createSequentialGroup()
                                .addComponent(lblFormat)
                                .addGap(18, 18, 18)
                                .addComponent(txtFormat))
                            .addGroup(pnlEditorLayout.createSequentialGroup()
                                .addComponent(lblRuntime)
                                .addGap(18, 18, 18)
                                .addComponent(txtRuntime, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRight)
                .addGap(262, 262, 262))
            .addGroup(pnlEditorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlEditorLayout.setVerticalGroup(
            pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRating)
                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRuntime)
                    .addComponent(txtRuntime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormat)
                    .addComponent(txtFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecord)
                    .addComponent(btnRight)
                    .addComponent(btnLeft))
                .addContainerGap())
        );

        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txtSearch.setEnabled(false);

        btnSearch.setText("Search");
        btnSearch.setEnabled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDeclare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEditor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDeclare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClose))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //updates selected record in list
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int year;
        int runtime;
        String format = txtFormat.getText();
        String name = txtTitle.getText();
        String rating = txtRating.getText();
        
        //validates integers
        try {
            year = Integer.parseInt(txtYear.getText());
            runtime = Integer.parseInt(txtRuntime.getText());
        }
        catch (Exception e) {
            lblMessage.setText("Movie runtime and year must be integers");
            return;
        }
        
        //validates Strings
        if (format.trim().isEmpty() || name.trim().isEmpty() || rating.trim().isEmpty()) {
            lblMessage.setText("Please have something in the title, rating, and rating fields");
            return;
        }
        else
            lblMessage.setText("");
        
        //validate update to ensure record is present
        try {
            //find and update movie
            if (myList.updateMovie(name, rating, year, runtime, format)) {
                lblMessage.setText(name + " was updated");
                refreshView();
            }
            else {
                lblMessage.setText(name + " could not be found");
            }
        }
        catch (Exception e) {
            lblMessage.setText("You can only update a record that exists.");
            return;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    //closes GUI
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    //declares list size
    private void btnDeclareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclareActionPerformed
        //validates declaration input
        //outputs message, if caught
        try {
            int amount = Integer.parseInt(txtDeclare.getText());

            //needed, as the input 0 doesn't raise an exception
            if (amount <= 0) {
                lblMessage.setText(amount + " is not valid, please use a number greater than 0");
                return;
            }
            else
                lblMessage.setText("");

            myList = new MovieList(amount);

            lblRecord.setText(recordTracker + "/" + amount);
        }
        catch (Exception e) {
            lblMessage.setText("Incorrect input for declaration. Please input a number greater than 0");
            return;
        }
        
        refreshView();
        
        //disables declare objects and enables everything else in the GUI
        //disable
        btnDeclare.setEnabled(false);
        txtDeclare.setEditable(false);
        //enable
        txtSearch.setEnabled(true);
        btnSearch.setEnabled(true);
        txtTitle.setEnabled(true);
        txtRating.setEnabled(true);
        txtRuntime.setEnabled(true);
        txtYear.setEnabled(true);
        txtFormat.setEnabled(true);
        btnLeft.setEnabled(true);
        btnRight.setEnabled(true);
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_btnDeclareActionPerformed

    //creates record in list
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int year;
        int runtime;
        String format = txtFormat.getText();
        String name = txtTitle.getText();
        String rating = txtRating.getText();
        
        //validates integers
        try {
            year = Integer.parseInt(txtYear.getText());
            runtime = Integer.parseInt(txtRuntime.getText());
        }
        catch (Exception e) {
            lblMessage.setText("Movie runtime and year must be integers");
            return;
        }
        
        //validates Strings
        if (format.trim().isEmpty() || name.trim().isEmpty() || rating.trim().isEmpty()) {
            lblMessage.setText("Please have something in the title, rating, and rating fields");
            return;
        }
        else
            lblMessage.setText("");
        
        //validates create to ensure enough space
        try {
            myList.createMovie(name, rating, year, runtime, format);
        }
        catch (Exception e) {
            lblMessage.setText("List is full, cannot add another record. Please delete one to add another.");
        }
        
        refreshView();
    }//GEN-LAST:event_btnAddActionPerformed

    //deletes selected record in list
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String name = txtTitle.getText();
        
        //find and delete movie
        if (myList.deleteMovie(name)) {
            lblMessage.setText(name + " was deleted");
            refreshView();
        }
        else {
            lblMessage.setText(name + " could not be found");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //moves selection down one
    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        recordTracker--;
        
        //prevents user from going out of bounds
        if (recordTracker <= 0) {
            recordTracker++;
            lblMessage.setText("Cannot go to position 0, as it does not exist");
            return;
        }
        else
            lblMessage.setText("");
        
        lblRecord.setText(recordTracker + "/" + myList.getCapacity());
        
        String name = myList.getMovieListMovieName(recordTracker - 1);
        String rating = myList.getMovieListMovieRating(recordTracker - 1);
        int year = myList.getMovieListMovieReleaseYear(recordTracker - 1);
        int runtime = myList.getMovieListMovieRuntime(recordTracker - 1);
        String format = myList.getMovieListMovieFormat(recordTracker - 1);
        
        txtTitle.setText(name);
        txtRating.setText(rating);
        txtRuntime.setText(Integer.toString(runtime));
        txtYear.setText(Integer.toString(year));
        txtFormat.setText(format);
        
        refreshView();
    }//GEN-LAST:event_btnLeftActionPerformed

    //moves selection up one
    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        recordTracker++;
        
        //prevents user from going out of bounds
        if (recordTracker > myList.getCapacity()) {
            recordTracker--;
            lblMessage.setText("Cannot go to position " + (myList.getCapacity() + 1) + ", as it does not exist");
            return;
        }
        else
            lblMessage.setText("");
        
        lblRecord.setText(recordTracker + "/" + myList.getCapacity());
        
        String name = myList.getMovieListMovieName(recordTracker - 1);
        String rating = myList.getMovieListMovieRating(recordTracker - 1);
        int year = myList.getMovieListMovieReleaseYear(recordTracker - 1);
        int runtime = myList.getMovieListMovieRuntime(recordTracker - 1);
        String format = myList.getMovieListMovieFormat(recordTracker - 1);
        
        txtTitle.setText(name);
        txtRating.setText(rating);
        txtRuntime.setText(Integer.toString(runtime));
        txtYear.setText(Integer.toString(year));
        txtFormat.setText(format);
        
        refreshView();
    }//GEN-LAST:event_btnRightActionPerformed

    //seaches list by movie name
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String nameSearch = txtSearch.getText();
        
        String record = myList.printMovie(nameSearch);
        
        if (myList.findMovie(nameSearch) != -1) {
            int index = myList.findMovie(nameSearch);
            
            recordTracker = index + 1;
            lblRecord.setText(recordTracker + "/" + myList.getCapacity());
        
            String name = myList.getMovieListMovieName(index);
            String rating = myList.getMovieListMovieRating(index);
            int year = myList.getMovieListMovieReleaseYear(index);
            int runtime = myList.getMovieListMovieRuntime(index);
            String format = myList.getMovieListMovieFormat(index);

            txtTitle.setText(name);
            txtRating.setText(rating);
            txtRuntime.setText(Integer.toString(year));
            txtYear.setText(Integer.toString(runtime));
            txtFormat.setText(format);
        }
        
        tareaView.setText(record);
    }//GEN-LAST:event_btnSearchActionPerformed
    
    //refreshes the text area's text
    private void refreshView() {
        tareaView.setText(myList.printMovieList());
    }
    
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
            java.util.logging.Logger.getLogger(MovieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MovieForm dialog = new MovieForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    //non-generated variables
    private MovieList myList;
    private int recordTracker = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDeclare;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFormat;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblRuntime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel pnlDeclare;
    private javax.swing.JPanel pnlEditor;
    private javax.swing.JTextArea tareaView;
    private javax.swing.JTextField txtDeclare;
    private javax.swing.JTextField txtFormat;
    private javax.swing.JTextField txtRating;
    private javax.swing.JTextField txtRuntime;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
