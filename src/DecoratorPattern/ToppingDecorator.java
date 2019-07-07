package DecoratorPattern;

public abstract class ToppingDecorator implements Shawarma {
    protected Shawarma tempShawarma;

    public ToppingDecorator(Shawarma s) {

        tempShawarma = s;

    }

    public String getDescription() {

        return tempShawarma.getDescription();

    }

    public double getCost() {

        return tempShawarma.getCost();

    }

}


