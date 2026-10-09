public class Eagle extends Bird2 {

    public Eagle() {
        super("Eagle"); // Виклик конструктора базового класу Bird2
    }

    @Override
    public void Eat() {
        System.out.println(getSpeciesName() + " eats prey.");
    }

    @Override
    public void Move() {
        System.out.println(getSpeciesName() + " flies high in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println(getSpeciesName() + " says: Screech! Screech!");
    }

    @Override
    public void sleep() {
        System.out.println(getSpeciesName() + " sleeps high in its nest in the mountains.");
    }
}