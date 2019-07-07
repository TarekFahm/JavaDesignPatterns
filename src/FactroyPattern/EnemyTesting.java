package FactroyPattern;

import java.util.Scanner;

public class EnemyTesting {
    public static void main(String[] args) {

        Enemy theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What Type Of Enemy?  ( B / D )");
        if (userInput.hasNextLine()) {
            String typeOfEnemy = userInput.nextLine();
            theEnemy = EnemyFactory.makeEnemy(typeOfEnemy);
            if (theEnemy != null) {
                doStuff(theEnemy);

            } else System.out.print("Please enter B or D next time");


        }


    }


    public static void doStuff(Enemy e) {
        e.displayEnemy();
        e.followHero();
        e.enemyShoot();


    }

}
