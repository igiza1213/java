package trp;
public class Car {
    String carname;
    String color = "검정색";
    int velocity;
    void speedUp(){
        velocity += 5;
    }
    void speedDown(){
        velocity -= 5;
    }
}