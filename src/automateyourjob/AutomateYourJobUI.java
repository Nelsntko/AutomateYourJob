/*
 * Copyright (C) 2016 ntko
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package automateyourjob;

import java.awt.CardLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ntko
 */
public class AutomateYourJobUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public AutomateYourJobUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @return 
     */
    // Lists the employment.template in an ArrayList
    static ArrayList<String> employmentRead() {
        ArrayList<String> fileRead = null;
        try {
            ReadTemplate r = new ReadTemplate();
            String fileName = "automateyourjob\\employment.template";

            fileRead = r.ReadTemplate(fileName);
        }catch (IOException ex) {
            Logger.getLogger(AutomateYourJob.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileRead;
    }
    // Lists the education.template in an ArrayList
    static ArrayList<String> educationRead() {
        ArrayList<String> fileRead = null;
        try {
            ReadTemplate r = new ReadTemplate();
            String fileName = "automateyourjob\\education.template";

            fileRead = r.ReadTemplate(fileName);
        }catch (IOException ex) {
            Logger.getLogger(AutomateYourJob.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileRead;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        employmentEdit = new javax.swing.JPanel();
        jEmploymentLabel1 = new javax.swing.JLabel();
        jEmploymentLabel2 = new javax.swing.JLabel();
        jEmploymentReferee = new javax.swing.JTextField();
        jEmploymentTitle = new javax.swing.JTextField();
        jEmploymentMainText = new javax.swing.JTextField();
        jEmploymentDate1 = new javax.swing.JTextField();
        jEmploymentTo = new javax.swing.JTextField();
        jEmploymentDate2 = new javax.swing.JTextField();
        jEmploymentPositionText = new javax.swing.JTextField();
        jEmploymentPosition = new javax.swing.JTextField();
        jEmploymentSalaryText = new javax.swing.JTextField();
        jEmploymentSalary = new javax.swing.JTextField();
        jEmploymentSaveButton = new javax.swing.JButton();
        jEmploymentDefaultButton = new javax.swing.JButton();
        jEmploymentLoadButton = new javax.swing.JButton();
        jEmploymentScrollPane = new javax.swing.JScrollPane();
        jEmploymentInfoText = new javax.swing.JTextArea();
        educationEdit = new javax.swing.JPanel();
        jEducationReferee = new javax.swing.JTextField();
        jEducationTitle = new javax.swing.JTextField();
        jEducationDate1 = new javax.swing.JTextField();
        jEducationDate2 = new javax.swing.JTextField();
        jEducationLabel1 = new javax.swing.JLabel();
        jEducationMainText = new javax.swing.JTextField();
        jEducationTo = new javax.swing.JTextField();
        jEducationAwarded = new javax.swing.JTextField();
        jEducationSaveButton = new javax.swing.JButton();
        jEducationLoadButton = new javax.swing.JButton();
        jEducationDefaultButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuHome = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuEmploymentEdit = new javax.swing.JMenuItem();
        jMenuEducationEdit = new javax.swing.JMenuItem();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        mainPanel.add(homePanel, "homePanel");

        employmentEdit.setInheritsPopupMenu(true);

        jEmploymentLabel1.setText("Separate parts are modifiable");

        jEmploymentLabel2.setText("These fields will not appear if the data hasn't been entered");

        jEmploymentReferee.setEditable(false);
        jEmploymentReferee.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentReferee.setText("<Referee>");

        jEmploymentTitle.setEditable(false);
        jEmploymentTitle.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentTitle.setText("(<Title>)");

        jEmploymentMainText.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentMainText.setText(employmentRead().get(0));

        jEmploymentDate1.setEditable(false);
        jEmploymentDate1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentDate1.setText("<Date 1>");

        jEmploymentTo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentTo.setText(employmentRead().get(1));

        jEmploymentDate2.setEditable(false);
        jEmploymentDate2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentDate2.setText("<Date 2>");

        jEmploymentPositionText.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentPositionText.setText(employmentRead().get(2));

        jEmploymentPosition.setEditable(false);
        jEmploymentPosition.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentPosition.setText("<Position>");

        jEmploymentSalaryText.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentSalaryText.setText(employmentRead().get(3));

        jEmploymentSalary.setEditable(false);
        jEmploymentSalary.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEmploymentSalary.setText("<salary>");

        jEmploymentSaveButton.setText("Save");
        jEmploymentSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmploymentSaveButtonActionPerformed(evt);
            }
        });

        jEmploymentDefaultButton.setText("Default");
        jEmploymentDefaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmploymentDefaultButtonActionPerformed(evt);
            }
        });

        jEmploymentLoadButton.setText("Load");
        jEmploymentLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmploymentLoadButtonActionPerformed(evt);
            }
        });

        jEmploymentInfoText.setColumns(20);
        jEmploymentInfoText.setRows(5);
        jEmploymentInfoText.setText(employmentRead().get(4));
        jEmploymentScrollPane.setViewportView(jEmploymentInfoText);

        javax.swing.GroupLayout employmentEditLayout = new javax.swing.GroupLayout(employmentEdit);
        employmentEdit.setLayout(employmentEditLayout);
        employmentEditLayout.setHorizontalGroup(
            employmentEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employmentEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employmentEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employmentEditLayout.createSequentialGroup()
                        .addComponent(jEmploymentScrollPane)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employmentEditLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jEmploymentSaveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEmploymentLoadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEmploymentDefaultButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employmentEditLayout.createSequentialGroup()
                        .addGroup(employmentEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(employmentEditLayout.createSequentialGroup()
                                .addComponent(jEmploymentLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEmploymentLabel2))
                            .addGroup(employmentEditLayout.createSequentialGroup()
                                .addComponent(jEmploymentReferee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEmploymentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEmploymentMainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEmploymentDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEmploymentTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEmploymentDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEmploymentPositionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEmploymentPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEmploymentSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEmploymentSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(105, Short.MAX_VALUE))))
        );
        employmentEditLayout.setVerticalGroup(
            employmentEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employmentEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employmentEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmploymentLabel2)
                    .addComponent(jEmploymentLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(employmentEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmploymentReferee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentMainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentPositionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmploymentSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEmploymentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(employmentEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmploymentDefaultButton)
                    .addComponent(jEmploymentLoadButton)
                    .addComponent(jEmploymentSaveButton))
                .addContainerGap())
        );

        mainPanel.add(employmentEdit, "employmentEdit");

        jEducationReferee.setEditable(false);
        jEducationReferee.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEducationReferee.setText("<Referee>");

        jEducationTitle.setEditable(false);
        jEducationTitle.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEducationTitle.setText("(<Title>)");

        jEducationDate1.setEditable(false);
        jEducationDate1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEducationDate1.setText("<Date 1>");

        jEducationDate2.setEditable(false);
        jEducationDate2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jEducationDate2.setText("<Date 2>");

        jEducationLabel1.setText("Separate parts are modifiable");

        jEducationMainText.setText(educationRead().get(0));

        jEducationTo.setText(educationRead().get(1));

        jEducationAwarded.setText(educationRead().get(2));

        jEducationSaveButton.setText("Save");
        jEducationSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEducationSaveButtonActionPerformed(evt);
            }
        });

        jEducationLoadButton.setText("Load");
        jEducationLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEducationLoadButtonActionPerformed(evt);
            }
        });

        jEducationDefaultButton.setText("Default");
        jEducationDefaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEducationDefaultButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout educationEditLayout = new javax.swing.GroupLayout(educationEdit);
        educationEdit.setLayout(educationEditLayout);
        educationEditLayout.setHorizontalGroup(
            educationEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educationEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(educationEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(educationEditLayout.createSequentialGroup()
                        .addComponent(jEducationReferee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEducationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEducationMainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEducationDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEducationTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEducationDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEducationAwarded, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                    .addGroup(educationEditLayout.createSequentialGroup()
                        .addComponent(jEducationLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educationEditLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jEducationSaveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEducationLoadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEducationDefaultButton)))
                .addContainerGap())
        );
        educationEditLayout.setVerticalGroup(
            educationEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educationEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEducationLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(educationEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEducationReferee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEducationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEducationMainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEducationDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEducationDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEducationTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEducationAwarded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(educationEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEducationDefaultButton)
                    .addComponent(jEducationLoadButton)
                    .addComponent(jEducationSaveButton))
                .addContainerGap())
        );

        mainPanel.add(educationEdit, "educationEdit");

        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseReleased(evt);
            }
        });

        jMenu1.setText("File");

        jMenuHome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        jMenuHome.setText("Home");
        jMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHomeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuHome);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Awaiting Publishing");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Candidate Comms");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Other");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit Template");

        jMenuEmploymentEdit.setText("Employment");
        jMenuEmploymentEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEmploymentEditActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEmploymentEdit);

        jMenuEducationEdit.setText("Education");
        jMenuEducationEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEducationEditActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEducationEdit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void jMenuEmploymentEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEmploymentEditActionPerformed
    CardLayout card = (CardLayout)mainPanel.getLayout();
    card.show(mainPanel, "employmentEdit");
    }//GEN-LAST:event_jMenuEmploymentEditActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jMenuBar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1MouseReleased

    private void jEmploymentSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmploymentSaveButtonActionPerformed
            try {
            String[] employment;
            employment = new String[5];
            employment[0] = jEmploymentMainText.getText();
            employment[1] = jEmploymentTo.getText();
            employment[2] = jEmploymentPositionText.getText();
            employment[3] = jEmploymentSalaryText.getText();
            employment[4] = jEmploymentInfoText.getText();
            int nbrEmployment = employment.length;

            BufferedWriter writer = null;
            writer = new BufferedWriter(new FileWriter("src\\automateyourjob\\employment.template"));
            for(int i = 0; i < nbrEmployment; i++)
            {
                writer.write(employment[i]);
                writer.append('¦');
            }
            writer.flush();
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(AutomateYourJobUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jEmploymentSaveButtonActionPerformed

    private void jMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHomeActionPerformed
    CardLayout card = (CardLayout)mainPanel.getLayout();
    card.show(mainPanel, "homePanel");
    }//GEN-LAST:event_jMenuHomeActionPerformed

    private void jEmploymentDefaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmploymentDefaultButtonActionPerformed
            jEmploymentMainText.setText("advised that the Candidate was employed from");
            jEmploymentTo.setText("to");
            jEmploymentPositionText.setText("in the position of");
            jEmploymentSalaryText.setText("with a salary of");
            jEmploymentInfoText.setText("The Referee described the Candidate as \n"
                    + "\n" + "They further advised that the Candidate was "
                    + "honest and showed integrity, and the Candidate's health "
                    + "and disciplinary record were clean.\n" + "\n" + "The "
                    + "reason for leaving stated was XXX and the Company would "
                    + "re-employ the Candidate.");
    }//GEN-LAST:event_jEmploymentDefaultButtonActionPerformed

    private void jEmploymentLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmploymentLoadButtonActionPerformed
        
            // employmentRead() defined on 46. returns array of the read template.
            String main = employmentRead().get(0);
            String to = employmentRead().get(1);
            String position = employmentRead().get(2);
            String salary = employmentRead().get(3);
            String info = employmentRead().get(4);
            jEmploymentMainText.setText(main);
            jEmploymentTo.setText(to);
            jEmploymentPositionText.setText(position);
            jEmploymentSalaryText.setText(salary);
            jEmploymentInfoText.setText(info);

    }//GEN-LAST:event_jEmploymentLoadButtonActionPerformed

    private void jMenuEducationEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEducationEditActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "educationEdit");
    }//GEN-LAST:event_jMenuEducationEditActionPerformed

    private void jEducationSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEducationSaveButtonActionPerformed
        try {
            String[] education;
            education = new String[3];
            education[0] = jEducationMainText.getText();
            education[1] = jEducationTo.getText();
            education[2] = jEducationAwarded.getText();
            int nbrEmployment = education.length;

            BufferedWriter writer = null;
            writer = new BufferedWriter(new FileWriter("src\\automateyourjob\\education.template"));
            for(int i = 0; i < nbrEmployment; i++)
            {
                writer.write(education[i]);
                writer.append('¦');
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(AutomateYourJobUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jEducationSaveButtonActionPerformed

    private void jEducationLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEducationLoadButtonActionPerformed
        // educationRead() defined on 59. returns array of the read template.
            String main = educationRead().get(0);
            String to = educationRead().get(1);
            String awarded = educationRead().get(2);
            jEducationMainText.setText(main);
            jEducationTo.setText(to);
            jEducationAwarded.setText(awarded);
    }//GEN-LAST:event_jEducationLoadButtonActionPerformed

    private void jEducationDefaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEducationDefaultButtonActionPerformed
            jEducationMainText.setText("advised that the Candidate studied from");
            jEducationTo.setText("to");
            jEducationAwarded.setText("and was awarded:" + "\n" + "\n");
    }//GEN-LAST:event_jEducationDefaultButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(AutomateYourJobUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutomateYourJobUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutomateYourJobUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutomateYourJobUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AutomateYourJobUI().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel educationEdit;
    private javax.swing.JPanel employmentEdit;
    private javax.swing.JPanel homePanel;
    private javax.swing.JTextField jEducationAwarded;
    private javax.swing.JTextField jEducationDate1;
    private javax.swing.JTextField jEducationDate2;
    private javax.swing.JButton jEducationDefaultButton;
    private javax.swing.JLabel jEducationLabel1;
    private javax.swing.JButton jEducationLoadButton;
    private javax.swing.JTextField jEducationMainText;
    private javax.swing.JTextField jEducationReferee;
    private javax.swing.JButton jEducationSaveButton;
    private javax.swing.JTextField jEducationTitle;
    private javax.swing.JTextField jEducationTo;
    private javax.swing.JTextField jEmploymentDate1;
    private javax.swing.JTextField jEmploymentDate2;
    private javax.swing.JButton jEmploymentDefaultButton;
    private javax.swing.JTextArea jEmploymentInfoText;
    private javax.swing.JLabel jEmploymentLabel1;
    private javax.swing.JLabel jEmploymentLabel2;
    private javax.swing.JButton jEmploymentLoadButton;
    private javax.swing.JTextField jEmploymentMainText;
    private javax.swing.JTextField jEmploymentPosition;
    private javax.swing.JTextField jEmploymentPositionText;
    private javax.swing.JTextField jEmploymentReferee;
    private javax.swing.JTextField jEmploymentSalary;
    private javax.swing.JTextField jEmploymentSalaryText;
    private javax.swing.JButton jEmploymentSaveButton;
    private javax.swing.JScrollPane jEmploymentScrollPane;
    private javax.swing.JTextField jEmploymentTitle;
    private javax.swing.JTextField jEmploymentTo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEducationEdit;
    private javax.swing.JMenuItem jMenuEmploymentEdit;
    private javax.swing.JMenuItem jMenuHome;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}