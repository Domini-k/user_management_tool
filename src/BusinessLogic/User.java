/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLogic;

/**
 *
 * @author djagodzky
 */
public class User {

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public User(String firstName, String secondName, String nickname, String contactEmail){
        this.firstName=firstName;
        this.secondName=secondName;
        this.nickname=nickname;
        this.contactEmail=contactEmail;
    }
    private String firstName;
    private String secondName;
    private String nickname;
    private String contactEmail;
    
}
