/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation.acc;

/**
 *
 * @author Shanty YS
 */
public class PanAcc implements Accessories{
    String name;

    public PanAcc() {
        this.name = "Pan";
    }

    @Override
    public void uses() {
        System.out.println("Pan are Used");
    }

    @Override
    public String getName() {
        return name;
    }
}
