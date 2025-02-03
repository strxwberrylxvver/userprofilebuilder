/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import userprofilebuilder.model.User;
import userprofilebuilder.model.UserGroup;

public class MainViewer extends JFrame {

    public MainViewer() {
        this.setTitle("User Profile Builder");
        this.setSize(500, 300);
        this.setLayout(new BorderLayout());

        JTabbedPane tabs = new JTabbedPane();
        JPanel ut = new JPanel();
        JPanel ue = new JPanel();
        ut.setLayout(new GridLayout(3, 1));
        ut.setBorder(BorderFactory.createTitledBorder("Title"));
        ue.setLayout(new GridLayout(3, 1));
        ue.setBorder(BorderFactory.createTitledBorder("Email"));

        JPanel mypanel = new JPanel();
        mypanel.setLayout(new GridLayout(3, 1));
        mypanel.setBorder(BorderFactory.createTitledBorder("Name"));

        addRow ad1 = new addRow("name",mypanel,180);
        addRow ad2 = new addRow("title",ut,60);
        addRow ad3 = new addRow("email",ue,200);
        
        addMenu menu = new addMenu(this);
        
        tabs.addTab("User Title", ut);
        tabs.addTab("User Email", ue);
        tabs.add(mypanel, "User Name");
        this.add(tabs, BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

}