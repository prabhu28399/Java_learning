package oops.inharitance;

class Two {
    public int add(int n, int n2) {
        return n + n2;
    }
}

class Three extends Two {
    public int sub(int n3, int n4) {
        return n3 - n4;
    }
}

class One {
    public static void main(String[] args) {
        Two t2 = new Two();
        Three t3 = new Three();

        int result = t2.add(13, 14);
        int result1 = t3.sub(40, 20);

        System.out.println("first" + " " + result + result1);
    }
}