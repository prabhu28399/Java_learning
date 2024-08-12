
class Computer {

    public void code() {

    }
}

class Desktop extends Computer {

    public void code() {
        System.out.println("fater coding in desktop");
    }
}

class Laptop extends Computer {

    public void code() {
        System.out.println("this is laptop in coding");
    }
}

class Developer extends Computer {

    public void Deapp(Computer lap) {
        lap.code();
    }
}

class Demo {

    public static void main(String args[]) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer prabhu = new Developer();

        prabhu.Deapp(desk);
    }
}
