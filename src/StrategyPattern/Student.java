package StrategyPattern;

public class Student extends Person {
    public Student() {
        teach = new CantTeach();
    }
}
