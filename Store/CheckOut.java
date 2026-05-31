import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {
    private String customerName;
    private String cashierName;
    private ArrayList<Product> products;
    private double discount;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }



    static void main() {
        String cashierResponse = "yes";
        ArrayList<Product> products = new ArrayList<>();

        System.out.println("What is the customer's Name");
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();

        do {
            System.out.println("What did the user buy?");
            Scanner scanner2 = new Scanner(System.in);
            String productName = scanner2.nextLine();

            System.out.println("How many pieces?");
            Scanner scanner3 = new Scanner(System.in);
            int numberBought = scanner3.nextInt();

            System.out.println("How much per unit?");
            Scanner scanner4 = new Scanner(System.in);
            double costPerUnit = scanner4.nextDouble();

            System.out.println("Add more Items? (yes/no)");
            Scanner scanner5 = new Scanner(System.in);
            String moreItems = scanner5.nextLine();
            if (moreItems.equalsIgnoreCase("no")){
                cashierResponse = "no";
            }

            Product product = new Product();
            product.setName(productName);
            product.setQuantity(numberBought);
            product.setPrice(costPerUnit);

            products.add(product);
        } while (cashierResponse.equals("yes"));

        System.out.println("What is your name?");
        Scanner scanner6 = new Scanner(System.in);
        String cashierName = scanner6.nextLine();
        System.out.println("How much discount will he get?");
        Scanner scanner7 = new Scanner(System.in);
        double discount = scanner7.nextDouble();

        CheckOut checkOut = new CheckOut();
        checkOut.setCashierName(cashierName);
        checkOut.setCustomerName(customerName);
        checkOut.setDiscount(discount);
        checkOut.setProducts(products);

        print(checkOut);
    }

    public static void print(CheckOut checkOut){
        printReceipt(checkOut, null);

        System.out.println("How Much did the customer give you?");
        Scanner scanner = new Scanner(System.in);
        double amountPaid = scanner.nextDouble();

        printReceipt(checkOut, amountPaid);
    }
    public static void printReceipt(CheckOut checkOut, Double amountPaid){
        double subtotal = 0;
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date: " + LocalDateTime.now());
        System.out.println("Cashier: " + checkOut.getCashierName());
        System.out.println("Customer Name: " + checkOut.getCustomerName());
        System.out.println("==========================================================");
        System.out.print("ITEM    ");
        System.out.print("QTY     ");
        System.out.print("PRICE   ");
        System.out.println("TOTAL(NGN)");
        System.out.println("-----------------------------------------------------------");

        for (Product product: checkOut.getProducts()){
            System.out.print(product.getName() + "     ");
            System.out.print(product.getQuantity() + "    ");
            System.out.print(product.getPrice() + "    ");
            double total = product.getPrice() * product.getQuantity();
            subtotal += total;
            System.out.println((total));
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Sub Total:        " + subtotal);

        double discount = (subtotal * checkOut.getDiscount())/100;

        System.out.println("Discount:        " + discount);
        double vatValue = (subtotal * 7.5)/100;
        System.out.println("VAT @ 17.50%:        " + vatValue);
        System.out.println("============================================================");

        double totalPayment = (subtotal + discount) - vatValue;

        System.out.println("Bill total:                   " + totalPayment);
        if (amountPaid != null){
            System.out.println("Amount Paid:            " + amountPaid);
            System.out.println("Balance:       " + (amountPaid - totalPayment));
        }

        System.out.println("============================================================");
        if (amountPaid == null) {
            System.out.println("THIS IS NOT A RECIEPT KINDLY PAY   " + totalPayment);
        }else {
            System.out.println("THANK YOU FOR YOUR PATRONAGE");

        }
        System.out.println("============================================================");
        System.out.println("\n\n\n");
    }
}

