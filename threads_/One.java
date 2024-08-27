class A extends Thread{
    public void run(){
        for(int i=0;i<=20;i++){
            System.out.println("Hyd");
            try{
                    Thread.sleep(100);
            }catch(InterruptedException e){
                    e.printStackTrace();
            }
        }
    }
}
class  B extends Thread{
    public void run(){
        for(int j=0;j<=20;j++){
            System.out.println("warangal..");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class One {
   
    public static void main(String args[]){
        A objA = new A();
        B objB = new B();


        objA.start();
        try {
            Thread.sleep(50);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        objB.start();
    }
}
