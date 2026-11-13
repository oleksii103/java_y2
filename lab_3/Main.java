public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. DEMONSTRATION OF TYPES (Lab requirement) ===");
        
        // A) Specific child class type
        Eagle specificEagle = new Eagle("Bald Eagle", 4, 2.3, 2200.0);
        System.out.print("[Type: Specific Class Eagle]: ");
        specificEagle.Move();

        // B) Parent abstract class type
        Bird2 parentEagle = new Eagle("Steppe Eagle", 3, 2.0, 1800.0);
        System.out.print("[Type: Parent Class Bird2]: ");
        parentEagle.Move();

        // C) Base interface type
        Bird1 interfaceDuck = new Duck("Scrooge", 4, 4.0);
        System.out.print("[Type: Base Interface Bird1]: ");
        interfaceDuck.sleep();

        System.out.println("\n=== 2. DEMONSTRATION OF SPECIFIC INTERFACES ===");
        
        // Using Swimmable interface directly
        Swimmable swimmer = new Duck("Daisy", 2, 6.5);
        System.out.println("Swimmer current speed: " + swimmer.getSwimSpeed() + " km/h");
        swimmer.setSwimSpeed(8.0);
        System.out.print("[Type: Interface Swimmable]: ");
        swimmer.swim();

        // Using Flyable interface directly
        Flyable flyer = new Eagle("Golden Eagle", 5, 2.4, 2500.0);
        System.out.println("Flyer current altitude: " + flyer.getFlightAltitude() + " m");
        System.out.print("[Type: Interface Flyable]: ");
        flyer.fly();

        // Using Hunter interface directly
        Hunter hunter = new Eagle("Hunter Eagle", 3, 2.2, 2000.0);
        System.out.print("[Type: Interface Hunter]: ");
        hunter.hunt();
    }
} 