/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class MainViewer {
    private JFrame myframe;
    private JTextArea yap;
    
    public MainViewer(){
    myframe = new JFrame("user profile builder <3");
    myframe.setSize(400,400);
    myframe.setLayout(new BorderLayout());
    
    JPanel mypanel = new JPanel();
    mypanel.setBackground(Color.PINK);
    mypanel.setLayout(new GridLayout(1,2));
    mypanel.setBorder(BorderFactory.createTitledBorder("Name"));
    
    JButton edt = new JButton("Edit");
    JButton dlt = new JButton("Delete");
    JRadioButton bu = new JRadioButton();
    JLabel un = new JLabel("usernames");
    
    mypanel.add(bu,BorderLayout.EAST);
    mypanel.add(un,BorderLayout.CENTER);
    mypanel.add(edt,BorderLayout.CENTER);
    mypanel.add(dlt,BorderLayout.WEST);
    
    myframe.add(mypanel,BorderLayout.CENTER);
    myframe.setVisible(true);
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
