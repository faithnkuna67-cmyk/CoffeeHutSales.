public class Main {
    public static void main(String[] args) {

        // Declare and populate a single-dimensional array
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Declare and populate a single-dimensional array
        String[] beverages = {
            "Coffee",
            "Tea",
            "Boba Tea"
        };

        // Declare and populate a two-dimensional array
        int[][] sales = {
            {500, 300, 125},
            {450, 250, 100},
            {480, 175, 120}
        };

        int grandTotal = 0;

        // Print the report heading
        System.out.println("NUMBER 1 COFFEE HUT");
        System.out.println("MONTHLY SALES REPORT");
        System.out.println();

        // Print the table headings using the beverage array
        System.out.printf("%-20s", "City");

        for (int j = 0; j < beverages.length; j++) {
            System.out.printf("%12s", beverages[j]);
        }

        System.out.printf("%12s%n", "Total");

        System.out.println("--------------------------------------------------------------");

        // Print sales data and calculate each city's total
        for (int i = 0; i < cities.length; i++) {

            int cityTotal = 0;

            System.out.printf("%-20s", cities[i]);

            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%12d", sales[i][j]);
                cityTotal += sales[i][j];
            }

            System.out.printf("%12d%n", cityTotal);

            grandTotal += cityTotal;
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Total sales for all cities: " + grandTotal);
    }
}
