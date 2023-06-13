package a;

public class Truck extends Car {
    int ton;
    void SpeedUp() {
        velocity += 10;
        System.out.println("속도 " + velocity +  "증가");
    }
    
    
}