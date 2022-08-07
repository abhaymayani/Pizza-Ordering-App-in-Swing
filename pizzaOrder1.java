package pizzaorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class pizzaOrder1 extends javax.swing.JFrame {

    JFrame frame;
    int qnt1, qnt2, qnt3, qnt4, total_qnt = 0;
    float cost, price;
    JLabel customer_name, size, Pizza_name, label_qnts, lable_cost, jl, label_price;
    String check_box = "", qnts = "";
    String toppings;
    int topping_cost;
    int rand;

    public pizzaOrder1() {
        initComponents();

        getContentPane().setBackground(Color.decode("#66d9ff"));
//        frame.setBackground(new Color(0,0,0,0));
//setContentPane(new JLabel(new ImageIcon("C:\\Users\\Abhay\\Pictures\try.png")));

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel1.setText("Cutomer Name : ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCheckBox1.setText("Margherita");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCheckBox2.setText("Chesse 7");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCheckBox3.setText("Burn to Hell");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCheckBox4.setText("Onion Pizza");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel2.setText("Pizza Type : ");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel3.setText("Pizza Size : ");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jRadioButton1.setText("Small");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jRadioButton2.setText("Mediam");

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jRadioButton3.setText("Large");

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jRadioButton4.setText("Monster");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel4.setText("Toppings : ");

        jButton1.setBackground(new java.awt.Color(0, 77, 102));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 77, 102));
        jButton2.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nothing", "Pepperoni          Rs = 40", "Mushrooms        Rs = 50", "Black olives        Rs = 80", "Extra cheese      Rs = 70" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox2)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton3))
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addGap(71, 71, 71)
                                .addComponent(jCheckBox4))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int total = 0;

        int min = 10;
        int max = 199;

        rand = (int) (Math.random() * (max - min + 1) + min);

        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setBackground(Color.yellow);
        jf.setVisible(true);
        jf.setLayout(null);

        String c_name = jTextField1.getText();
        toppings = (String) jComboBox1.getSelectedItem();

        if (toppings.startsWith("Mushrooms")) {
            topping_cost = 50;

        } else if (toppings.startsWith("Pepperoni")) {
            topping_cost = 40;

        } else if (toppings.startsWith("Extra cheese")) {
            topping_cost = 70;

        } else if (toppings.startsWith("Black olives")) {
            topping_cost = 80;
        } else if (toppings.startsWith("Nothing")) {
            topping_cost = 0;
        }

        JDialog dialog = new JDialog(jf, "Dialog Box");
        dialog.setSize(500, 500);

        JLabel jl3 = new JLabel("*********************************************************************************");
        jl3.setBounds(30, 10, 500, 100);
        jl3.setForeground(Color.decode("#4286f4"));
        jf.add(jl3);

        JLabel jl2 = new JLabel("               Abhay's Pizza");
        jl2.setFont(new Font("Harlow Solid Italic", Font.BOLD, 24));
        jl2.setForeground(Color.decode("#3a7bd5"));
        jl2.setBounds(30, 30, 500, 100);
        jf.add(jl2, BorderLayout.CENTER);

        jl = new JLabel("*********************************************************************************");
        jl.setBounds(30, 50, 500, 100);
        jl.setForeground(Color.decode("#4286f4"));
        jf.add(jl);

        JLabel rand_bill_no = new JLabel("<html><b>Bill No. = " + rand + "</b></html>");
        rand_bill_no.setBounds(320, 70, 200, 80);
        jf.add(rand_bill_no);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        JLabel lable_date = new JLabel("<html><b>Date = </b>" + dateFormat.format(date) + "</html>");
        lable_date.setBounds(320, 90, 200, 80);
        jf.add(lable_date);

        JLabel jl5 = new JLabel("Pizza Name         Quentities          Rate        Price");
        jl5.setBounds(30, 110, 500, 100);
        jl5.setFont(new Font("Cascadia Code", Font.BOLD, 16));
        jf.add(jl5);

        customer_name = new JLabel("Customer Name : " + c_name);
        customer_name.setBounds(30, 70, 200, 100);
        jf.add(customer_name);

