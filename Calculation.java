package methods;

import items.Item;
import containers.SmallContainer;
import containers.BigContainer;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    private List<Item> items = new ArrayList<>();

    public void addItems(Item item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            items.add(item);
        }
    }

    public double totalVolume() {
        return items.stream().mapToDouble(Item::calculateVolume).sum();
    }

    public double totalWeight() {
        return items.stream().mapToDouble(Item::getWeight).sum();
    }

    public String bestShipping() {
        double totalVolume = totalVolume();
        double totalWeight = totalWeight();
        double smallContainerVolume = new SmallContainer().calculateVolume();
        double bigContainerVolume = new BigContainer().calculateVolume();

        double minCost = Double.MAX_VALUE;
        String bestCombination = "";

        // Try different combinations of big and small containers
        for (int bigContainers = 0; bigContainers <= Math.ceil(totalVolume / bigContainerVolume); bigContainers++) {
            for (int smallContainers = 0; smallContainers <= Math.ceil(totalVolume / smallContainerVolume); smallContainers++) {
                double usedVolume = bigContainers * bigContainerVolume + smallContainers * smallContainerVolume;
                double usedWeight = bigContainers * 30000 + smallContainers * 500;

                if (usedVolume >= totalVolume && usedWeight >= totalWeight) {
                    double cost = bigContainers * new BigContainer().getCost(totalWeight) + smallContainers * new SmallContainer().getCost(totalWeight);
                    if (cost < minCost) {
                        minCost = cost;
                        bestCombination = bigContainers + " Big Containers, " + smallContainers + " Small Containers";
                    }
                }
            }
        }

        return "Total cost: " + minCost + " Euros, " + bestCombination;
    }

    public void printItems() {
        items.forEach(Item::printInfo);
    }

    public void printOrder() {
        System.out.println("Order contains:");
        System.out.println("Total order Volume: " + totalVolume() + " m^3");
        System.out.println("Total order Weight: " + totalWeight() + " kg");
        System.out.println(bestShipping());
    }
}
