public abstract class Bird2 implements Bird1 {
    private String speciesName;
    private int age;            
    protected double wingSpan;  
    public String habitat;      

    private static int birdCount = 0; 

    {                                 
        this.habitat = "Wild nature";  
    }                                 

    public Bird2() {                  
        this("Unknown species", 0, 0.0); 
    }                                 

    public Bird2(String speciesName) {
        this(speciesName, 0, 0.0);    
    }

    public Bird2(String speciesName, int age, double wingSpan) { 
        this.speciesName = speciesName; 
        this.age = age;                 
        this.wingSpan = wingSpan;       
        birdCount++;                    
    }                                   

    public String getSpeciesName() { return speciesName; }
    public void setSpeciesName(String speciesName) { this.speciesName = speciesName; } 

    public int getAge() { return age; }             
    public void setAge(int age) { this.age = age; } 

    public double getWingSpan() { return wingSpan; } 
    public void setWingSpan(double wingSpan) { this.wingSpan = wingSpan; } 

    public static int getBirdCount() { return birdCount; } 

    public abstract void Eat();
    public abstract void Move();
    public abstract void makeSound();
    public abstract void sleep();
}