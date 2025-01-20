/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userprofilebuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import userprofilebuilder.model.UserGroup;
import userprofilebuilder.view.MainViewer;

public class App {
    public static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        UserGroup.readCsv("username.csv");
        MainViewer mv = new MainViewer();

    }
    
}
