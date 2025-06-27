package items;

// importing products informations
public abstract class Item {
    private double width;
    private double height;
    private double depth;
    private double weight;

    public Item(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
// calculating the volume of the product
    public double calculateVolume() {
        return (width / 100) * (height / 100) * (depth / 100); // convert cm to m^3
    }
// getting the weight of the product 
    public double getWeight() {
        return weight;
    }
// printing the products informations 
    public void printInfo() {
        System.out.println("Item: " + this.getClass().getSimpleName());
        System.out.println("Dimensions: " + width + "x" + height + "x" + depth + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Volume: " + calculateVolume() + " m^3");
    }
}