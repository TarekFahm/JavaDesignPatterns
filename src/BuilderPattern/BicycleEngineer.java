package BuilderPattern;

public class BicycleEngineer {
    private BicycleBuilder bicycleBuilder;

    public BicycleEngineer(BicycleBuilder bicycleBuilder) {
        this.bicycleBuilder = bicycleBuilder;
    }

    public Bicycle getBicycle(){
        return this.bicycleBuilder.getBicycle();
    }
    public void makeBicycle(){
        this.bicycleBuilder.buildBicycleSeat();
        this.bicycleBuilder.buildBicycleHandlebar();
        this.bicycleBuilder.buildBicycleChain();
        this.bicycleBuilder.buildBicyclePedal();
        this.bicycleBuilder.buildBicycleTires();
    }
}
