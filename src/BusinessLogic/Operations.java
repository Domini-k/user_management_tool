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
    
    Magazine m = new Magazine();

    public Magazine getMagazine() {
        return m;
    }
    
    public void addNewUser(User user){
        m.getUsers().add(new User(user.getFirstName(),user.getSecondName(),user.getNickname(),user.getContactEmail()));
    }
    
}
