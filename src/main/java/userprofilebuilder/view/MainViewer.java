/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import userprofilebuilder.model.User;
import userprofilebuilder.model.UserGroup;

public class MainViewer {
    private JFrame myframe;

    public MainViewer() {
        myframe = new JFrame("User Profile Builder");
        myframe.setSize(500, 300);
        myframe.setLayout(new BorderLayout());

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

        addRow("name",mypanel);
        addRow("title",ut);
        addRow("email",ue);

        tabs.addTab("User Title", ut);
        tabs.addTab("User Email", ue);
        tabs.add(mypanel, "User Name");
        myframe.add(tabs, BorderLayout.CENTER);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


    public void addRow(String attribute, JPanel panel)
    {
        for (User u: UserGroup.getUsers()) {
            String value = "";
            if ("name".equals(attribute))
                {value = u.getName();}
            else if ("title".equals(attribute))
                {value = u.getTitle();}
            else if ("email".equals(attribute))
                {value = u.getEMail();}
            else {value = "";}

            JPanel rows1 = new JPanel();
            JRadioButton j = new JRadioButton(value);
            j.setPreferredSize(new Dimension(200, 30));
            rows1.add(j);
            JButton e = new JButton("Edit");
            e.setPreferredSize(new Dimension(65, 25));
            rows1.add(e);
            JButton d = new JButton("Delete");
            d.setPreferredSize(new Dimension(70, 25));
            rows1.add(d);
            rows1.repaint();
            panel.add(rows1, BorderLayout.CENTER);
        }
    }
}