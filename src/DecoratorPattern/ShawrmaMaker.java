package DecoratorPattern;

public class ShawrmaMaker {
    public static void main(String[] args) {
        Shawarma sh = new Potato(new Chicken(new PlainShawarma()));
        System.out.println("Ingredients: " + sh.getDescription());

        System.out.println("Price: " + sh.getCost());
    }
}
