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


public class Subtraction implements ActionListener{
     public JFrame Subtractionframe,scoreframe;
     public JPanel Subtractionpanel,scorepanel;
     public JTextField aq1,aq2,aq3,aq4,aq5;
     public JLabel q1,q2,q3,q4,q5,scorelabel;
     public JButton score;
     public String c,f,i,l,o;
     
    public Subtraction(){
        //creating the questions
         int min = 0;
         int max = 9;
         
         int a = (int)(Math.random() * ((max - min)+min));
         int b = (int)(Math.random() * ((max - min)+min));
         int x = a-b;
         c = Integer.toString(x);
         int d = (int)(Math.random() * ((max - min)+min));
         int e = (int)(Math.random() * ((max - min)+min));
         int y = d-e;
         f = Integer.toString(y);
         int g = (int)(Math.random() * ((max - min)+min));
         int h = (int)(Math.random() * ((max - min)+min));
         int z = g-h;
         i = Integer.toString(z);
         int j = (int)(Math.random() * ((max - min)+min));
         int k = (int)(Math.random() * ((max - min)+min));
         int w = j-k;
         l = Integer.toString(w);
         int m = (int)(Math.random() * ((max - min)+min));
         int n = (int)(Math.random() * ((max - min)+min));
         int v = m-n;
         o = Integer.toString(v);
          
         //creating the Subtraction JFrame
         Subtractionframe = new JFrame();
         Subtractionframe.setSize(700, 300);
         Subtractionframe.setLayout(new BorderLayout());
         Subtractionframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Subtractionframe.setTitle("Fun Math Quiz, Subtraction!");
         
         //creating the panel
         Subtractionpanel = new JPanel();
         Subtractionpanel.setLayout(null);
         Subtractionpanel.setBackground(Color.cyan);
               

         //adding question one to the panel
         q1=new JLabel(a+" "+"-"+" "+b+" "+"= ");
         q1.setBounds(300, 20, 45, 20);
         Subtractionpanel.add(q1);
         //addint the answer's textfield
         aq1=new JTextField();
         aq1.setBounds(350, 20, 50, 20);
         Subtractionpanel.add(aq1);
         
         //adding question two to the panel
         q2=new JLabel(d+" "+"-"+" "+e+" "+"= ");
         q2.setBounds(300, 50, 45, 20);
         Subtractionpanel.add(q2);
         //addint the answer's textfield
         aq2=new JTextField();
         aq2.setBounds(350, 50, 50, 20);
         Subtractionpanel.add(aq2);
         
         //adding question three to the panel
         q3=new JLabel(g+" "+"-"+" "+h+" "+"= ");
         q3.setBounds(300, 80, 45, 20);
         Subtractionpanel.add(q3);
         //addint the answer's textfield
         aq3=new JTextField();
         aq3.setBounds(350, 80, 50, 20);
         Subtractionpanel.add(aq3);
         
         //adding question four to the panel
         q4=new JLabel(j+" "+"-"+" "+k+" "+"= ");
         q4.setBounds(300, 110, 45, 20);
         Subtractionpanel.add(q4);
         //addint the answer's textfield
         aq4=new JTextField();
         aq4.setBounds(350, 110, 50, 20);
         Subtractionpanel.add(aq4);
         
         //adding question five to the panel
         q5=new JLabel(m+" "+"-"+" "+n+" "+"= ");
         q5.setBounds(300, 140, 45, 20);
         Subtractionpanel.add(q5);
         //addint the answer's textfield
         aq5=new JTextField();
         aq5.setBounds(350, 140, 50, 20);
         Subtractionpanel.add(aq5);

         //creating the get score button
         score = new JButton("Get Score!");
         score.addActionListener(this);
         score.setBounds(300,180, 100, 20);
         Subtractionpanel.add(score);
         
         //adding the JPanel and it's components to the JFrame
         Subtractionframe.add(Subtractionpanel);
         Subtractionframe.setVisible(true);  
    }
    
    public void main(String[] args){
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == score){
             // closing the Subtraction JFrame
             Subtractionframe.dispose();
             //counting the score
             
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
