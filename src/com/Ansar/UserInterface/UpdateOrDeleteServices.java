package com.Ansar.UserInterface;

import com.Ansar.DataModel.Services;
import com.Ansar.DataModel.ServicesType;
import com.Ansar.Database.DeleteInDatabase;
import com.Ansar.Database.GetDataFromDatabase;
import com.Ansar.Database.UpdateDataInDatabase;
import com.Ansar.LinkedList.LinkedList;

import javax.swing.table.DefaultTableModel;

public class UpdateOrDeleteServices extends javax.swing.JPanel{
    private GetDataFromDatabase getDataFromDatabase=new GetDataFromDatabase();
    private UpdateDataInDatabase updateDataInDatabase=new UpdateDataInDatabase();
    Services services;
    ServicesType servicesType;
    DefaultTableModel model1,model2,model3,model4;
    /**
     * Creates new form UpdateOrDeleteServices
     */
    public UpdateOrDeleteServices() {
        initComponents();
        editingButton.setVisible(false);
        updateButton.setVisible(false);
        deleteButton.setVisible(false);

        editingButton1.setVisible(false);
        updateButton1.setVisible(false);
        deleteButton1.setVisible(false);
        model1 =(DefaultTableModel) ServicesAll.getModel();
        model3=(DefaultTableModel) ServicesTypeAll.getModel();

        model2=(DefaultTableModel) ServicesAll1.getModel();
        model4=(DefaultTableModel) ServicesTypeAll1.getModel();
        Multithreading_1 multithreading_1=new Multithreading_1();
        multithreading_1.start();
        Multithreading_2 multithreading_2=new Multithreading_2();
        multithreading_2.start();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ServiceID = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ServicesAll = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ServicesTypeAll1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        ServicesAll1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        IDType = new javax.swing.JTextField();
        SearchButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        ServicesTypeAll = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        serviceName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        IdToChnageType = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        serviceType = new javax.swing.JTextField();
        editingButton = new javax.swing.JCheckBox();
        updateButton = new javax.swing.JRadioButton();
        deleteButton = new javax.swing.JRadioButton();
        editingButton1 = new javax.swing.JCheckBox();
        updateButton1 = new javax.swing.JRadioButton();
        deleteButton1 = new javax.swing.JRadioButton();

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(650, 540));

        jPanel7.setBackground(new java.awt.Color(242, 247, 247));
        jPanel7.setToolTipText("Search by service Id.");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Enter Services ID                 ");
        jLabel14.setToolTipText("");

        ServiceID.setToolTipText("Enter ID/Method to search.");

