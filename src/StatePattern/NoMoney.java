package StatePattern;

public class NoMoney implements VendingState {
    VendingMachine vendingMachine;

    public NoMoney(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Please Insert 10 Pounds ");
        vendingMachine.setVendingState(vendingMachine.hasMoney);
    }

    @Override
    public void ejectMoney() {
        System.out.println("You Didn't Insert A Money");
    }

    @Override
    public void selectOrder(int orderSelected) {
        System.out.println("You Didn't Insert A Money");
    }
}