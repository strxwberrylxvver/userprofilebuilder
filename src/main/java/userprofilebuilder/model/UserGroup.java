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
    
    private ArrayList<User> users = new ArrayList<>();
    private static UserGroup instance;
    
    private UserGroup(){    
    }
    
    public static UserGroup getInstance(){
        if (instance == null){
            instance =  new UserGroup();
        }
        return instance;
    }
    public ArrayList<User> getUsers() {
        return this.users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    

    
public void readSuperCsv(String filename)
{
    try(
                BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            while(br.ready())
            {
                String lines = br.readLine();
                String[] v = lines.split(",");
                users.add(new User(v[0],v[1],v[2],v[3]));
            }
        }
        catch(Exception e)
        {
              e.printStackTrace();
        }
}
    public void writeSuperCsv(String filename)
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
