package SuperKeyword;

class A{
    int x=6;
}
class B extends A{

    int x=10;
    void displayInformationlocal(){
        System.out.println(x);
    }

    void displayInformationsuper(){
        System.out.println(super.x);
    }


}
public class test {

    public static void main(String[] args){
          A a=new A();
          B b=new B();

         b.displayInformationlocal();
         b.displayInformationsuper();
    }

}
