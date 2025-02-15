/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.*;
import javax.swing.*;

public class MainViewer extends JFrame {
private static MainViewer instance;
    JPanel titlepanel = new JPanel();
    JPanel emailpanel = new JPanel();
    JPanel namepanel = new JPanel();
    JTabbedPane tabs = new JTabbedPane();

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

        this.addPanel();
        new addMenu(this);
        
        tabs.addTab("User Title", titlepanel);
        tabs.addTab("User Email", emailpanel);
        tabs.add(namepanel, "User Name");
        this.add(tabs, BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void addPanel() {
        if (titlepanel != null || emailpanel != null || namepanel != null) {
            titlepanel.removeAll();
            emailpanel.removeAll();
            namepanel.removeAll();
        }

        namepanel.setLayout(new GridLayout(0, 1));
        namepanel.setBorder(BorderFactory.createTitledBorder("Name"));
        titlepanel.setLayout(new GridLayout(0, 1));
        titlepanel.setBorder(BorderFactory.createTitledBorder("Title"));
        emailpanel.setLayout(new GridLayout(0, 1));
        emailpanel.setBorder(BorderFactory.createTitledBorder("Email"));

        new addRow("name", namepanel,180);
        new addRow("title", titlepanel,60);
        new addRow("email",emailpanel,200);

        titlepanel.revalidate();
        emailpanel.revalidate();
        namepanel.revalidate();
        titlepanel.repaint();
        emailpanel.repaint();
        namepanel.repaint();
        this.revalidate();
        this.repaint();
        }

}