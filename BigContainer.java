package containers;


// Big container size 
public class BigContainer extends Container {
    public BigContainer() {
        super(2.59, 2.43, 12.01);
    }
// Big container price 
    @Override
    public double getCost(double weight) {
        return 1800;
    }
}