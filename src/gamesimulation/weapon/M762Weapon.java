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
public class M762Weapon implements Weapon{
        String name;

    public M762Weapon() {
        this.name = "M762";
    }

    @Override
    public void pick() {
        System.out.println("M762 are Picked");
    }

    @Override
    public String getName() {
        return name;
    }  
}
