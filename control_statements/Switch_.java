// public class Switch_ {

//     public static void main (String args[]){
//         String day = "monday";

//         switch (day){
//             case "saturday" , "sunday":
//                 System.out.println("today at 6am");
//                 break;
//             case "monday":
//                 System.out.print("monday nice");
//                 break;
//             case "tuesday":
//                 System.out.print("tuesday");
//                 break;
//             default:
//                 System.out.print("None of all these days...!");
//         }
//     }
// }


// second way

public class Switch_{
    public static void main (String args[]){
        int num = 20;

        switch (num){
            case 2 -> System.out.println("number is correct is 2");
            case 3 -> System.out.println("number is correct is 2");
            case 20 -> System.out.println("number is correct is 20");
            case 22 -> System.out.println("number is correct is 2");
            default -> System.out.println("none of the number is incorrect");
        }
    }
}