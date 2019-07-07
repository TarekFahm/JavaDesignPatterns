package StrategyPattern;

public class Person {
    private String Fname;
    private String Lname;
    private int age;
    public Teaching teach;

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String tryToTeach(){
        return teach.teach();
    }
    public void setTeachAbility( Teaching teachAbility){
        teach = teachAbility;

    }
}
