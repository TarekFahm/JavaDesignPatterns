package MVC;

public class CalculatorModel {
    private int addcalculationValue;
    private int subcalculationValue;
    private int divcalculationValue;
    private int mulcalculationValue;


    public void addTwoNumbers(int firstNumber, int secondNumber) {

        addcalculationValue = firstNumber + secondNumber;

    }

    public void subtractTwoNumbers(int firstNumber, int secondNumber) {

        subcalculationValue = firstNumber - secondNumber;
    }

    public void divideTwoNumbers(int firstNumber, int secondNumber) {

        divcalculationValue = firstNumber / secondNumber;
    }

    public void multiplyTwoNumbers(int firstNumber, int secondNumber) {

        mulcalculationValue = firstNumber * secondNumber;
    }

    public int getAddcalculationValue() {
        return addcalculationValue;
    }

    public int getSubcalculationValue() {
        return subcalculationValue;
    }

    public int getDivcalculationValue() {
        return divcalculationValue;
    }

    public int getMulcalculationValue() {
        return mulcalculationValue;
    }
}
