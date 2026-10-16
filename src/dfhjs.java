import java.util.Scanner;
public class dfhjs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, quantity = 0, discout = 0, finaltotal = 0, items = 0, change = 0, payment = 0, mouse = 0, keyboard = 0, headphones = 0, laptopstand = 0;
        int mousetotal = 0, keyboardtotal = 0, headphonestotal = 0, laptopstandtotal = 0, bonusdiscount = 0;
        int option = 0;

        while (option != 5) {
            System.out.println("===== SIMPLE STORE =====\n");
            System.out.println("1. Mouse         - $20");
            System.out.println("2. Keyboard      - $40");
            System.out.println("3. Headphones    - $50");
            System.out.println("4. Labtop Stand  - $30");
            System.out.println("5. Checkout\n");
            System.out.print("Choose a product: ");
            option = scanner.nextInt();

            if (option > 0 && option < 6) {

                switch (option) {
                    case 1:
                        System.out.println("Price: $20");
                        System.out.print("Enter quantity: ");
                        quantity = scanner.nextInt();
                        if (quantity > 0) {
                            total = total + quantity * 20;
                            mousetotal = mousetotal + quantity*20;
                            items += quantity;
                            mouse += quantity;
                            System.out.println("\nAdded to cart!");
                            System.out.println("Current total: $" + total + "\n");
                        } else {
                            System.out.println("Invalid quantity.");
                            System.out.println("Quantity must be greater than 0.\n");
                        }
                        break;
                    case 2:
                        System.out.println("\nYou selected: Keyboard");
                        System.out.println("Price: $40");
                        System.out.print("Enter quantity: ");
                        quantity = scanner.nextInt();
                        if (quantity > 0) {
                            total = total + quantity * 40;
                            keyboardtotal = keyboardtotal + quantity*40;
                            items += quantity;
                            keyboard += quantity;
                            System.out.println("\nAdded to cart!");
                            System.out.println("Current total: $" + total + "\n");
                        } else {
                            System.out.println("Invalid quantity.");
                            System.out.println("Quantity must be greater than 0.\n");
                        }
                        break;
                    case 3:
                        System.out.println("\nYou selected: Headphones");
                        System.out.println("Price: $50");
                        System.out.print("Enter quantity: ");
                        quantity = scanner.nextInt();
                        if (quantity > 0) {
                            total = total + quantity * 50;
                            headphonestotal = headphonestotal + quantity*50;
                            items += quantity;
                            headphones += quantity;
                            System.out.println("\nAdded to cart!");
                            System.out.println("Current total: $" + total + "\n");
                        } else {
                            System.out.println("Invalid quantity.");
                            System.out.println("Quantity must be greater than 0.\n");
                        }
                        break;
                    case 4:
                        System.out.println("\nYou selected: Laptop Stand");
                        System.out.println("Price: $30");
                        System.out.print("Enter quantity: ");
                        quantity = scanner.nextInt();
                        if (quantity > 0) {
                            total = total + quantity * 30;
                            laptopstandtotal = laptopstandtotal + quantity*30;
                            items += quantity;
                            laptopstand += quantity;
                            System.out.println("\nAdded to cart!");
                            System.out.println("Current total: $" + total + "\n");
                        } else {
                            System.out.println("Invalid quantity.");
                            System.out.println("Quantity must be greater than 0.\n");
                        }
                        break;
                    case 5:
                        System.out.println("===== CHECKOUT =====\n");
                        System.out.println("Items purchased: " + items);
                        System.out.println("Subtotal: " + total + "$\n");

                        if (total >= 200) {
                            discout = (int) (total * 0.15);
                            System.out.println("You received a 15% discount.");
                        }else if (total >= 100) {
                            discout = (int) (total * 0.10);
                            System.out.println("You received a 10% discount.");
                        }
                        if (mouse >= 5) {
                            System.out.println("5% bonus discount for Mouse");
                            bonusdiscount = (int) (bonusdiscount + mousetotal*0.05);
                        }
                        if (keyboard >= 5) {
                            System.out.println("5% bonus discount for Keyboard");
                            bonusdiscount = (int) (bonusdiscount + keyboardtotal*0.05);
                        }
                        if (headphones >= 5) {
                            System.out.println("5% bonus discount for Headphones");
                            bonusdiscount = (int) (bonusdiscount + headphonestotal*0.05);
                        }
                        if (laptopstand >= 5) {
                            System.out.println("5% bonus discount for Laptop Stand");
                            bonusdiscount = (int) (bonusdiscount + laptopstandtotal*0.05);
                        }
                        System.out.println("\nDiscount: " + discout + "$");
                        System.out.println("Bonus Discount: " + bonusdiscount + "$");
                        finaltotal = total - discout - bonusdiscount;
                        System.out.println("Final total: " + finaltotal + '$');
                }
            }else {
                System.out.println("Invalid option.");
                System.out.println("Please choose number from 1 to 5\n");
            }
        }
        while (true) {
            System.out.print("Enter payment amount: $");
            payment = scanner.nextInt();
            if (payment >= finaltotal) {
                System.out.println("\nPayment successful!\n");
                if (items >= 10)
                    System.out.println("You earned a $10 coupon for your next visit!\n");
                change = payment - finaltotal;
                break;

            }else if (payment < finaltotal) {
                System.out.println("\nInsufficient payment.");
                System.out.println("You still need to pay: $" + (finaltotal-payment) + "\n");
            }
        }

        System.out.println("\n===== ITEMS PURCHASED =====");
        System.out.println("Mouse: " + mouse);
        System.out.println("Keyboard: " + keyboard);
        System.out.println("Headphones: " + headphones);
        System.out.println("Laptop Stand: " + laptopstand);
        String mostPurchasedProduct = "";
        int maxquantity = -1;
        if (mouse > maxquantity) {
            maxquantity = mouse;
            mostPurchasedProduct = "Mouse";
        }if (keyboard > maxquantity) {
            maxquantity = keyboard;
            mostPurchasedProduct = "Keyboard";
        }if (headphones > maxquantity) {
            maxquantity = headphones;
            mostPurchasedProduct = "Headphones";
        }if (laptopstand > maxquantity) {
            maxquantity = laptopstand;
            mostPurchasedProduct = "Laptop Stand";
        }
        System.out.println("Most purchased product: " + mostPurchasedProduct);
        System.out.println("Quantity: " + maxquantity + "\n");
        System.out.println("=======================");
        System.out.println("     SIMPLE STORE");
        System.out.println("=======================\n");
        System.out.println("Items purchased:  " + items);
        System.out.println("Subtotal:       $" + total);
        System.out.println("Discount:       $" + discout);
        System.out.println("Bonus Discount: $" + bonusdiscount);
        System.out.println("Final total:    $" + finaltotal);
        System.out.println("Payment:        $" + payment);
        System.out.println("Change:         $" + change);
        System.out.println("\n=======================");
        System.out.println("Thank you for shopping!");
        System.out.println("=======================");

    }
}

