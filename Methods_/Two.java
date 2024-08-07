// package methods_;
class Extra{
    public String fun(int num){
        
        if(num <= 10 ){
            return "congratulations";
        }
        else{
           return "not bad try next time";
        }
    }
    // public void giveme(){
    //     System.out.println("xxxxxxx");
    // }
}
public class Two {
    public static void main (String args[]){
        Extra ex_obj = new Extra();
        ex_obj.fun();
        String result = ex_obj.fun(5)
        System.out.println(result)
        // System.out.println(result);
    }
}
