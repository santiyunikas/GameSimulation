/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation.Enemy;

/**
 *
 * @author Shanty YS
 */
public class Comp2Enemy implements Enemy {

    private String stats;
    private String name;
    
    
       public Comp2Enemy() {
        this.stats = "alive";
        this.name = "Computer 2";
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Computer 2 is "+stats());
    }

    @Override
    public String stats() {
        return stats;
    }

    @Override
    public void setStats(String die) {
        this.stats=die;
    }

}
