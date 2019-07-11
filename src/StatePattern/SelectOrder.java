package StatePattern;

public class SelectOrder implements VendingState {
    VendingMachine vendingMachine;

    public SelectOrder(VendingMachine vendingMachine) {
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
        System.out.println("You already Selected an order");

    }
}
