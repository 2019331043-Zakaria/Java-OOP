import java.util.Scanner;

class Student {

    private int q;

    public int getQ() {
        return q;
    }

    public void setQ(int p) {
        q = p;
    }
}

public class Constructor {

    public static void main(String [] args) {
        Scanner cin = new Scanner(System.in);

        Student zack= new Student();

        zack.setQ(8);
        System.out.println(zack.getQ());

    }
}
