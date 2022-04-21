import java.util.Scanner;

class A{
    int i,j;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
class B extends A{ // extend A in B
    int k;
    int sum;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public  int getSum(){
        return  i+j+k;
    }
}

public class Inheritance {
    public static void main(String args[]) {

           A obj1 = new A();
           B obj2 = new B();

           obj1.setI(10);
           obj1.setI(13);

           obj2.setI(0);
           obj2.setJ(3);
           obj2.setK(2);

        System.out.println(obj2.getSum());
    }

}
