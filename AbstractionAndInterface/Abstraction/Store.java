package AbstractionAndInterface.Abstraction;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product){

}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtProduct("oil painting", 3546, "very important and beautiful painting by Picaso"));
        storeProducts.add(new ArtProduct("water painting", 1265, "very important and beautiful painting by Leo"));
        storeProducts.add(new ArtProduct("Buddha statue", 3546, "very important and beautiful statue by John"));

        listProducts();

        System.out.println("\n Order 1");
        var oderr1 = new ArrayList<OrderItem>();
        addItemToOrder(oderr1, 1, 2);
        addItemToOrder(oderr1, 0, 1);
        printOrder(oderr1);


    }

    public static void listProducts(){

        for (var item : storeProducts) {
            System.out.println("-".repeat(50));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int oderindex, int quantity){

        order.add(new OrderItem(quantity, storeProducts.get(oderindex)));

    }

    public static void printOrder(ArrayList<OrderItem> order){

        double salesTotal = 0;
        for (var item: order){
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }

        System.out.printf("Sales Total = $%6.2f %n", salesTotal);

    }

}
