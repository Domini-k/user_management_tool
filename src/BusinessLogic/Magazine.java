/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLogic;

import java.util.ArrayList;

/**
 *
 * @author djagodzky
 */
public class Magazine {

    public ArrayList<User> getUsers() {
        return users;
    }
    public void removeUser(int userIndex){
    users.remove(userIndex);
    }
       private ArrayList <User> users = new ArrayList<>();
}
