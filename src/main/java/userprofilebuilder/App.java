/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userprofilebuilder;

import java.util.ArrayList;
import userprofilebuilder.model.UserGroup;
import userprofilebuilder.view.MainViewer;

public class App {
    public static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        UserGroup.getInstance().readSuperCsv("userprofile.csv");
        MainViewer mv = MainViewer.getInstance();
    }
    
}
