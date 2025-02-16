package userprofilebuilder.view;

import userprofilebuilder.model.UserGroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddUserDialog extends JDialog implements ActionListener {
    JPanel mainpanel = new JPanel(new BorderLayout());
    JPanel textbox = new JPanel(new GridLayout(4, 1, 5, 5));
    JPanel names = new JPanel(new GridLayout(4, 1, 5, 5));
    JPanel option = new JPanel(new FlowLayout());
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");


    public AddUserDialog(JFrame frame)
    {
        super(frame, "Add User", true);
        this.setSize(350, 200);
        setLocationRelativeTo(frame);

        names.add(new JLabel("profile"));
        names.add(new JLabel("title"));
        names.add(new JLabel("name"));
        names.add(new JLabel("email"));

        textbox.add(new JTextField("Enter Profile Name"));
        textbox.add(new JTextField("Enter Title"));
        textbox.add(new JTextField("Enter Name"));
        textbox.add(new JTextField("Enter eMail"));

        option.add(ok);
        option.add(cancel);

        ok.addActionListener(this);
        cancel.addActionListener(this);
        ok.setActionCommand("OK");
        cancel.setActionCommand("Cancel");
        option.add(ok);
        option.add(cancel);

        mainpanel.add(textbox, BorderLayout.EAST);
        mainpanel.add(names, BorderLayout.WEST);
        mainpanel.add(option, BorderLayout.SOUTH);
        setContentPane(mainpanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "OK":
                JOptionPane.showMessageDialog(this, "User added!");
                dispose();
                break;

            case "Cancel":
                dispose();
                break;

        }
    }
}
