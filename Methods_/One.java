package methods_;
class Computer {
    public String danzer(){
        String msg = "this is the method of void";
        System.out.println(msg);
        return msg;
    }
}

class One{
    public static void main (String args[]){
        System.out.print("testing hello world");

        Computer Comp = new Computer();

        Comp.danzer();


    }


}