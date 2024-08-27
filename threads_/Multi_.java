class AA extends  Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hyderabad");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class BB extends  Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("wgl");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Multi_ {
    public static void main(String args[]){
        AA objA = new AA();
        BB objB = new BB();

        objA.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        objB.start();
    }
}
