package userprofilebuilder.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfileButtonPanel extends JPanel implements ActionListener {
    JButton display = new JButton("Display Profile");
    JButton addp = new JButton("Add Profile");

    public UserProfileButtonPanel()
    {
        display.addActionListener(this);
        addp.addActionListener(this);
        display.setActionCommand("Display Profile");
        addp.setActionCommand("Add Profile");
        this.add(display);
        this.add(addp);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Display Profile":
                System.out.println("Display Profile");
                break;

            case "Add Profile":
                System.out.println("Add Profile");
                break;

        }
    }
}
