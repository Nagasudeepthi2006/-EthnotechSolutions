import java.util.*;

abstract class Foodorder {

    String customername;
    String Address;

    Foodorder() {
        System.out.println("Welcome");
    }

    Foodorder(String name, String add) {
        this.customername = name;
        this.Address = add;
    }

    abstract void order();

    void display() {
        System.out.println("Customer Name : " + customername);
        System.out.println("Address : " + Address);
    }
}

class Dosa extends Foodorder {
    Dosa(String name, String add) { super(name, add); }

    int item_no = 1; double price = 50; int quantity = 2;
    String Fooditem = "Dosa";

    void display() {
        super.display();
        double total = price * quantity;
        double discount = total / 1.5;
        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    void order() { System.out.println("Order Placed Successfully"); }
}

class FriedRice extends Foodorder {
    FriedRice(String name, String add) { super(name, add); }

    int item_no = 2; double price = 80; int quantity = 1;
    String Fooditem = "Fried Rice";

    void display() {
        super.display();
        double total = price * quantity;
        double discount = total / 1.5;
        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    void order() { System.out.println("Order Placed Successfully"); }
}

class Noodles extends Foodorder {
    Noodles(String name, String add) { super(name, add); }

    int item_no = 3; double price = 70; int quantity = 2;
    String Fooditem = "Noodles";

    void display() {
        super.display();
        double total = price * quantity;
        double discount = total / 1.5;
        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    void order() { System.out.println("Order Placed Successfully"); }
}

class Sandwich extends Foodorder {
    Sandwich(String name, String add) { super(name, add); }

    int item_no = 4; double price = 60; int quantity = 1;
    String Fooditem = "Sandwich";

    void display() {
        super.display();
        double total = price * quantity;
        double discount = total / 1.5;
        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    void order() { System.out.println("Order Placed Successfully"); }
}

class Pizza extends Foodorder {
    Pizza(String name, String add) { super(name, add); }

    int item_no = 5; double price = 120; int quantity = 1;
    String Fooditem = "Pizza";

    void display() {
        super.display();
        double total = price * quantity;
        double discount = total / 1.5;
        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    void order() { System.out.println("Order Placed Successfully"); }
}

class Momos extends Foodorder {
    Momos(String name, String add) { super(name, add); }

    int item_no = 6; double price = 90; int quantity = 2;
    String Fooditem = "Momos";

    void display() {
        super.display();
        double total = price * quantity;
        double discount = total / 1.5;
        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    void order() { System.out.println("Order Placed Successfully"); }
}

class IceCream extends Foodorder {
    IceCream(String name, String add) { super(name, add); }

    int item_no = 7; double price = 50; int quantity = 2;
    String Fooditem = "Ice Cream";

    void display() {
        super.display();
        double total = price * quantity;
        double discount = total / 1.5;
        System.out.println("Item Number : " + item_no);
        System.out.println("Item Name : " + Fooditem);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    void order() { System.out.println("Order Placed Successfully"); }
}

class Demo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Dosa");
        System.out.println("2. Fried Rice");
        System.out.println("3. Noodles");
        System.out.println("4. Sandwich");
        System.out.println("5. Pizza");
        System.out.println("6. Momos");
        System.out.println("7. Ice Cream");

        System.out.print("Enter Item Number : ");
        int item_no = sc.nextInt();

        if(item_no == 1) {
            new Dosa("Ananya","Puttaparthi").display();
        }
        else if(item_no == 2) {
            new FriedRice("Sravya","Bangalore").display();
        }
        else if(item_no == 3) {
            new Noodles("Divya","Hyderabad").display();
        }
        else if(item_no == 4) {
            new Sandwich("Keerthi","Mumbai").display();
        }
        else if(item_no == 5) {
            new Pizza("Pooja","Chennai").display();
        }
        else if(item_no == 6) {
            new Momos("Sneha","Delhi").display();
        }
        else if(item_no == 7) {
            new IceCream("Harika","Goa").display();
        }
        else {
            System.out.println("Item Not Found!!!");
        }
    }
}