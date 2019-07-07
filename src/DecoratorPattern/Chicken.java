package DecoratorPattern;

public class Chicken extends ToppingDecorator {
    public Chicken(Shawarma s) {
        super(s);
        System.out.println("Adding Bread");
        System.out.println("Adding Chicken");
    }

    public String getDescription() {

        return tempShawarma.getDescription() + ",Chicken";

    }

    public double getCost() {

        return tempShawarma.getCost() + 11.00;

    }
}
