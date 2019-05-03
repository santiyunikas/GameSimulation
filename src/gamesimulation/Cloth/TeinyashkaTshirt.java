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
public class TeinyashkaTshirt implements Skin {

    String name;

    public TeinyashkaTshirt() {
        this.name = "Teinyashka Skin";
    }

    @Override
    public void uses() {
        System.out.println("Teinyashka Skin are Used");
    }

    @Override
    public String getName() {
        return name;
    }
}
