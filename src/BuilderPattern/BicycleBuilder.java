package BuilderPattern;

public interface BicycleBuilder {
    public void buildBicycleTires();

    public void buildBicyclePedal();

    public void buildBicycleChain();

    public void buildBicycleHandlebar();

    public void buildBicycleSeat();

    public Bicycle getBicycle();


}
