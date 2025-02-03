/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class addMenu extends JMenuBar{
    JMenu fileMenu;
    JMenuItem openFile; 
    JMenuItem quit;
    public addMenu(JFrame f){   
        fileMenu = new JMenu("File");
        openFile = new JMenuItem("Open File...");
        quit = new JMenuItem("Quit File...");
        fileMenu.add(openFile);
        fileMenu.add(quit);
        this.add(fileMenu);
        f.add(this,BorderLayout.NORTH);
    }
}
