package BuilderPattern;

public class TestBuilder {
    public static void main(String[] args){
        BicycleBuilder old = new OldBicycleBuilder();
        BicycleEngineer eng = new BicycleEngineer(old);
        eng.makeBicycle();

        Bicycle b = eng.getBicycle();
        System.out.println("Bicycle Built!");
        System.out.println("Bicycle Seat Type : " + b.getBicycleSeat());
        System.out.println( "Bicycle Handlebar Type : " + b.getBicycleHandlebar());
        System.out.println( "Bicycle Pedal Type : " + b.getBicyclePedal());
        System.out.println( "Bicycle Chain Type : " + b.getBicycleChain());
        System.out.println( "Bicycle Tires Type : " + b.getBicycleTires());

    }
}
