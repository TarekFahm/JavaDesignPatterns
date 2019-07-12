package StatePattern;

public class VendingMachine {
    VendingState hasMoney;
    VendingState noMoney;
    VendingState selectOrder;

    VendingState vendingState;


    public VendingMachine(){
        hasMoney = new HasMoney(this);
        noMoney = new NoMoney(this);
        selectOrder = new SelectOrder(this);

        vendingState = noMoney;
    }

    public void setVendingState(VendingState vendingState) {
        this.vendingState = vendingState;
    }
   public void insertMoney(){
        vendingState.insertMoney();
    }
    public void ejectMoney(){
        vendingState.ejectMoney();
    }
    public void selectOrder(int order){
        vendingState.selectOrder(order);
    }


    public VendingState getNoMoney() {
        return noMoney;
    }

    public VendingState getSelectOrder() {
        return selectOrder;
    }
}
