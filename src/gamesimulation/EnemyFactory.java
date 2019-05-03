/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation;

import gamesimulation.weapon.Weapon;
import gamesimulation.AbstractFactory;
import gamesimulation.Cloth.Skin;
import gamesimulation.Enemy.Comp1Enemy;
import gamesimulation.Enemy.Comp2Enemy;
import gamesimulation.Enemy.Comp3Enemy;
import gamesimulation.Enemy.Enemy;
import gamesimulation.acc.Accessories;

/**
 *
 * @author Shanty YS
 */
public class EnemyFactory extends AbstractFactory{

    @Override
    Enemy getEnemy(String enemyType) {
        if (enemyType.equalsIgnoreCase("Computer 1")) {
            return new Comp1Enemy();
        }else if (enemyType.equalsIgnoreCase("Computer 2")) {
            return new Comp2Enemy();
        }else if (enemyType.equalsIgnoreCase("Computer 3")) {
            return new Comp3Enemy();
        }
        return null;
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
    Accessories getAcc(String weaponType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
