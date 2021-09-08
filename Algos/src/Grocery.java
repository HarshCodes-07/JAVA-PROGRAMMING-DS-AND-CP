import java.util.*;

class item {
    int price;
    String quantity;

    public item(String quantity, int price) {
        this.price = price;
        this.quantity = quantity;
    }
}

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, item> GroceryList = new HashMap<>();
        int ch = 0;
        System.out.println("Enter your budget : ");
        int budget = Integer.parseInt(sc.nextLine());
        do {
            menu();
            System.out.println("Enter your choice : ");
            ch = Integer.parseInt(sc.nextLine());
            if (ch == 1) {
                // Logic for Item Addition
                System.out.println("Enter product : ");
                String name = sc.nextLine();
                System.out.println("Enter Quantity : ");
                String Quantity = sc.nextLine();
                System.out.println("Enter Price : ");
                int Price = Integer.parseInt(sc.nextLine());
                if (Price > budget) {
                    System.out.println("Can't Buy the product ###(because budget left is " + budget + ")");
                    continue;
                }
                item it = new item(Quantity, Price);
                if (GroceryList.containsKey(name)) {
                    item temp = GroceryList.get(name);
                    budget += temp.price;
                }
                GroceryList.put(name, it);
                budget -= it.price;
                System.out.println("Amount Left : " + budget);
            }
        } while (ch != 2);
        for (Map.Entry mapElement : GroceryList.entrySet()) {
            String key = (String) mapElement.getKey();
            item value = (item) mapElement.getValue();
            if (value.price == budget) {
                System.out.println("Amount left can buy you " + key);
            }
        }
        System.out.println("Grocery List is : ");
        System.out.println("Product Name\tQuantity\tPrice");
        for (Map.Entry mapElement : GroceryList.entrySet()) {
            String key = (String) mapElement.getKey();
            item value = (item) mapElement.getValue();
            System.out.println(key + "\t\t\t" + value.quantity + "\t\t" + value.price);
        }
    }

    private static void menu() {
        System.out.println("1. Add an Item");
        System.out.println("2. Exit");
    }
}
/*Given TestCase OUTPUT
Enter your budget :
500
1. Add an Item
2. Exit
Enter your choice :
1
Enter product :
corn flour
Enter Quantity :
1.5 kg
Enter Price :
100
Amount Left : 400
1. Add an Item
2. Exit
Enter your choice :
1
Enter product :
wheat
Enter Quantity :
2 kg
Enter Price :
100
Amount Left : 300
1. Add an Item
2. Exit
Enter your choice :
1
Enter product :
corn flour
Enter Quantity :
2 kg
Enter Price :
250
Amount Left : 150
1. Add an Item
2. Exit
Enter your choice :
1
Enter product :
rice
Enter Quantity :
5 kg
Enter Price :
300
Can't Buy the product ###(because budget left is 150)
1. Add an Item
2. Exit
Enter your choice :
1
Enter product :
xyz
Enter Quantity :
1 kg
Enter Price :
50
Amount Left : 100
1. Add an Item
2. Exit
Enter your choice :
2
Amount left can buy you wheat
Grocery List is :
Product Name	Quantity	Price
xyz	            1 kg	    50
wheat	        2 kg	    100
corn flour	    2 kg	    250
 */