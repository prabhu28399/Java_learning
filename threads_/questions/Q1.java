// Print Even and Odd Numbers
// Description: Create two threads—one for printing even numbers and another for printing odd numbers from 1 to 100. Ensure that the numbers are printed in the correct sequence (i.e., 1, 2, 3, 4, ..., 100).

class Oddd extends  Thread{
        public void run(){
            for(int i=0;i<=100;i++){
                if(i%2 ==1){
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
}

class Evenn extends  Thread{
        public void run(){
            for(int i=0;i<=100;i++){
                if(i%2==0){
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
}

public class Q1 {
 public static void main(String args[])   {
    Evenn evn = new Evenn();
    Oddd od = new Oddd();


    evn.start();
    try{
        Thread.sleep(50);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    od.start();
 }
}
