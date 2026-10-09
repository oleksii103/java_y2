public class Duck implements Bird1 {
    @Override
    public void Eat() {
        System.out.println("Duck eats grain.");
    }

    @Override
    public void Move() {
        System.out.println("Duck swims in water.");
    }

    @Override
    public void makeSound() {
        System.out.println("Duck says: Quack! Quack!");
    }

    @Override
    public void sleep() {
        System.out.println("Duck sleeps near the water shore.");
    }
}