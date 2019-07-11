package StatePattern;

public class TestVendingMachine {
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertMoney();
        vendingMachine.ejectMoney();
        vendingMachine.insertMoney();
        System.out.println("To Select Pepsi enter 1 ");
        System.out.println("To Select 7Up enter 2 ");
        System.out.println("To Select Fanta enter 3 ");
        System.out.println("To Select CocaCola enter 4 ");
        vendingMachine.selectOrder(1);


    }}
