/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class MainViewer {
    private JFrame myframe;
    public MainViewer(){
    myframe = new JFrame("my first window <3");
    myframe.setBounds(400,0,400,400);
    myframe.setLayout(new BorderLayout());
    myframe.setVisible(true);
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
