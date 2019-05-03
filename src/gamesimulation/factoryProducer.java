/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation;

/**
 *
 * @author Shanty YS
 */
public class factoryProducer {

    public static AbstractFactory getFactory(String whatUCreate) {
        if (whatUCreate.equalsIgnoreCase("enemy")) {
            return new EnemyFactory();
        } else if (whatUCreate.equalsIgnoreCase("skin")) {
            return new SkinFactory();
        } else if (whatUCreate.equalsIgnoreCase("acc")) {
            return new AccFactory();
        }else if (whatUCreate.equalsIgnoreCase("wp")) {
            return new WeaponFactory();
        }
        return null;
    }
}
