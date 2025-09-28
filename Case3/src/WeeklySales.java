import com.company.model.Salesperson;
import com.company.model.Sorting;

import java.util.Scanner;

//********************************************************************
//  WeeklySales.java
//
//  Sorts the sales staff in descending order by sales.
//********************************************************************
public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff;

        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many Sales person do you want to sort? ");

        size = scan.nextInt();

        salesStaff = new Salesperson[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter the Sales person #" + (i + 1) + " data...");
            System.out.println("Enter the sales person first name:");
            String first = scan.next();
            System.out.println("Enter the sales person last name:");
            String last = scan.next();
            System.out.println("Enter the sales total sales:");
            int totalSales = scan.nextInt();

            salesStaff[i] = new Salesperson(first, last, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
    }
}