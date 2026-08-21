import java.util.Scanner;

public class RestaurantBill{
	int choice;
	int bill;
	String order;

// Constructor to store the user's choice
RestaurantBill(int c){
	this.choice = c;
}

 // Calculate bill according to the user selection
void calculateBill() {

    switch (choice) {
		   case 1:
                order = "Tea";
                bill = 5;
                break;

           case 2:
                order = "Tea with Milk";
                bill = 5 + 5;
                break;

            case 3:
                order = "Tea with Sugar";
                bill = 5 + 2;
                break;

            case 4:
                order = "Tea with Milk and Sugar";
                bill = 5 + 5 + 2;
                break;

            case 5:
                order = "Coffee";
                bill = 8;
                break;

            case 6:
                order = "Coffee with Milk";
                bill = 8 + 5;
                break;

            case 7:
                order = "Coffee with Sugar";
                bill = 8 + 2;
                break;

            case 8:
                order = "Coffee with Milk and Sugar";
                bill = 8 + 5 + 2;
                break;

            default:
                order = "Invalid choice";
                bill = 0;
        }
    }

    void display() {
        System.out.println("You ordered: " + order);
        System.out.println("Total Bill = Rs." + bill);
        System.out.println("\nThanks for ordering .Have a nice day !!");
    }

//Main
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);

      System.out.println("\n========= MENU =========");
      System.out.println("1. Tea");
      System.out.println("2. Tea with Milk");
      System.out.println("3. Tea with Sugar");
      System.out.println("4. Tea with Milk and Sugar");
      System.out.println("5. Coffee");
      System.out.println("6. Coffee with Milk");
      System.out.println("7. Coffee with Sugar");
      System.out.println("8. Coffee with Milk and Sugar");

      System.out.print("Enter your choice: ");
       int c = sc.nextInt();

      RestaurantBill r1 = new RestaurantBill(c);
      r1.calculateBill();
      r1.display();

     sc.close();
    }
}


