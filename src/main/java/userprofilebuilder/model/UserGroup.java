/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class UserGroup {
    
    private static ArrayList<User> users = new ArrayList<>();
    
    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        UserGroup.users = users;
    }
public static void readSuperCsv(String filename)
{
    try(
                BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            while(br.ready())
            {
                String lines = br.readLine();
                String[] v = lines.split(",");
                User user = new User(v[2]);
                user.setUserProfileID(v[0]);
                user.setTitle(v[1]);
                user.setEMail(v[3]);
                users.add(user);
            }
        }
        catch(Exception e)
        {
              e.printStackTrace();
        }
}
    public static void writeSuperCsv(String filename)
    {
        try(
                BufferedWriter bw = new BufferedWriter(new FileWriter(filename)))
        {
            for (User u: users)
            {
            bw.write(u.getUserProfileID() + "," + u.getTitle() + "," + u.getName() + "," + u.getEMail());
            bw.newLine();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