        SearchButton.setText("Search");
        SearchButton.setFocusPainted(false);
        SearchButton.setFocusable(false);
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(ServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(SearchButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ServiceID)
                                        .addComponent(SearchButton))
                                .addContainerGap())
        );

        ServicesAll.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Service ID", "Service Name"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ServicesAll.setToolTipText("All data of Services Table.");
        jScrollPane1.setViewportView(ServicesAll);

        ServicesTypeAll1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Service ID", "Service Type"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ServicesTypeAll1.setToolTipText("All data of Service Type Table.");
        jScrollPane3.setViewportView(ServicesTypeAll1);

        ServicesAll1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Service ID", "Service Name"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ServicesAll1.setToolTipText("All data of Services Table.");
        jScrollPane4.setViewportView(ServicesAll1);

        jPanel8.setBackground(new java.awt.Color(242, 247, 247));
        jPanel8.setToolTipText("Search by Service Id and Type");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Service ID");
        jLabel15.setToolTipText("");

        IDType.setToolTipText("Enter ID/Details to search.");

        SearchButton2.setText("Search");
        SearchButton2.setFocusPainted(false);
        SearchButton2.setFocusable(false);
        SearchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Service Type");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(IDType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(SearchButton2)))
                                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IDType)
                                        .addComponent(SearchButton2)
                                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        ServicesTypeAll.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Service ID", "Service Type"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ServicesTypeAll.setToolTipText("All data of Service Type Table.");
        jScrollPane5.setViewportView(ServicesTypeAll);

        jPanel9.setBackground(new java.awt.Color(242, 247, 247));
        jPanel9.setToolTipText("Add Account's Data here in fields.");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Service Type    ");

        serviceName.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("ServiceID");

        IdToChnageType.setEditable(false);
        IdToChnageType.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Service Name   ");

        serviceType.setEditable(false);

        editingButton.setBackground(new java.awt.Color(242, 247, 247));
        editingButton.setText("Enable Editing");
        editingButton.setToolTipText("Click to Edit Details.");
        editingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editingButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(242, 247, 247));
        buttonGroup1.add(updateButton);
        updateButton.setText("Update");
        updateButton.setToolTipText("Click to update.");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(242, 247, 247));
        buttonGroup1.add(deleteButton);
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("click to delete.");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editingButton1.setBackground(new java.awt.Color(242, 247, 247));
        editingButton1.setText("Enable Editing");
        editingButton1.setToolTipText("Click to Edit Details.");
        editingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editingButton1ActionPerformed(evt);
            }
        });

        updateButton1.setBackground(new java.awt.Color(242, 247, 247));
        updateButton1.setText("Update");
        updateButton1.setToolTipText("Click to update.");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        deleteButton1.setBackground(new java.awt.Color(242, 247, 247));
        deleteButton1.setText("Delete");
        deleteButton1.setToolTipText("click to delete.");
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addComponent(serviceName, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(editingButton)
                                                        .addGap(27, 27, 27)
                                                        .addComponent(updateButton)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(deleteButton))
                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel17)
                                                                .addComponent(IdToChnageType, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel16)
                                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                                        .addComponent(serviceType, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(editingButton1)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(updateButton1)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(deleteButton1))))))
                                .addGap(202, 202, 202))
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(serviceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(editingButton)
                                                .addComponent(updateButton)
                                                .addComponent(deleteButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IdToChnageType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(serviceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editingButton1)
                                        .addComponent(updateButton1)
                                        .addComponent(deleteButton1))
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 650, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 540, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>



    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        services=getDataFromDatabase.getSingleService(Integer.parseInt(ServiceID.getText().replace(" ","")));
        if(services!=null)
        {
            model2.setRowCount(0);
            model2.addRow(new Object[]{services.getServiceId(),services.getServiceName()});
            serviceName.setText(services.getServiceName());
            editingButton.setVisible(true);
        }
        else
        {
            model2.setRowCount(0);
            serviceName.setText(null);
            editingButton.setVisible(false);
            updateButton.setVisible(false);
            deleteButton.setVisible(false);
        }
    }

    private void SearchButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        GetDataFromDatabase getDataFromDatabase=new GetDataFromDatabase();
        servicesType=getDataFromDatabase.getSingleServiceType(Integer.parseInt(IDType.getText().replace(" ","")),type.getText());
        try{
        if(serviceType!=null)
        {
            model4.setRowCount(0);
            System.out.println(servicesType.getServiceId());
            System.out.println(servicesType.getServiceType());
            model4.addRow(new Object[]{servicesType.getServiceId(),servicesType.getServiceType()});
            IdToChnageType.setText(String.valueOf(servicesType.getServiceId()));
            serviceType.setText(servicesType.getServiceType());
            editingButton1.setVisible(true);
        }
        else
        {
            model4.setRowCount(0);
            IdToChnageType.setText(null);
            serviceType.setText(null);
            editingButton1.setVisible(false);
            updateButton.setVisible(false);
            deleteButton.setVisible(false);
        }}catch (Exception e)
        {
            model4.setRowCount(0);
            IdToChnageType.setText(null);
            serviceType.setText(null);
            editingButton1.setVisible(false);
            updateButton1.setVisible(false);
            deleteButton1.setVisible(false);
        }
    }

    private void editingButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(editingButton.isSelected())
        {
            serviceName.setEditable(true);
            updateButton.setVisible(true);
            deleteButton.setVisible(true);
        }
        else{
            serviceName.setEditable(false);
            updateButton.setVisible(false);
            deleteButton.setVisible(false);
        }
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        boolean flag=updateDataInDatabase.UpdateInServices(services.getServiceId(),serviceName.getText());
        if(flag)
        {
            Multithreading_1 multithreading_1=new Multithreading_1();
            multithreading_1.start();
        }

    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        DeleteInDatabase deleteInDatabase=new DeleteInDatabase();
        boolean flag=deleteInDatabase.DeleteInService(services.getServiceId());
        if(flag)
        {
            Multithreading_1 thread1=new Multithreading_1();
            thread1.start();
        }
    }

    private void editingButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(editingButton1.isSelected())
        {
            IdToChnageType.setEditable(true);
            serviceType.setEditable(true);
            updateButton1.setVisible(true);
            deleteButton1.setVisible(true);
        }
        else
        {
            IdToChnageType.setEditable(false);
            serviceType.setEditable(false);
            updateButton1.setVisible(false);
            deleteButton1.setVisible(false);
        }
    }

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        boolean flag=updateDataInDatabase.UpdateInServiceType(Integer.parseInt(IdToChnageType.getText().replace(" ","")),serviceType.getText(),
                servicesType.getServiceId(),servicesType.getServiceType());
        if(flag)
        {
            Multithreading_2 multithreading_2=new Multithreading_2();
            multithreading_2.start();
        }
    }

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        DeleteInDatabase deleteInDatabase=new DeleteInDatabase();
        boolean flag=deleteInDatabase.DeleteInServiceType(servicesType.getServiceId(),servicesType.getServiceType());
        if(flag)
        {
            Multithreading_2 thread2=new Multithreading_2();
            thread2.start();
        }
    }

    class Multithreading_1 extends Thread{
        public void run() {
            model1.setRowCount(0);
            LinkedList<Services> servicesLinkedList=getDataFromDatabase.getServices();
            for (int count = 0; count < servicesLinkedList.size(); count++) {
                model1.addRow(new Object[]{servicesLinkedList.get(count).getServiceId(),servicesLinkedList.get(count).getServiceName()});
            }
        }
    }

    class Multithreading_2 extends Thread{
        public void run() {
            model3.setRowCount(0);
            LinkedList<ServicesType> servicesTypeLinkedList=getDataFromDatabase.getServicesType();
            for (int count = 0; count < servicesTypeLinkedList.size(); count++) {
                model3.addRow(new Object[]{servicesTypeLinkedList.get(count).getServiceId(),servicesTypeLinkedList.get(count).getServiceType()});
            }
        }
    }



    // Variables declaration - do not modify
    private javax.swing.JTextField IDType;
    private javax.swing.JFormattedTextField IdToChnageType;
    public  javax.swing.JPanel MainPanel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SearchButton2;
    private javax.swing.JTextField ServiceID;
    private javax.swing.JTable ServicesAll;
    private javax.swing.JTable ServicesAll1;
    private javax.swing.JTable ServicesTypeAll;
    private javax.swing.JTable ServicesTypeAll1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton deleteButton;
    private javax.swing.JRadioButton deleteButton1;
    private javax.swing.JCheckBox editingButton;
    private javax.swing.JCheckBox editingButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField serviceName;
    private javax.swing.JTextField serviceType;
    private javax.swing.JTextField type;
    private javax.swing.JRadioButton updateButton;
    private javax.swing.JRadioButton updateButton1;
    // End of variables declaration
}