class A {

    public void show() {
        System.out.println("this is a class ");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("this is B class");
    }
}

public class Demo {
    public static void main(String args[]) {
        B obj = new B();
        obj.show();
    }
}
