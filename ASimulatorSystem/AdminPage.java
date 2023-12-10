
package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class AdminPage extends JFrame implements ActionListener{
    JButton login , clear;
    JLabel pass1 , idtext , id , pass;
    
    AdminPage(){
        setLayout(null);
        JLabel ad = new JLabel ("Admin Page");
        ad.setFont(new Font("Raleway" , Font.BOLD , 40));
        ad.setBounds(140 , 50 , 600 , 40);
         add(ad);
         
         id =  new JLabel("Enter ID");
         id.setFont(new Font("Raleway" , Font.BOLD , 26));
         id.setBounds(70 , 200 , 600 , 40);
         add(id);
         
         pass =  new JLabel("Enter Password");
         pass.setFont(new Font("Raleway" , Font.BOLD , 26));
         pass.setBounds(70 , 300 , 600 , 40);
         add(pass);
         
         JTextField idtext = new JTextField();
         idtext.setBounds(320 , 200 , 250 , 30);
         add(idtext);
         
          JTextField pass1text = new JTextField();
         pass1text.setBounds(320 , 300 , 250 , 30);
         add(pass1text);
         
        login = new JButton("LOG IN");
        login.setBounds(240,400,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(440,400,150,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
    
        
        
        setSize(650 , 600);
        setVisible(true);
        setLocation(420,100);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== login){
            
        }
//        else if(ae.getSource()==clear){
//            pass.setText("");
//            idtext.setText("");
//        }
//        
    } 
    
    public static void main(String args[]){
        new AdminPage();
    }
}
