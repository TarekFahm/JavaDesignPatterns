package BuilderPattern;

public class OldBicycleBuilder implements BicycleBuilder {
    private Bicycle bicycle;

    public OldBicycleBuilder() {
        this.bicycle = new Bicycle();
    }

    @Override
    public void buildBicycleTires() {
        bicycle.setBicycleTires("Clincher tyres");

    }

    @Override
    public void buildBicyclePedal() {
        bicycle.setBicyclePedal("shimano Flat pedals");

    }

    @Override
    public void buildBicycleChain() {
        bicycle.setBicycleChain("Half-link chains");

    }

    @Override
    public void buildBicycleHandlebar() {
        bicycle.setBicycleHandlebar("RISER BARS");

    }

    @Override
    public void buildBicycleSeat() {
        bicycle.setBicycleSeat("Comfort Saddles");

    }

    @Override
    public Bicycle getBicycle() {
        return this.bicycle;
    }
}
