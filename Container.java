package containers;

public abstract class Container {
    private double height;
    private double width;
    private double length;

    
    //importing containers sizes 
    public Container(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
// calculating containers volume 
    public double calculateVolume() {
        return height * width * length;
    }

    public abstract double getCost(double weight);
// printing the information of the containers 
    public void printInfo() {
        System.out.println("Container: " + this.getClass().getSimpleName());
        System.out.println("Dimensions: " + height + "x" + width + "x" + length + " m");
        System.out.println("Volume: " + calculateVolume() + " m^3");
    }
}


     

      






