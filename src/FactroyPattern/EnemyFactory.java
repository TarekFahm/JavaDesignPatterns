package FactroyPattern;

public class EnemyFactory {

    public static Enemy makeEnemy(String newEnemyType){

        if (newEnemyType.equals("B")){
            return new Bird();
        }else
            if (newEnemyType.equals("D")){
                return new Dinosaur();
            }else return null;
    }
}
