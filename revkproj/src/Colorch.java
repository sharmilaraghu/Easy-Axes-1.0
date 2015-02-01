/* Copyright (C) 2010 Rajkumar.S , V.Dhinakaran

 This file is part of 'Paint Your Mind'.

 'Paint Your Mind' is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Foobar is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with 'Paint Your Mind'.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.*;
import javax.sound.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Colorch.java
 *
 * Created on Jan 11, 2010, 8:48:54 PM
 */
/**
 *
 * @author Raj
 */
class grid extends Thread {

    JButton b1, b2;
    int i = -1;
    JToggleButton jt;

    grid(JButton a, JButton b, JToggleButton c) {
        b1 = a;
        b2 = b;
        jt = c;
    }

    @Override
    public void run() {
        while (true) {
            b1.setEnabled(false);
            b2.setEnabled(false);

            i = (i + 1) % 2;
            if (i == 0) {
                if (jt.isSelected() == true) {

                    jt.setSelected(false);

                    break;
                }
                b1.setEnabled(true);
            } else if (i == 1) {
                if (jt.isSelected() == true) {

                    jt.setSelected(false);
                    break;
                }
                b2.setEnabled(true);

            }
            try {

                Thread t = Thread.currentThread();
                //t.setPriority(Thread.MAX_PRIORITY);

                Thread.sleep(10000);

                //t.join();
            } catch (Exception e) {
            }
        }
        return;
    }
}

class speed extends Thread {

    JButton b1, b2, b3;
    int i = -1;
    JToggleButton jt;

    speed(JButton a, JButton b, JButton c, JToggleButton d) {
        b1 = a;
        b2 = b;
        b3 = c;
        jt = d;
    }

    @Override
    public void run() {
        while (true) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);

            i = (i + 1) % 3;
            if (i == 0) {
                if (jt.isSelected() == true) {

                    jt.setSelected(false);
                    break;
                }
                b1.setEnabled(true);
            } else if (i == 1) {
                if (jt.isSelected() == true) {

                    jt.setSelected(false);
                    break;
                }
                b2.setEnabled(true);
            } else if (i == 2) {
                if (jt.isSelected() == true) {

                    jt.setSelected(false);
                    break;
                }
                b3.setEnabled(true);
            }

            try {

                Thread t = Thread.currentThread();
                Thread.sleep(10000);


            } catch (Exception e) {
            }
        }
        return;
    }
}

class color1 extends Thread {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int i = -1, flag = 1;
    JToggleButton jt;

    color1(JButton a, JButton b, JButton c, JButton d, JButton e, JButton f, JButton g, JButton h, JButton j, JToggleButton ba) {
        b1 = a;
        b2 = b;
        b3 = c;
        b4 = d;
        b5 = e;
        b6 = f;
        b7 = g;
        b8 = h;
        b9 = j;
        jt = ba;

    }

