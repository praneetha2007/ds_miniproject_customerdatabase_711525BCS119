import java.util.Scanner;

public class Customer {

    int id;
    String name;

    public static void bubbleSort(Customer[] c, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (c[j].id > c[j + 1].id) {
                    Customer temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
    }

    public static void display(Customer[] c, int n) {
        System.out.println("\nSorted Customer List:");
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + c[i].id + " Name: " + c[i].name);
        }
    }

    public static void search(Customer[] c, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (c[i].id == key) {
                System.out.println("\nCustomer Found!");
                System.out.println("ID: " + c[i].id);
                System.out.println("Name: " + c[i].name);
                return;
            }
        }
        System.out.println("\nCustomer Not Found!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        Customer[] customers = new Customer[n];

        for (int i = 0; i < n; i++) {
            customers[i] = new Customer();

            System.out.print("Enter Customer ID: ");
            customers[i].id = sc.nextInt();

            System.out.print("Enter Customer Name: ");
            customers[i].name = sc.next();
        }

        bubbleSort(customers, n);
        display(customers, n);

        System.out.print("\nEnter ID to search: ");
        int key = sc.nextInt();

        search(customers, n, key);

        sc.close();
    }
}