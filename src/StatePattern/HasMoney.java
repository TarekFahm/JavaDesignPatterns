package StatePattern;

public class HasMoney implements VendingState {
   VendingMachine vendingMachine;

    public HasMoney(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("You Can't Insert Money Twice");

    }

    @Override
    public void ejectMoney() {
        System.out.println("Your Money is ejected");
        vendingMachine.setVendingState(vendingMachine.getNoMoney());

    }

    @Override
    public void selectOrder(int orderSelected) {
        if (orderSelected==1){
            System.out.println("You Selected Pepsi");
            vendingMachine.setVendingState(vendingMachine.getSelectOrder());
        }
        else if (orderSelected==2){
            System.out.println("You Selected 7Up");
            vendingMachine.setVendingState(vendingMachine.getSelectOrder());
        }
        else if (orderSelected == 3){
            System.out.println("You Selected Fanta");
            vendingMachine.setVendingState(vendingMachine.getSelectOrder());
        }
        else if (orderSelected == 4){
            System.out.println("You Selected CocaCola");
            vendingMachine.setVendingState(vendingMachine.getSelectOrder());
               }
        else {
            System.out.println("Please Enter numbers from 1 to 4 ");
        }


    }
}