//        JOptionPane.showMessageDialog(this, "This is Dialpg");
        if (jCheckBox1.isSelected()) {
//            cost = qnt1 * total;

            check_box = jCheckBox1.getText();
            qnts = ""/*jCheckBox1.getText() + " = "*/ + qnt1;
//            Pizza_name = new JLabel("" + check_box1);
//            Pizza_name.setBounds(30, 150, 200, 80);
//            dialog.add(Pizza_name);
        }
        if (jCheckBox2.isSelected()) {
//            cost = qnt2 * total;
            check_box += "," + jCheckBox2.getText();
            qnts += "," /*+ jCheckBox2.getText() + " = "*/ + qnt2;
//            Pizza_name = new JLabel("" + check_box2);
//            Pizza_name.setBounds(30, 150, 200, 80);
//            dialog.add(Pizza_name);
        }
        if (jCheckBox3.isSelected()) {
//            cost = qnt2 * total;
            check_box += "," + jCheckBox3.getText();
            qnts += "," /*+ jCheckBox3.getText() + " = "*/ + qnt3;
//            Pizza_name = new JLabel("" + check_box3);
//            Pizza_name.setBounds(30, 150, 200, 80);
//            dialog.add(Pizza_name);
        }
        if (jCheckBox4.isSelected()) {
//            cost = qnt2 * total;
            check_box += "," + jCheckBox4.getText();
            qnts += "," /*+ jCheckBox4.getText() + " = "*/ + qnt4;
//            Pizza_name = new JLabel("" + check_box4); 
        }

        String[] split_name = check_box.split(",");

        for (int i = 0; i < split_name.length; i++) {
            Pizza_name = new JLabel(split_name[i]);

            if (i == 0) {
                Pizza_name.setBounds(30, 150, 600, 80);
                jf.add(Pizza_name);
            } else if (i == 1) {
                Pizza_name.setBounds(30, 170, 600, 80);
                jf.add(Pizza_name);
            } else if (i == 2) {
                Pizza_name.setBounds(30, 190, 600, 80);
                jf.add(Pizza_name);
            } else if (i == 3) {
                Pizza_name.setBounds(30, 210, 600, 80);
                jf.add(Pizza_name);
            }
        }

        String[] devide_qnt = qnts.split(",");

        for (int i = 0; i < devide_qnt.length; i++) {
            label_qnts = new JLabel(devide_qnt[i]);

            if (!devide_qnt[i].isEmpty()) {

            }

            try {
                total_qnt += (Integer.parseInt(devide_qnt[i]));
            } catch (Exception e) {
            }
            if (i == 0) {
                label_qnts.setBounds(170, 150, 600, 80);
                jf.add(label_qnts);
            } else if (i == 1) {
                label_qnts.setBounds(170, 170, 600, 80);
                jf.add(label_qnts);
            } else if (i == 2) {
                label_qnts.setBounds(170, 190, 600, 80);
                jf.add(label_qnts);
            } else if (i == 3) {
                label_qnts.setBounds(170, 210, 600, 80);
                jf.add(label_qnts);
            }

        }

        if (jRadioButton1.isSelected()) {
            total = 300;
//            size = new JLabel("Pizza Size : " + jRadioButton1.getText() + "\n");

            for (int i = 0; i < split_name.length; i++) {

                try {
                    price = total * (Float.parseFloat(devide_qnt[i]));

                    size = new JLabel("" + total);
                    label_price = new JLabel("" + price);

                    if (i == 0) {
                        size.setBounds(275, 150, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 150, 200, 80);
                        jf.add(label_price);
                    } else if (i == 1) {
                        size.setBounds(275, 170, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 170, 200, 80);
                        jf.add(label_price);
                    } else if (i == 2) {
                        size.setBounds(275, 190, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 190, 200, 80);
                        jf.add(label_price);
                    } else if (i == 3) {
                        size.setBounds(275, 210, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 210, 200, 80);
                        jf.add(label_price);
                    }
                } catch (Exception e) {
                }
//                if (!devide_qnt[i].isEmpty()) {
//
//                }

            }
        }
        if (jRadioButton2.isSelected()) {
            total = 500;
//            size = new JLabel("Pizza Size : \n" + jRadioButton2.getText() + "\n");
//            size.setBounds(180, 130, 200, 80);
//            jf.add(size);

            for (int i = 0; i < split_name.length; i++) {

                try {
                    price = total * (Float.parseFloat(devide_qnt[i]));

                    label_price = new JLabel("" + price);

                    size = new JLabel("" + total);

                    if (i == 0) {
                        size.setBounds(275, 150, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 150, 200, 80);
                        jf.add(label_price);
                    } else if (i == 1) {
                        size.setBounds(275, 170, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 170, 200, 80);
                        jf.add(label_price);
                    } else if (i == 2) {
                        size.setBounds(275, 190, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 190, 200, 80);
                        jf.add(label_price);
                    } else if (i == 3) {
                        size.setBounds(275, 210, 200, 80);
                        jf.add(size);

                        label_price.setBounds(320, 210, 200, 80);
                        jf.add(label_price);
                    }
                } catch (Exception e) {
                }
                if (!devide_qnt[i].isEmpty()) {

                }
            }
        }
        if (jRadioButton3.isSelected()) {
            total = 1000;
//            size = new JLabel("Pizza Size : \n" + jRadioButton3.getText() + "\n");
//            size.setBounds(180, 150, 200, 80);
//            jf.add(size);

            for (int i = 0; i < split_name.length; i++) {

                try {
                    price = total * (Float.parseFloat(devide_qnt[i]));

                    label_price = new JLabel("" + price);

                    size = new JLabel("" + total);

                    if (i == 0) {
                        size.setBounds(275, 150, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 150, 200, 80);
                        jf.add(label_price);
                    } else if (i == 1) {
                        size.setBounds(275, 170, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 170, 200, 80);
                        jf.add(label_price);
                    } else if (i == 2) {
                        size.setBounds(275, 190, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 190, 200, 80);
                        jf.add(label_price);
                    } else if (i == 3) {
                        size.setBounds(275, 210, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 210, 200, 80);
                        jf.add(label_price);
                    }
                } catch (Exception e) {
                }
                if (!devide_qnt[i].isEmpty()) {

                }

            }
        }
        if (jRadioButton4.isSelected()) {
            total = 1500;
//            size = new JLabel("Pizza Size : \n" + jRadioButton4.getText() + "\n");
//            size.setBounds(180, 150, 200, 80);
//            jf.add(size);

            for (int i = 0; i < split_name.length; i++) {

                try {
                    price = total * (Float.parseFloat(devide_qnt[i]));

                    label_price = new JLabel("" + price);
                    size = new JLabel("" + total);

                    if (i == 0) {
                        size.setBounds(275, 150, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 150, 200, 80);
                        jf.add(label_price);
                    } else if (i == 1) {
                        size.setBounds(275, 170, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 170, 200, 80);
                        jf.add(label_price);
                    } else if (i == 2) {
                        size.setBounds(275, 190, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 190, 200, 80);
                        jf.add(label_price);
                    } else if (i == 3) {
                        size.setBounds(275, 210, 200, 80);
                        jf.add(size);

                        label_price.setBounds(340, 210, 200, 80);
                        jf.add(label_price);
                    }
                } catch (Exception e) {
                }
                if (!devide_qnt[i].isEmpty()) {

                }
            }
        }
        JLabel lable_toppings = new JLabel("<html><b>Extra Topping Charges : </b>" + toppings + "</html>");
        lable_toppings.setBounds(30, 230, 600, 80);
        jf.add(lable_toppings);

        JLabel toppingLableCost = new JLabel("" + topping_cost);
        toppingLableCost.setBounds(340, 230, 100, 80);
        jf.add(toppingLableCost);

        JLabel label_dash = new JLabel("--------------------------------------------------------------------------------");
        label_dash.setBounds(30, 250, 600, 80);
        label_dash.setFont(new Font("Verdana", Font.BOLD, 10));
        jf.add(label_dash);

        JLabel total_items = new JLabel("Items : " + split_name.length);
        total_items.setBounds(30, 270, 100, 80);
        total_items.setFont(new Font("Verdana", Font.BOLD, 12));
        jf.add(total_items);

        JLabel total_qnts = new JLabel("Qnts : " + total_qnt);
        total_qnts.setBounds(150, 270, 100, 80);
        total_qnts.setFont(new Font("Verdana", Font.BOLD, 12));
        jf.add(total_qnts);

        cost = (qnt1 + qnt2 + qnt3 + qnt4) * total + topping_cost;
        lable_cost = new JLabel("Total Amount : " + cost);
        lable_cost.setFont(new Font("Verdana", Font.BOLD, 12));
        lable_cost.setBounds(235, 270, 600, 80);
        jf.add(lable_cost);

        JLabel jl4 = new JLabel("_________________________________________________________");
        jl4.setBounds(30, 290, 500, 100);
        jl4.setForeground(Color.decode("#4286f4"));
        jf.add(jl4);

        JLabel jl6 = new JLabel("_________________________________________________________");
        jl6.setBounds(30, 292, 500, 100);
        jl6.setForeground(Color.decode("#4286f4"));
        jf.add(jl6);

        JLabel addr = new JLabel("Address : B-/102 Avadh Viceroy , Sarthana Jakatnaka, Surat");
        addr.setBounds(30, 310, 500, 100);
        jf.add(addr);

        JLabel thanku = new JLabel("                Thank YOu :) ");
        thanku.setFont(new Font("Algerian", Font.BOLD, 25));
        thanku.setForeground(Color.decode("#4286f4"));
        thanku.setBounds(30, 350, 500, 100);
        jf.add(thanku, BorderLayout.CENTER);

        JButton button = new JButton("Print");
        button.setBounds(400, 425, 70, 30);
        jf.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                PrinterJob pj = PrinterJob.getPrinterJob();
