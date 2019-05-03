/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation.Cloth;

/**
 *
 * @author Shanty YS
 */
public class DmmTshirt implements Skin {

    String name;

    public DmmTshirt() {
        this.name = "DMM Skin";
    }

    @Override
    public void uses() {
        System.out.println("DMM Skin are Used");
    }

    @Override
    public String getName() {
        return name;
    }
}
