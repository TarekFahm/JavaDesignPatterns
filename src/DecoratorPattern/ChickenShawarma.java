package DecoratorPattern;

public class ChickenShawarma implements Shawarma {
    private String description = "Chicken , Potato , Tomya ";
    private double cost = 20.00;

    public void setDescription(String description) {
        description = description;
    }

    public void setCost(double cost) {
        cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
