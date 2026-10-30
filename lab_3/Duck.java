public class Duck implements Bird1 {
    private String name;        //lab_4_edited
    private int age;            //lab_4_edited
    protected double swimSpeed; //lab_4_edited
    public String color;        //lab_4_edited

    // Instance initializer block
    {                         //lab_4_edited
        this.color = "White";  //lab_4_edited
    }                         //lab_4_edited

    public Duck() {           //lab_4_edited
        this("Duck", 1, 5.0); //lab_4_edited
    }                         //lab_4_edited

    public Duck(String name, int age, double swimSpeed) { //lab_4_edited
        this.name = name;           //lab_4_edited
        this.age = age;             //lab_4_edited
        this.swimSpeed = swimSpeed; //lab_4_edited
    }                               //lab_4_edited

    // Access methods (Encapsulation)
    public String getName() { return name; }               //lab_4_edited
    public void setName(String name) { this.name = name; } //lab_4_edited

    public int getAge() { return age; }             //lab_4_edited
    public void setAge(int age) { this.age = age; } //lab_4_edited

    public double getSwimSpeed() { return swimSpeed; }                         //lab_4_edited
    public void setSwimSpeed(double swimSpeed) { this.swimSpeed = swimSpeed; } //lab_4_edited

    // Comparison method
    public boolean isEqual(Duck other) { //lab_4_edited
        if (other == null) return false; //lab_4_edited
        return this.age == other.age &&  //lab_4_edited
               Double.compare(this.swimSpeed, other.swimSpeed) == 0 && //lab_4_edited
               this.name.equals(other.name);                           //lab_4_edited
    }                                    //lab_4_edited

    @Override
    public void Eat() {
        System.out.println(name + " eats grain."); //lab_4_edited
    }

    @Override
    public void Move() {
        System.out.println(name + " swims at a speed of " + swimSpeed + " km/h."); //lab_4_edited
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Quack! Quack!"); //lab_4_edited
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps near the water shore."); //lab_4_edited
    }
}