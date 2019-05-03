/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation;

import gamesimulation.weapon.Weapon;
import gamesimulation.Cloth.Skin;
import gamesimulation.Enemy.Enemy;
import gamesimulation.acc.Accessories;
import gamesimulation.acc.HelmAcc;
import gamesimulation.acc.KompensatorAcc;
import gamesimulation.acc.PanAcc;

/**
 *
 * @author Shanty YS
 */
public class AccFactory extends AbstractFactory{

    @Override
    Enemy getEnemy(String enemyType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Skin getSkin(String skinType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Weapon getWeapon(String weaponType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Accessories getAcc(String accType) {
        if (accType.equalsIgnoreCase("Pan")) {
            return new PanAcc();
        }else if (accType.equalsIgnoreCase("Helm")) {
            return new HelmAcc();
        }else if (accType.equalsIgnoreCase("Kompensator")) {
            return new KompensatorAcc();
        }
        return null;
    }
    
}
