public class Main {
    public static void main(String[] args) {
        
        Bird1 duck = new Duck();
        
        Bird2 eagle = new Eagle();

        System.out.println("--- Duck (Interface Bird1) ---");
        duck.Eat();
        duck.Move();
        duck.makeSound();
        duck.sleep();

        System.out.println();

        System.out.println("--- Eagle (Abstract Class Bird2) ---");
        eagle.Eat();
        eagle.Move();
        eagle.makeSound();
        eagle.sleep();
    }
}