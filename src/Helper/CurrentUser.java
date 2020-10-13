/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author wirll
 */
public class CurrentUser {
    // static variable single_instance of type Singleton 

    private static CurrentUser single_instance = null;

    // variable of type String 
    public static String user;

    // private constructor restricted to this class itself 
    public CurrentUser(String name) {
        user = name;
    }

    private CurrentUser() {
    }

    // static method to create instance of Singleton class 
    public static CurrentUser getInstance() {
        if (single_instance == null) {
            single_instance = new CurrentUser();
        }

        return single_instance;
    }
}
