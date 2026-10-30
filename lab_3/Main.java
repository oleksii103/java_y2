public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. Creating Objects ===");
        Duck duck1 = new Duck("Donald", 2, 6.5);            //lab_4_edited
        Duck duck2 = new Duck("Donald", 2, 6.5);            //lab_4_edited
        Duck duck3 = duck1;                                 //lab_4_edited (посилання на duck1)

        Eagle eagle1 = new Eagle("Eagle", 4, 2.3, 2000.0);  //lab_4_edited
        Eagle eagle2 = new Eagle("Eagle", 4, 2.3, 2000.0);  //lab_4_edited
        Eagle eagle3 = eagle1;                              //lab_4_edited (посилання на eagle1)

        System.out.println("\n=== 2. Encapsulation and Access Methods ==="); //lab_4_edited
        System.out.println("Species: " + eagle1.getSpeciesName() + ", Age: " + eagle1.getAge() + ", Habitat: " + eagle1.habitat); //lab_4_edited
        eagle1.setAge(5); //lab_4_edited
        System.out.println("Updated eagle age: " + eagle1.getAge()); //lab_4_edited

        // 3. Демонстрація статичного поля (викликом через клас Bird2)
        System.out.println("\n=== 3. Static Field ==="); //lab_4_edited
        System.out.println("Total count of created Bird2 objects: " + Bird2.getBirdCount()); //lab_4_edited

        System.out.println("\n=== 4. Object Comparison ==="); //lab_4_edited

        System.out.println("--- Duck Comparison ---"); //lab_4_edited
        System.out.println("duck1 == duck2 (by reference): " + (duck1 == duck2)); // false //lab_4_edited
        System.out.println("duck1 == duck3 (by reference): " + (duck1 == duck3)); // true  //lab_4_edited
        System.out.println("duck1.isEqual(duck2) (by content): " + duck1.isEqual(duck2)); // true //lab_4_edited

        System.out.println("\n--- Eagle Comparison ---"); //lab_4_edited
        System.out.println("eagle1 == eagle2 (by reference): " + (eagle1 == eagle2)); // false //lab_4_edited
        System.out.println("eagle1 == eagle3 (by reference): " + (eagle1 == eagle3)); // true  //lab_4_edited
        System.out.println("eagle1.isEqual(eagle2) (by content): " + eagle1.isEqual(eagle2)); // true //lab_4_edited

        // 5. Виклики методів поведінки
        System.out.println("\n=== 5. Bird Behavior ===");
        duck1.Move();
        duck1.makeSound();
        eagle1.Move();
        eagle1.makeSound();
    }
}