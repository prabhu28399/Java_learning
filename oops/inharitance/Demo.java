package oops.inharitance;

public class Demo {
    public static void main(String[] args) {
        Calc calObj = new Calc();
        int n = calObj.add(10, 20);
        int nn = calObj.sub(10, 20);

        System.out.println(n);
        System.out.println(nn);
    }
}
