package projectmath;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DivisionHard implements ActionListener{
     public JFrame DivisionHardframe,scoreframe;
     public JPanel DivisionHardpanel,scorepanel;
     public JTextField aq1,aq2,aq3,aq4,aq5;
     public JLabel q1,q2,q3,q4,q5,scorelabel;
     public JButton score;
     public String c,f,i,l,o;
     
    public DivisionHard(){
        //creating the questions

         int min = 1;
         int max = 100;
        
         float a = (int)(Math.random() * (max - min)+min);
         float b = (int)(Math.random() * (max - min)+min);
          
         if (a%b == 0){
         
         c = String.format("%.0f", a/b);
         }
         else if (a%b != 0){
         
         c = String.format("%.1f", a/b);
         }
         System.out.println(c);
         /////////////////
         
         float d = (int)(Math.random() * (max - min)+min);
         float e = (int)(Math.random() * (max - min)+min);
         
         if (d%e == 0){
         
         f = String.format("%.0f",d/e);
         }
         else if (d%e != 0){
         
         f = String.format("%.1f",d/e);
         }
         System.out.println(f);
         //////////////////////
         
         float g = (int)(Math.random() * (max - min)+min);
         float h = (int)(Math.random() * (max - min)+min);
         
         if (g%h == 0){
         i = String.format("%.0f", g/h);
         }
         else if (g%h != 0){
         i = String.format("%.1f", g/h);
         }
         System.out.println(i);
         //////////////////////
         
         float j = (int)(Math.random() * (max - min)+min);
         float k = (int)(Math.random() * (max - min)+min);
         
         if(j%k == 0){
         l = String.format("%.0f", j/k);
         }
         else if (j%k != 0){
         l = String.format("%.1f", j/k);
         }
         System.out.println(l);
         /////////////////////
         
         float m = (int)(Math.random() * (max - min)+min);
         float n = (int)(Math.random() * (max - min)+min);
         
         if (m%n == 0){
         o = String.format("%.0f", m/n);
         }
         else if (m%n != 0){
         o = String.format("%.1f", m/n);
         }
         System.out.println(o);
          
         //creating the Division JFrame
         DivisionHardframe = new JFrame();
         DivisionHardframe.setSize(700, 300);
         DivisionHardframe.setLayout(new BorderLayout());
         DivisionHardframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         DivisionHardframe.setTitle("Fun Math Quiz, Division!");
         
         //creating the panel
         DivisionHardpanel = new JPanel();
         DivisionHardpanel.setLayout(null);
         DivisionHardpanel.setBackground(Color.cyan);
         
         //adding question one to the panel
         q1=new JLabel(a+" "+"÷"+" "+b+" "+"= ");
         q1.setBounds(270, 20, 80, 20);
         DivisionHardpanel.add(q1);
         //addint the answer's textfield
         aq1=new JTextField();
         aq1.setBounds(350, 20, 50, 20);
         DivisionHardpanel.add(aq1);
         
         //adding question two to the panel
         q2=new JLabel(d+" "+"÷"+" "+e+" "+"= ");
         q2.setBounds(270, 50, 80, 20);
         DivisionHardpanel.add(q2);
         //addint the answer's textfield
         aq2=new JTextField();
         aq2.setBounds(350, 50, 50, 20);
         DivisionHardpanel.add(aq2);
         
         //adding question three to the panel
         q3=new JLabel(g+" "+"÷"+" "+h+" "+"= ");
         q3.setBounds(270, 80, 80, 20);
         DivisionHardpanel.add(q3);
         //addint the answer's textfield
         aq3=new JTextField();
         aq3.setBounds(350, 80, 50, 20);
         DivisionHardpanel.add(aq3);
         
         //adding question four to the panel
         q4=new JLabel(j+" "+"÷"+" "+k+" "+"= ");
         q4.setBounds(270, 110, 80, 20);
         DivisionHardpanel.add(q4);
         //addint the answer's textfield
         aq4=new JTextField();
         aq4.setBounds(350, 110, 50, 20);
         DivisionHardpanel.add(aq4);
         
         //adding question five to the panel
         q5=new JLabel(m+" "+"÷"+" "+n+" "+"= ");
         q5.setBounds(270, 140, 80, 20);
         DivisionHardpanel.add(q5);
         //addint the answer's textfield
         aq5=new JTextField();
         aq5.setBounds(350, 140, 50, 20);
         DivisionHardpanel.add(aq5);

         //creating the get score button
         score = new JButton("Get Score!");
         score.addActionListener(this);
         score.setBounds(300,180, 100, 20);
         DivisionHardpanel.add(score);
         
         //adding the JPanel and it's components to the JFrame
         DivisionHardframe.add(DivisionHardpanel);
         DivisionHardframe.setVisible(true);  
    }
    
    public void main(String[] args){
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == score){
             // closing the Division JFrame
             DivisionHardframe.dispose();
             //counting the scores
             
             int score = 0;
             
             if (c.equalsIgnoreCase(aq1.getText())){                 
                 score++;
             }
             if (f.equalsIgnoreCase(aq2.getText())){          
                 score++;
             }
             if (i.equalsIgnoreCase(aq3.getText())){ 
                 score++;
             }
             if (l.equalsIgnoreCase(aq4.getText())){
                 score++;
             }
             if (o.equalsIgnoreCase(aq5.getText())){     
                 score++;
             }
             //creating the score JFrame
             scoreframe = new JFrame();
             scoreframe.setSize(200, 200);
             scoreframe.setLayout(new BorderLayout());
             scoreframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             scoreframe.setTitle("Score!");
             
             // creating the score JPanel    
             scorepanel = new JPanel();
             scorepanel.setLayout(null);
             scorepanel.setBackground(Color.pink);
             
             //adding the score to the panel   
             scorelabel = new JLabel("Your score is: " + score+"/5");
             scorelabel.setBounds(50, 80, 100, 20);
             scorepanel.add(scorelabel);
             
             //adding the JPanel and it's components to the JFrame
             scoreframe.add(scorepanel);
             scoreframe.setVisible(true);
        }
    } 
}