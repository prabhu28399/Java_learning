class A extends Thread
{
    public void run(){
        for(int i=0;i<=20;i++){
            System.out.println("hlo");
        }
    }
}
class B extends  Thread
{
    public void run(){
        for (int i = 0;i<=10;i++){
            System.out.println("hello guys..");
        }
    }
}

public class Demo {
    public static void main(String args[]){
        A objA = new A();
        B objB = new B();


        objA.start();
        objB.start();
    }
}