    @Override
    public void run() {
        while (true) {
            //b1.setForeground(Color.LIGHT_GRAY);

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            /*b2.setForeground(Color.LIGHT_GRAY);
             b3.setForeground(Color.LIGHT_GRAY);
             b4.setForeground(Color.LIGHT_GRAY);
             b5.setForeground(Color.LIGHT_GRAY);
             b6.setForeground(Color.LIGHT_GRAY);
             b7.setForeground(Color.LIGHT_GRAY);
             b8.setForeground(Color.LIGHT_GRAY);
             b9.setForeground(Color.LIGHT_GRAY);*/
            i = (i + 1) % 9;

            if (i == 0) {
                if (jt.isSelected() == true) {

                    jt.setSelected(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    break;
                }
                b1.setEnabled(true);

            } else if (i == 1) {
                b2.setEnabled(true);
                if (jt.isSelected() == true) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    jt.setSelected(false);
                    return;
                }
            } else if (i == 2) {
                b3.setEnabled(true);
                if (jt.isSelected() == true) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    jt.setSelected(false);
                    break;
                }
            } else if (i == 3) {
                b4.setEnabled(true);
                if (jt.isSelected() == true) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    jt.setSelected(false);
                    break;
                }
            } else if (i == 4) {
                b5.setEnabled(true);
                if (jt.isSelected() == true) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    jt.setSelected(false);
                    break;
                }
            } else if (i == 5) {
                b6.setEnabled(true);
                if (jt.isSelected() == true) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    jt.setSelected(false);
                    break;
                }
            } else if (i == 6) {
                b7.setEnabled(true);
                if (jt.isSelected() == true) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    jt.setSelected(false);
                    break;
                }
            } else if (i == 7) {
                b8.setEnabled(true);
                if (jt.isSelected() == true) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    jt.setSelected(false);
                    break;
                }
            } else {
                b9.setEnabled(true);
                if (jt.isSelected() == true) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    jt.setSelected(false);
                    break;
                }
            }
            try {

                Thread t = Thread.currentThread();
                t.setPriority(Thread.MAX_PRIORITY);

                Thread.sleep(10000);

                //t.join();
            } catch (Exception e) {
            }
        }
        return;
    }
}

public class Colorch extends javax.swing.JFrame {

    colorc C;
    color1 c11;
    Color co = Color.WHITE;
    speed s1;
    grid g1;
    int flag = 1, cc = 1, ac = 0, sped = 10000, grd = 10;

    /**
     * Creates new form Colorch
     */
    public Colorch() {

        initComponents();
        //this.getContentPane().setBackground(Color.decode(""));
        this.getContentPane().setBackground(Color.BLACK);
        C = new colorc(jButton11, jButton12, jButton13, jButton20);
        //jLabel2.setText("Click on the HIT button to");
        //jLabel3.setText("select the values for the options..");
        C.start();
    }

