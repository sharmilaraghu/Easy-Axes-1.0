
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToggleButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class third extends javax.swing.JFrame {

    /**
     * Creates new form third
     */
    int speed;
    public third()
    {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK); 
    }
    public third(int s) 
    {
        initComponents();
        speed=s;
        this.getContentPane().setBackground(Color.BLACK); 
        grd g1=new grd(jButton1,jButton2,speed);
        g1.start();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1096, 666));
        setMinimumSize(new java.awt.Dimension(1096, 666));
        setPreferredSize(new java.awt.Dimension(1360, 747));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT GRID SIZE");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton1.setText("10 X 10");

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton2.setText("20 X 20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        int g=0;
        Color c1,c2;
        c1=jButton1.getBackground();
        c2=jButton2.getBackground();
        if(c1==Color.GREEN)
        {
            g=10;
        }
        else
            if(c2==Color.GREEN)
            {
             g=20;   
            }
        fourth fo=new fourth(speed,g);
        fo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       //int s=speed;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new third().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

class grd extends Thread {

    JButton b1, b2;
    int i,s;

    grd(JButton a, JButton b,int sp)
    {
        b1 = a;
        b2 = b;
        i=-1;
        s=sp;        
    }

    @Override
    public void run() 
    {
        while (true)
        {
            /*b1.setEnabled(false);
            b2.setEnabled(false);*/
            b1.setBackground(Color.LIGHT_GRAY);
            b2.setBackground(Color.LIGHT_GRAY);
            b1.setForeground(Color.BLACK);
            b2.setForeground(Color.BLACK);


            i = (i + 1) % 2;
            if (i == 0)
            {
                b1.setBackground(Color.GREEN);
                b2.setBackground(Color.LIGHT_GRAY);
            }
            else if (i == 1) 
            {
               b2.setBackground(Color.GREEN);
               b1.setBackground(Color.LIGHT_GRAY);
            }
            try {

                Thread t = Thread.currentThread();
                //t.setPriority(Thread.MAX_PRIORITY);

                Thread.sleep(s);

                //t.join();
            } catch (Exception e) {
            }
        }
    }
}
