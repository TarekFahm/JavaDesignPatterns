package DecoratorPattern;

public class Potato extends ToppingDecorator {
    public Potato(Shawarma s) {
        super(s);
        System.out.println("Adding Potato");

    }

    public String getDescription() {

        return tempShawarma.getDescription() + ",Potato";

    }

    public double getCost() {

        return tempShawarma.getCost() + 9.00;

    }
}
