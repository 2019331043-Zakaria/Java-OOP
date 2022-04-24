package SuperKeyword;

class Vehicle{
    String name;
    int weight;

    Vehicle(String name , int weight){
        this.name=name;
        this.weight=weight;
    }

    void display(){
        System.out.println(name);
        System.out.println(weight);
    }
}

class Car extends Vehicle {

    int gear;

    Car(String name, int weight, int gear){
        super(name, weight); //super constructor call first
        this.gear=gear;
    }

    @Override
    void display() {
        super.display();
        System.out.println(gear);
    }
}
public class Test3 {
    public static void main(String[] args){

        Car a=new Car("cycle", 22, 2);
        Vehicle b = new Vehicle("bus", 344);

        a.display();

        b.display();
    }
}
