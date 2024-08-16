class AB{
    public void name(){
        System.out.println("this is name method");
    }
    int age = 45;
    try{
        if(age==40){
            System.out.println("both are equal..");
        }
        else{
            System.out.println("both are not equal don't compare it...");
        }
    };
    catch{

    }
}
class Demo{
    public static void main(String args[]){
        AB obj = new AB();
          obj.name();
    }
    
}