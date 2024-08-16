class PrabhuException extends  Exception{
    public PrabhuException(String   string){
        super(string);
    }
}

public class My_excepction {
    public static void main(String args[]){
        int num = 0;
        int roll = 0;
        try{
            roll = num/2;
            if (roll == 0){
                throw new PrabhuException("this is prabhu exception");
            }
        }
        catch(PrabhuException e){
            System.out.println(e.getMessage());
            // System.out.println("catch block");
        }
        catch(Exception e){
            System.out.println("error in this project");
        }
        System.out.println("every time it will print if error is there or not");
    }
}