//
//                if (pj.printDialog()) {
//                    try {
//                        PageFormat pf = pj.pageDialog(pj.defaultPage());
//                        pf.setPaper(new Paper());
//                        pj.print();
//                    } catch (PrinterException exc) {
//                        System.out.println(exc);
//                    }
//                }

                Document document = new Document();
                try {
                    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Abhay\\Downloads\\" + c_name + ".pdf"));
                    document.open();
                    PdfContentByte contentByte = writer.getDirectContent();
                    PdfTemplate template = contentByte.createTemplate(500, 500);
                    Graphics2D g2 = template.createGraphics(500, 500);
                    jf.print(g2);
                    g2.dispose();
                    contentByte.addTemplate(template, 30, 300);

                } catch (Exception ex) {
                    Logger.getLogger(PizzaOrder.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    if (document.isOpen()) {
                        document.close();
                    }
                    JOptionPane.showMessageDialog(pizzaOrder1.this, "Bill saved successfully.\n\n" + "C:\\Users\\Abhay\\Downloads\\" + c_name + ".pdf");
                }

            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        frame = new JFrame();
        qnt1 = (Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the Margherita Pizza Quntity : ")));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        frame = new JFrame();
        qnt2 = (Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the Chesse 7 Quntity : ")));
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        frame = new JFrame();
        qnt3 = (Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the Burn to Hell Quntity : ")));
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        frame = new JFrame();
        qnt4 = (Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the Onion Pizza Quntity : ")));
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextField1.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pizzaOrder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizzaOrder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizzaOrder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizzaOrder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizzaOrder1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
