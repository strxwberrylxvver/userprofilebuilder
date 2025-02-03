/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class addMenu extends JMenuBar implements ActionListener{
    JMenu fileMenu;
    JMenuItem openFile; 
    JMenuItem quit;
    public addMenu(JFrame frame){   
        fileMenu = new JMenu("File");
        openFile = new JMenuItem("Open File");
        quit = new JMenuItem("Quit");
        
        openFile.addActionListener(this);
        openFile.setActionCommand("OpenFile");
        quit.addActionListener(this);
        quit.setActionCommand("QuitFile");

        fileMenu.add(openFile);
        fileMenu.add(quit);
        this.add(fileMenu);
        frame.add(this,BorderLayout.NORTH);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch(e.getActionCommand()){
            case "OpenFile":
                System.out.println("Open File");
                break;
            case "QuitFile":
                System.out.println("Quit");
                System.exit(0);
                break;
        }
    }
}
