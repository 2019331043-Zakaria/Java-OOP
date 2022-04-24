package SuperKeyword;

class person{

    void display(){
        System.out.println("inside person class");
    }
}

class teacher extends person{
    @Override
    void display(){
         super.display(); // call super class teacher
         System.out.println("inside teacher class"); //call local class person
     }
}
public class Test2 {
    public static void main(String[] args){
          person a= new person();
          person b= new teacher();
          b.display();

    }
}
