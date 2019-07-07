package FactroyPattern;

public abstract class Enemy {
    private String name;
    private double damage;

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }
    public void followHero(){
        System.out.println(getName() + " is following the hero");
    }
    public void displayEnemy(){
        System.out.println(getName() + " is on the screen");

    }
    public void enemyShoot (){
        System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");
    }
}
