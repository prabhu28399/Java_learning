interface AB {
    public int add(int n1, int n2);
}

public class Return_ {
    public static void main(String args[]) {
        AB obj = (int n1, int n2) -> {
            return n1 + n2;
        };

        int result = obj.add(20, 30);
        System.out.println(result);
    }
}
