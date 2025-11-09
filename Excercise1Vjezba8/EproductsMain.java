package udg.edu.me;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EproductsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Eproducts> products = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Electronic Products Menu ---");
            System.out.println("1. Add Computer");
            System.out.println("2. Add Phone");
            System.out.println("3. Add TV");
            System.out.println("4. Show all products");
            System.out.println("5. Show only Computers");
            System.out.println("6. Show only Phones");
            System.out.println("7. Show only TVs");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            String ch = sc.nextLine();

            if (ch.equals("0")) break;

            if (ch.equals("1")) {
                System.out.print("Description: ");
                String desc = sc.nextLine();
                System.out.print("Code: ");
                String code = sc.nextLine();
                System.out.print("Import price: ");
                double price = Double.parseDouble(sc.nextLine());
                System.out.print("Processor: ");
                String cpu = sc.nextLine();
                System.out.print("Memory GB: ");
                int mem = Integer.parseInt(sc.nextLine());
                products.add(new RA(desc, mem, price, cpu, code));
            }

            else if (ch.equals("2")) {
                System.out.print("Description: ");
                String desc = sc.nextLine();
                System.out.print("Code: ");
                int code = Integer.parseInt(sc.nextLine());
                System.out.print("Import price: ");
                double price = Double.parseDouble(sc.nextLine());
                System.out.print("Operating System: ");
                String os = sc.nextLine();
                System.out.print("Screen size (inch): ");
                double screen = Double.parseDouble(sc.nextLine());
                products.add(new TE(desc, code, price, os, screen));
            }

            else if (ch.equals("3")) {
                System.out.print("Description: ");
                String desc = sc.nextLine();
                System.out.print("Code: ");
                int code = Integer.parseInt(sc.nextLine());
                System.out.print("Import price: ");
                double price = Double.parseDouble(sc.nextLine());
                System.out.print("Screen size (inch): ");
                double screen = Double.parseDouble(sc.nextLine());
                products.add(new TV(desc, code, price, screen));
            }
        }System.out.println("Program finished.");
    }
}
