/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.*;
import javax.swing.*;

public class MainViewer extends JFrame {
private static MainViewer instance;
    JPanel ut;
    JPanel ue;
    JPanel mypanel;

    public static MainViewer getInstance(){
        if (instance == null)
        {instance = new MainViewer();
        }
        return instance;
    }
    private MainViewer() {
        this.setTitle("User Profile Builder");
        this.setSize(500, 400);
        this.setLayout(new BorderLayout());

        JTabbedPane tabs = new JTabbedPane();
        ut = new JPanel();
        ue = new JPanel();
        ut.setLayout(new GridLayout(0, 1));
        ut.setBorder(BorderFactory.createTitledBorder("Title"));
        ue.setLayout(new GridLayout(0, 1));
        ue.setBorder(BorderFactory.createTitledBorder("Email"));

        mypanel = new JPanel();
        mypanel.setLayout(new GridLayout(0, 1));
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


            public void refresh() {
                ut.removeAll();
                ue.removeAll();
                mypanel.removeAll();

                new addRow("name", mypanel, 180);
                new addRow("title", ut, 60);
                new addRow("email", ue, 200);

                ut.revalidate();
                ut.repaint();
                ue.revalidate();
                ue.repaint();
                mypanel.revalidate();
                mypanel.repaint();
        }

}