public class Eagle extends Bird2 implements Flyable, Hunter {
    private double flightAltitude; 

    public Eagle() { this("Eagle", 3, 2.1, 1500.0); }                                     

    public Eagle(String speciesName, int age, double wingSpan, double flightAltitude) { 
        super(speciesName, age, wingSpan);     
        this.flightAltitude = flightAltitude;   
    }                                           

    @Override
    public double getFlightAltitude() { return flightAltitude; }                             
    
    @Override
    public void setFlightAltitude(double flightAltitude) { this.flightAltitude = flightAltitude; } 
    
    @Override
    public void fly() {
        System.out.println(getSpeciesName() + " is soaring at an altitude of " + flightAltitude + " meters.");
    }

    @Override
    public void hunt() {
        System.out.println(getSpeciesName() + " dives from " + flightAltitude + "m to catch prey!");
    }

    public boolean isEqual(Eagle other) { 
        if (other == null) return false;  
        return this.getAge() == other.getAge() && 
               Double.compare(this.wingSpan, other.wingSpan) == 0 &&               
               Double.compare(this.flightAltitude, other.flightAltitude) == 0;     
    }                                     

    @Override
    public void Eat() { System.out.println(getSpeciesName() + " eats fresh meat."); }
    
    @Override
    public void Move() { System.out.println(getSpeciesName() + " moves by flying."); }
    
    @Override
    public void makeSound() { System.out.println(getSpeciesName() + " says: Screech!"); }
    
    @Override
    public void sleep() { System.out.println(getSpeciesName() + " sleeps in the mountains."); }
}