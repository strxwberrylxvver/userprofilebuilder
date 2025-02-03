package userprofilebuilder.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import userprofilebuilder.model.User;
import userprofilebuilder.model.UserGroup;


public class addRow implements ActionListener {
    String value = "";
    JRadioButton j;
    User u;
    
    public  addRow(String attribute, JPanel panel, int jsize)
    {

        for (User u: UserGroup.getUsers()) {
            if ("name".equals(attribute))
            {value = u.getName();}
            else if ("title".equals(attribute))
            {value = u.getTitle();}
            else if ("email".equals(attribute))
            {value = u.getEMail();}
            else {value = "";}

            JPanel rows1 = new JPanel();
            JRadioButton j = new JRadioButton(value);
            j.setPreferredSize(new Dimension(jsize, 30));
            rows1.add(j);
            JButton e = new JButton("Edit");
            e.setPreferredSize(new Dimension(65, 25));
            e.addActionListener(this);
            e.setActionCommand(j.getText());
            rows1.add(e);
            JButton d = new JButton("Delete");
            d.setPreferredSize(new Dimension(70, 25));
            rows1.add(d);
            rows1.repaint();
            panel.add(rows1, BorderLayout.CENTER);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String input = JOptionPane.showInputDialog(null,"Enter New Text",e.getActionCommand());
        System.out.println(input);

        if (input != null){
            JButton button = (JButton) e.getSource();
            JPanel parentPanel = (JPanel) button.getParent();
            JRadioButton radioButton = (JRadioButton) parentPanel.getComponent(0);
            radioButton.setText(input);
            button.setActionCommand(radioButton.getText());
            System.out.println("User input: " + input);
            
            for (User u: UserGroup.getUsers())
            {
                if (u.getName().equals(e.getActionCommand()))
                {
                    u.setName(input);
                }
                
                if (u.getEMail().equals(e.getActionCommand()))
                {
                    u.setEMail(input);
                }
                
                if (u.getUserProfileID().equals(e.getActionCommand()))
                {
                    u.setUserProfileID(input);
                }
                if (u.getTitle().equals(e.getActionCommand()))
                {
                    u.setTitle(input);
                }            
            }
            UserGroup.writeSuperCsv("userprofile.csv");
        }
        else {System.out.println("User has cancelled");}

    }
}
