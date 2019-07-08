package TemplatePattern;

public class MealMaker {
    public static void main(String[] args){
        System.out.println("Customer 1");
        ItalianMeal cus1 = new ItalianMeal();
        cus1.makeMeal();

        System.out.println();

        System.out.println("Customer 2");
        VeggieMeal cus2 = new VeggieMeal();
        cus2.makeMeal();

    }
}
