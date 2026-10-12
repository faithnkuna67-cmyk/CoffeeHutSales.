import java.util.Scanner;

interface IBeverage {
    String getBeverageType();
    String getCity();
    int getTotalSales();
}

abstract class Beverage implements IBeverage {
    private String beverageType;
    private String city;
    private int totalSales;

    public Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    public String getBeverageType() {
        return beverageType;
    }

    public String getCity() {
        return city;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public abstract void printReport();
}

class BeverageSales extends Beverage {
    public BeverageSales(String beverageType, String city, int totalSales) {
        super(beverageType, city, totalSales);
    }

    public void printReport() {
        System.out.println();
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("**************************");
        System.out.println("BEVERAGE TYPE: " + getBeverageType());
        System.out.println("CITY: " + getCity());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}

class RunApplication {
    public static void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the beverage type");
        System.out.println("1) COFFEE");
        System.out.println("2) TEA");
        System.out.println("3) BOBA");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        input.nextLine();

        String beverageType;

        switch (choice) {
            case 1:
                beverageType = "COFFEE";
                break;
            case 2:
                beverageType = "TEA";
                break;
            case 3:
                beverageType = "BOBA";
                break;
            default:
                System.out.println("Invalid choice.");
                input.close();
                return;
        }

        System.out.print("Enter the city: ");
        String city = input.nextLine().trim().toUpperCase();

        System.out.print("Enter the total sales of "
                + beverageType + " beverages in " + city + ": ");

        int totalSales = input.nextInt();

        BeverageSales report =
                new BeverageSales(beverageType, city, totalSales);

        report.printReport();

        input.close();
    }
}

public class Main {
    public static void main(String[] args) {
        RunApplication.run();
    }
}
