
public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird duck = new Duck();

        System.out.println("Eagle:");
        eagle.Eat();
        eagle.Move();

        System.out.println();

        System.out.println("Duck:");
        duck.Eat();
        duck.Move();
    }
}