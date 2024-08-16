class Abc{

}
class One{
    public static void main(String args[]){
        int roll = -5;
        int num = 0;

        try{
           num = roll/0;
        }
        catch(Exception e){
            System.out.println("error occured in out system of this project");
        }
        System.out.println("your number is : " + num);
    };
}   