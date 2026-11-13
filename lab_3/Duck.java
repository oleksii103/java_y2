public class Duck implements Bird1, Swimmable {
    private String name;        
    private int age;            
    protected double swimSpeed; 
    public String color;        

    { this.color = "White"; }                         

    public Duck() { this("Duck", 1, 5.0); }                         

    public Duck(String name, int age, double swimSpeed) { 
        this.name = name;           
        this.age = age;             
        this.swimSpeed = swimSpeed; 
    }                               

    public String getName() { return name; }               
    public void setName(String name) { this.name = name; } 
    public int getAge() { return age; }             
    public void setAge(int age) { this.age = age; } 

    @Override
    public double getSwimSpeed() { return swimSpeed; }                         
    
    @Override
    public void setSwimSpeed(double swimSpeed) { this.swimSpeed = swimSpeed; } 
    
    @Override
    public void swim() {
        System.out.println(name + " is actively swimming at " + swimSpeed + " km/h.");
    }

    public boolean isEqual(Duck other) { 
        if (other == null) return false; 
        return this.age == other.age &&  
               Double.compare(this.swimSpeed, other.swimSpeed) == 0 && 
               this.name.equals(other.name);                           
    }                                    

    @Override
    public void Eat() { System.out.println(name + " eats grain."); }
    
    @Override
    public void Move() { System.out.println(name + " moves by walking."); }
    
    @Override
    public void makeSound() { System.out.println(name + " says: Quack! Quack!"); }
    
    @Override
    public void sleep() { System.out.println(name + " sleeps near the water shore."); }
}