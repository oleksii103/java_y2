package lab_6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lab_6 {
    public static void main(String[] args) {
        // Create a map (Key: Subscriber surname, Value: Phone number)
        Map<String, String> phoneBook = new HashMap<>();

        // Populate the map with initial data (10 elements)
        phoneBook.put("Shevchenko", "+380671112233");
        phoneBook.put("Kovalenko", "+380502223344");
        phoneBook.put("Bondarenko", "+380933334455");
        phoneBook.put("Tkachenko", "+380664445566");
        phoneBook.put("Kravchenko", "+380975556677");
        phoneBook.put("Oliinyk", "+380636667788");
        phoneBook.put("Shevchuk", "+380957778899");
        phoneBook.put("Polishchuk", "+380688889900");
        phoneBook.put("Melnyk", "+380999990011");
        phoneBook.put("Savchenko", "+380730001122");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display all elements");
            System.out.println("2. Add element");
            System.out.println("3. Search element by key");
            System.out.println("4. Remove element by key");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nMap contents (" + phoneBook.size() + " elements):");
                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;

                case "2":
                    System.out.print("Enter subscriber surname: ");
                    String newKey = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String newValue = scanner.nextLine();
                    phoneBook.put(newKey, newValue);
                    System.out.println("Element successfully added/updated.");
                    break;

                case "3":
                    System.out.print("Enter surname to search: ");
                    String searchKey = scanner.nextLine();
                    if (phoneBook.containsKey(searchKey)) {
                        System.out.println("Found: " + searchKey + " - " + phoneBook.get(searchKey));
                    } else {
                        System.out.println("Element with this key was not found.");
                    }
                    break;

                case "4":
                    System.out.print("Enter surname to remove: ");
                    String removeKey = scanner.nextLine();
                    if (phoneBook.remove(removeKey) != null) {
                        System.out.println("Element successfully removed.");
                    } else {
                        System.out.println("Element with this key was not found.");
                    }
                    break;

                case "0":
                    System.out.println("Program terminated.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}