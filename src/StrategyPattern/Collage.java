package StrategyPattern;

public class Collage {
    public static void main(String[] args) {
        Person ali = new Instructor();
        Person omar = new Student();
        System.out.println("ALI: " + ali.tryToTeach());
        System.out.println("Omar: " + omar.tryToTeach());
        omar.setTeachAbility(new Teacher());
        System.out.println("Omar: "+ omar.tryToTeach());

    }
    }
