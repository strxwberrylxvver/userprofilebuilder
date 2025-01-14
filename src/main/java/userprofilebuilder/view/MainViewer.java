/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


public class MainViewer {
    private JFrame myframe;
    private JTextArea yap;
    private JTabbedPane tabs = new JTabbedPane();

    public MainViewer(){
    myframe = new JFrame("user profile builder <3");
    myframe.setBounds(400,0,400,400);
    myframe.setLayout(new BorderLayout());
    JPanel mypanel = new JPanel();
    mypanel.setBackground(Color.PINK);
    mypanel.setLayout(new FlowLayout());
    //this.yap = new JTextArea();
    //mypanel.add(yap, "hi");
    tabs.addTab("WELCOME", mypanel);
    myframe.add(tabs);
    myframe.add(mypanel,BorderLayout.CENTER);
    myframe.setVisible(true);
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
