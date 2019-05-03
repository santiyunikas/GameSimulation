/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation;

import gamesimulation.Cloth.Skin;
import gamesimulation.Enemy.Enemy;
import gamesimulation.acc.Accessories;
import gamesimulation.weapon.M762Weapon;
import gamesimulation.weapon.UMP9Weapon;
import gamesimulation.weapon.UziWeapon;
import gamesimulation.weapon.Weapon;

/**
 *
 * @author Shanty YS
 */
public class WeaponFactory extends AbstractFactory {

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
        if (weaponType.equalsIgnoreCase("uzi")) {
            return new UziWeapon();
        } else if (weaponType.equalsIgnoreCase("ump9")) {
            return new UMP9Weapon();
        }else if (weaponType.equalsIgnoreCase("m762")) {
            return new M762Weapon();
        }
        return null;
    }

    @Override
    Accessories getAcc(String accType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
