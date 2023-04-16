package tictactoc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;




public class mywindow extends JFrame  {

     JLabel heading ,clockLabel;
     Font font = new Font("", Font.BOLD, 25);
     JPanel mainpJPanel;
     JButton []butt =new JButton[9];
     

      mywindow(){

        super.setTitle("Tictactoc...");
        super.setSize(500, 400);
        this.gui();
        super.setLocation(40, 100);
        super.setBackground(getForeground());
       
 
       ImageIcon icon = new ImageIcon("img/icon.png");
       setIconImage(icon.getImage());
       
       
       getContentPane().setBackground(Color.BLACK);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       super.setVisible(true);
       
     }

     
    
    public void gui() {
     heading = new JLabel("Digital Clock");
      // north heading 
       heading.setFont(font);
       this.add(heading,BorderLayout.NORTH);
       heading.setHorizontalAlignment(SwingConstants.CENTER);
       
      // creating object for clock

      clockLabel = new JLabel("Clock");
      clockLabel.setFont(font);
      this.add(clockLabel,BorderLayout.SOUTH);
      clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
     
     
     /**
     *
     */
    Thread t = new Thread(){

      public void run() {
        
        try {
          
          while(true){
            String datetime = new Date().toLocaleString();

            clockLabel.setText(datetime);
            Thread.sleep(1000);

          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
     
       }; 
       
    t.start();

    /// panal


    
      }



}
