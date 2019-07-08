package TemplatePattern;

public class ItalianMeal extends Meal {
    String[] meatUsed = {"Beef ", ", italian sauce"};
    String[] riseUsed = {"White rice" , ", Basil"};
    String[] saladUsed = {"Tomatoes" , ", cucumber", ", Onions" , ", Sweet Peppers"};

    @Override
    void addMeat() {
        System.out.print("Adding To Meat : ");
        for (String meat : meatUsed){

            System.out.print(meat + " ,");

        }

    }

    @Override
    void addRice() {
        System.out.print("Adding To Rice : ");
        for (String meat : riseUsed){

            System.out.print(meat + " ,");

        }

    }

    @Override
    void addFries() {
        System.out.print("Adding Fries");
        System.out.print(" , ");


    }

    @Override
    void addSalad() {
        System.out.print("Adding To Salad : ");
        for (String meat : saladUsed){

            System.out.print(meat);

        }

    }
}
