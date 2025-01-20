/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import userprofilebuilder.model.User;
import userprofilebuilder.model.UserGroup;



public class MainViewer {
    private JFrame myframe;
    private JTextArea yap;
    
    public MainViewer(){
    myframe = new JFrame("User Profile Builder");
    myframe.setSize(500,300);
    myframe.setLayout(new BorderLayout());

    JTabbedPane tabs = new JTabbedPane();
    
    JPanel mypanel = new JPanel();
 //   mypanel.setBackground(Color.PINK);
    mypanel.setLayout(new GridLayout(3,1));
    mypanel.setBorder(BorderFactory.createTitledBorder("Name"));
    
    for (User u: UserGroup.getUsers()) {
        JPanel rows = new JPanel();
       // rows.setBackground(Color.PINK);
        JRadioButton j = new JRadioButton(u.getName());
        j.setPreferredSize(new Dimension(130,30));
        rows.add(j);
        JButton e = new JButton("Edit");
        e.setPreferredSize(new Dimension(65,25));
        rows.add(e);
        JButton d = new JButton("Delete");
        d.setPreferredSize(new Dimension(70,25));
        rows.add(d);
        rows.repaint();
        mypanel.add(rows,BorderLayout.CENTER);
    }
    tabs.add(mypanel,"User Name");
    myframe.add(tabs,BorderLayout.CENTER);
    myframe.setVisible(true);
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
