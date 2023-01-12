/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLogic;

/**
 *
 * @author djagodzky
 */
public class Operations {
    
    Magazine magazine = new Magazine();
    
    public void addNewUser(User user){
        magazine.getUsers().add(new User(user.getFirstName(),user.getSecondName(),user.getNickname(),user.getContactEmail()));
    }
    
}
