
class Word {
    // public final void show() {
    public void show() {
        System.out.println("word class");
    }
}

class Book extends Word {
    public void show() {
        System.out.println("book class show method");
    }
}

public class Demo {
    public static void main(String args[]) {
        Book obj = new Book();
        obj.show();

    }
}
