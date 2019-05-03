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
public interface Enemy {
    void draw();
    String stats();
    String getName();
    void setStats(String die);
}
