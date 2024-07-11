abstract class Vehicle{
     abstract void Start();
}
class car extends Vehicle{

    @Override
    void start(){
    
         System.out.println("car is starting......");

    }
    void drive(){
        System.out.println("car is driving..");
    }

}

public class Singleinheritance {
    public static void main (String[] args) {
        car car =new car();
        car.Start();
        car.drive();
    }
}





