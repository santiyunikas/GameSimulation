/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation;

import gamesimulation.weapon.Weapon;
import gamesimulation.Cloth.*;
import gamesimulation.Enemy.*;
import gamesimulation.acc.Accessories;

/**
 *
 * @author Shanty YS
 */
public class SkinFactory extends AbstractFactory{

    @Override
    Enemy getEnemy(String enemyType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Skin getSkin(String skinType) {
        if (skinType.equalsIgnoreCase("PandaTshirt")) {
            return new PandaTshirt();
        }else if (skinType.equalsIgnoreCase("DmmTshirt")) {
            return new DmmTshirt();
        }else if (skinType.equalsIgnoreCase("TeinyashkaTshirt")) {
            return new TeinyashkaTshirt();
        }
        return null;
    }

    @Override
    Weapon getWeapon(String weaponType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Accessories getAcc(String weaponType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
