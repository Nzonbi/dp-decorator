package boissons;

public class Expresso extends Boisson{

    public Expresso() {
        this.description = "Espresso";
    }

    @Override
    public double cout() {
        return 6;
    }
}
