package StrategyPattern;

public interface Teaching {
    String teach();
}
class Teacher implements Teaching{
    public String teach() {
        return "can teach";
    }
}
class CantTeach implements Teaching{
    public String teach(){
        return "can not teach";
    }
}
