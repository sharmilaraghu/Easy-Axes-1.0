
import java.awt.Color;
import javax.swing.JButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class number extends javax.swing.JFrame {

    /**
     * Creates new form number
     */
    int step,spee,gri;
    Color col;
    public number() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
    }
public number(int st,int speed,int grid,Color colour)
{
     initComponents();
     this.getContentPane().setBackground(Color.BLACK);
    step=st;
    spee=speed;
    gri=grid;
    col=colour;
    numbers ns=new numbers(jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,spee);
     ns.start();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 747));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 204));
        jLabel1.setText("CHOOSE NUMBER OF POINTS TO PLOT");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton1.setText("3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton2.setText("4");

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton3.setText("5");

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton4.setText("6");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton5.setText("7");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton6.setText("8");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton7.setText("9");

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton8.setText("10");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
         int no = 0;
        if(jButton1.getBackground()==Color.MAGENTA)
        {
            no=3;
        }
        else if(jButton2.getBackground()==Color.MAGENTA)
        {
            no=4;
        }
        else if(jButton3.getBackground()==Color.MAGENTA)
        {
            no=5;
            
        }
         else if(jButton4.getBackground()==Color.MAGENTA)
        {
            no=6;
            
        }
         else if(jButton5.getBackground()==Color.MAGENTA)
        {
            no=7;
            
        }
         else if(jButton6.getBackground()==Color.MAGENTA)
        {
            no=8;
            
        }
         else if(jButton7.getBackground()==Color.MAGENTA)
        {
            no=9;
            
        }
         else if(jButton8.getBackground()==Color.MAGENTA)
        {
            no=10;
            
        }
        /* else if(jButton9.getBackground()==Color.CYAN)
        {
            c=Color.DARK_GRAY;
            
        }*/
        
        input in=new input(step,spee,gri,col,no);
        in.setVisible(true);
        this.setVisible(false);
                              
    }//GEN-LAST:event_formMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new number().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
class numbers extends Thread
{
      JButton  b1,b2,b3, b4, b5, b6, b7, b8;
    int i,step,spe,gri;
    Color c1;
    

    numbers( JButton a, JButton b, JButton c, JButton d, JButton e, JButton f, JButton g,JButton h,int s)
    {
        b1 = a;
        b2 = b;
        b3 = c;
        b4 = d;
        b5 = e;
        b6 = f;
        b7 = g;
        b8 = h;
        //b9 = j;
        i=-1;
      //  step=ste;
        //c1=co;
        spe=s;
        //gri=gr;
    }

    @Override
    public void run() {
        while (true) {
             b1.setBackground(Color.LIGHT_GRAY);
             b2.setBackground(Color.LIGHT_GRAY);
             b3.setBackground(Color.LIGHT_GRAY);
             b4.setBackground(Color.LIGHT_GRAY);
             b5.setBackground(Color.LIGHT_GRAY);
             b6.setBackground(Color.LIGHT_GRAY);
             b7.setBackground(Color.LIGHT_GRAY);
             b8.setBackground(Color.LIGHT_GRAY);
            // b9.setBackground(Color.LIGHT_GRAY);
             b1.setForeground(Color.BLACK);
             b2.setForeground(Color.BLACK);
             b3.setForeground(Color.BLACK);
             b4.setForeground(Color.BLACK);
             b5.setForeground(Color.BLACK);
             b6.setForeground(Color.BLACK);
             b7.setForeground(Color.BLACK);
             b8.setForeground(Color.BLACK);
             //b9.setForeground(Color.DARK_GRAY);
            /*b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);*/
           
            i = (i + 1) % 8;

            if (i == 0)
            {
                b1.setBackground(Color.MAGENTA);
                b2.setBackground(Color.LIGHT_GRAY);
                b3.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b7.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.LIGHT_GRAY);
               // b9.setBackground(Color.LIGHT_GRAY);
            }
           else 
            if (i == 1)
            {
                b2.setBackground(Color.MAGENTA);
                b1.setBackground(Color.LIGHT_GRAY);
                b3.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b7.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.LIGHT_GRAY);
//                b9.setBackground(Color.LIGHT_GRAY);
            }
            else
            if (i == 2) 
            {
               b3.setBackground(Color.MAGENTA);
                b2.setBackground(Color.LIGHT_GRAY);
                b1.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b7.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.LIGHT_GRAY);
//                b9.setBackground(Color.LIGHT_GRAY);
            }
            else
            if (i == 3)
            {
                b4.setBackground(Color.MAGENTA);
                b2.setBackground(Color.LIGHT_GRAY);
               b3.setBackground(Color.LIGHT_GRAY);
                b1.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b7.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.LIGHT_GRAY);
//                b9.setBackground(Color.LIGHT_GRAY);
            }
            else
            if (i == 4)
            {
                b5.setBackground(Color.MAGENTA);
                b2.setBackground(Color.LIGHT_GRAY);
                b3.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
               b1.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b7.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.LIGHT_GRAY);
//                b9.setBackground(Color.LIGHT_GRAY);
            }
            else
            if (i == 5)
            {
                b6.setBackground(Color.MAGENTA);
                b2.setBackground(Color.LIGHT_GRAY);
                b3.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b1.setBackground(Color.LIGHT_GRAY);
                b7.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.CYAN);
                //b9.setBackground(Color.LIGHT_GRAY);
            }
            else
            if (i == 6)
            {
                b7.setBackground(Color.MAGENTA);
                b2.setBackground(Color.LIGHT_GRAY);
               b3.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b1.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.LIGHT_GRAY);
                //b9.setBackground(Color.CYAN);
            } 
             else
            if (i == 7)
            {
                b7.setBackground(Color.LIGHT_GRAY);
                b2.setBackground(Color.LIGHT_GRAY);
               b3.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b1.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.MAGENTA);
                //b9.setBackground(Color.CYAN);
            } 
           
            try {

                Thread t = Thread.currentThread();
                t.setPriority(Thread.MAX_PRIORITY);

                Thread.sleep(spe);

                //t.join();
            } catch (Exception e) {
            }
        }
      
    }
}
