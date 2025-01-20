/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userprofilebuilder.model;
public class User {
    
    private String UserProfileID;
    private String Title;
    private String Name;
    private String EMail;

    public String getUserProfileID() {
        return UserProfileID;
    }

    public void setUserProfileID(String UserProfileID) {
        this.UserProfileID = UserProfileID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public User(String name) {
        this.Name = name;
    }

    
}
