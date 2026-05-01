import java.util.Scanner;

class ShopSystem {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int choice, quantity;
        int grandTotal = 0;

       
        int coffee = 20;
        int Chai = 15;
        int sandwich = 40;
        int juice = 30;

        do {
            System.out.println("\n--- WELCOME TO  CHAI GALATA ---");
            System.out.println("\n--- SHOP MENU ---");
            System.out.println("1. Coffee - Rs." + coffee);
            System.out.println("2. Chai- Rs." + Chai);
            System.out.println("3. Juice - Rs." + juice);
            System.out.println("4. Sandwich - Rs." + sandwich);
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            if (choice < 1 || choice > 4) if (choice == 0) {
                System.out.println("Final Amount: " + grandTotal);
                
            } else {
                System.out.println("Invalid choice");
            } else {
                System.out.print("Enter quantity: ");
                quantity = s.nextInt();

                int total = 0;

                if (choice == 1) {
                    total = coffee * quantity;
                } else if (choice == 2) {
                    total = Chai * quantity;
                } else if (choice == 3) {
                    total = juice * quantity;
                } else if (choice == 4) {
                    total = sandwich * quantity;
                }

                grandTotal = grandTotal + total;

                System.out.println("Item Total: " + total);
                System.out.println("Grand Total: " + grandTotal);
                System.out.println("Do you want to continue shopping? (1 for Yes, 0 for No)");
                
                choice = s.nextInt();
            }

        } while (choice != 0);
        System.out.println("Exiting... Bye! Bye!!");

        s.close();
    }
}