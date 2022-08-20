/**
 * This project is about a simple math test using what i have learnt  
 * in object oriented programming 2
 * */
package projectmath;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.math.*;
import javax.swing.*;

public class Projectmath implements ActionListener{

     public JFrame frame,Additionframe,Multiplicationframe,Divisionframe,
         Subtractionframe,scoreframe;
     public JPanel top_panel,bottom_panel,center_panel,Additionpanel;
     public JTextField usernametext,aq1,aq2,aq3,aq4,aq5;
     public JLabel Welcome,username,diffucality,Choose,q1,q2,q3,q4,q5;
     public JButton Addition,Multiplication,Division,Subtraction,score;
     public JComboBox diffucalitycombo;
     public JCheckBox diffucalitybox;
     public String name;
     
    public Projectmath(){
        
        //creating a JFrame
        frame = new JFrame();
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Fun Math Quiz");
        
        
        //creating a top panel to hold the title
        top_panel = new JPanel();
        top_panel.setLayout(new FlowLayout());
        top_panel.setBackground(Color.yellow);
        
        Welcome = new JLabel("Welcome to Fun Math Quiz!");
        Welcome.setFont(new Font("Calabri",Font.PLAIN,20));
        top_panel.add(Welcome);
        
        
        //creating a center panel that holds the user info
        //and the choose statment
        center_panel = new JPanel();
        center_panel.setLayout(null);
        center_panel.setBackground(Color.yellow);
        
        
        
        username = new JLabel("username: ");
        username.setBounds(300,150,90,30);
        center_panel.add(username);
        
        
        usernametext = new JTextField();
        usernametext.setEditable(true);
        usernametext.setBounds(400,155,90,25);
        center_panel.add(usernametext);
        
        diffucality = new JLabel("diffucality: ");
        diffucality.setBounds(300,185,90,30);
        center_panel.add(diffucality);
        
        String diffucality [] = {"easy","hard"};
        diffucalitycombo = new JComboBox(diffucality);
        diffucalitycombo.addActionListener(this);
        diffucalitycombo.setBounds(400,190,90,25);
        center_panel.add(diffucalitycombo);
        
        Choose = new JLabel("Choose a Section!");
        Choose.setFont(new Font("Calabri",Font.PLAIN,20));
        Choose.setBounds(270,250,161,100);
        center_panel.add(Choose);
        
        
        //creating a bottom panel that holds the test options
        bottom_panel = new JPanel();
        bottom_panel.setLayout(new FlowLayout());
        bottom_panel.setBackground(Color.yellow);
                
        Addition = new JButton("Addition");
        Addition.addActionListener(this);
        bottom_panel.add(Addition);
        Addition.setEnabled(false);
        
        
        Multiplication = new JButton("Multiplication");
        Multiplication.addActionListener(this);
        Multiplication.setEnabled(false);
        bottom_panel.add(Multiplication);
        
        Division = new JButton("Division");
        Division.addActionListener(this);
        Division.setEnabled(false);
        bottom_panel.add(Division);
        
        Subtraction = new JButton("Subtraction");
        Subtraction.addActionListener(this);
        Subtraction.setEnabled(false);
        bottom_panel.add(Subtraction);
        
        
        //adding the JPanels that holds the components to the JFrame
        frame.add(top_panel,BorderLayout.NORTH);
        frame.add(center_panel,BorderLayout.CENTER);
        frame.add(bottom_panel,BorderLayout.SOUTH);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        //creating the object
         new Projectmath();
         
    }
    
    @Override
    public void actionPerformed(ActionEvent ea){
        
        //choosing the difficulity
        if (diffucalitycombo.getItemAt(diffucalitycombo.getSelectedIndex())== "easy"){
            //enabilng the buttons when choosing the diffivulity
            Addition.setEnabled(true);
            Multiplication.setEnabled(true);
            Division.setEnabled(true);
            Subtraction.setEnabled(true);
        
            if (ea.getSource() == Addition)
            {
                //closing the previous frame
                frame.dispose();
                //creating an object of class Addition
                new Addition();
            }
            
            if (ea.getSource()==Multiplication)
            {
                //closing the previous frame
                frame.dispose();
                //creating an object of class Multiplication
                new Multiplication();
            }

            if (ea.getSource()==Division)
            {
                //closing the previous frame
                frame.dispose();
                //creating an object of class Division
                new Division();
            }

            if (ea.getSource()==Subtraction)
            {
                //closing the previous frame
                frame.dispose();
                //creating an object of class Subtraction
                new Subtraction();
            }
        }
        else if (diffucalitycombo.getItemAt(diffucalitycombo.getSelectedIndex())== "hard"){

            Addition.setEnabled(true);
            Multiplication.setEnabled(true);
            Division.setEnabled(true);
            Subtraction.setEnabled(true);
        }
        if (diffucalitycombo.getItemAt(diffucalitycombo.getSelectedIndex())== "hard" && ea.getSource() == Addition)
            {
                //closing the previous frame
                frame.dispose();
                //creating an object of class Addition
                new AdditionHard();
            }
        if (diffucalitycombo.getItemAt(diffucalitycombo.getSelectedIndex())== "hard" && ea.getSource()==Multiplication)
            {
                //closing the previous frame
                frame.dispose();
                //creating an object of class Multiplication
                new MultiplicationHard();
            }
        if (diffucalitycombo.getItemAt(diffucalitycombo.getSelectedIndex())== "hard" && ea.getSource()==Division)
            {
                //closing the previous frame
                frame.dispose();
                //creating an object of class Division
                new DivisionHard();
            }
        if (diffucalitycombo.getItemAt(diffucalitycombo.getSelectedIndex())== "hard" && ea.getSource()==Subtraction)
            {
                //closing the previous frame
                frame.dispose();
                //creating an object of class Subtraction
                new SubtractionHard();
            }
    }
}   