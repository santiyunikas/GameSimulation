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


/**
 *
 * @author Shanty YS
 */
public abstract class AbstractFactory {
    abstract Enemy getEnemy(String enemyType);
    abstract Skin getSkin(String skinType);
    abstract Weapon getWeapon(String weaponType);
    abstract Accessories getAcc(String accType);
}
