package Main;
import items.*;
import methods.Calculation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Calculation calc = new Calculation();

        // Sample order regarding the number of items for each product 
        calc.addItems(new Laptop(), 1);
        calc.addItems(new Mouse(), 200);
        calc.addItems(new Desktop(), 150);
        calc.addItems(new LCDScreen(), 200);

        // Print order information
        calc.printOrder();

    }

}



 
 