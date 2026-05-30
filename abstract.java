abstract class Foodorder 
{
    String customerName;
    int quantity;
    double price;

    Foodorder(String name, int quantity, double price) {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void orderFood();

    void generateBill() {
        double total = quantity * price;
        double d = total * 0.07;
        total -= d;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price per item : " + price);
        System.out.println("Total dis : " + d);
        System.out.println("Total Bill : " + total);
    }
}

class ChapatiOrder extends Foodorder
{
    String chapatiType;

    ChapatiOrder(String name, int quantity, double price, String chapatiType) {
        super(name, quantity, price);
        this.chapatiType = chapatiType;
    }

    @Override
    void orderFood() {
        System.out.println("Welcome to Zomato");
        System.out.println("Chapati Type : " + chapatiType);
        System.out.println("Chapati ordered successfully");
    }
}

class Main {
    public static void main(String args[]) {
        ChapatiOrder c = new ChapatiOrder("Mounika", 2, 50, "Butter Chapati");
        c.orderFood();
        c.generateBill();
    }
}