/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import static userprofilebuilder.App.names;

public class UserGroup {
    
    private static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        UserGroup.users = users;
    }
public static void readCsv(String filename)
    {
        try(
                BufferedReader br = new BufferedReader(new FileReader(filename));)
        {
            while(br.ready())
            {
                String name = br.readLine();
                users.add(new User(name));
            }
        }
        catch(Exception e)
        {
                ;
                }
    }
}
