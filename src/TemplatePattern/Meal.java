package TemplatePattern;

public abstract class Meal {
    final void makeMeal(){
       if (customerWantsMeat()){
           addMeat();
       }
       if (customerWantsRise()){
           addRice();
       }
       if (customerWantsFries()){
           addFries();
       }
       if (customerWantsSalad()){
           addSalad();
       }
   }
    abstract void addMeat();
    abstract void addRice();
    abstract void addFries();
    abstract void addSalad();

    boolean customerWantsMeat() { return true; }
    boolean customerWantsRise() { return true; }
    boolean customerWantsFries() { return true; }
    boolean customerWantsSalad() { return true; }

}


