import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.image.ImageProducer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
class Line extends Thread
{
    Graphics g;
    JDesktopPane j1;
     int countx=1,grid,speed,x1;
     int county=1,j=1,i=1,y1;
     JToggleButton jt;
    Line(JDesktopPane jDesktopPane1,JToggleButton jt1,int g1,int s,int x,int y)
    {
     g=jDesktopPane1.getGraphics();
     j1=jDesktopPane1;
     jt=jt1;
     grid=g1;
     speed=s;
     x1=x;
     y1=y;
    }
    public void runx()
    {
      g.setColor(Color.LIGHT_GRAY);
      int flag=1,o=1,z=0;
      for(countx=1;countx<=grid;countx++)
       {
          String disp="";
          o=countx*x1;
          disp+=o;
          for(i=1;i<=grid;i++)
          {
               if(jt.isSelected()==true)
                {

                    jt.setSelected(false);
                    flag=0;
                    return;
                }

                if(i==countx)
                {
                    g.setColor(Color.RED);
                    g.drawString(disp,j1.getWidth()/grid*i,40);
                    z=j1.getWidth()/grid*i;
                }
                int x=j1.getWidth()/2;
                int y=j1.getHeight()/2;
                int gr=j1.getWidth()/grid;
                int gry=j1.getHeight()/grid;
                //int i=0,count=0;
                g.drawLine(gr*i, 0, gr*i, 2*y);
                g.setColor(Color.LIGHT_GRAY);
            }
            try
            {
                Thread t=Thread.currentThread();
                t.setPriority(Thread.MAX_PRIORITY);
                Thread.sleep(speed);
            }
            catch(Exception e)
            {
            }
            if(flag==0)
                break;
            if(countx==grid)
                countx-=grid;
            }


    }
     public void stopx()
    {
        g.setColor(Color.LIGHT_GRAY);
        int flag=1,o1=1,z1=0;
        for(county=1;county<=grid;county++)
        {
            String disp="";
            o1=county*y1;
            disp+=o1;
            for(j=1;j<=grid;j++)
            {
               if(jt.isSelected()==true)
                {

                    jt.setSelected(false);
                    flag=0;
                    return;
                }

                if(j==county)
                {
                    g.setColor(Color.RED);
                    g.drawString(disp,40,j1.getHeight()/grid*j);
                      z1=j1.getHeight()/grid*j;
                }
                int x=j1.getWidth()/2;
                int y=j1.getHeight()/2;
      
                int gr=j1.getWidth()/grid;
                  int gry=j1.getHeight()/grid;
              
                    g.drawLine(0, j*gry, 2*x,j*gry);
                    g.setColor(Color.LIGHT_GRAY);


            }
            try
            {
                Thread t=Thread.currentThread();
                t.setPriority(Thread.MAX_PRIORITY);
                Thread.sleep(speed);
            }
            catch(Exception e)
            {

            }
            if(flag==0)
                break;
            if(county==grid)
            county-=grid;

    }
    }
    @Override
        public void run()
        {
            runx();
            stopx();
            runx();
            stopx();             
}
}
public class paintfrm extends javax.swing.JFrame  {
    int cc=0,ac=0,speed=10000,grid=10,k1=10,k2=0,lg=0;
    int sx=0,sy=0;
//    colorchg C;
    Line l;
//    Point p;
    Graphics g;
    Color col;
    Color color=Color.BLACK;
    int x1,x2,y1,y2,xc,yc,rc,xr,yr,xr2,yr2,flag=1,xp=1,yp=1,f1=1;
    /** Creates new form paintfrm */
    public paintfrm(Color c,int s,int gr)
    {
        color=c;
        if(s==1)
            speed=10000;
        else if (s==2)
            speed=9000;
        else
            speed=7000;
        grid=gr;
        initComponents();
        // C=new colorchg(jButton2);
        //C.start();
         l=new Line(jDesktopPane1,jToggleButton2,grid,speed,sx,sy);
                 g=jDesktopPane1.getGraphics();
         //        l=new Line(jDesktopPane1,jToggleButton2,grid,speed,sx,sy);
       // l.start();

    }
    public paintfrm() {
        initComponents();
          
         //C=new colorchg(jButton2);
        //C.start();
        l=new Line(jDesktopPane1,jToggleButton2,grid,speed,sx,sy);
        //l.start();
        
        //cir=new Circle(jDesktopPane1,jLabel11,jLabel12,jToggleButton2,grid,speed,sx,sy);
        g=jDesktopPane1.getGraphics();
        //l.start();   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton7 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint-Untitled1");
        setBackground(new java.awt.Color(102, 0, 153));
        setForeground(new java.awt.Color(204, 0, 255));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        filler1.setBounds(0, 0, 150, 0);
        jDesktopPane1.add(filler1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Hit");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Select");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("jToggleButton2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton20.setText("End");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jButton7))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton2)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jToggleButton1)
                            .addGap(25, 25, 25))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(850, 850, 850)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(494, 494, 494)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(274, 274, 274))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-801)/2, (screenSize.height-525)/2, 801, 525);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        jDesktopPane1.repaint();
      

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
     l=new Line(jDesktopPane1,jToggleButton2,grid,speed,sx,sy);
     l.start();        
    }//GEN-LAST:event_formMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
   //int cfg;
        if(ac==0)
        {
           // jLabel13.setText(""+cc);
            jLabel13.setText("x co-ordinate for the first point being chosen");
           
         //flag=0;
           // l.stopx();
          }
        else
        {   
          if(ac==1)
            {
                    //if(jToggleButton1.isSelected()==true)
                    {
                        jLabel13.setText("the y co-ordinate for the first point being chosen");
                 //      String n;
                        if(l==null)
            return;
         String n;
         n=String.valueOf(l.countx);
         x1=l.countx;
         ac++;   
                        /* if(l==null)
                            return;
                        String n;
                        n=String.valueOf(l.countx);
                        x1=l.countx;
                        jToggleButton2.setSelected(true);
                        ac++;
                        jToggleButton2.setSelected(true);*/
                       
                       }

                }
            else if(ac==2)
            {
                    {
                        if(l==null)
                            return;
                        String n;
                        jLabel13.setText("the x co-ordinate for the second point being chosen");
                        n=String.valueOf(l.county);
                        y1=l.county;
                        ac++;
                        jToggleButton2.setSelected(true);
                         int gr=jDesktopPane1.getWidth()/grid;
                          x1=x1*gr;
                          y1=y1*gr;
 //jLabel13.setText("Select the x co-ordinate for the second point");
                      Graphics g=jDesktopPane1.getGraphics();
                      g.fillOval(x1-2, y1-2, 6,6);
//al.runx();
                        /* n=String.valueOf(l.county);
                        y1=l.county;
                        ac++;
                        jToggleButton2.setSelected(true);
                         int gr=jDesktopPane1.getWidth()/grid;
                          x1=x1*gr;
                          y1=y1*gr;
 jLabel13.setText("Select the x co-ordinate for the second point");
                      Graphics g=jDesktopPane1.getGraphics();
                      g.fillOval(x1-2, y1-2, 6,6);*/
  if(l==null)
                        return;
  ac++;
                        n=String.valueOf(l.countx);
                        x2=l.countx;
                       // l.stopx();
                    }
                }

            else if(ac==3)
            {                  
                    {
                      /*  if(l==null)
                            return;
                        String n;
                        n=String.valueOf(l.countx);
                        x2=l.countx;
                        jToggleButton2.setSelected(true);
                        ac++;*/
                        jLabel13.setText("Select the y co-ordinate for the second point");
 if(l==null)
                            return;
                        String n;
                        n=String.valueOf(l.county);
                        y2=l.county;
                        jToggleButton2.setSelected(true);
                        ac++;
                        jLabel13.setText("Select the y co-ordinate for the second point");                     
                      int gr=jDesktopPane1.getWidth()/grid;
                  //x1=x1*gr;
                  x2=x2*gr;
                  //y1=y1*gr;
                  y2=y2*gr;
                Graphics g=jDesktopPane1.getGraphics();
                g.setColor(color);
               
                g.fillOval(x2-2, y2-2, 6, 6);
                g.setColor(color);
                g.drawString("("+x1+","+y1+")",x1-4,y1-4);
                g.drawString("("+x2+","+y2+")",x2-4,y2-4);
                g.drawLine(x1, y1, x2, y2);
                ac=1;
                flag=1;
                    }
                }

            /*else if(ac==4)
            {
                    //if(jToggleButton1.isSelected()==true)
                    {
                        if(l==null)
                            return;
                        String n;
                        n=String.valueOf(l.county);
                        y2=l.county;
                        jToggleButton2.setSelected(true);
                        ac++;
                        jLabel13.setText("Select the y co-ordinate for the second point");                     
                      int gr=jDesktopPane1.getWidth()/grid;
                  //x1=x1*gr;
                  x2=x2*gr;
                  //y1=y1*gr;
                  y2=y2*gr;
                Graphics g=jDesktopPane1.getGraphics();
                g.setColor(color);
               
                g.fillOval(x2-2, y2-2, 6, 6);
                g.setColor(color);
                g.drawString("("+x1+","+y1+")",x1-4,y1-4);
                g.drawString("("+x2+","+y2+")",x2-4,y2-4);
                g.drawLine(x1, y1, x2, y2);
                ac=1;
                flag=1;
            }
            }*/
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
       
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
       // C.flag=1;
        //chh.setVisible(true);
        new Colorch().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paintfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

}
