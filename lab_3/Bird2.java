public abstract class Bird2 {
    private String speciesName;
    private int age;            //lab_4_edited
    protected double wingSpan;  //lab_4_edited
    public String habitat;      //lab_4_edited

    // static field
    private static int birdCount = 0; //lab_4_edited

    // Instance initializer block
    {                                 //lab_4_edited
        this.habitat = "Wild nature";  //lab_4_edited
    }                                 //lab_4_edited

    // Constructors
    public Bird2() {                  //lab_4_edited
        this("Unknown species", 0, 0.0); //lab_4_edited
    }                                 //lab_4_edited

    public Bird2(String speciesName) {
        this(speciesName, 0, 0.0);    //lab_4_edited
    }

    public Bird2(String speciesName, int age, double wingSpan) { //lab_4_edited
        this.speciesName = speciesName; //lab_4_edited
        this.age = age;                 //lab_4_edited
        this.wingSpan = wingSpan;       //lab_4_edited
        birdCount++;                    //lab_4_edited
    }                                   //lab_4_edited

    // Access methods (Encapsulation)
    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) { //lab_4_edited
        this.speciesName = speciesName;             //lab_4_edited
    }                                               //lab_4_edited

    public int getAge() { return age; }             //lab_4_edited
    public void setAge(int age) { this.age = age; } //lab_4_edited

    public double getWingSpan() { return wingSpan; } //lab_4_edited
    public void setWingSpan(double wingSpan) { this.wingSpan = wingSpan; } //lab_4_edited

    // Static method
    public static int getBirdCount() { return birdCount; } //lab_4_edited

    public abstract void Eat();
    public abstract void Move();
    public abstract void makeSound();
    public abstract void sleep();
}