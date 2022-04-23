class person{

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class teacher extends person{ // extend A in B

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class InheritPrivate {

    public static void main(String[] args){

        teacher obj1=new teacher();

        obj1.setAge(12);
        obj1.setName("zack");

        System.out.println(obj1.getName()+" "+obj1.getAge());


    }

}
