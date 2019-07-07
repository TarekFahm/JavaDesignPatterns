package DecoratorPattern;

public class PlainShawarma implements Shawarma {
    @Override
    public String getDescription() {
        return "Bread";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