    /* This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton10.setText("COLOR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(java.awt.Color.black);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w.jpg"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.jpg"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bl.jpg"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g.jpg"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/r.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/y.jpg"))); // NOI18N

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p.jpg"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/o.jpg"))); // NOI18N
        jButton6.setAlignmentY(0.0F);
        jButton6.setAutoscrolls(true);
        jButton6.setMaximumSize(new java.awt.Dimension(117, 117));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.jpg"))); // NOI18N

        jButton11.setText("COLOR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("SPEED");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("GRID");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("HIT");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("SLOW");

        jButton16.setText("MEDIUM");

        jButton17.setText("FAST");

        jToggleButton1.setText("jToggleButton1");

        jButton18.setText("10 X 10");

        jButton19.setText("20 X 20");

        jButton20.setText("SUBMIT");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("  CLICK HIT TO CHOOSE OPTIONS ");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(265, 265, 265)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton3))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:

       //jLabel2.setForeground(Color.YELLOW);
        if (flag == 1) {
            cc = C.i;
            if (cc == 0) {
                jButton11.doClick();
            } else if (cc == 1) {
                jButton12.doClick();
            } else if (cc == 2) {
                jButton13.doClick();
            } else if (cc == 3) {
                jButton20.doClick();
            }
            flag = 0;
        } else if (cc == 0) {
            ac = c11.i;
            jToggleButton1.setSelected(true);
            jLabel1.setText("" + ac);
            if (ac == 0) {
                co = Color.WHITE;
            } else if (ac == 1) {
                co = Color.BLACK;
            } else if (ac == 2) {
                co = Color.GREEN;
            } else if (ac == 3) {
                co = Color.RED;
            } else if (ac == 4) {
                co = Color.BLUE;
            } else if (ac == 5) {
                co = Color.ORANGE;
            } else if (ac == 6) {
                co = Color.YELLOW;
            } else if (ac == 7) {
                co = Color.getHSBColor(12, 108, 95);
            } else if (ac == 8) {
                co = Color.PINK;
            }
            jButton10.setForeground(co);
            flag = 1;
            jButton11.setEnabled(true);
            jButton12.setEnabled(true);
            jButton13.setEnabled(true);
            jButton20.setEnabled(true);
            jLabel3.setText("Values for the options..");
            /*if(ac==0)
             */
        } else if (cc == 1) {
            ac = s1.i;
            jToggleButton1.setSelected(true);
            if (ac == 0) {
                sped = 1;
            } else if (ac == 1) {
                sped = 2;
            } else if (ac == 2) {
                sped = 3;
            }
            jLabel1.setText("" + sped);
            flag = 1;
            jButton11.setEnabled(true);
            jButton12.setEnabled(true);
            jButton13.setEnabled(true);
            jButton20.setEnabled(true);
            jLabel3.setText("Values for the options..");
        } else if (cc == 2) {
            ac = g1.i;
            jToggleButton1.setSelected(true);
            if (ac == 0) {
                grd = 10;
            } else {
                grd = 20;
            }
            flag = 1;
            jLabel1.setText("" + grd);
            jButton11.setEnabled(true);
            jButton12.setEnabled(true);
            jButton13.setEnabled(true);
            jButton20.setEnabled(true);
            jLabel3.setText("Values for the options..");
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        c11 = new color1(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jToggleButton1);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton20.setEnabled(false);
        jLabel3.setText("Desired color when highlighted");
        c11.start();

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        s1 = new speed(jButton15, jButton16, jButton17, jToggleButton1);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton20.setEnabled(false);
        jLabel3.setText("Desired speed when highlighted");
        s1.start();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        g1 = new grid(jButton18, jButton19, jToggleButton1);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton20.setEnabled(false);
        jLabel3.setText("Desired grid size when highlighted");
        g1.start();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        paintfrm pr;
        pr = new paintfrm(co, sped, grd);

        this.setVisible(false);
        pr.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        jButton14MouseClicked(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First().setVisible(true);
                //new Colorch().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

class colorc extends Thread {

    JButton b1, b2, b3, b4;
    int i;

    colorc(JButton a, JButton b, JButton c, JButton d) {
        b1 = a;
        b2 = b;
        b3 = c;
        b4 = d;
        i = -1;
    }

    public void run() {
        while (true) {
            b1.setForeground(Color.BLACK);
            b2.setForeground(Color.BLACK);
            b3.setForeground(Color.BLACK);
            b4.setForeground(Color.BLACK);
            i = (i + 1) % 4;
            if (i == 0) {


                b1.setForeground(Color.MAGENTA);
                File soundFile = new File("color.wav");

                try {

                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    Clip clip = AudioSystem.getClip();

                    clip.open(audioIn);

                    //clip.start();
                    clip.start();
                    //clip.loop(5);

                } catch (Exception m) {
                }
            } else if (i == 1) {
                b2.setForeground(Color.MAGENTA);
                File soundFile = new File("speed.wav");
                try {

                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    Clip clip = AudioSystem.getClip();

                    clip.open(audioIn);

                    //clip.start();
                    clip.start();
                    //  clip.loop(5);

                } catch (Exception m) {
                }
            } else if (i == 2) {
                b3.setForeground(Color.MAGENTA);
                File soundFile = new File("grid.wav");


                try {

                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    Clip clip = AudioSystem.getClip();

                    clip.open(audioIn);

                    //clip.start();
                    clip.start();
                    //  clip.loop(5);

                } catch (Exception m) {
                }
            } else {


                b4.setForeground(Color.MAGENTA);
                File soundFile = new File("okay.wav");
                //String sss+"okay.wav";
                //File soundFile=new File(sss);
                try {

                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    Clip clip = AudioSystem.getClip();

                    clip.open(audioIn);

                    //clip.start();
                    clip.start();
                    //  clip.loop(5);

                } catch (Exception m) {
                }
            }
            try {
                Thread.sleep(10000);
                Thread t = Thread.currentThread();
                t.setPriority(Thread.MIN_PRIORITY);

            } catch (Exception e) {
            }
        }
    }
}