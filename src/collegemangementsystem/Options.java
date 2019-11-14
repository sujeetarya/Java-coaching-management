/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemangementsystem;

import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author akki
 */
public class Options extends javax.swing.JFrame {

    public Options() {
        initComponents();
        myMethod();
    }
    
    private void myMethod(){
        this.setVisible(true);
        txtCID.setEditable(false);
        txtTID.setEditable(false);
        txtSID.setEditable(false);
        txtAID.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plMain = new javax.swing.JPanel();
        plSideMenu = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        btnAddTeacher = new javax.swing.JButton();
        btnAddCourse = new javax.swing.JButton();
        btnAddAdmin = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnback1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();
        txtCName = new javax.swing.JTextField();
        txtFees = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        btsSubmit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTID = new javax.swing.JTextField();
        txtTName = new javax.swing.JTextField();
        txtTCourse = new javax.swing.JTextField();
        txtTContact = new javax.swing.JTextField();
        txtTAddress = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cbTSex = new javax.swing.JComboBox<>();
        TClear = new javax.swing.JButton();
        btnTSubmit = new javax.swing.JButton();
        btnTUpload = new javax.swing.JButton();
        txtTPath = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblTPhoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtSID = new javax.swing.JTextField();
        txtSName = new javax.swing.JTextField();
        txtSFName = new javax.swing.JTextField();
        txtSAddress = new javax.swing.JTextField();
        txtMName = new javax.swing.JTextField();
        txtSCourse = new javax.swing.JTextField();
        txtSContact = new javax.swing.JTextField();
        txtSemail = new javax.swing.JTextField();
        SDOB = new com.toedter.calendar.JDateChooser();
        cbSSex = new javax.swing.JComboBox<>();
        Submit = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        lblSPhoto = new javax.swing.JLabel();
        txtSPath = new javax.swing.JTextField();
        btnSUpload = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtAID = new javax.swing.JTextField();
        txtAName = new javax.swing.JTextField();
        txtAFName = new javax.swing.JTextField();
        txtAAddress = new javax.swing.JTextField();
        txtAUName = new javax.swing.JTextField();
        txtAContact = new javax.swing.JTextField();
        txtAEmail = new javax.swing.JTextField();
        ADOB = new com.toedter.calendar.JDateChooser();
        CBASex = new javax.swing.JComboBox<>();
        APasswordField1 = new javax.swing.JPasswordField();
        jLabel37 = new javax.swing.JLabel();
        APasswordField2 = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        btnAClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plMain.setBackground(new java.awt.Color(255, 255, 255));

        plSideMenu.setBackground(new java.awt.Color(0, 102, 102));

        btnAddStudent.setBackground(new java.awt.Color(0, 102, 102));
        btnAddStudent.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudent.setText("ADD STUDENT");
        btnAddStudent.setBorder(null);
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnAddTeacher.setBackground(new java.awt.Color(0, 102, 102));
        btnAddTeacher.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAddTeacher.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTeacher.setText("ADD TEACHER");
        btnAddTeacher.setBorder(null);
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        btnAddCourse.setBackground(new java.awt.Color(0, 102, 102));
        btnAddCourse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAddCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCourse.setText("ADD COURSE");
        btnAddCourse.setBorder(null);
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnAddAdmin.setBackground(new java.awt.Color(0, 102, 102));
        btnAddAdmin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAddAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAdmin.setText("ADD ADMIN ");
        btnAddAdmin.setBorder(null);
        btnAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdminActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 102, 102));
        btnEdit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT RECORDS");
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(0, 102, 102));
        btnView.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("VIEW RECORDS");
        btnView.setBorder(null);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnback1.setBackground(new java.awt.Color(0, 102, 102));
        btnback1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        btnback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plSideMenuLayout = new javax.swing.GroupLayout(plSideMenu);
        plSideMenu.setLayout(plSideMenuLayout);
        plSideMenuLayout.setHorizontalGroup(
            plSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSideMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(plSideMenuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnback1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plSideMenuLayout.setVerticalGroup(
            plSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSideMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnback1)
                .addGap(30, 30, 30)
                .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Course ID");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Course Name");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Fees");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Duration");

        txtCID.setText("----Alloted By Server----");

        btsSubmit.setText("Submit");
        btsSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsSubmitActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFees, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnClear)
                        .addGap(50, 50, 50)
                        .addComponent(btsSubmit)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsSubmit)
                    .addComponent(btnClear))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD COURSE", jPanel1);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Teacher ID");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Teacher Name");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Course");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Contact");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Address");

        txtTID.setText("----Alloted By Server----");

        txtTContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTContactActionPerformed(evt);
            }
        });
        txtTContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTContactKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Sex");

        cbTSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        cbTSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTSexActionPerformed(evt);
            }
        });

        TClear.setText("Clear");
        TClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TClearActionPerformed(evt);
            }
        });

        btnTSubmit.setText("Insert");
        btnTSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTSubmitActionPerformed(evt);
            }
        });

        btnTUpload.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnTUpload.setText("Upload");
        btnTUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTUploadActionPerformed(evt);
            }
        });

        txtTPath.setBorder(javax.swing.BorderFactory.createTitledBorder("Path"));
        txtTPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTPathActionPerformed(evt);
            }
        });

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(100, 100));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(100, 100));

        lblTPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblTPhoto.setMaximumSize(new java.awt.Dimension(100, 100));
        lblTPhoto.setMinimumSize(new java.awt.Dimension(100, 100));
        lblTPhoto.setPreferredSize(new java.awt.Dimension(100, 100));

        jDesktopPane1.setLayer(lblTPhoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel25)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTContact, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(txtTPath, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(btnTUpload)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TClear)
                .addGap(50, 50, 50)
                .addComponent(btnTSubmit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(cbTSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtTCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtTContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtTAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTSubmit)
                            .addComponent(TClear)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTUpload)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD TEACHER", jPanel2);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("ID");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Name");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Course");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Email");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("F. Name");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("M. Name");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("DOB");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Sex");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Address");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Contact");

        txtSID.setText("----Alloted By Server----");

        txtSContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSContactKeyTyped(evt);
            }
        });

        cbSSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        cbSSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSSexActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jDesktopPane2.setMaximumSize(new java.awt.Dimension(100, 100));
        jDesktopPane2.setMinimumSize(new java.awt.Dimension(100, 100));

        lblSPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblSPhoto.setMaximumSize(new java.awt.Dimension(100, 100));
        lblSPhoto.setMinimumSize(new java.awt.Dimension(100, 100));
        lblSPhoto.setPreferredSize(new java.awt.Dimension(100, 100));

        jDesktopPane2.setLayer(lblSPhoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtSPath.setBorder(javax.swing.BorderFactory.createTitledBorder("Path"));
        txtSPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSPathActionPerformed(evt);
            }
        });

        btnSUpload.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSUpload.setText("Upload");
        btnSUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSemail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(50, 50, 50)
                                .addComponent(Submit))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(38, 38, 38)
                                    .addComponent(SDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSContact, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(91, 91, 91))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSFName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSPath, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnSUpload)))
                        .addGap(124, 124, 124))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtSFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(cbSSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSUpload)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtSContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit)
                            .addComponent(jButton8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtSAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtSCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtSemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD STUDENT", jPanel3);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Admin ID");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Admin Name");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Email");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("F. Name");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("User Name");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("DOB");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setText("Sex");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Address");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Password");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Contact");

        txtAID.setText("----Alloted By Server----");

        txtAContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAContactKeyTyped(evt);
            }
        });

        CBASex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        CBASex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBASexActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setText("confirm Password");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnAClear.setText("Clear");
        btnAClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel31)
                    .addComponent(jLabel27)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33)
                    .addComponent(jLabel30)
                    .addComponent(jLabel37))
                .addGap(65, 65, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBASex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(APasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnAClear)
                        .addGap(50, 50, 50)
                        .addComponent(btnSubmit))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(APasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtAID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtAFName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtAUName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addGap(38, 38, 38)
                                    .addComponent(ADOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel36)
                                        .addComponent(jLabel29))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtAContact, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtAID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(txtAName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel36)
                    .addComponent(txtAFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(txtAUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(APasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSubmit)
                        .addComponent(btnAClear))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(APasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBASex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("ADD ADMIN ", jPanel5);

        javax.swing.GroupLayout plMainLayout = new javax.swing.GroupLayout(plMain);
        plMain.setLayout(plMainLayout);
        plMainLayout.setHorizontalGroup(
            plMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMainLayout.createSequentialGroup()
                .addComponent(plSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18))
        );
        plMainLayout.setVerticalGroup(
            plMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(plMainLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(930, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnAddAdminActionPerformed

    private void CBASexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBASexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBASexActionPerformed

    private void cbSSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSSexActionPerformed

    private void cbTSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTSexActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        new Edit();
        this.dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        new View();
        this.dispose();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback1ActionPerformed
        // TODO add your handling code here:
        new AdminLogin();
        this.dispose();
    }//GEN-LAST:event_btnback1ActionPerformed

    private void btsSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsSubmitActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to Submit?", "Title on Box", dialogButton);
        if(dialogResult == 0) {
            Connection con;
            try{
                con=CreateConnection.getObject();
                String sqlquery="INSERT INTO course(CName,Fees,Duration) VALUES (?,?,?)";
                PreparedStatement pst = con.prepareStatement(sqlquery);
                pst.setString(1, txtCName.getText());
                pst.setString(2, txtFees.getText());
                pst.setString(3, txtDuration.getText());
                int row=pst.executeUpdate();
                if(row>0){
                    JOptionPane.showMessageDialog(null, "Inserted Successfully.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Insertion Unsuccessful.", "Woops", JOptionPane.ERROR_MESSAGE);
                }
                pst.close();
            }
            catch(Exception e){
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
        }
        else {
            System.out.println("No Option");
        }
    }//GEN-LAST:event_btsSubmitActionPerformed

    private void btnTSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTSubmitActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to Submit?", "Title on Box", dialogButton);
        if(dialogResult == 0) {
            Connection con;
            try{
                con=CreateConnection.getObject();
                String sqlquery="INSERT INTO teacher(TName,Sex,Course,Contact,Address,Photo) VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sqlquery);
                pst.setString(1, txtTName.getText());
                pst.setString(2, cbTSex.getSelectedItem().toString());
                pst.setString(3, txtTCourse.getText());
                pst.setString(4, txtTContact.getText());
                pst.setString(5, txtTAddress.getText());
                pst.setBytes(6, tPhoto);
                int row=pst.executeUpdate();
                if(row>0){
                    JOptionPane.showMessageDialog(null, "Inserted Successfully.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Insertion Unsuccessful.", "Woops", JOptionPane.ERROR_MESSAGE);
                }
                con.close();
            }
            catch(Exception e){
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
        }
        else {
            System.out.println("No Option");
        }
    }//GEN-LAST:event_btnTSubmitActionPerformed

    private void txtTContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTContactKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        String phoneno=txtTContact.getText();
        int length=phoneno.length();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))||length>9){
            evt.consume();
        }
    }//GEN-LAST:event_txtTContactKeyTyped

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to Submit?", "Title on Box", dialogButton);
        if(dialogResult == 0) {
            Connection con;
            try {
                con=CreateConnection.getObject();
                Statement smt=con.createStatement();
                String sqlquery="INSERT INTO student (SName,FName,MName,Sex,Address,Course,Email,Contact,DOB,SPhoto) VALUES (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sqlquery);
                Date birDate=SDOB.getDate();
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat formatter = new SimpleDateFormat(pattern);
                String sqlDateString = formatter.format(birDate);
                ps.setString(1, txtSName.getText());
                ps.setString(2, txtSFName.getText());
                ps.setString(3, txtMName.getText());
                ps.setString(4, cbSSex.getSelectedItem().toString());
                ps.setString(5, txtSAddress.getText());
                ps.setString(6, txtSCourse.getText());
                ps.setString(7, txtSemail.getText());
                ps.setString(8, txtSContact.getText());  
                ps.setString(9, sqlDateString);
                ps.setBytes(10, sPhoto);
                int row=ps.executeUpdate();
                if(row>0){
                    JOptionPane.showMessageDialog(null, "Inserted Successfully.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Insertion Unsuccessful.", "Woops", JOptionPane.ERROR_MESSAGE);
                }
                ps.close();
            }
            catch (Exception ex) {
                System.err.println("Got an exception! ");
                System.err.println(ex.getMessage());
            }
        }
        else {
            System.out.println("No Option");
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to Submit?", "Title on Box", dialogButton);
        if(dialogResult == 0) {
            Connection con;
            try {
                con=CreateConnection.getObject();
                Statement smt=con.createStatement();
                String sqlquery="INSERT INTO signup(Name,FName,UserName,Password,Sex,Address,Email,Contact,DOB) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sqlquery);
                Date birDate=ADOB.getDate();
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat formatter = new SimpleDateFormat(pattern);
                String sqlDateString = formatter.format(birDate);
                ps.setString(1, txtAName.getText());
                ps.setString(2, txtAFName.getText());
                ps.setString(3, txtAUName.getText());
                ps.setString(4, APasswordField1.getText());
                ps.setString(5, CBASex.getSelectedItem().toString());
                ps.setString(6, txtAAddress.getText());
                ps.setString(7, txtAEmail.getText());
                ps.setString(8, txtAContact.getText());  
                ps.setString(9, sqlDateString);
                int row=ps.executeUpdate();
                if(row>0){
                    JOptionPane.showMessageDialog(null, "Inserted Successfully.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Insertion Unsuccessful.", "Woops", JOptionPane.ERROR_MESSAGE);
                }
                ps.close();
            }
            catch (Exception ex) {
                System.err.println("Got an exception! ");
                System.err.println(ex.getMessage());
            }
        }
        else {
            System.out.println("No Option");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtSContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSContactKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        String phoneno=txtSContact.getText();
        int length=phoneno.length();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))||length>9){
            evt.consume();
        }
    }//GEN-LAST:event_txtSContactKeyTyped

    private void txtAContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAContactKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        String phoneno=txtAContact.getText();
        int length=phoneno.length();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))||length>9){
            evt.consume();
        }
    }//GEN-LAST:event_txtAContactKeyTyped

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtCID.setText("");
        txtCName.setText("");
        txtFees.setText("");
        txtDuration.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void TClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TClearActionPerformed
        // TODO add your handling code here:
        txtTID.setText("");
        txtTName.setText("");
        txtTCourse.setText("");
        txtTContact.setText("");
        txtTAddress.setText("");
    }//GEN-LAST:event_TClearActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        txtSID.setText("");
        txtSName.setText("");
        txtSFName.setText("");
        txtMName.setText("");
        txtSAddress.setText("");
        txtSCourse.setText("");
        txtSemail.setText("");
        txtSContact.setText("");
        SDOB.setDate(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnAClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAClearActionPerformed
        // TODO add your handling code here:
        txtAID.setText("");
        txtAName.setText("");
        txtAFName.setText("");
        txtAUName.setText("");
        APasswordField1.setText("");
        APasswordField2.setText("");
        CBASex.setSelectedIndex(0);
        txtAAddress.setText("");
        txtAEmail.setText("");
        txtAContact.setText("");
        ADOB.setDate(null);
    }//GEN-LAST:event_btnAClearActionPerformed

    private void txtTContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTContactActionPerformed

    private void btnTUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTUploadActionPerformed
        // go get the path of image
        String filename=null;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        lblTPhoto.setIcon(new ImageIcon(f.toString()));
        filename=f.getAbsolutePath();
        txtTPath.setText(filename);
        
        //to convert image to byte array
        try{
            File image = new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int redNum; (redNum=fis.read(buf))!=-1;){
                bos.write(buf, 0,redNum);
            }
            tPhoto=bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);   
        }
    }//GEN-LAST:event_btnTUploadActionPerformed

    private void txtTPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTPathActionPerformed

    private void txtSPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSPathActionPerformed

    private void btnSUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUploadActionPerformed
        // TODO add your handling code here:
        String filename=null;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        lblSPhoto.setIcon(new ImageIcon(f.toString()));
        filename=f.getAbsolutePath();
        txtSPath.setText(filename);
        
        //to convert image to byte array
        try{
            File image = new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int redNum; (redNum=fis.read(buf))!=-1;){
                bos.write(buf, 0,redNum);
            }
            sPhoto=bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);   
        }
    }//GEN-LAST:event_btnSUploadActionPerformed
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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ADOB;
    private javax.swing.JPasswordField APasswordField1;
    private javax.swing.JPasswordField APasswordField2;
    private javax.swing.JComboBox<String> CBASex;
    private com.toedter.calendar.JDateChooser SDOB;
    private javax.swing.JButton Submit;
    private javax.swing.JButton TClear;
    private javax.swing.JButton btnAClear;
    private javax.swing.JButton btnAddAdmin;
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSUpload;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnTSubmit;
    private javax.swing.JButton btnTUpload;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnback1;
    private javax.swing.JButton btsSubmit;
    private javax.swing.JComboBox<String> cbSSex;
    private javax.swing.JComboBox<String> cbTSex;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblSPhoto;
    private javax.swing.JLabel lblTPhoto;
    private javax.swing.JPanel plMain;
    private javax.swing.JPanel plSideMenu;
    private javax.swing.JTextField txtAAddress;
    private javax.swing.JTextField txtAContact;
    private javax.swing.JTextField txtAEmail;
    private javax.swing.JTextField txtAFName;
    private javax.swing.JTextField txtAID;
    private javax.swing.JTextField txtAName;
    private javax.swing.JTextField txtAUName;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFees;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtSAddress;
    private javax.swing.JTextField txtSContact;
    private javax.swing.JTextField txtSCourse;
    private javax.swing.JTextField txtSFName;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtSName;
    private javax.swing.JTextField txtSPath;
    private javax.swing.JTextField txtSemail;
    private javax.swing.JTextField txtTAddress;
    private javax.swing.JTextField txtTContact;
    private javax.swing.JTextField txtTCourse;
    private javax.swing.JTextField txtTID;
    private javax.swing.JTextField txtTName;
    private javax.swing.JTextField txtTPath;
    // End of variables declaration//GEN-END:variables
    private byte[] tPhoto=null;
    private byte[] sPhoto=null;
}
