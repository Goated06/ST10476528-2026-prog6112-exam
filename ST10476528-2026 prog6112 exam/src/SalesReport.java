import java.util.Scanner;
public class SalesReport {
    public static  void main(String[]args){
        Scanner input = new Scanner(System.in);
        String[] names = {
                "Cosy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };
        int[][] sales = new int[3][3];
        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Enter sales for month " + (j + 1) + "for" + names[i]);
                sales[i][j] = input.nextInt();

            }
        }
        Product p = new Product(names, sales);
        PrintProduct print = new PrintProduct();
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("----------------------------------------------");
        print.printTotal(p);
        print.printAverage(p);
        print.printPopular(p);
        input.close();
    }

}
