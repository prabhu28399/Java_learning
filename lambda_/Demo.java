interface A {

    void show(int j);
}

class Demo {
    public static void main(String args[]) {
        A obj = (j) -> System.out.println("this is in object obj " + j);

        obj.show(20);

    }
}