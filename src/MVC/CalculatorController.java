package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorController {
    private CalculatorModel theModel;
    private CalculatorView theView;

    public CalculatorController(CalculatorView newView , CalculatorModel newModel) {
     this.theView = newView;
     this.theModel = newModel;
     this.theView.addCalculateListener(new CalculateListener());
     this.theView.subCalculateListener(new CalculateListener2());
     this.theView.divCalculateListener(new CalculateListener3());
     this.theView.mulCalculateListener(new CalculateListener4());

    }



    class CalculateListener implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNum , secondNum = 0;
            try {
                firstNum = theView.getFirstNumber();
                secondNum= theView.getSecondNumber();
                theModel.addTwoNumbers(firstNum,secondNum);
                theView.setCalcSolution(theModel.getAddcalculationValue());
            }
            catch (NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("Please Enter Two  Integers");
            }
        }
    }
    class CalculateListener2 implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNum2 , secondNum2 = 0;
            try {
                firstNum2 = theView.getFirstNumber2();
                secondNum2= theView.getSecondNumber2();
                theModel.subtractTwoNumbers(firstNum2,secondNum2);
                theView.setCalcSolution2( theModel.getSubcalculationValue());
            }
            catch (NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("Please Enter Two  Integers");
            }
        }
    }
    class CalculateListener3 implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNum3 , secondNum3 = 0;
            try {
                firstNum3 = theView.getFirstNumber3();
                secondNum3= theView.getSecondNumber3();
                theModel.divideTwoNumbers(firstNum3,secondNum3);
                theView.setCalcSolution3(theModel.getDivcalculationValue());
            }
            catch (NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("Please Enter Two Integers");
            }
        }

    }
    class CalculateListener4 implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNum4 , secondNum4 = 0;
            try {
                firstNum4 = theView.getFirstNumber4();
                secondNum4= theView.getSecondNumber4();
                theModel.multiplyTwoNumbers(firstNum4,secondNum4);
                theView.setCalcSolution4( theModel.getMulcalculationValue());
            }
            catch (NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("Please Enter Two  Integers");
            }
        }
    }
}
