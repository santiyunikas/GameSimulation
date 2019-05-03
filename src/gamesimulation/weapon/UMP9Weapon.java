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
public class UMP9Weapon implements Weapon{
        String name;

    public UMP9Weapon() {
        this.name = "UMP9";
    }

    @Override
    public void pick() {
        System.out.println("UMP9 are Picked");
    }

    @Override
    public String getName() {
        return name;
    }  
}
