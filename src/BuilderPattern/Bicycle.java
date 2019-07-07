package BuilderPattern;

public class Bicycle implements BicyclePlan {
    private String bicycleTires;
    private String bicyclePedal;
    private String bicycleChain;
    private String bicycleHandlebar;
    private String bicycleSeat;

    public String getBicycleTires() {
        return bicycleTires;
    }

    public String getBicyclePedal() {
        return bicyclePedal;
    }

    public String getBicycleChain() {
        return bicycleChain;
    }

    public String getBicycleHandlebar() {
        return bicycleHandlebar;
    }

    public String getBicycleSeat() {
        return bicycleSeat;
    }

    @Override
    public void setBicycleTires(String tires) {
        bicycleTires = tires;

    }

    @Override
    public void setBicyclePedal(String pedal) {
        bicyclePedal = pedal;

    }

    @Override
    public void setBicycleChain(String chain) {
        bicycleChain = chain;

    }

    @Override
    public void setBicycleHandlebar(String handlebar) {
        bicycleHandlebar = handlebar;

    }

    @Override
    public void setBicycleSeat(String seat) {
        bicycleSeat = seat;

    }
}
