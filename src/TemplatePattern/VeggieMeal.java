package TemplatePattern;

public class VeggieMeal extends Meal {
    String[] riseUsed = {" brown rice " , ", Mint"};
    String[] saladUsed = {" Tomatoes" , ", cucumber", ", Onions" , ", Sweet Peppers"};
    boolean customerWantsFries() { return false; }
    boolean customerWantsMeat() { return false; }
    void addMeat() {}
    void addFries() {}
    void addRice() {
        System.out.print("Adding To Rice : ");
        for (String meat : riseUsed){

            System.out.print(meat + " , ");

        }

    }
    void addSalad() {
        System.out.print("Adding To Salad : ");
        for (String meat : saladUsed) {

            System.out.print(meat);

        }
    }


}
