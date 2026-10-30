public class Eagle extends Bird2 {
    private double flightAltitude; //lab_4_edited

    public Eagle() {                      //lab_4_edited
        this("Eagle", 3, 2.1, 1500.0);    //lab_4_edited
    }                                     //lab_4_edited

    public Eagle(String speciesName, int age, double wingSpan, double flightAltitude) { //lab_4_edited
        super(speciesName, age, wingSpan);     //lab_4_edited
        this.flightAltitude = flightAltitude;   //lab_4_edited
    }                                           //lab_4_edited

    // Access methods
    public double getFlightAltitude() { return flightAltitude; }                             //lab_4_edited
    public void setFlightAltitude(double flightAltitude) { this.flightAltitude = flightAltitude; } //lab_4_edited

    // Comparison method
    public boolean isEqual(Eagle other) { //lab_4_edited
        if (other == null) return false;  //lab_4_edited
        return this.getAge() == other.getAge() && //lab_4_edited
               Double.compare(this.wingSpan, other.wingSpan) == 0 &&               //lab_4_edited
               Double.compare(this.flightAltitude, other.flightAltitude) == 0;     //lab_4_edited
    }                                     //lab_4_edited

    @Override
    public void Eat() {
        System.out.println(getSpeciesName() + " eats prey.");
    }

    @Override
    public void Move() {
        System.out.println(getSpeciesName() + " flies at an altitude of " + flightAltitude + " meters."); //lab_4_edited
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