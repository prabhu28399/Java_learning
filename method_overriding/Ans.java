class X {
    public int add(int n2, int n1) {
        return n1 + n2;
    }
}

class Y extends X {
    public int add(int n2, int n1) {
        return n1 + n2 + 3;
    }
}

public class Ans {
    public static void main(String args[]) {
        Y r1 = new Y();
        int result = r1.add(2, 30);
        System.out.println(result);
    }
}
