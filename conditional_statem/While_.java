// nested while loop

class While_{
    public  static void main (String args[]){
        int num = 1;
        
        while (num <= 20){
            System.out.println("the num is : " + num);
            int number = 1;
            while (number <= 2){
                System.out.println("xxxxx : "  + number);
                number++;
            }
            num++;
        }
    }
}