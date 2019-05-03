/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation.weapon;

/**
 *
 * @author Shanty YS
 */
public class UziWeapon implements Weapon{
    String name;

    public UziWeapon() {
        this.name = "Uzi";
    }

    @Override
    public void pick() {
        System.out.println("Uzi are Picked");
    }

    @Override
    public String getName() {
        return name;
    }  
    
    
}
