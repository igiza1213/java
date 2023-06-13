package a;

public class Car {
    String carname;
    String color;
    int velocity;
    void SpeedUp() {
        velocity += 5;
        System.out.println("속도 " + velocity +  "증가");
    }
    void SpeedDown() {
        velocity -= 5;
        System.out.println("속도 " + velocity +  "감소");
    }
}
