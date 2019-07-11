package StatePattern;

public interface VendingState {
    void insertMoney();
    void ejectMoney();
    void selectOrder(int orderSelected);
}
