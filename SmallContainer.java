package containers;

// small containers sizes
public class SmallContainer extends Container {
    public SmallContainer() {
        super(2.59, 2.43, 6.06);
    }

    // small containers price 
    @Override
    public double getCost(double weight) {
        return weight > 500 ? 1200 : 1000;
    }
}
