public class SwitchExample {
    public static void main(String[] args) {
        String day = "jarvis";

        switch(day){
            case "Sunday":
                System.out.println("Monday");
            break;
            case "Monday":
                System.out.println("Monday");
            break;
            case "Thuesday":
                System.out.println("Thuesday");
            break;
            case "Wednesday":
                System.out.println("Wednesday");
            break;
            case "Thursday":
                System.out.println("Thursday");
            break;
            case "Friday":
                System.out.println("Friday");
            break;

            default:
                System.out.println("Holiday");
        }
    }
}
