public abstract class Bird2 {
    private String speciesName;

    public Bird2(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public abstract void Eat();
    public abstract void Move();
    public abstract void makeSound();
    public abstract void sleep();
}