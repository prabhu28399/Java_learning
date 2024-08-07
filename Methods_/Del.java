class Calculator {
    public void text(){
        System.out.println("this is for Telangana movement");

    }
    public String givemepen(int cost){
        if (cost <= 10)
            return "congratulations";

        return "not bad try next time";
    }
}


class Del {
    public static void main(String args[]) {
        Calculator camp = new Calculator();
        camp.text();

        String str = camp.givemepen(20);

        System.out.println(str);
    }
}