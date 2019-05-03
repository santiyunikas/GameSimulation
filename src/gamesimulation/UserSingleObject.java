/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation;

import gamesimulation.Cloth.Skin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shanty YS
 */
public class UserSingleObject {

    private ArrayList<String> usernameList, passwordList;
    private String weapon;
    private String skin;
    private String acc;
    private static UserSingleObject instance = new UserSingleObject();

    private UserSingleObject() {
        usernameList = new ArrayList<>();
        passwordList = new ArrayList<>();
    }

    public static UserSingleObject getInstance() {
        return instance;
    }

    public void register(String username, String password) {
        usernameList.add(username);
        passwordList.add(password);
    }

    public boolean login(String username, String password) {
        boolean x = false;
        for (int i = 0; i < usernameList.size(); i++) {
            if (!usernameList.isEmpty()) {
                if (username.equalsIgnoreCase(usernameList.get(i)) && password.equalsIgnoreCase(passwordList.get(i))) {
                    x = true;
                }
            }

        }
        return x;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String armor) {
        this.acc = acc;
    }

    
    
}
