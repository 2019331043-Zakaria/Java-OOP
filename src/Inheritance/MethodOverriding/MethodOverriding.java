package MethodOverriding;

class Person{
     int age;
     String name;
     void displayInformation(){
         System.out.println(age);
         System.out.println(name);
     }
}

class Teacher extends Person{
     String subject;

    @Override                        //Can't override static,Final method
    void displayInformation() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(subject);
    }
}
public class MethodOverriding {

       public static void main(String[] args){



           Teacher b = new Teacher();
           b.name="qasa";
           b.age=34;
           b.subject="math";

           b.displayInformation();

           Person a= new Person();
           a.name="wew";
           a.age=12;

           a.displayInformation();

       }
}
