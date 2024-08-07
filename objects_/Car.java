public class Car {
    
    int cost ;
    String model;
    Float mialage;

    void modeldisplay(){
        System.out.println("model  of car : " + model);
    }
    void miallagedisplay(){
        System.out.println("miallage of car : " + mialage);
    }
    void costdisplay(){
        System.out.println("cost of car : " + cost);
    }

}

class Example {
    public static void Main (String args[]){
        Car Bmw = new Car();

        Bmw.cost = 45000;
        Bmw.model = "Bmw superfast";
        Bmw.mialage = 30.50;

        Bmw.modeldisplay();
        Bmw.miallagedisplay();
        Bmw.costdisplay();

    

    }
}
