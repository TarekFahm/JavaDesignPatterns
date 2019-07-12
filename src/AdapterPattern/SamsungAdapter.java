package AdapterPattern;

public class SamsungAdapter implements CellPhone {
    private Samsung samsung;

    public SamsungAdapter(Samsung samsung) {
        this.samsung = samsung;
    }


    @Override
    public void AppStore() {
        samsung.googlePlay();

    }
}
