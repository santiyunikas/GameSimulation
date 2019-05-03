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
public class HelmAcc implements Accessories{

    String name;

    public HelmAcc() {
        this.name = "Helm";
    }

    @Override
    public void uses() {
        System.out.println("Helm are Used");
    }

    @Override
    public String getName() {
        return name;
    }
    
}
