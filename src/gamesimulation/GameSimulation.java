/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesimulation;

import gamesimulation.Cloth.*;
import gamesimulation.Enemy.*;
import gamesimulation.acc.Accessories;
import gamesimulation.weapon.Weapon;
import java.util.Scanner;

/**
 *
 * @author Shanty YS
 */
public class GameSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Hallo Warior, Make a Choose");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("So ?");
            pilihan = in.nextInt();
            System.out.println("==============================================================================");

            UserSingleObject object = UserSingleObject.getInstance();
            String uname, pw;
            System.out.println("Username : ");
            uname = in.next();
            System.out.println("Password : ");
            pw = in.next();
            if (pilihan == 1) {
                if (uname != null && pw != null) {
                    object.register(uname, pw);
                    System.out.println("Register Successfull");
                } else {
                    System.out.println("Insert Username and Password");
                    pilihan = 1;
                }
            } else if (pilihan == 2) {
                if (object.login(uname, pw)) {
                    System.out.println("Welcome to Survival Game Simulation");
                    int action;
                    AbstractFactory enemyFactory = factoryProducer.getFactory("enemy");
                    Enemy comp1, comp2, comp3;
                    comp1 = enemyFactory.getEnemy("Computer 1");
                    comp2 = enemyFactory.getEnemy("Computer 2");
                    comp3 = enemyFactory.getEnemy("Computer 3");
                    do {
                        System.out.println("Skin Used : " + object.getSkin());
                        System.out.println("Accessories Used : " + object.getAcc());
                        System.out.println("Weapon Used : " + object.getWeapon());
                        System.out.println("Enemy : ");

                        comp1.draw();

                        comp2.draw();

                        comp3.draw();

                        System.out.println("Action : ");
                        System.out.println("1. Get Skin");
                        System.out.println("2. Get Accessories");
                        System.out.println("3. Get Weapon");
                        System.out.println("4. Reset Equipment");
                        System.out.println("5. Kill Enemy");
                        System.out.println("0. Exit Game");
                        System.out.print("Your Choice : ");
                        action = in.nextInt();

                        if (action == 1) {
                            System.out.println("Choose One :");
                            int skin = 0;
                            AbstractFactory skinFactory = factoryProducer.getFactory("skin");
                            Skin skin1 = skinFactory.getSkin("PandaTshirt");
                            System.out.println("1. " + skin1.getName());
                            Skin skin2 = skinFactory.getSkin("DmmTshirt");
                            System.out.println("2. " + skin2.getName());
                            Skin skin3 = skinFactory.getSkin("TeinyashkaTshirt");
                            System.out.println("3. " + skin3.getName());
                            System.out.print("So ? ");
                            skin = in.nextInt();
                            System.out.println("==============================================================================");
                            if (skin == 1) {
                                skin1.uses();
                                object.setSkin(skin1.getName());
                            } else if (skin == 2) {
                                skin2.uses();
                                object.setSkin(skin2.getName());
                            } else if (skin == 3) {
                                skin3.uses();
                                object.setSkin(skin3.getName());
                            }
                        } else if (action == 2) {
                            System.out.println("Choose One :");
                            int acc = 0;
                            AbstractFactory accFactory = factoryProducer.getFactory("acc");
                            Accessories acc1 = accFactory.getAcc("Helm");
                            System.out.println("1. " + acc1.getName());
                            Accessories acc2 = accFactory.getAcc("Pan");
                            System.out.println("2. " + acc2.getName());
                            Accessories acc3 = accFactory.getAcc("Kompensator");
                            System.out.println("3. " + acc3.getName());
                            System.out.print("So ? ");
                            acc = in.nextInt();
                            if (acc == 1) {
                                acc1.uses();
                                object.setAcc(acc1.getName());
                            } else if (acc == 2) {
                                acc2.uses();
                                object.setAcc(acc2.getName());
                            } else if (acc == 3) {
                                acc3.uses();
                                object.setAcc(acc2.getName());
                            }
                        } else if (action == 3) {
                            System.out.println("Choose One :");
                            int weapon = 0;
                            AbstractFactory wpFactory = factoryProducer.getFactory("wp");
                            Weapon wp1 = wpFactory.getWeapon("Uzi");
                            System.out.println("1. " + wp1.getName());
                            Weapon wp2 = wpFactory.getWeapon("ump9");
                            System.out.println("2. " + wp2.getName());
                            Weapon wp3 = wpFactory.getWeapon("m762");
                            System.out.println("3. " + wp3.getName());
                            System.out.print("So ? ");
                            weapon = in.nextInt();
                            if (weapon == 1) {
                                wp1.pick();
                                object.setWeapon(wp1.getName());
                            } else if (weapon == 2) {
                                wp2.pick();
                                object.setWeapon(wp2.getName());
                            } else if (weapon == 3) {
                                wp3.pick();
                                object.setWeapon(wp3.getName());
                            }
                        } else if (action == 4) {
                            object.setWeapon(null);
                            object.setWeapon(null);
                            object.setWeapon(null);
                        } else if (action == 5) {
                            System.out.println("Choose One :");
                            int en = 0;
                            enemyFactory = factoryProducer.getFactory("enemy");
                            System.out.println("1. " + comp1.getName());
                            System.out.println("2. " + comp2.getName());
                            System.out.println("3. " + comp3.getName());
                            System.out.print("So ? ");
                            en = in.nextInt();
                            if (en == 1) {
                                comp1.setStats("die");
                            } else if (en == 2) {
                                comp2.setStats("die");
                            } else if (en == 3) {
                                comp3.setStats("die");
                            }
                        }
                    } while (action != 0 && action <= 5);

                } else {
                    System.out.println("Username and Password are Wrong");
                    pilihan = 1;
                }
            }
        } while (pilihan != 2);

    }
}
